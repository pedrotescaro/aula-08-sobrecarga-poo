import java.util.Date;
 
public class App {
    public static void main(String[] args) throws Exception {
        Aluno a = new Aluno("Carlos", "301", new Date(124,8,24));
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno(new Date("06/01/1998"), "292");
        Aluno a3 = new Aluno("Alexandre", new Date("07/09/1980"));
        Aluno a4 = new Aluno("Marcos", "290");

        System.out.println("Nome: " + a.getNome());
        System.out.println("Matricula: " + a.getMatricula());
        System.out.println("Data de nascimento: " + a.getData());

        
        System.out.println("Nome: " + a1.getNome());

        System.out.println("Matricula: " + a2.getMatricula());
        System.out.println("Data de nascimento" + a2.getData());

        System.out.println("Nome: " + a3.getNome());
        System.out.println("Data de nascimento: " + a3.getData());
        
        System.out.println("Nome: " + a4.getNome());
        System.out.println("Matricula: " + a4.getMatricula());
      
    }
}