package com.jonas;

public class NFL {
    private Conference afc;
    private Conference nfc;

    public NFL(Conference afc, Conference nfc) {
        this.afc = afc;
        this.nfc = nfc;
    }

    public Conference getAfc() {
        return afc;
    }

    public void setAfc(Conference afc) {
        this.afc = afc;
    }

    public Conference getNfc() {
        return nfc;
    }

    public void setNfc(Conference nfc) {
        this.nfc = nfc;
    }
}
