package logica;
public class Blog {
// estado
public String titulo;
public String cuerpo;
public String mailAutor;
//comportamiento
//constructor
Blog(String titulo,String cuerpo,String mailAutor){
	this.titulo=titulo;
	this.cuerpo=cuerpo;
	this.mailAutor=mailAutor;
}
//getters y setters
//getters
public String getTitulo() {
	return this.titulo;
}

public String getCuerpo() {
     return this.cuerpo;
}
public String getMailAutor() {
	return this.mailAutor;
}
//setters
public void setTitulo(String titulo) {
	this.titulo=titulo;
}
public void setCuerpo(String cuerpo) {
	this.cuerpo=cuerpo;
}
public void setMailAutor(String mailAutor) {
	this.mailAutor=mailAutor;
}
}
