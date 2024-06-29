import java.util.Arrays;
public class GradeBook{
	public static void main(String [] args){
			int [][] gradesArray = {{87,96,70},
					{68,87,90},
					{94,100,90},
					{100,81,82},
					{83,65,85},
					{78,87,65},
					{85,75,83},
					{91,94,100},
					{76,72,84},
					{87,93,73}};
			System.out.println(gradesArray.length);
			double [] averageRowArray = averageStudent(gradesArray);
			for(int i = 0; i < averageRowArray.length; i++) {
				System.out.println(averageRowArray[i]);
}
	}
	
	 public static double[] averageStudent(int[][]gradesArray) {
		 double[] averageRow = new double[gradesArray.length];
		 
		 for(int i = 0; i < gradesArray[0].length; i++) {
			 for(int j = 0; j < gradesArray.length; j++) {
				 averageRow[j] += gradesArray[j][i];
			 } 
		 }
		 for(int i = 0; i < gradesArray.length; i++) {
			 averageRow[i] /= gradesArray.length;
		 }
		 
		 return averageRow;
	 }
	
	
	
}

