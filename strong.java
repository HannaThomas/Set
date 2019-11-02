import java.util.*;
import java.sql.*;
class strong{
    public static <T> Set<T> nonIdenticalSet(Set<T> a,Set<T> b)
    {
        return new HashSet<T>(){{
            addAll(a);
            addAll(b);
        }};
    }
    

    public static void main(String args[])
    {

//SET 1   
        HashMap<String, String> Map1 = new HashMap<>();
        Map1.put("name","Kamal");
        Map1.put("dob","15-02-1965");
        Map1.put("prof","artist");
        Map1.put("status","single");
        Map1.put("gender","male");
        ArrayList<String> keyList1 = new ArrayList<String>(Map1.keySet());
        ArrayList<String> valueList1 = new ArrayList<String>(Map1.values());
        
        HashMap<String, String> Map2 = new HashMap<>();
        Map2.put("name","Aradhi");
        Map2.put("dob","30-08-1989");
        Map2.put("prof","homemaker");
        Map2.put("status","married");
        Map2.put("gender","female");
        ArrayList<String> keyList2 = new ArrayList<String>(Map2.keySet());
        ArrayList<String> valueList2 = new ArrayList<String>(Map2.values());

        HashMap<String, String> Map3 = new HashMap<>();
        Map3.put("name","Zakhir");
        Map3.put("dob","03-12-1955");
        Map3.put("prof","Nil");
        Map3.put("status","married");
        Map3.put("gender","male");
        ArrayList<String> keyList3 = new ArrayList<String>(Map3.keySet());
        ArrayList<String> valueList3 = new ArrayList<String>(Map3.values());
        
        HashMap<String, String> Map4 = new HashMap<>();
        Map4.put("name","Jhon D");
        Map4.put("dob","21-03-1995");
        Map4.put("prof","personal");
        Map4.put("status","single");
        Map4.put("gender","male");
        ArrayList<String> keyList4 = new ArrayList<String>(Map4.keySet());
        ArrayList<String> valueList4 = new ArrayList<String>(Map4.values());
        
        //System.out.println("Initial mappings:"+Map1);
        //System.out.println("Initial mappings:"+Map2);

        Set setA= new HashSet(); 
        setA.add(Map1);
        setA.add(Map2);
        setA.add(Map3);
        setA.add(Map4);
        
        System.out.println("Set1:"+setA);

        


 //SET 2   
        HashMap<String, String> Map5 = new HashMap<>();
        Map5.put("name","Kajal");
        Map5.put("dob","15-02-1955");
        Map5.put("prof","artist");
        Map5.put("status","single");
        Map5.put("gender","female");
        ArrayList<String> keyList5 = new ArrayList<String>(Map5.keySet());
        ArrayList<String> valueList5 = new ArrayList<String>(Map5.values());
        
        HashMap<String, String> Map6 = new HashMap<>();
        Map6.put("name","Aradhi");
        Map6.put("dob","30-08-1989");
        Map6.put("prof","homemaker");
        Map6.put("status","married");
        Map6.put("gender","female");
        ArrayList<String> keyList6 = new ArrayList<String>(Map6.keySet());
        ArrayList<String> valueList6 = new ArrayList<String>(Map6.values());

        HashMap<String, String> Map7 = new HashMap<>();
        Map7.put("name","Zakhir");
        Map7.put("dob","03-12-1955");
        Map7.put("prof","Nil");
        Map7.put("status","married");
        Map7.put("gender","male");
        ArrayList<String> keyList7 = new ArrayList<String>(Map7.keySet());
        ArrayList<String> valueList7 = new ArrayList<String>(Map7.values());
        
        HashMap<String, String> Map8 = new HashMap<>();
        Map8.put("name","Johon D");
        Map8.put("dob","21-03-1985");
        Map8.put("prof","personal");
        Map8.put("status","single");
        Map8.put("gender","male");
        ArrayList<String> keyList8 = new ArrayList<String>(Map8.keySet());
        ArrayList<String> valueList8 = new ArrayList<String>(Map8.values());
        
        //System.out.println("Initial mappings:"+Map1);
        //System.out.println("Initial mappings:"+Map2);

        Set setB= new HashSet(); 
        setB.add(Map5);
        setB.add(Map6);
        setB.add(Map7);
        setB.add(Map8);
        
        System.out.println("Set2:"+setB);

        //non identical set
        System.out.println("NonIdentical Set: "+nonIdenticalSet(setA,setB));  
                             
    }
}