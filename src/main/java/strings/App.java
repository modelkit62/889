package strings;

import org.dbunit.dataset.IDataSet;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class App {


    @Test
    public void stringConverter(){
        String start = "my pOLLA is bIg enough joder puta!";
        String end = "My polla Is Big Enough joder Puta!";
        assertEquals(end, App.converter(start));

    }


   static  List<String> lista = Arrays.asList("joder", "polla");

    public static String converter(String start) {
        // start = "my pOLLA is bIg enough joder puta!";

        String s = start.toLowerCase();
        String[] split = s.split(" ");
        for(int i = 0; i < split.length; i++){
            if(!lista.contains(split[i])){
                split[i] = capitalMe(split[i]);
            }
        }
        return String.join( " ", split);

    }

    private static String capitalMe(String s) {
        return s.substring(0,1).toUpperCase() + s.substring(1, s.length());
    }

}
