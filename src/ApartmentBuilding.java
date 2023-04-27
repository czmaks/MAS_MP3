public class ApartmentBuilding extends Building{

    private int numberOfFlats;
    private int maxNumberOfResidentsInFlat;

    public ApartmentBuilding(int numberOfLevels, String streetName, int streetNumber, int numberOfFlats, int maxNumberOfResidentsInFlat) {
        super(numberOfLevels, streetName, streetNumber);
        this.numberOfFlats = numberOfFlats;
        this.maxNumberOfResidentsInFlat = maxNumberOfResidentsInFlat;
    }

    public int getNumberOfFlats() {
        return numberOfFlats;
    }

    public void setNumberOfFlats(int numberOfFlats) {
        this.numberOfFlats = numberOfFlats;
    }

    public int getMaxNumberOfResidentsInFlat() {
        return maxNumberOfResidentsInFlat;
    }

    public void setMaxNumberOfResidentsInFlat(int maxNumberOfResidentsInFlat) {
        this.maxNumberOfResidentsInFlat = maxNumberOfResidentsInFlat;
    }

    @Override
    public int getResidents() {
        return getNumberOfFlats()*getMaxNumberOfResidentsInFlat();
    }
}
