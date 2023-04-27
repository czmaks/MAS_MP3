import java.util.EnumSet;

enum AnimalType {Animal, Cat, Dog, Hamster}
public class Animal {

    private String name;
    private String breed;

    private boolean canBark;

    private EnumSet<AnimalType> animakKind = EnumSet.of(AnimalType.Animal);

    public boolean isCanBark() throws Exception {
        if(animakKind.contains(AnimalType.Dog)) {
            return canBark;
        }else {
            throw new Exception("This animal is not a dog!");
        }
    }

    public void setCanBark(boolean canBark) throws Exception{
        if(animakKind.contains(AnimalType.Dog)) {
            this.canBark = canBark;
        }else {
            throw new Exception("This animal is not a dob!");
        }
    }
}
