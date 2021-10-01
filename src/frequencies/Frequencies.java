/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frequencies;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Usuari
 */
public class Frequencies {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("***********************");
        System.out.println("**  Mr A.          ****");
        System.out.println("***********************");
        
        String text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer quis sagittis velit, a tristique lectus. Pellentesque ut odio mattis, imperdiet tortor eu, rhoncus erat. Sed diam nibh, dictum non purus ac, dictum maximus risus. Duis ac tortor at quam porttitor ultrices ac sed metus. Donec ipsum lorem, iaculis id sapien vitae, eleifend maximus felis. Fusce vitae nisl at sapien iaculis tempor. Nunc vel luctus metus, et vehicula eros. Nulla facilisi. Sed ex felis, placerat eu risus ut, pharetra ultrices ex. Nulla viverra orci a tincidunt gravida. Aliquam erat volutpat. Maecenas sit amet enim massa. Pellentesque pulvinar id turpis sed mattis. In consectetur mi id sem blandit molestie.";


        String[] paraules = text.split("[ ,\\./-;*]");


        Map<String, Integer> frequencies = new TreeMap<>();
        
        for (String p1 : paraules) {
            String p = p1.toLowerCase();
            if (!p.isEmpty()) {
                
                Integer f = frequencies.get(p);
                if(f==null) {
                    f=0;
                }
                f++;
                frequencies.put(p, f);
            }
        }
        for(String p: frequencies.keySet()){
            System.out.println(">"+p+ ":"+ frequencies.get(p));
        }

      
    }

}
