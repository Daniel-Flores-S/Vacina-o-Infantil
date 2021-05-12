package model;

public class Vaccines {
    private boolean BCG;
    private boolean HepatiteB;
    private boolean PentaDTP;
    private boolean VIPVOP;
    private boolean Meningococica;



    public Vaccines(boolean BCG, boolean hepatiteB, boolean pentaDTP, boolean VIPVOP, boolean meningococica) {
        this.BCG = BCG;
        HepatiteB = hepatiteB;
        PentaDTP = pentaDTP;
        this.VIPVOP = VIPVOP;
        Meningococica = meningococica;
    }

    public boolean isBCG() {
        return BCG;
    }

    public void setBCG(boolean BCG) {
        this.BCG = BCG;
    }

    public boolean isHepatiteB() {
        return HepatiteB;
    }

    public void setHepatiteB(boolean hepatiteB) {
        HepatiteB = hepatiteB;
    }

    public boolean isPentaDTP() {
        return PentaDTP;
    }

    public void setPentaDTP(boolean pentaDTP) {
        PentaDTP = pentaDTP;
    }

    public boolean isVIPVOP() {
        return VIPVOP;
    }

    public void setVIPVOP(boolean VIPVOP) {
        this.VIPVOP = VIPVOP;
    }

    public boolean isMeningococica() {
        return Meningococica;
    }

    public void setMeningococica(boolean meningococica) {
        Meningococica = meningococica;
    }
}
