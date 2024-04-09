import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean isToRun = true;
        while(isToRun){
            System.out.println("Введите данные согласно шаблону:\nФамилия Имя Отчество дата рождения[dd.mm.yyyy] номер телефона пол[m/f]");
            System.out.println("Введите x для выхода");
            String input = scanner.nextLine();
            if(input.equals("x")) isToRun = false;
            else HandleUserInput.handleUserInput(input);

        }
        scanner.close();
    }
}
