public class Aluno{
double notasemestral;
String nome;
public Aluno(String n) {
notasemestral=0.0;
nome = n;
}
public void calcularNotaSemestral(double nota1, double nota2 ){
notasemestral = (nota1 + nota2) / 2;
}
}
Aluno teste;
teste = new Aluno("TEste");

