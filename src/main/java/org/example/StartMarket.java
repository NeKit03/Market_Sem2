package org.example;
import java.util.Scanner;
public class StartMarket extends Market {
    Scanner in = new Scanner(System.in);
    Market market=new Market();
    public void openMarket(){
        while(true){
            printMenu();
            switch (in.next()){
                case "1":
                    System.out.println("Сколько посетителей пришло:"+"\n");
                    if(in.hasNextInt()){
                        Integer n=in.nextInt();
                        for(int i=1;i<=n;i++){
                            System.out.println("Введите имя посетителя "+i+":\n");
                            market.acceptToMarket(new Human(in.next()));
                        }
                        market.update();
                        break;
                    }else{
                        System.out.println("Введены не корректные данные");
                        break;
                    }
                case "2":
                    System.out.println("Магазин закрылся! Досвидания!");
                    return;

                default:
                    System.out.println("Введены не корректные данные");
            }

        }
    }

    private void printMenu(){
        System.out.println("\n___________________MENU______________________\n");
        System.out.println("1)Появились посетители\n");
        System.out.println("2)Пора закрывать магазин\n");
        System.out.println("_____________________________________________\n");

    }
}
