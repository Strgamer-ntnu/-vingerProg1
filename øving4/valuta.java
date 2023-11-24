package øving4;

public class valuta {
    public float exchangeRate;
    public valuta(Float arg) {
        exchangeRate = arg;

    }
    public float fromNok(float mengde) {
        return mengde/exchangeRate;
    }
    public float toNok(float mengde) {
        return mengde*exchangeRate;
    }
}
