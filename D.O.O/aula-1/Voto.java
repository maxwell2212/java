public class Voto{
  public static void main (String args[]) {

    Eleitor eleitor = new Eleitor();
    eleitor.titulo = 1234567;
    eleitor.nome = "Demetrius Goldenhaug";
    eleitor.idade = 56;
    eleitor.status = true;

    Eleitor eleitor2 = new Eleitor();
    eleitor2.titulo = 7654321;
    eleitor2.nome = "Bolsonaro";
    eleitor2.idade = 70;
    eleitor2.status = false;

    if (pessoa1.idade < 16){
		    System.out.println(pessoa1.nome + " Não precisa Votar");
		}else if (pessoa1.idade >= 16) && (pessoa1.idade > 64){
		 	  System.out.println(pessoa1.nome + " é Facultativo!");
    }else if{
        System.out.println("Eles são gêmeos");
    }

}
}
