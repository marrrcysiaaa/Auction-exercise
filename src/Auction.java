public class Auction {
    public static void main(String[] args) {
        Items auction1 = new Items();
        Items auction2 = new Items();
        Seller seller1 = new Seller();
        Seller seller2 = new Seller();
        Address address1 = new Address();
        Address address2 = new Address();




        auction1.title = "X-Box One";
        auction1.description = "Konsola dla wymagajacych graczy.";
        auction1.price = 999.99;
        seller1.firstName = "Jan";
        seller1.lastName = "Kowalski";
        auction1.owner = seller1;
        auction1.owner.address = address1;
        address1.city = "Wrocław";
        address1.postalCode = "51-236";
        address1.street = "ul. Długa";
        address1.homeNo = "15A";
        address1.flatNo = "3";




        auction2.title = "Samsung S20";
        auction2.description = "Niesamowity telefon z trzema obiektywami";
        auction2.price = 3_999;
        seller2.firstName = "Justyna";
        seller2.lastName = "Kowalczyk";
        auction2.owner = seller2;
        auction2.owner.address = address2;
        address2.city = "Wałbrzych";
        address2.postalCode = "54-241";
        address2.street = "ul. Zamkowa";
        address2.homeNo = "156";
        address2.flatNo = "49";



        System.out.println("Aukcja 1: ");
        System.out.println(auction1.title);
        System.out.println(auction1.description);
        System.out.println("Cena: " + auction1.price);
        System.out.println("Sprzedjący: " + seller1.firstName + " " + seller1.lastName);
        System.out.println("Miejscowość: " + address1.city);
        System.out.println(" ");
        System.out.println("Aukcja 2: ");
        System.out.println(auction2.title);
        System.out.println(auction2.description);
        System.out.println("Cena: " + auction2.price);
        System.out.println("Sprzedjący: " + seller2.firstName + " " + seller2.lastName);
        System.out.println("Miejscowość: " + address2.city);





    }
}