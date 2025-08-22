package ch04;

class Test {
    static boolean isLetterString(String s) {
        for (int i = 0; i<s.length(); i++) {
            if (!Character.isLetter(s.charAt(i))) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isLetterString(null));
    }
}
