/**
 * Created by Sakshi
 * date- 17/05/19
 * This program accepts a Map object having two key-value pairs with the keys val1 and val2.
 * If the key `val1` has a value, set the key `val2` to have that value, and Set the key
 * `val1` to have the value `" "`.
 */

package Programs;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapOperation {

    //accepts input map, modify values and return map object
    public Map<String,String> changeValue(Map<String,String> input) {
        Map<String,String> output=new HashMap<>();
        String[] key=new String[2];
        String[] value=new String[2];

        int i=0,index=0;
        Iterator<Map.Entry<String,String>> it=input.entrySet().iterator();

        //store key and value from input map in string arrays
        while (it.hasNext()) {
            Map.Entry<String,String> map1=it.next();
            key[i]=map1.getKey();
            value[i]=map1.getValue();
            i++;
        }

        int flag=0;
        String replace="";
        //find 'val1' and store its value in a variable
        for(int j=0;j<key.length;j++) {
            if(key[j].equals("Val1")) {
                replace=value[j];
                value[j]=" ";
                flag=1;
                break;
            }
        }
        if(flag==0) {
            return null;
        }

        //find 'val2' and update its value
        for (int j=0;j<key.length;j++) {
            if(key[j].equals("Val2")) {
                value[j]=replace;
                break;
            }
        }

        //put modified values in the map
        for (int k=0;k<key.length;k++) {
            output.put(key[k],value[k]);
        }
        return output;
    }
}
