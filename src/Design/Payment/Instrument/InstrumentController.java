package Design.Payment.Instrument;

import java.util.List;

public class InstrumentController {
    private InstrumentServiceFactory instrumentServiceFactory;

    public InstrumentController() {
        this.instrumentServiceFactory = new InstrumentServiceFactory();
    }

    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        InstrumentService instrumentService = instrumentServiceFactory.getInstrumentService(instrumentDO.getInstrumentType());
        return instrumentService.addInstrument(instrumentDO);
    }

    public List<InstrumentDO> getAllInstruments(int userId) {
        InstrumentService bankInstrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.BANK);
        InstrumentService cardInstrumentService = instrumentServiceFactory.getInstrumentService(InstrumentType.CARD);

        List<InstrumentDO> instrumentDOList = bankInstrumentService.getInstruments(userId);
        instrumentDOList.addAll(cardInstrumentService.getInstruments(userId));
        return instrumentDOList;
    }

    public InstrumentDO getInstrument(int userId, int instrumentId) {
        List<InstrumentDO> instrumentDOList = getAllInstruments(userId);
        return instrumentDOList.stream().filter(instrumentDO -> instrumentDO.getInstrumentId() == instrumentId).findFirst().get();
    }
}
