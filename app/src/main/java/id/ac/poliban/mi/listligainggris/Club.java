package id.ac.poliban.mi.listligainggris;

public class Club {
    private String flag;
    private String clubName;
    private String clubDesc;

    public Club(String flag, String clubName, String clubDesc) {
        this.flag = flag;
        this.clubName = clubName;
        this.clubDesc = clubDesc;
    }

    public String getFlag() {
        return flag;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public String getClubName() {
        return clubName;
    }

    public void setClubName(String clubName) {
        this.clubName = clubName;
    }

    public String getClubDesc() {
        return clubDesc;
    }

    public void setClubDesc(String clubDesc) {
        this.clubDesc = clubDesc;
    }

    @Override
    public String toString() {
        return String.format("%30s\n\n%s", getClubName(), getClubDesc());
    }
}