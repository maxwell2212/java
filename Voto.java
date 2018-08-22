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

    if (pessoa1.idade > pessoa2.idade){
		    System.out.println(pessoa1.nome + " é o mais velho!");
		}else if (pessoal.idade < pessoa2.idade){
		 	  System.out.println(pessoa2.nome + " é o mais velho!");
    }else{
        System.out.println("Eles são gêmeos");
    }

}
}
