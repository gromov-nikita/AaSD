package countries;

public class Countries {
    private String name;
    private String language;
    private double area;
    private int population;
    private boolean sea;
    public Countries() {}
    public Countries(String name, String language, double area, int population, boolean sea) {
        this.name = name;
        this.language = language;
        this.area = area;
        this.population = population;
        this.sea = sea;
    }
    public String getName() {
        return name;
    }
    public String getLanguage() {
        return language;
    }
    public double getArea() {
        return area;
    }
    public int getPopulation() {
        return population;
    }
    public boolean getSea() {
        return sea;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setLanguage(String language) {
        this.language = language;
    }
    public void setArea(double area) {
        this.area = area;
    }
    public void setPopulation(int population) {
        this.population = population;
    }
    public void setSea(boolean sea) {
        this.sea = sea;
    }
    @Override
    public String toString() {
        return "Name: " + name + "; Language: " + language + "; Area: " + area + "; Population: " + population + "; Sea: " + sea + ".";
    }
}
