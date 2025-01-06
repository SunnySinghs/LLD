package Design.Payment.Instrument;

public class InstrumentServiceFactory {

    public InstrumentService getInstrumentService(InstrumentType instrumentType) {
        switch (instrumentType) {
            case BANK -> {
                return new BankService();
            }
            case CARD -> {
                return new CardService();
            }
        }
        return null;
    }
}
