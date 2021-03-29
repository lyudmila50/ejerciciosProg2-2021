package logica;
public class Usuario {
	// Estado
public String nombre;
public String mail;
public int contrasena;
public int tipo;
// Comportamiento 
//constructor
Usuario(String nombre,String mail,int contrasena, int tipo){
	this.nombre=nombre;
	this.mail=mail;
	this.contrasena=contrasena;
	this.tipo=tipo;
}
//getters y setters
//getters
public String getNombre() {
	return this.nombre;
}

public String getMail() {
     return this.mail;
}
public int getContrasena() {
	return this.contrasena;
}
public int getTipo() {
	return this.tipo;
}
//setters
public void setNombre(String nombre) {
	this.nombre=nombre;
}
public void setMail(String mail) {
	this.mail=mail;
}
public void setContrasena(int contrasena) {
	this.contrasena=contrasena;
}
public void setTipo(int tipo) {
	this.tipo=tipo;
}
}
