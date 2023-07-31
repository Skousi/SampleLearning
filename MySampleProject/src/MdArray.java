
public class MdArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2d array*/
		int[][] matrix =new int[5][2];
		matrix[0][0]=6;
		matrix[3][1]=4;
		System.out.println(matrix[0][0]);
		
		for (int n=0; n<5;n++) {
			for(int j=0; j<2; j++) {
				System.out.print(matrix[n][j]);
			}
			System.out.println();
	}
	}
}


