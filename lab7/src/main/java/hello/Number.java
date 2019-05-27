package hello;

public class Number {

    private Integer decNum;
    private String binNum;

    public String setBinNum() {
        binNum = Integer.toBinaryString(decNum);
        return binNum;
    }

    public String setBinNum(String bin) {
        binNum = bin;
        decNum = Integer.parseInt(binNum, 2);
        return binNum;
    }

    public void setDecNum(Integer dexNum) {
        this.decNum = dexNum;
        setBinNum();
    }

    public String getBinNum() {
        return binNum;
    }

    public Integer getDecNum() {
        return decNum;
    }

}
