package hello;

public class Number {

    private Integer decNum;
    private String binNum;

    public String setBinNum() {
        binNum = Integer.toBinaryString(decNum);
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
    /*public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }*/

}
