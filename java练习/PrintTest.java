public class PrintTest{
    public static void main(String args[]){
        int a[][] = {{1,2},{3,4}};
        Matrix matrix = new Matrix(a);
        matrix.getMatrix();
    }
    
}
class Matrix{
    private int row;//行
    private int line;//列
    private int temp[][];
    Matrix(int a[][]){
        this.temp = a;
    }
    public void getMatrix(){
        System.out.println(temp);
    }
}