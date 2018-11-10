import java.io.File;

public class ShowFileListUtil {
    private static String sep = "";

    public static void listFile(File file) {
        ShowFileListUtil.sep += ".";
        if (file.isDirectory()) {
            File[] fileList = file.listFiles();
            for (int i = 0; i < fileList.length; i++) {
                ShowFileListUtil.listFile(fileList[i]);
            }
        } else {
            System.out.println(ShowFileListUtil.sep + file.getName());// + " F");
        }
        ShowFileListUtil.sep = ShowFileListUtil.sep.substring(0, ShowFileListUtil.sep.lastIndexOf('.'));
    }
}