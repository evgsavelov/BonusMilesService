public class Main {
    public static void main(String[] args) {
        BonusMilesService service = new BonusMilesService();
        int price = 10_000;
        int miles = service.calculate(price);
        System.out.println(miles);
    }
}

class BonusMilesService {
    int cost;
    int miles;

    int calculate(int cost) {
        miles = cost / 20;
        return miles;
    }
}



