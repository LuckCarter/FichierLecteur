public class Main {

    public static void main(String[] args){
        LecteurFilesInterface lf = new LecteurFichier("C:/Users/pater/Desktop/files.txt");
        lf.read();
        lf.display();
        System.out.PalindromeLecteur();

        LecteurFilesInterface lr = new ReverseLecteur("C:/Users/pater/Desktop/files.txt");
        lr.read();
        lr.display();
        System.out.PalindromeLecteur();

        LecteurFilesInterface lp = new PalindromeLecteur("C:/Users/pater/Desktop/files.txt");
        lp.read();
        lp.display();
    }
}
