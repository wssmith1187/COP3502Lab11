
import java.io.FileInputStream;
import java.util.Scanner;

public class FileCow extends Cow {
	
    protected String fileName;
    
    //Constructor
    public FileCow(String name, String fileName) {
        super(name);
        this.fileName = fileName;
        try {
            FileInputStream inStream = new FileInputStream(fileName);
            Scanner fileScanner = new Scanner(inStream);
            image = "";

            while(fileScanner.hasNextLine()) {
                image += fileScanner.nextLine() + "\n";
            }
            inStream.close();
        } catch (RuntimeException exception) {
            throw new RuntimeException("MOOOOO!!!!!!");
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void setImage() {
        throw new RuntimeException("Cannot reset FileCow Image");
    }

}
