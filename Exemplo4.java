public class Exemplo4 {
	String msg;
	public Exemplo4(){
	msg = "";
}

	public static void main(String[] args){
	Exemplo4 e1 = new Exemplo4();
	e1.msg ="Este";
	Exemplo4 e2 = new Exemplo4();
	e2.msg = e1.msg;
	System.out.println("Comparando os objs");
	System.out.println(e2.equals(e1));


}
}
