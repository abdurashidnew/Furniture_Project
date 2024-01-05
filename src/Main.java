import module.Furniture;
import service.FurnitureService;

public class Main {
    public static void main(String[] args) {
        Furniture furniture1 = new Furniture("Bucktown Modular 4-Piece Sectional Sofa with Ottoman", "WHite", 454D);
        Furniture furniture2 = new Furniture("Characteristics", "Black", 20d);
        Furniture furniture3 = new Furniture("Entryway Furniture & Organization", "Pink", 80d);
        Furniture furniture4 = new Furniture("Kitchen & Dining Furniture", "White", 90D);
        Furniture furniture5 = new Furniture("Kids’ Furniture", "Red", 100D);
        Furniture furniture6 = new Furniture("Statement Furniture", "Yellow", 50D);
        Furniture furniture7 = new Furniture("Best Furniture", "Black", 150D);
        Furniture furniture8 = new Furniture("Bathroom Furniture", "Orange", 35D);
        Furniture furniture9 = new Furniture("Nursery Furniture", "White", 90D);
        Furniture furniture10 = new Furniture("Furniture Sets & Collections", "Red", 300D);
        FurnitureService furnitureService = new FurnitureService();

        furnitureService.create(1, furniture1); // TODO: CREATE QILINDI
        furnitureService.create(2, furniture2);
        furnitureService.create(3, furniture3);
        furnitureService.create(4, furniture4);
        furnitureService.create(5, furniture5);
        furnitureService.create(6, furniture6);
        furnitureService.create(7, furniture7);
        furnitureService.create(8, furniture8);
        furnitureService.create(9, furniture9);
        furnitureService.create(10, furniture10);


//        System.out.println(furnitureService.getAll(1)); // TODO: 1 RAQAMLIK KEY VALUEGA SAQANGAN PRODUCT CHAQIRILDI
//        System.out.println(furnitureService.deleteFurniture(1, 1)); // TODO: 1 RAQAMLIK KEY  VA 1 RAQAMLIK ID O'CHIRILDI
//        System.out.println(furnitureService.deleteFurniture(20,1)); // TODO: 20 RAQAMLIK KEY DAGI MA'LUMOTNI TOPA OLMAGANLIGI UCHUN O'CHIRILMADI!
        furnitureService.updateFurniture(1, 1, new Furniture("Sofa", "Black", 10D));
        System.out.println(furnitureService.getAll(1)); // TODO: 1 RAQAMLIK KEY VALUEGA SAQANGAN PRODUCT CHAQIRILDI, QIYMAT O'ZGARGAN HOLDA
        System.out.println(furnitureService.deleteFurniture(1, 1));
        System.out.println(furnitureService.getAll(1)); // TODO: 1 RAQAMLIK KEY VALUE CHAQIRILDI BUNDAY ID BO'LMAGANLAIGI UCHUN MA'LUMOT CHIQMADI

    }

}
