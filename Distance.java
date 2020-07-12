import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Distance{

	public static void main(String[] args){

		ArrayList<String> distanceConvertB = new ArrayList<String>();
		//		contact.add(newContactName.nextLine());   		ArrayList<String> contact = new ArrayList<String>();    //

		//picking what to convert//
		Scanner dconvertA = new Scanner(System.in);
		System.out.println("Pick a unit to convert: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Kilometers, [5]Inchs, [6]Feet, [7]Yards, [8]Miles.");
		String distanceConvertA = dconvertA.nextLine();	

		//if distanceconverta is not 1-8//
		if (!distanceConvertA.equals("1") && !distanceConvertA.equals("2") && !distanceConvertA.equals("3") && !distanceConvertA.equals("4") && !distanceConvertA.equals("5") && !distanceConvertA.equals("6") && !distanceConvertA.equals("7") && !distanceConvertA.equals("8")){
			System.out.println("Incorrect Input.");
		} else {

		//picking what to convert to//
		if (distanceConvertA.equals("1")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Centimeters, [2]Meters, [3]Kilometers, [4]Inchs, [5]Feet, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());		

		} else if (distanceConvertA.equals("2")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Meters, [3]Kilometers, [4]Inchs, [5]Feet, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("3")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Kilometers, [4]Inchs, [5]Feet, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("4")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Inchs, [5]Feet, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("5")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Kilometers, [5]Feet, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("6")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Kilometers, [5]Inchs, [6]Yards, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("7")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Kilometers, [5]Inchs, [6]Feet, [7]Miles.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else if (distanceConvertA.equals("8")){

		Scanner dconvertB = new Scanner(System.in);
		System.out.println("Pick a unit to convert to: [1]Millimeters, [2]Centimeters, [3]Meters, [4]Kilometers, [5]Inchs, [6]Feet, [7]Yards.");
		distanceConvertB.add(dconvertB.nextLine());	

		} else {
			System.out.println("Incorrect Input.");
		}

		if (!distanceConvertB.contains("1") && !distanceConvertB.contains("2") && !distanceConvertB.contains("3") && !distanceConvertB.contains("4") && !distanceConvertB.contains("5") && !distanceConvertB.contains("6") && !distanceConvertB.contains("7")){
			System.out.println("Incorrect Input");
		} else{

		//number needed to convert//
		Scanner unit = new Scanner(System.in);
		System.out.println("What is the length?");
		int unitValue = unit.nextInt();	


		if (distanceConvertA.equals("1")) {//millimeter//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue / 10 + " Centimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue / 1000 + " Meters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 1000000 + " Kilometers");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue / 25.4 + " Inchs");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue / 305 + " Feet");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue / 914 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 1852000 + " Miles");				
			}
		} else if (distanceConvertA.equals("2")){//centimeter//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 10 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue / 100 + " Meters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 100000 + " Kilometers");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue / 2.54 + " Inchs");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue / 30.48 + " Feet");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue / 91.44 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 185200 + " Miles");				
			}
		} else if (distanceConvertA.equals("3")){//meter//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 1000 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 100 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 1000 + " Kilometers");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue * 39.37 + " Inchs");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue * 3.281 + " Feet");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue * 1.094 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 1852 + " Miles");				
			}
		} else if (distanceConvertA.equals("4")){//kilometer//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 1000000 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 100000 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue * 1000 + " Meters");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue * 39370 + " Inchs");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue * 3281 + " Feet");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue * 1094 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 1.852 + " Miles");				
			}
		} else if (distanceConvertA.equals("5")){//inches//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 25.4 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 2.54 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 39.37 + " Meters");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue / 39370 + " Kilometers");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue / 12 + " Feet");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue / 36 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 72913 + " Miles");				
			}
		} else if (distanceConvertA.equals("6")){//feet//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 304.8 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 30.48 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 3.281 + " Meters");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue / 3281 + " Kilometers");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue * 12 + " Inchs");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue / 3 + " Yards");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 6076 + " Miles");				
			}
		} else if (distanceConvertA.equals("7")){//yards//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 914.4 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 91.44 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue / 1.094 + " Meters");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue / 1094 + " Kilometers");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue * 36 + " Inchs");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue * 3 + " Feet");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue / 2025 + " Miles");				
			}
		} else if (distanceConvertA.equals("8")){//miles//
			if (distanceConvertB.contains("1")){
				System.out.println(unitValue * 1852000 + " Millimeters");
			} else if (distanceConvertB.contains("2")){
				System.out.println(unitValue * 185200 + " Centieters");				
			} else if (distanceConvertB.contains("3")){
				System.out.println(unitValue * 1852 + " Meters");				
			} else if (distanceConvertB.contains("4")){
				System.out.println(unitValue * 1.852 + " Kilometers");				
			} else if (distanceConvertB.contains("5")){
				System.out.println(unitValue * 72913.4 + " Inchs");				
			} else if (distanceConvertB.contains("6")){
				System.out.println(unitValue * 6076.12 + " Feet");				
			} else if (distanceConvertB.contains("7")){
				System.out.println(unitValue * 2025 + " Yards");				
			}
		}



	}
	}
	}
}