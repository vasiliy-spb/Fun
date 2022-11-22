import java.util.Scanner;

public class Main {

    public static String name1;
    public static String name2;

    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);

        name1 = sc.nextLine();
        name2 = sc.nextLine();

        System.out.println("Введите стоп-слово: ");

        String stopWord = sc.nextLine();
        if (!stopWord.equalsIgnoreCase("start")){
            System.out.println("Кто 'winner' мы не узнаем, но кто-то точно looser...");
        } else {
            System.out.print("Wait a second");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(250);
            System.out.print(".");
            Thread.sleep(250);
            System.out.println(".");
            Thread.sleep(250);
            roulette();
        }
    }

    private static void roulette(){
        int x = (int) (Math.random() * 3);
        if (x == 1) {
            winner1(name1, name2);
            return;
        }
        if (x == 2) {
            winner2(name1, name2);
        } else {
            winner3(name1, name2);
        }
    }

    private static void winner1(String holmes, String watson){
        if (holmes.length() == watson.length()){
            winner3(holmes,watson);
            return;
        }
        if(holmes.length() > watson.length()){
            System.out.println(holmes + " is winner!");
        } else {
            System.out.println(watson + " is winner!");
        }
    }

    private static void winner2(String tom, String jerry){
        int x = (int) (Math.random() * 2);
        if (x == 1){
            System.out.println(tom + " is winner!");
        } else {
            System.out.println(jerry + " is winner!");
        }
    }

    private static void winner3(String winner, String looser){
        System.out.println("Sorry, " + winner + " and " + looser + ", but always winner is Vasiliy!");
    }
}