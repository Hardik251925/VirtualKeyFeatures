// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;  
import java.io.*; 
 public class VirtualKey {
    public static void main(String[] args) throws Exception {
        ArrayList<String> userList = new ArrayList<String>();
        String name="";
        int choice=0;
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        
        while(choice<4){
            System.out.println("VIRTUAL OPERATIONS");
            System.out.println("1 User Add");
            System.out.println("2 User Search");
            System.out.println("3 User Delete");
            System.out.println("4 Exit");
            System.out.println("Enter Your Choice :");
            try{
               choice=Integer.parseInt(br.readLine().toString().trim());   
            }catch(Exception e){
                
            }
          
            switch(choice)
            {
                
                case 1: System.out.println("Enter User Name :");
                name= br.readLine();
                userList.add(name);
                for(int i=0;i<userList.size();i++){
                    //System.out.println(userList.get(i));
                }
                break;
                case 2: System.out.println("Enter Search User Name :");
                 if(userList.size()>0){
                name= br.readLine();
                for(int i=0;i<userList.size();i++){
                    if(userList.get(i).contains(name)){
                         System.out.println(
                       userList.get(i)+"Position :"+i);
                        
                    }
                    
                }
                 break;
                     
                 }
                 case 3: System.out.println("Delete User Name :");
                 if(userList.size()>0){
                name = br.readLine();
                for(int i=0;i<userList.size();i++){
                    if(userList.get(i).contains(name)){
                        
                        userList.remove(i);
                        
                    }
                  //  System.out.println("User List after remove"+userList.get(i));
                    
                }
                break;     
                 }
                 default:return;
            }
          
          
        }
    }
}