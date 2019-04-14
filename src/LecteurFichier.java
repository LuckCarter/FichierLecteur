public class LecteurFichier extends Read implements LecteurFilesInterface {


    public LecteurFichier(String file) {
        super.file = file;
    }

    public void display() {
        System.out.println(content);
    }

    public void read() {
        super.read(file);
    }
}
