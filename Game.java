import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Game{
    int x;
    int y;
    char z;
    
    public Game(int x, int y, char z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    
    public void gameStart(){
        Scanner skan1 = new Scanner(System.in);
        System.out.println("Please put nr of rows");
        int r = skan1.nextInt();
        
        Table table = new Table(r);
        table.showBoard(table.createTable());
        
        Game game = new Game(0,0,'a');
        
        char[][] tab2 = new char[r][r];
        tab2 =game.modTable(table.createTable());
        table.showBoard(tab2);
        
        CellAlive cellalive = new CellAlive();
       
        table.showBoard(cellalive.checkIfCellAlive(tab2));

        for (int i=0;i<1;i++){
            i--;
            System.out.println("Display next step?Y/N");
            String answer = skan1.next();
            if (answer.equals("Y")){
                tab2=cellalive.checkIfCellAlive(tab2);
                tab2=cellalive.checkIfCellAlive(tab2);
                table.showBoard(cellalive.checkIfCellAlive(tab2));
                cellalive.checkIfSomeoneAlive(cellalive.checkIfCellAlive(tab2));
            }
            else {
                System.out.println("Bye");
                System.exit(1);
            }
        }

    }
    
    public char[][] modTable(char[][] arr){
         Scanner skan1 = new Scanner(System.in);
         boolean decider = true;
         
         do {
         System.out.println("Please put coordinate X");
         x = skan1.nextInt();
         System.out.println("Please put coordinate Y");
         y = skan1.nextInt();
         
         arr[y][x]='X';
         
         System.out.println("Do you want more living cells?Y/N");
         z = skan1.next().charAt(0);
         if (z=='N'){
             decider=false;
         }
         }
         while (decider);
         return arr;
    }
    
    

    
}