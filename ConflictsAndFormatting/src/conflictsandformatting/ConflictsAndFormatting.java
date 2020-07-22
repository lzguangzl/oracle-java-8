package conflictsandformatting;

import java.util.Date;
import java.util.List;

public class ConflictsAndFormatting {
    public static void main(String[] args) {
        Date date;

        // Conflicts with java.util, hence java.sql need to be included
        java.sql.Date sqlDate;
    }

    // Crtl + Alt + L to format code in intellij IDEA
    public void checkEmpty (List list) {
        if(list.isEmpty()){
            System.out.println("empty");
        } else {
            System.out.println("not empty");
        }
    }
}
