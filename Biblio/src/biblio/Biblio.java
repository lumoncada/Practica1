package biblio;

import java.math.BigInteger;
import javax.swing.JOptionPane;

public class Biblio {

    int contLib=0, cod=1; 
    userBiblio libro [] = new userBiblio[5]; 
 
    public Biblio(){ 
 
        String ax;
        int op=0;
 
        do{
            ax = JOptionPane.showInputDialog(null, "1. Ingresar Libro\n"
                                                  +"2. Actualizar\n"
                                                  +"3. Buscar\n"
                                                  +"4. Eliminar\n"
                                                  +"5. Salir");
            if(ax!=null && !ax.equals("")){
                op = Integer.parseInt(ax);
 
                switch(op){
                    case 1:
                        ingresar();
                        break;
                    case 2:
                        actualizar();
                        break;
                    case 3:
                        buscar();
                        break;
                    case 4:
                        eliminar();
                        break;
                    case 5:
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "No es una opción valida");                  
                }
            }
 
        }while(op!=5);
    }
 
    public void ingresar(){        
 
        BigInteger anoPub, cantidad;
        String nombre, autor, codigo, area;
             
 
        nombre = JOptionPane.showInputDialog(null, "Ingrese el Nombre del libro: ");
        autor = JOptionPane.showInputDialog(null, "Ingrese el autor del libro: ");
        anoPub =  new BigInteger(JOptionPane.showInputDialog(null, "Ingrese el año de publicacíon: ")) ;
        cantidad =  new BigInteger(JOptionPane.showInputDialog(null, "Ingrese la cantidad de libros: ")) ;
        codigo = JOptionPane.showInputDialog(null, "Ingrese el codigo del libro: ");
        area = JOptionPane.showInputDialog(null, "Ingrese el Area del libro: ");
 
        userBiblio temp = new userBiblio();
 
        temp.setCod(cod); 
        temp.setNombre(nombre); 
        temp.setAutor(autor);
        temp.setAnoPub(anoPub);
        temp.setCantidad(cantidad); 
        temp.setCodigo(codigo);
        temp.setArea(area);
        
 
        libro[contLib] = temp;
        contLib++;  
        cod++;      
    }
 
    public void actualizar(){
 
        String ay="";
 
        for(int i=0; i<contLib; i++){
            ay+="Codigo: "+libro[i].getCod()+"n"
              + "Nombre: "+libro[i].getNombre()+"n"
              + "Autor: "+libro[i].getAutor()+"n"
              + "Año Publicacion: "+libro[i].getAnoPub()+"n"
              + "Cantidad: "+libro[i].getCantidad()+"n"     
              + "Codigo: "+libro[i].getCodigo()+"n"
              + "Area: "+libro[i].getArea()+"n"; 
        }
        JOptionPane.showMessageDialog(null, ay);
    }
 
    public void buscar(){
 
        String ax, c;
 
        ax = JOptionPane.showInputDialog(null, "Digite el nombre del libro a buscar");
        if(ax!=null && !ax.equals("")){
            c =ax; 
            if(contLib!=0){
                for(int i=0; i<contLib; i++){
                    if(c.equals(libro[i].getNombre())){
                        ax="";
                        ax+="Nombre: "+libro[i].getNombre()+"\n"
                          + "Apellido: "+libro[i].getAutor()+"\n"
                          + "Año Publicacion: "+libro[i].getAnoPub()+"\n"
                          + "Cantidad: "+libro[i].getCantidad()+"\n"   
                          + "Codigo: "+libro[i].getCodigo()+"\n"
                          + "Area: "+libro[i].getArea()+"\n"; 
                          break;
                    }
                    else{
                        ax="No se ha encontrado el libro :("; 
                    }
                }
                JOptionPane.showMessageDialog(null, ax);
            }
 
        }
    }
 
    public void eliminar(){
            String ax, c;
 
        ax = JOptionPane.showInputDialog(null, "Digite el nombre del libro a eliminar");
        if(ax!=null && !ax.equals("")){
            c =ax; 
            if(contLib!=0){
                for(int i=0; i<contLib; i++){
                    if(c.equals(libro[i].getNombre())){
                       libro[i].setNombre(null);
                       libro[i].setAutor(null);
                       libro[i].setAnoPub(null);
                       libro[i].setCantidad(null);  
                       libro[i].setCodigo(null);
                       libro[i].setArea(null);
                          break;
                    }
                    else{
                        ax="No se ha encontrado el libro :("; 
                        JOptionPane.showMessageDialog(null, ax);
                    }
                }
                
            }
 
        }
        
 
                        
    }
 
    public static void main(String[] args) {
 
        Biblio w = new Biblio(); 
        System.exit(0);        
    }
}