import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteUserToFile {
    public static void writeUserToFile(String userInput, String fileName) throws UserWriteToFileException{
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("users/" + fileName + ".text", true))){
            writer.write(userInput);
            writer.newLine();
        } catch (IOException e){
            throw new UserWriteToFileException(e, "Не удалось записать файл");
        }
    }
}
