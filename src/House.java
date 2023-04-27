public class House extends Building{
    private String style;
    private int familySize;

    public House(int numberOfLevels, int familySize, String streetName, int streetNumber, String style) {
        super(numberOfLevels, streetName, streetNumber);
        this.style = style;
        this.familySize = familySize;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getFamilySize() {
        return familySize;
    }

    public void setFamilySize(int familySize) {
        this.familySize = familySize;
    }

    @Override
    public int getResidents(){
        return getFamilySize();
    }
}
