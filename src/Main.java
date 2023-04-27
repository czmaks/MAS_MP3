public class Main {
    public static void main(String[] args) {

        House house = new House(2, 5, "Szkolna", 4, "Sweedish");
        ApartmentBuilding apartmentBuilding = new ApartmentBuilding(5, "Koscielna", 4, 20, 4);

        System.out.println(house.getResidents());
        System.out.println(apartmentBuilding.getResidents());
    }
}