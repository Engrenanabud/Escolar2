public class Aluno {

    String nome;
    String matricula;
    String curso;
    String materia1;
    String materia2;
    String materia3;



    boolean aprovacaomatematica(float valormatematica){

        if (valormatematica >= 7){

            return true;

        } else {

            return false;
        }
    }

    boolean aprovacaofisica(float valorfisica){

        if (valorfisica >= 7){

            return true;

        } else {

            return false;
        }
    }

    boolean aprovacaoquimica(float valorquimica){

        if (valorquimica >= 7){

            return true;

        } else {

            return false;
        }
    }



}