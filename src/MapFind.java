
import java.util.*;
import java.io.*;

class MapFind{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,String> map = new HashMap<String,String>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            map.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(map.containsKey(s)){
            	System.out.println(s+"="+map.get(s));
            }else
            	System.out.println("Not found");
        }
        in.close();
    }
}