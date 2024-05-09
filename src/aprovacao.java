public class aprovacao {


    public static void main (String[] args) {


        Aluno aluno1 = new Aluno();

        aluno1.nome = "João";
        aluno1.matricula = "123";
        aluno1.curso = "Engenharia";
        aluno1.materia1 = "Matematica";
        aluno1.materia2 = "Física";
        aluno1.materia3 = "Química";


        System.out.println("Ficha do Aluno");
        System.out.println(aluno1.nome);
        System.out.println("Matrícula" + " "+ aluno1.matricula);
        System.out.println(aluno1.curso);
        System.out.println(aluno1.nome + " " +"Está cursando:" + " "+ aluno1.materia1 + " , " +  aluno1.materia2 + " , " + aluno1.materia3);




        boolean aprovouemmat = aluno1.aprovacaomatematica(8);
        if (aprovouemmat) {
            System.out.println("você está aprovado em matemática");
        } else {

            System.out.println("você está de recuperação de matemática");
        }

        boolean aprovouemfisica = aluno1.aprovacaofisica(7);
        if (aprovouemfisica) {
            System.out.println("você está aprovado em fisica");
        } else {

            System.out.println("você está de recuperação de física");

        }


        boolean aprovouemquimica = aluno1.aprovacaoquimica(9);
        if (aprovouemquimica) {
            System.out.println("você está aprovado em quimica");
        } else {

            System.out.println("você está de recuperação de quimica");

        }

        if (aprovouemmat && aprovouemfisica && aprovouemquimica){

            System.out.println("Você passou de ano parabéns!");

        }else {

            System.out.println("Você não passou de ano ainda!");
        }


    }
}
