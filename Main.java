import java.util.Scanner;
import java.util.Random;
class Main {
 public static void main(String[] args) {
        Random rand = new Random();
        Scanner lmaohaha = new Scanner(System.in);
        String[][] board= new String[6][7];
        for(int x = 0; x < board.length; x++){
            for(int y = 0; y < board[0].length; y++){
                
                board[x][y] = " _ ";
            }
            }
            System.out.println("AI OR LOCALMP");
            String mode = lmaohaha.nextLine();
            if(mode.equals("localmp")||mode.equals("LOCALMP")){
            System.out.println("Welcome to COnnected 5 - 1 (INSERT NOCKOFF BRAND FOR COPYRIGHT REASONS HERE!) lol ");
        for(int x = 0; x < board.length; x++){
            System.out.println(" ");
            for(int y = 0; y < board[0].length; y++){
        
                System.out.print(board[x][y]);
            }
        }

        boolean wincon = false;
        boolean isp1turn = true;
        while(wincon == false){
            if(isp1turn == true){
                System.out.println("ITS player 1 turn");
                System.out.println("what col would you like to place your pieace");
                int colplacemntp1 = lmaohaha.nextInt();
                int rowplaceholder = 5;
                while(board[rowplaceholder][colplacemntp1] != " _ " ){
                    rowplaceholder--;
                }
                board[rowplaceholder][colplacemntp1] = " x ";
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board[0].length; y++){
                
                        System.out.print(board[x][y]);
                        isp1turn = false; 
                    }

                }
                wincon = WINCON(board); 
            }
            if(isp1turn == false){
                System.out.println("ITS player 2 turn");
                System.out.println("what col would you like to place your pieace");
                int colplacemntp2 = lmaohaha.nextInt();
                int rowplaceholder2 = 5;
                while(board[rowplaceholder2][colplacemntp2] != " _ " ){
                    rowplaceholder2--;
                }
                board[rowplaceholder2][colplacemntp2] = " o ";
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board[0].length; y++){
                
                        System.out.print(board[x][y]);
                        isp1turn = true; 
                    }
                    
                }
                wincon = WINCON(board);
                
            
            }





        }













            }else if(mode.equals("ai")|| mode.equals("AI")){
               System.out.println("Welcome to COnnected 5 - 1 (INSERT NOCKOFF BRAND FOR COPYRIGHT REASONS HERE!) lol ");
        for(int x = 0; x < board.length; x++){
            System.out.println(" ");
            for(int y = 0; y < board[0].length; y++){
        
                System.out.print(board[x][y]);
            }
        }

        boolean wincon = false;
        boolean isp1turn = true;
        while(wincon == false){
            if(isp1turn == true){
                System.out.println("ITS player 1 turn");
                System.out.println("what col would you like to place your pieace");
                int colplacemntp1 = lmaohaha.nextInt();
                int rowplaceholder = 5;
                while(board[rowplaceholder][colplacemntp1] != " _ " ){
                    rowplaceholder--;
                }
                board[rowplaceholder][colplacemntp1] = " x ";
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board[0].length; y++){
                
                        System.out.print(board[x][y]);
                        isp1turn = false; 
                    }

                }
                wincon = WINCON(board); 
            }
            if(isp1turn == false){
              System.out.println("AI TURN ");
              System.out.println(" ");
                int colplacemntp2 = rand.nextInt(6);
                int rowplaceholder2 = 5;
                while(board[rowplaceholder2][colplacemntp2] != " _ " ){
                    rowplaceholder2--;
                }
                board[rowplaceholder2][colplacemntp2] = " o ";
                for(int x = 0; x < board.length; x++){
                    System.out.println(" ");
                    for(int y = 0; y < board[0].length; y++){
                
                        System.out.print(board[x][y]);
                        isp1turn = true; 
                    }
                    
                }
                wincon = WINCON(board);
                
            
            }





        }







            }
    }
    public static boolean WINCON(String[][] board){ 
      boolean wincon = false;
      for(int x = 0; x < board.length; x++){
                   
                    for(int y = 0; y < board[0].length - 3; y++){
                        if(board[x][y] == " x " && board[x][y+ 1] == " x " && board[x][y+ 2] == " x " && board[x][y+ 3] == " x "){
                            wincon = true;
                            
                            System.out.println("X WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 0; y < board[0].length; y++){
                        if(board[x][y] == " x " && board[x + 1][y] == " x " && board[x + 2][y] == " x " && board[x + 3][y] == " x "){
                            wincon = true;
                            
                            System.out.println("X WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 0; y < board[0].length - 3; y++){
                        if(board[x][y] == " x " && board[x + 1][y + 1] == " x " && board[x + 2][y + 2] == " x " && board[x + 3][y + 3] == " x "){
                            wincon = true;
                            
                            System.out.println("X WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 3; y < board[0].length; y++){
                        if(board[x][y] == " x " && board[x + 1][y - 1] == " x " && board[x + 2][y - 2] == " x " && board[x + 3][y - 3] == " x "){
                            wincon = true;
                            System.out.println("X WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length; x++){
                   
                    for(int y = 0; y < board[0].length - 3; y++){
                        if(board[x][y] == " o " && board[x][y+ 1] == " o " && board[x][y+ 2] == " o " && board[x][y+ 3] == " o "){
                            wincon = true;
                        
                            System.out.println("O WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 0; y < board[0].length; y++){
                        if(board[x][y] == " o " && board[x + 1][y] == " o " && board[x + 2][y] == " o " && board[x + 3][y] == " o "){
                            wincon = true;
                            
                            System.out.println("O WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 0; y < board[0].length - 3; y++){
                        if(board[x][y] == " o " && board[x + 1][y + 1] == " o " && board[x + 2][y + 2] == " o " && board[x + 3][y + 3] == " o "){
                            wincon = true;
                            
                            System.out.println("O WON");

                        }
                 
                    }
                }
                for(int x = 0; x < board.length - 3; x++){
                   
                    for(int y = 3; y < board[0].length; y++){
                        if(board[x][y] == " o " && board[x + 1][y - 1] == " o " && board[x + 2][y - 2] == " o " && board[x + 3][y - 3] == " o "){
                            wincon = true;
                           
                            System.out.println("O WON");

                        }
                 
                    }
                }

                  return wincon;
    }
}