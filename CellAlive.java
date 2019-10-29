public class CellAlive{
    
    
    public char[][] checkIfCellAlive(char[][] tab){
        
        CellAlive cellalive = new CellAlive();
        int[][] tabpoints= new int[tab.length][tab.length];
        
        
     for (int i=0;i<tab.length;i++){
         for (int j=0;j<tab.length;j++){
             int pt = 0;
             if (tab[i][j]=='X'){
                 
                 pt = cellalive.checkNeighboursAlive(tab,i,j);
                 pt++;
                 tabpoints[i][j]=pt;
                 
             }
             if (tab[i][j]=='*'){
                 pt = cellalive.checkNeighboursAlive(tab,i,j);
                 tabpoints[i][j]=pt;
                 }
                 
             }
         }
       return  (cellalive.createNewTab(tab,tabpoints));
    }
    
    public int checkNeighboursAlive(char[][] tab, int x, int y){
        
        int pt = 0;
        try{
            if (tab[x-1][y-1]=='X'){
            pt+=1;
         }
        }
         catch (ArrayIndexOutOfBoundsException exception) {
              //continue;
          }
        
        try{
        if (tab[x][y-1]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
        try{  
        if (tab[x+1][y-1]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
        try{  
        if (tab[x-1][y]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
        try{  
        if (tab[x+1][y]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
         try{ 
        if (tab[x-1][y+1]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
              //continue;
          }
        try{  
        if (tab[x][y+1]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
        try{ 
        if (tab[x+1][y+1]=='X'){
            pt+=1;
         }
        }
        catch (ArrayIndexOutOfBoundsException exception) {
             // continue;
          }
        return pt;
    }
    
    public char[][] createNewTab(char[][] tab,int[][] tabpoints){
        for (int i=0;i<tab.length;i++){
         for (int j=0;j<tab.length;j++){
             if (tabpoints[i][j]==3){
             tab[i][j]='X';
         } else {
                tab[i][j]='*';
            }
         }
        }     
        return tab;     
    }

    public void checkIfSomeoneAlive(char[][] tab){
        int ptAlive=0;
        for (int j=0;j<tab.length;j++){
            for (int i=0;i<tab.length;i++){
                if (tab[j][i]=='X'){
                    ptAlive++;
                }
            }
        }
        if (ptAlive==0){
            System.out.print("Every cell is dead. Game over");
            System.exit(1);
        }

    }

}