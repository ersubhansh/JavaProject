class Automobile {
    String make;
    String model;
    int year;

    public Automobile(String make,String model, int year) {
        this.make=make;
        this.model=model;
        this.year=year;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String newmake) {
        this.make = newmake;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String newmodel) {
        this.model = newmodel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int newyear) {
        this.year = newyear;
    }
}
