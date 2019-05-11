package pets;


public class Terrier extends Dog {
    public Terrier(){
        name = "Yorik";
        age = 2;
    }

    public Terrier(String tname, int tage){
        super(tname, tage);
    }

    public String execCommand(String command){
        switch (command) {
            case "Sit!":
                return "Woof! *siting* [would like 2 say but can't]: I love u, master!";
            case "Voice!":
                return "Woof!";
            default: return "*misunderstanding...*";
        }
    }
}
