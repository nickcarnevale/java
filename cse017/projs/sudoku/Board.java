import java.util.ArrayList;
import java.util.Scanner;
import java.io.PrintWriter;  
import java.io.File;
import java.io.FileNotFoundException;

public class Board{

    private static ArrayList<ArrayList<Integer>> board;
    private static ArrayList<Integer> avaliableNumbers;
    private final int EMPTY = 0; 
    private static int prevRow = -1;
    private static int prevCol = -1;

    public Board(String filename){

        avaliableNumbers = new ArrayList<>(9);
        for(int i =0; i < 9; i++){
            avaliableNumbers.add(9);
        }

        board = new ArrayList<>(9);

        for(int i = 0; i < 9; i++){
            board.add(new ArrayList<>());
        }
        readBoard(filename);
    }

    private void readBoard(String filename) throws IllegalArgumentException{
        String nums = ""; 
        String[] numsArray;
        int num = -1; 
        try{
            File file = new File(filename);
            Scanner fileReader = new Scanner(file);
            for(int i = 0; i < 9; i ++){
                nums = fileReader.nextLine();
                numsArray = nums.split(" ");
                for(int j = 0; j < 9;j++){
                    num = Integer.parseInt(numsArray[j]);
                    if(num != 0){
                        board.get(i).add(num);
                        avaliableNumbers.set(num-1,avaliableNumbers.get(num-1)-1);
                    }
                    else{
                        board.get(i).add(num);
                    }  
                }
            }
        }catch(FileNotFoundException e){
            System.out.print("File not found.");
        }
    }

    private static boolean isAvaliable(int digit){
        if(avaliableNumbers.get(digit-1) > 0){
            return true;
        }
        else return false; 
    }

    private static boolean noNumbersLeft(){
        int num = 0; 
        for(int i = 0; i < 9; i++){
            num += avaliableNumbers.get(i);
        }
        if(num == 0){
            return true;
        }else return false; 
    }

    private static boolean checkMove(int row, int col){
        int num = board.get(row).get(col);
        if(num!= 0 && !isAvaliable(num)){
            return false; 
        }
        for(int i = 0; i < 9; i++){
            if(col != i){
                if(board.get(row).get(i) == num){
                    return false;
                }
            }
            
        }
        
        for(int i = 0; i < 9; i++){
            if(row != i){
                if(board.get(i).get(col) == num){
                return false; 
            }
            }
        }

        int box = 0; 
        if(row < 3 && col < 3){
            box = 1;
        }
        else if(row < 3 && col > 2 && col < 6){
            box = 2;
        }
        else if(row < 3 && col > 5 && col < 9){
            box = 3;
        }
        else if(row > 2 && row < 6 && col < 3 ){
            box = 4;
        }
        else if(row > 2 && row < 6 && col > 2 && col < 6){
            box = 5;
        }
        else if(row > 2 && row < 6 && col > 5 && col < 9){
            box = 6;
        }
        else if(row > 5 && row < 9 && col < 3){
            box = 7;
        }
        else if(row > 5 && row < 9 && col > 2 && col < 6){
            box = 8;
        }
        else{
            box = 9; 
        }

        switch(box){
            case 1:
            for(int i = 0; i < 3; i++){
                for(int j= 0; j < 3; j++){
                    if(i != row && j != col){
                        if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                    
                }
            }
            break;
            case 2:
            for(int i = 0; i < 3; i++){
                for(int j= 3; j < 6; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;                        

                    }
                    }
                }
            }
            break;
            case 3:
            for(int i = 0; i < 3; i++){
                for(int j= 6; j < 9; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
            case 4:
            for(int i = 3; i < 6; i++){
                for(int j= 0; j < 3; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
            case 5:
            for(int i = 3; i < 6; i++){
                for(int j= 3; j < 6; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
            case 6:
            for(int i = 3; i < 6; i++){
                for(int j= 6; j < 9; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
            case 7:
            for(int i = 6; i < 9; i++){
                for(int j= 0; j < 3; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){
 
                        return false;
                    }
                    }
                }
            }
            break;
            case 8:
            for(int i = 6; i < 9; i++){
                for(int j= 3; j < 6; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
            case 9:
            for(int i = 6; i < 9; i++){
                for(int j= 6; j < 9; j++){
                    if(i != row && j != col){
                    if(board.get(i).get(j) == num){

                        return false;
                    }
                    }
                }
            }
            break;
        }

        return true;    
    }

    public boolean solve(){
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board.get(i).get(j) == EMPTY){
                    
                    if(solve(i,j)){
                    }
                }
            }
        }
        return false; 
    }
    

    public boolean solve(int row, int col){
        int count = 0; 
        if(board.get(row).get(col) == EMPTY){

            for(int i = 0; i < 9; i++){
                count++;
                if(avaliableNumbers.get(i) > 0){
                    board.get(row).set(col,i + 1);
                    if(checkMove(row, col)){
                        prevRow = row;
                        prevCol = col; 
                        avaliableNumbers.set(i,avaliableNumbers.get(i)-1);
                        if(col == 8){
                            row++;
                            col = 1;
                            solve(row, col);
                            return true;
                        }
                        else{
                            col++; 
                            solve(row, col);
                            return true;
                        }
                    }
                    else{
                        board.get(row).set(col, EMPTY);
                        
                    }
                    
            }
        }
        }
    return false;

    }


    public String toString(){
        String output = "";
        for(int i = 0; i < 9; i ++){

                for(int j = 0; j < 9;j++){
                    output += (board.get(i).get(j) + " ");
                }
                output += "\n";
            }

        for(int i = 0; i < 9; i++){
            output += avaliableNumbers.get(i);
        }
       
        return output; 
    }

}