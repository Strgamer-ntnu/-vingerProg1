package øving11;

import java.awt.geom.Area;

public class Eiendom {
        private final int Kommunenr;
        private final String kommunenavn;
        private final int Gardsnr;
        private final int Bruksnr;
        private final String bruksnavn;
        private float areal;
        private String eier;
    
        public Eiendom(int Kommunenr, String kommunenavn, int Gardsnr, int Bruksnr, String bruksnavn, float areal, String eier) {
            this.Kommunenr = Kommunenr;
            this.kommunenavn = kommunenavn;
            this.Gardsnr = Gardsnr;
            this.Bruksnr = Bruksnr;
            this.bruksnavn = bruksnavn;
            this.areal = areal;
            this.eier = eier;
        }

        public int getKommunenr() {return Kommunenr;}
        public String getKommunenavn() {return kommunenavn;}
        public int getGardsnr() {return Gardsnr;}
        public int getBruksnr() {return Bruksnr;}
        public String getBruksnavn() {return bruksnavn;}
        public float getAreal() {return areal;}
        public String getEier() {return eier;}
        public void setAreal(float areal) {this.areal = areal;}
        public void setEier(String eier) {this.eier = eier;}
        public String toString() {
            return Kommunenr + "-" + Gardsnr + "/" + Bruksnr;
        }
        //Gjør denne til tostring, den andre til toIdString
        public String toStringLong() {
            String outString = "";
            outString+= Kommunenr + "-" + Gardsnr + "/" + Bruksnr;
            if (!(bruksnavn.trim()=="" || bruksnavn==null)) {
                outString+=" Bruksnavn: " + bruksnavn;
            }
            outString+= "\nAreal: " + areal + " Eier: " + eier;
            return outString;}
    
}
