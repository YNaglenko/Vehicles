package ua.univer.vehicles;
/// тестинг gitHub235
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

import Helper.AbstractFactoryVehicles;
import Helper.FactoryVehicles;
import Model.CCar;
import Model.CVehicle;

// тест 555
class VehicleSortbySpeed implements Comparator<CVehicle> {

	public int compare(CVehicle v1, CVehicle v2) {
		return v1.getSpeed() - v2.getSpeed();
	}
}

class VehicleSortbyPrice implements Comparator<CVehicle> {
	public int compare(CVehicle v1, CVehicle v2) {
		return (int) (v1.getPrice() - v2.getPrice());

	}
}

class VehicleSortbyYear implements Comparator<CVehicle> {
	public int compare(CVehicle v1, CVehicle v2) {
		return v1.getYearAssembled() - v2.getYearAssembled();

	}
}


public class Main {

	public static void main(String[] args) {
		  
		AbstractFactoryVehicles vehicles = new FactoryVehicles();
		CVehicle [] masVehicle = new CVehicle[25];
		for (int i = 0; i < masVehicle.length; i++) {
			masVehicle[i] = vehicles.randVehicle();
		}
		
		System.out.println("******** Отображение оригинального массива*******");
		for (CVehicle vehicle : masVehicle) {
			System.out.println(vehicle);
		}
		
		
		System.out.println("******** Сортировка Масива по скорости*******");
		Arrays.sort(masVehicle, new VehicleSortbySpeed());
		
		for (CVehicle vehicle : masVehicle) {
			System.out.println(vehicle);}
		
		
		System.out.println("******** Сортировка Масива по стоимости*******");
		Arrays.sort(masVehicle, new VehicleSortbyPrice());
		
		for (CVehicle vehicle : masVehicle) {
			System.out.println(vehicle);}
		
		System.out.println("******** Сортировка Масива по году выпуска*******");
		Arrays.sort(masVehicle, new VehicleSortbyPrice());
		
		for (CVehicle vehicle : masVehicle) {
			System.out.println(vehicle);}
		
		
		/*
		String prompt ="Введите тип ТС для его создания:"+"\n"+"1-Самолет, 2-Автомобиль, 3-Корабль, 0-Выход ";
		   int n = 50; // размерность тестового массива ТС
		   int choice = -1;
		   CVehicle [] vmass= new CVehicle [n];  // создание тестового массива ТС
		   int i=0;
		   Scanner sc = new Scanner(System.in);
		   CVehicle v = new CCar(); 
		   
		   System.out.println(prompt);
		   choice = sc.nextInt() ;
		   while (choice != 0) {
		   
		    System.out.println("Введите координаты, долгота: ");
		    int att = sc.nextInt();
		    
		    System.out.println("Введите координаты, широта: ");
		    int lon = sc.nextInt();
		    
		    System.out.println("Введите скорость: ");
		    int speed = sc.nextInt();
		    
		    System.out.println("Введите цену: ");
		    int price = sc.nextInt();
		    
		    System.out.println("Введите Год выпуска: ");
		    int yearAssembled = sc.nextInt();
		    
		    System.out.println(v.getCurID());    
		    vmass[i]=  v.createVehicle(choice, att, lon, speed, price, yearAssembled);
		    System.out.println("Создано ТС с параметрами:");
		    System.out.println(vmass[i].toString());
		     
		    System.out.println(prompt);
			   choice = sc.nextInt() ;
			   i++;
			  
		 } */
		   
           
	}

}

