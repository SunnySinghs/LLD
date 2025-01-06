package Design.Payment.Instrument;

public class InstrumentDO {
    private int instrumentId;
    private int userId;
    private InstrumentType instrumentType;
    private String bankAccNo;
    private String ifscCode;
    private String cardNo;
    private String cvvNo;

    public int getInstrumentId() {
        return instrumentId;
    }

    public void setInstrumentId(int instrumentId) {
        this.instrumentId = instrumentId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getIfscCode() {
        return ifscCode;
    }

    public void setIfscCode(String ifscCode) {
        this.ifscCode = ifscCode;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
    }

    public String getCvvNo() {
        return cvvNo;
    }

    public void setCvvNo(String cvvNo) {
        this.cvvNo = cvvNo;
    }

    @Override
    public String toString() {
        return "InstrumentDO{" +
                "instrumentId=" + instrumentId +
                ", userId=" + userId +
                ", instrumentType=" + instrumentType +
                ", bankAccNo='" + bankAccNo + '\'' +
                ", ifscCode='" + ifscCode + '\'' +
                ", cardNo='" + cardNo + '\'' +
                ", cvvNo='" + cvvNo + '\'' +
                '}';
    }
}
