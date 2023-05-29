package main.java.com.mycompany.examen_3ra_evaluacion_doberge;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem{
	private final List<Estudiante> estudiantes;
	public void main(String[] args) {
		// TODO Auto-generated method stub
		//No pudimos guardar varios estuiantes en un solo archivo
		String rutaE1 = "C:\\Examen3\\Estudiante1.est";
		String rutaE2 = "C:\\Examen3\\Estudiante2.est";
		String rutaE3 = "C:\\Examen3\\Estudiante3.est";
		String rutaE4 = "C:\\Examen3\\Estudiante4.est";
		String rutaE5 = "C:\\Examen3\\Estudiante5.est";
		//los objetos de prueba
		Estudiante E1 = new Estudiante("Julian",15,"Segundo");
		Estudiante E2 = new Estudiante("Elian",16,"Segundo");
		Estudiante E3 = new Estudiante("Jesus",17,"Segundo");
		Estudiante E4 = new Estudiante("Alonso",18,"Segundo");
		Estudiante E5 = new Estudiante("Luffy",19,"Segundo");
		//try catch para los errores IOException y FileNotFoundException
		try {
			//Pruebas con cada uno de los objetos
			addStudent(E1);
			storeData(E1,rutaE1);
			loadData(rutaE1);
			getStudent(15);
			
			addStudent(E2);
			storeData(E2,rutaE2);
			loadData(rutaE2);
			
			addStudent(E3);
			storeData(E3,rutaE3);
			loadData(rutaE3);
			
			addStudent(E4);
			storeData(E4,rutaE4);
			loadData(rutaE4);
			
			addStudent(E5);
			storeData(E5,rutaE5);
			loadData(rutaE5);
			System.out.println(E5);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	public StudentManagementSystem() {
            estudiantes = new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	//Debe añadir un nuevo estudiante al sistema
	public void addStudent(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	//Debe leer los datos del estudiante, conforme a su numero de lista
	public Estudiante getStudent(int nList){
		for (Estudiante estudiante : estudiantes) {
            if (estudiante.getNlista() == nList) {
            	return estudiante;
            }
        }
        return null;
    }
	public static void storeData(Estudiante estudiante, String fileName) throws IOException {
		//este método debe almacenar los datos de los estudiantes en un archivo
		//mediante el manejo de archivos.
		FileOutputStream foStream = new FileOutputStream(fileName);
		ObjectOutputStream ooStream = new ObjectOutputStream(foStream);
		ooStream.writeObject(estudiante);
		ooStream.close();
	}
	public static Estudiante loadData(String filename) throws IOException, ClassNotFoundException {
		//este método debería cargar los datos del estudiante desde el archivo. 
		Estudiante e1 = null;
		FileInputStream fiStream = new FileInputStream(filename);
		ObjectInputStream oiStream = new ObjectInputStream(fiStream);
		e1 =(Estudiante) oiStream.readObject();
		return e1;	
	}

}


