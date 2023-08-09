public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int MileCost = 20;     //количество рублей для одной бонусной мили
        int BonusMile = ticketPrice / MileCost;
        System.out.println(BonusMile);
    }
}