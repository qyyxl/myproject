import java.util.ArrayList;
import java.util.List;

public class ConnectionTest {

    public static void main(String[]args){
        List<String> list = new ArrayList<String>();
        list.add("FD//01");
        list.add("FD//02");
        list.add("FD//03");
        list.add("FD//04");
        list.add("FD//05");
        list.stream().
                filter(name -> !name.contains("//04")&&!name.contains("//05"))
                .forEach(name->{
                    System.out.println(name);
                });
    }
}
