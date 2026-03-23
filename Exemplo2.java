public class Exemplo2{
	public Exemplo2(){}
	public void mostrarMensagem(String msg){
	System.out.println(msg);
}
	public static void main(String[] args){
	Exemplo2 ex2;
	Exemplo2 meuPet;
	System.out.println("Antes da instância");
	ex2 = new Exemplo2();
	ex2.mostrarMensagem("Teste");
	meuPet = new Exemplo2();
	meuPet.mostrarMensagem("Está é a mensagem do meu pet lindo");



}



}
