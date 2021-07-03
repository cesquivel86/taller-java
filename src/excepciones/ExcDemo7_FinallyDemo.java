package excepciones;

public class ExcDemo7_FinallyDemo {
    public static void main(String[] args) {
        for (int i=0;i<3;i++){
            ExcDemo7_UsoFinally.genExcepecion(i);
            System.out.println();
        }
    }
}
