import java.io.File;

public class DeleteMultipleFiles {
    public static void main(String[] args) {
        // Specify the absolute paths of the files to be deleted
        String[] filePaths = {
            "/storage/emulated/0/Android/data/com.tencent.iglite/files/ProgramBinaryCache",
            "/storage/emulated/0/Android/data/com.tencent.iglite/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Config",
            "/storage/emulated/0/Android/data/com.tencent.iglite/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/@NOOB_BAADY_GAMING",
            "/storage/emulated/0/Android/data/com.tencent.iglite/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/@NOOB_BAADY",
            "/storage/emulated/0/Android/data/com.tencent.iglite/files/UE4Game/ShadowTrackerExtra/ShadowTrackerExtra/Saved/NOOB_BAADY_UpdateInfo"
            // Add more file paths if needed
        };

        for (String filePath : filePaths) {
            File file = new File(filePath);

            // Attempt to delete the file
            boolean deleted = file.delete();

            if (deleted) {
                System.out.println("Data has been reset " + file.getName());
            } else {
                System.out.println("Access failed " + file.getName());
            }
        }
    }
}
