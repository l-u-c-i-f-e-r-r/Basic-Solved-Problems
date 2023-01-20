
public class Ec {

  
        private String name;
     
        // Getter
        public String getName() {
          return name;
        }
     
        // Setter
        public void setName(String newName) {
          this.name = newName;
        }
     
         
         
         public static void main(String args[]) {
             // TODO code application logic here
             Ec myObj = new Ec();
             myObj.setName("John");
             System.out.println(myObj.getName());
     
         }
     }
     