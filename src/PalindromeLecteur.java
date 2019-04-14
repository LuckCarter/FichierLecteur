public class PalindromeLecteur extends Read implements LecteurFilesInterface {

    public PalindromeLecteur(String file) {
        super.file = file;
    }

    private boolean palindrome(int begin, int end) {
        if(begin == end) {
            return true;
        }
        if(content.charAt(begin) == content.charAt(end)) {
            if(!palindrome(begin+1, end-1)) {
                return true;
            }
        }
        else {
            return false;
        }
        return false;
    }

    public void display() {
        if(palindrome(0, super.content.length()-1)) System.out.PalindromeLecteur("Ceci est un palindrome.");
        else System.out.PalindromeLecteur("Ce n'est pas un palindrome.");
    }

    public void read() {
        super.read(file);
    }
}
