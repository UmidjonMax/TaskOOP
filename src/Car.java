public class Car {
    public String rang, modeli;
    public int narxi;
    public boolean isAutomat;

    public String isAutomat() {
        if (isAutomat) {
            return "Avtomat";
        }
        return "mexanik";
    }
}

