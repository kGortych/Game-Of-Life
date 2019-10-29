import java.util.Arrays;

public class Table{
    int size =1;
    
    public Table(int size){
        this.size=size;
            }
            
    
    public char[][] createTable(){
       char[][] tab = new char[size][size];
        for(int i=0;i<size;i++){
            for (int j=0;j<size;j++){
                tab[i][j]='*';
             
             }
        }
        return tab;
    }
    
    String buildString(char c, int n) {
    char[] arr = new char[n];
    Arrays.fill(arr, c);
    return new String(arr);
  }
    
     public void showBoard(char[][] arr){
         char wall = '|';
         System.out.println(" "+buildString('-',size)+' ');
           for (int j=0;j<size;j++){
               String row = "|";
               for (int i=0;i<size;i++){
             row = row + arr[j][i];
                  }
                  row = row + wall;
                  System.out.println(row);
           }
           System.out.println(" "+buildString('-',size)+' ');
     }
     
     
     
     

    

    
}
    
