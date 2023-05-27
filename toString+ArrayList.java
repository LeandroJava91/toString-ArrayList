import java.util.ArrayList;
import java.util.List;

///////////////////Clase Producto/////////////////////

class Producto{
 
 public String nombrepro;
 public int precio;
    
    public Producto(String nombrepro, int precio){
        this.nombrepro=nombrepro;
        this.precio=precio;
    }
}

///////////////////Clase Persona/////////////////////

class Persona{
    
    public String nombre;
    public String apellido;
    
    List<Producto> productos;
    
    public Persona(String nombre, String apellido, List<Producto> productos){
        this.nombre=nombre;
        this.apellido=apellido;
        this.productos=productos;
    }
    

    public String toString(){
        
        StringBuilder sb = new StringBuilder();////declaro el StringBuilder
	    sb.append("Pedido:\n");
	    sb.append("Usuario: ").append(this.nombre);
	    sb.append(" "+this.apellido);
	    sb.append("\n");
	    sb.append("Productos:\n");
	   
	    for (Producto producto : productos) {
	        sb.append("Nombre: ").append(producto.nombrepro)
	          .append(", Precio: ").append(producto.precio)
	          .append("\n");
	       
	    }
	   
	    return sb.toString();
    }
    
    
    
        }

///////////////////Clase Sumar/////////////////////        
        //esta clase sirve de logica de negocio para sumar el total de productos


        class Sumar{
        public int productoTota=0;
        
        
        public void sumas(List<Producto> productossum){
            
            for(Producto prod: productossum){
                productoTota+=prod.precio;
                            }
                         
               
        }
        public String toString(){
            return "total "+ productoTota;
        }
        }


///////////////////Clase Principal///////////////////// 

public class MyClass {
    public static void main(String args[]) {
      
      Producto pro1= new Producto("harina",100);
       Producto pro2= new Producto("polenta",400);
        Producto pro3= new Producto("carne",1000);
        Producto pro4= new Producto("carne",5000);
        
        List<Producto>listpro= new ArrayList<>();
        listpro.add(pro1);
        listpro.add(pro2);
        listpro.add(pro3);
        listpro.add(pro4);
        
        Sumar suma=new Sumar();
        suma.sumas(listpro);
        Persona perso= new Persona("leandro","duarte",listpro);

      System.out.println(perso.toString()+" total"+suma);
    }
}