package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.println("=== Reservation ===");
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in date (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out date (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());

		Reservation reservation = new Reservation(number, checkIn, checkOut);

		String error = reservation.updateDate(checkIn, checkOut);
		if (error != null) {
			System.out.println("Error in reservation: " + error);
		} else {
			System.out.println(reservation);
		}

		sc.close();

	}

}
