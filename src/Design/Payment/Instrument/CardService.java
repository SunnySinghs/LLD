package Design.Payment.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardService extends InstrumentService{
    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        CardInstrument cardInstrument = new CardInstrument();
        cardInstrument.setInstrumentId(new Random().nextInt(100));
        cardInstrument.setCardNumber(instrumentDO.getCardNo());
        cardInstrument.setCvvNumber(instrumentDO.getCvvNo());
        cardInstrument.setInstrumentType(instrumentDO.getInstrumentType());
        cardInstrument.setUserId(instrumentDO.getUserId());

        List<Instrument> instrumentList = userVsInstrument.get(instrumentDO.getUserId());
        if (instrumentList == null) {
            instrumentList = new ArrayList<>();
            userVsInstrument.put(instrumentDO.getUserId(), instrumentList);
        }
        instrumentList.add(cardInstrument);
        return convertIntrumentToInstrumentDO(cardInstrument);
    }

    @Override
    public List<InstrumentDO> getInstruments(int userId) {
        List<Instrument> instrumentList = userVsInstrument.get(userId);
        List<InstrumentDO> userInstruments = new ArrayList<>();
        if (instrumentList != null) {
            for (Instrument instrument: instrumentList) {
                if (instrument.getInstrumentType() == InstrumentType.CARD) {
                    userInstruments.add(convertIntrumentToInstrumentDO((CardInstrument) instrument));
                }
            }
        }
        return userInstruments;
    }

    private InstrumentDO convertIntrumentToInstrumentDO(CardInstrument cardInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(cardInstrument.getInstrumentId());
        instrumentDO.setCardNo(cardInstrument.getCardNumber());
        instrumentDO.setCvvNo(cardInstrument.getCvvNumber());
        instrumentDO.setUserId(cardInstrument.getUserId());
        instrumentDO.setInstrumentType(cardInstrument.getInstrumentType());
        return instrumentDO;
    }
}
