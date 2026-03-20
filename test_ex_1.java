
public class test_ex_1 {

    public static int main(String mot) {
        int count = 0;
        String voyelles = "aeiouy";

        for (int i = 0; i < mot.length(); i++) {
            char c = mot.charAt(i);
            if (voyelles.indexOf(c) != -1) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String mot = "hello world";
        System.out.println(voyelles(mot));
    }
}