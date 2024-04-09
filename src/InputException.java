public class InputException extends Exception{
    public InputException(String message){
        super("Вы ввели некорректные данные: " + message);
    }
}
