
package biblio;

import java.math.BigInteger;

public class userBiblio {
     private int cod; 
    private BigInteger anoPub, cantidad;
    private String nombre, autor, codigo, area;
    
 
  
    public int getCod() {
        return cod;
    }
 
 
    public void setCod(int cod) {
        this.cod = cod;
    }
 
 
  
    public String getNombre() {
        return nombre;
    }
 
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
 
  
    public String getAutor() {
        return autor;
    }
 
  
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
    public String getCodigo() {
        return codigo;
    }
 
  
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    public String getArea() {
        return area;
    }
 
   
    public void setArea(String area) {
        this.area = area;
    }
    
    public BigInteger getAnoPub() {
        return anoPub;
    }
 
   
    public void setAnoPub(BigInteger anoPub) {
        this.anoPub = anoPub;
    }
    
    
    public BigInteger getCantidad() {
        return cantidad;
    }
 
  
    public void setCantidad(BigInteger cantidad) {
        this.cantidad = cantidad;
    }
    
}



