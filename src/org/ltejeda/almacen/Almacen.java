package org.ltejeda.almacen;

import org.ltejeda.almacen.dominio.*;

public class Almacen {
    public static void main(String[] args) {
        Producto[] productos = new Producto[8];
        productos[0] = new Fruta("manzana", 2000,500,"verde");
        productos[1] = new Fruta("pera", 1500, 400, "verde");
        productos[2] = new Limpieza("lavaloza", 1200, "aromatizantes", 3);
        productos[3]= new Limpieza("desinfectante", 2500, "HCl", 2.5);
        productos[4] = new Lacteo("yogur", 3000, 2, 35);
        productos[5] = new Lacteo("queso", 20000, 1, 27);
        productos[6] = new NoPerecedero("atun", 9000, 30, 180);
        productos[7] = new NoPerecedero("Frijoles", 7200, 45, 800);

        for (Producto producto: productos) {
            System.out.println("=========" + producto.getClass().getSimpleName());
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio");

            if(producto instanceof Fruta){
                System.out.println("Peso: " + ((Fruta) producto).getPeso() + " g");
                System.out.println("Color: " + ((Fruta) producto).getColor());
            }

            if(producto instanceof Limpieza){
                System.out.println("Componentes: " + ((Limpieza) producto).getComponentes());
                System.out.println("Litros: " + ((Limpieza) producto).getLitros() + "L");
            }

            if(producto instanceof Lacteo){
                System.out.println("Cantidad: " + ((Lacteo) producto).getCantidad() + " unidades");
                System.out.println("Proteinas: " + ((Lacteo) producto).getProteinas());
            }

            if(producto instanceof NoPerecedero){
                System.out.println("Contenido: " + ((NoPerecedero) producto).getContenido());
                System.out.println("Calorias: " + ((NoPerecedero) producto).getCalorias());
            }
        }
    }
}
