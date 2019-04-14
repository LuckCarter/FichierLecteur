import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public abstract class Read {

    protected String file;
    protected String content = "";

    public void read(String file) {
        FileInputStream in = null;
        File f = new File(file);

        try {
            in = new FileInputStream(f);
            int content;
            while ((content = in.read()) != -1) {
                this.content += (char)content;
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            try {
                if (in != null)
                    in.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
