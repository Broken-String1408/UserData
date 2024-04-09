import java.util.logging.Logger;

public class HandleUserInput {
    public static void handleUserInput(String userInput){
        try {
            String fileName = ValidateUserInput.validateUserInput(userInput);
            WriteUserToFile.writeUserToFile(userInput, fileName);
        } catch (InputException inputException){
            System.out.println(inputException.getMessage());
        } catch (UserWriteToFileException userWriteToFileException){
            userWriteToFileException.printStackTrace();
        }
    }
}
