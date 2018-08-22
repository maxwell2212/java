public class Votar{
  public static void main (String args[]) {

    Eleitor pessoa1 = new Eleitor();
    pessoa1.nome = "Demetrius Goldenhaug";
    pessoa1.idade = 16;


    if (pessoa1.idade < 16){
		    System.out.println(pessoa1.nome + " você não precisa Votar");}
		else if (((pessoa1.idade >= 16) && (pessoa1.idade < 18)) || (pessoa1.idade > 64 )){
		 	  System.out.println(pessoa1.nome + " você é Facultativo!");}
    else {
        System.out.println(pessoa1.nome + " você tem que votar!");}


}
}
