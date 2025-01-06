package Design.Payment.Instrument;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BankService extends InstrumentService{
    @Override
    public InstrumentDO addInstrument(InstrumentDO instrumentDO) {
        BankInstrument bankInstrument = new BankInstrument();
        bankInstrument.setInstrumentId(new Random().nextInt(100));
        bankInstrument.setBankAccountNo(instrumentDO.getBankAccNo());
        bankInstrument.setIfscCode(instrumentDO.getIfscCode());
        bankInstrument.setInstrumentType(instrumentDO.getInstrumentType());
        bankInstrument.setUserId(instrumentDO.getUserId());

        List<Instrument> instrumentList = userVsInstrument.get(instrumentDO.getUserId());
        if (instrumentList == null) {
            instrumentList = new ArrayList<>();
            userVsInstrument.put(instrumentDO.getUserId(), instrumentList);
        }
        instrumentList.add(bankInstrument);
        return convertIntrumentToInstrumentDO(bankInstrument);
    }

    @Override
    public List<InstrumentDO> getInstruments(int userId) {
        List<Instrument> instrumentList = userVsInstrument.get(userId);
        List<InstrumentDO> userInstruments = new ArrayList<>();
        if (instrumentList != null) {
            for (Instrument instrument: instrumentList) {
                if (instrument.getInstrumentType() == InstrumentType.BANK) {
                    userInstruments.add(convertIntrumentToInstrumentDO((BankInstrument) instrument));
                }
            }
        }
        return userInstruments;
    }

    private InstrumentDO convertIntrumentToInstrumentDO(BankInstrument bankInstrument) {
        InstrumentDO instrumentDO = new InstrumentDO();
        instrumentDO.setInstrumentId(bankInstrument.getInstrumentId());
        instrumentDO.setBankAccNo(bankInstrument.getBankAccountNo());
        instrumentDO.setIfscCode(bankInstrument.getIfscCode());
        instrumentDO.setUserId(bankInstrument.getUserId());
        instrumentDO.setInstrumentType(bankInstrument.getInstrumentType());
        return instrumentDO;
    }
}
