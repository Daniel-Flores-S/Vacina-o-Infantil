package model;

public class Vaccines {
    private String BCG;
    private String HepatiteB;
    private String PentaDTP;
    private String VIPVOP;
    private String Meningococica;

    public Vaccines(String BCG, String hepatiteB, String pentaDTP, String VIPVOP, String meningococica) {
        this.BCG = BCG;
        HepatiteB = hepatiteB;
        PentaDTP = pentaDTP;
        this.VIPVOP = VIPVOP;
        Meningococica = meningococica;
    }

    public String getBCG() {
        return BCG;
    }

    public void setBCG(String BCG) {
        this.BCG = BCG;
    }

    public String getHepatiteB() {
        return HepatiteB;
    }

    public void setHepatiteB(String hepatiteB) {
        HepatiteB = hepatiteB;
    }

    public String getPentaDTP() {
        return PentaDTP;
    }

    public void setPentaDTP(String pentaDTP) {
        PentaDTP = pentaDTP;
    }

    public String getVIPVOP() {
        return VIPVOP;
    }

    public void setVIPVOP(String VIPVOP) {
        this.VIPVOP = VIPVOP;
    }

    public String getMeningococica() {
        return Meningococica;
    }

    public void setMeningococica(String meningococica) {
        Meningococica = meningococica;
    }
}
