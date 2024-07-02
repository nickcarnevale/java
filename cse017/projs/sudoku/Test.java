public class Test{
    public static void main(String[]args){
        Board puzzle = new Board("sudoku.txt");
	    System.out.println(puzzle);
        boolean fact = puzzle.solve();
	    System.out.println(puzzle);
    }
}
