public class Main {
    public static void main(String[] args) {

        int ticketPrice = 13676;
        int mileCost = 20;     //количество рублей для одной бонусной мили
        int bonusMile = ticketPrice / mileCost;
        System.out.println(bonusMile);
    }
}