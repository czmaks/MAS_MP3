public abstract class Building {
    private int numberOfLevels;
    private String streetName;
    private int streetNumber;

    public Building(int numberOfLevels, String streetName, int streetNumber) {
        super();
        this.numberOfLevels = numberOfLevels;
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    public abstract int getResidents();
}
