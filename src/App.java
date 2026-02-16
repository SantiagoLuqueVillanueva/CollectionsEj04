import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();

        String text = "";

        for (int i = 0; i < 10; i++) {
            text = System.console().readLine();
            list.add(text);
        }

        Collections.sort(list);

        System.out.println();

        for (String word : list) {
            System.out.println(word);
        }
    }
}
