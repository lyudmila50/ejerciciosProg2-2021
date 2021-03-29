package logica;
public class Main {
	 Usuario[] usuarios = new Usuario[5];// declaramos un arreglo
	 
	public static void printBlogsByAutor(String mailAutor,Blog[] blogs) ;
		for (int i=0; i<usuarios.length;i++) {
			if (usuarios[0].getAutor=mailAutor) {
				System.out.println(usuarios[i].getAutor);
			}
		}
	
public static void main(String[]args) {
	 
	Usuario User1 = new Usuario("Juan","juan@juan.com",1234,1);
	Usuario User2 = new Usuario( "Carlos","carlos@carlos.com",1234,2);
	Usuario User3 = new Usuario("Pedro","pedro@pedro.com",1234,2);
	usuarios[0]=User1;
	usuarios[1]=User2;
	usuarios[2]=User3;
	
	Blog Blog1 = new Blog("Un dia mas en el universo","Es un libro muy bello, muy entretenido… o no...","juan@juan.com");
	Blog Blog2 = new Blog("La divina comedia","Es un libro muy bello, habla del infierno segun Dante","carlos@carlos.com");
	Blog Blog3 = new Blog("El hombre en busca de sentido","Es un libro muy bello, habla de que todos deberiamos tener un sentido de vida","carlos@carlos.com");
	
	Blog[] blogs = { Blog1, Blog2,Blog3};
	
	printBlogsByAutor("juan@juan.com",Blog1);
	
}

}
