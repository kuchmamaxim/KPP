package hello;

public class Number {

    private Integer decNum = 0;
    private String binNum;

    public void setBinNum() {
        if (isDecValid()) {
            binNum = Integer.toBinaryString(decNum);
        } else {
            decNum = 0;
            binNum = "Wrong argument!";
        }
    }

    void setFromBinNum(String bin) {
        if (bin.matches("[10]+")) {
            binNum = bin;
            decNum = Integer.parseInt(binNum, 2);
        } else {
            decNum = 0;
            binNum = "Wrong argument!";
        }
    }

    public void setDecNum(Integer decNum) {
        this.decNum = decNum;
        setBinNum();
    }

    void setFromDecNum(String decNum) {
        if (isDecValid() && decNum.matches("[0123456789]+")) {
            this.decNum = Integer.parseInt(decNum);
            setBinNum();
        } else {
            this.decNum = 0;
            binNum = "Wrong argument!";
        }
    }

    public String getBinNum() {
        return binNum;
    }

    public Integer getDecNum() {
        return decNum;
    }

    private Boolean isDecValid() {
        return decNum >= 0;
    }

}