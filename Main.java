public class Main {
    public static void main(String[] args) {
        float coat = 70;
        byte coatDiscount = 77;
        float hat = 25;
        byte hatDiscount = 37;
        float businessSuit = 53;
        byte businessSuitDiscount = 44;
        float shirt = 19;
        byte shirtDiscount = 0;
        float shoes = 41;
        byte shoesDiscount = 32;

        float account = 312;

        float cost = (coat-((coat/100)*coatDiscount)+hat-((hat/100)*hatDiscount)+businessSuit-((businessSuit/100)*businessSuitDiscount)+shirt-((shirt/100)*shirtDiscount)+shoes-((shoes/100)*shoesDiscount));

                if (account > cost){
                    System.out.println("Да, денег хватает! Можно купить.");}
                else {System.out.println("Тебе не хватает! Денег нет:( Иди работать!!");
                }
    }
}
