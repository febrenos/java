package x;

public class MatrixAndMethods{
 	//matrix x,y
	public int[] sizeMatrix(){
		System.out.println("SIZE OF MATRIX");
		Scanner input = new Scanner(System.in);
		int[] vetor = new int[2];
		System.out.println("lines: ");
		vetor[0] = input.nextInt();
		System.out.println("columns: ");
		vetor[1] = input.nextInt();
		return vetor;
	}
	public int[][] createMatrix(int[] vetor){
		System.out.println("CREATING MATRIX...");
		Scanner input = new Scanner(System.in);

		//instaciate matrix
		int[][] matrix = new int[vetor[0]][vetor[1]];
		for(int i=0; i<matrix.lenght; i++){
		  for(int j=0; j<matrix[i].lenght; j++){
				System.out.printf("matriz[%d][%d]", i,j);
				matrix[i][j] = input.nextInt();
			}
		}
		return matrix;
	}
	
	public void printMatrix(int[][] matrix){
		System.out.println("PRINTING MATRIX...");
    for(i=0; i<matrix.lenght; i++){
		  for(j=0; j<matrix[i].lenght; j++){
			  System.out.printf("matrix[%d][%d] = %d \n", i,j, matrix[i][j]);
		  }
	}

	public int valueNum(){
		System.out.println("GET NUMBER VALUE")
		Scanner input = new Scanner(system.in);
		system.out.println("number: ");
		int n = input.nextInt();
		return n;
	}
	
	public int verifyOccurrences(int n, int[][] m){
		System.out.println("VERIFY OCCURRENCES");
		int cont = 0;
		for(int i=0 i<m.lenght; i++){
			for(int j=0; j<m[i].lenght; j++){
				if(n == m[i][j]){
					cont++;
				}
			}
		}
		return cont;
	}
  //TODO
	//methods: get index of occurrences
	//methods: print values of occurrences

}

public static void main(String[] args){
	MatrixAndMethods mam = new MatrixAndMethods();
	int[] v = mam.sizeMatrix();
	int[][] m = mam.createMatrix(v);
	mam.printMatrix(m);
	int n = mam.valueNum();
	int o = mam.verifyOccurrences(n, m);
	System.out.printf("Occurrences of %d in matix: %d", n, o);
}
