package week1.les2.oefening2;

public class Main {
    public static void main(String[] args){
        Product pr1 = new Product("ipad", "1234ab", 614.00);
        pr1.setBTW(19.0);
        pr1.verhoogPrijsMet(2.5);
        System.out.println("eerste product: " + pr1);

        Product pr2 = new Product("paracetamol", "543cd");
        pr2.setPrijs(1.90);
        pr2.setBTW(6.0);
        pr2.verhoogPrijsMet(-10.0);
        System.out.println("Tweede product: " + pr2);
        System.out.println();
        System.out.println(pr2.getBTW());
        System.out.println(pr2.btwBedrag());
        System.out.println(pr2.getPrijs());
    }
}
