import java.io.IOException;

public class UserWriteToFileException extends IOException {
   public UserWriteToFileException(IOException e, String message){
       super(message, e);

   }

}
