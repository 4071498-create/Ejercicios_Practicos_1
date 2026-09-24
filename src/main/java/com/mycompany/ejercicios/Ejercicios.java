/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicios;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author prato
 */
public class Ejercicios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        /**
        //Ejercicio 1:
        System.out.println("Ejercicio 1 -----------------");
        File carpeta = new File("ficheros_dam");
        if(carpeta.exists() && carpeta.isDirectory()){
            String[] ficheros = carpeta.list();
            System.out.println("La carpeta 'ficheros_dam' existe y contiene " + ficheros.length + " archivo(s)");
        }else{
            System.out.println("La carpeta 'ficheros_dam' no existe, creandola...");
            carpeta.mkdir();
            File log = new File("ficheros_dam/setup.log");
            try {
                log.createNewFile();
                System.out.println("Carpeta creada con éxito");
            } catch (IOException e) {
                System.out.println(e);
            }
        }
        
        * 
        //Ejercicio 2:
        System.out.println("Ejercicio 2 -----------------");
        File temp = new File("ficheros_dam/temp.bak");
            try {
                temp.createNewFile();
            } catch (IOException e) {
                System.out.println(e);
            }
        while(true){
            System.out.print("Introduzca una ruta para limpiar: ");
            String ruta = scanner.nextLine();
            File carpetaLimpiar = new File(ruta);
            if(carpetaLimpiar.exists()){
                if(temp.exists()){
                    System.out.print("Desea borrar el archivo '" + temp.getName()+"'? s/n ");
                    String res = scanner.nextLine();
                    if("s".equals(res) | "S".equals(res)){
                        temp.delete();
                        System.out.println("Archivo borrado con éxito");
                    }
                }else{
                    System.out.println("No hay archivos para borrar");
                }
                break;
            }else{
                System.out.println("El directorio no existe");
            }
        }
        
        * 
        //Ejercicio 3:
        System.out.println("Ejercicio 3 -----------------");
        File c = new File("MurciaFP/2026/AccesoDatos");
        c.mkdirs();
        System.out.println("Creado el sistema de carpetas, presione enter para renombrar la ultima carpeta: ");
        String i = scanner.nextLine();
        File nc = new File("MurciaFP/2026/AD_Backup");
        c.renameTo(nc);
        System.out.println("Carpeta renombrada con éxito.");
            
        * 
        //Ejercicio 4:
        try (FileInputStream ois = new FileInputStream("logo.png")) {
            byte[] b = ois.readAllBytes();
            try (FileOutputStream oos = new FileOutputStream("copia_logo.png")) {
                oos.write(b);
            }catch(IOException e){
            System.out.println(e);
        }
        }catch(IOException e){
            System.out.println(e);
        } 
        
        * */
        //Ejercicio 5:
        
        
    }
}
