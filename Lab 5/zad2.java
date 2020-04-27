package projekt;
public class zad2 {
    public static void main(String[] args){

       int[] tab = {3, 2, 3, 7,1,2,3,8};
       for(int i=0;i<tab.length;i++) {
           if(tab[i]==1)
           {
              if(tab[i+1]==2)
              {
                  if(tab[i+2]==3)
                  {
                      System.out.println("tablica zawiera sekwencję 1,2,3");
                  }
              }
           }
           else{

               System.out.println("Tablica nie zawiera skewencji");

           }
       }
    }
    }

