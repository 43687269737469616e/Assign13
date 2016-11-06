package self.my;

public class Main {

    public static void main(String[] args) {
	    Computer coffeePot = new Computer("i3", "MSI", "8GB DDR3", "500W","1TB SATA SSD");
        GamingComputer gamer = new GamingComputer("i7", "ASUS ROG", "32GB DDR4", "1200W", "1TB M.2 SSD","GTX 1080","Intel", "ASUS Sonar","GTX 1080 SLI", "RED");
        Computer midRange = new Computer("i5", "ASUS", "12GB DDR3", "750W","1TB SATA SSD", "1070 GTX", "Intel");

        System.out.println(coffeePot);
        System.out.println(gamer);
        System.out.println(midRange);
    }
}
