import java.util.Scanner;
public class getandset {

    int age, score;
    String name;

    void setage(int age) {
        this.age = age;
    }

    void setscore(int score) {
        this.score = score;
    }

    void setname(String name) {
        this.name = name;

    }

    int getage() {
        return age;
    }

    int getscore() {
        return score;
    }

    String getname() {
        return name;
    }
}
        class getit extends getandset {
            getit() {
            Scanner scan = new Scanner(System.in);
            System.out.println("Set one of them: ");
            setage(scan.nextInt());

            System.out.println(getage());
        }

        public static void main(String[] args) {
            new getit();
            }
}
