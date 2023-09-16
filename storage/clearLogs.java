import javax.swing.JOptionPane;
import java.io.File;

public class DeleteFile {
    public static void main(String[] args) {
        // Specify the absolute path to the file
        String filePath = "/android/data/com.igce.tencent/data/cache/filename.txt";

        File myObj = new File(filePath);

        // Attempt to delete the file
        boolean deleted = myObj.delete();

        if (deleted) {
            // Display a success alert
            JOptionPane.showMessageDialog(null, "Logs cleared " + myObj.getName(), "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Display an error alert
            JOptionPane.showMessageDialog(null, "Access failed.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
}
