package com.adl.tasksesi4;

import java.util.Scanner;

public class TaskSesi4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TaskSesi4 task =new TaskSesi4();
		task.nomor1();

	}
	public void nomor1() {
		
		Scanner scan =new Scanner(System.in);
		
		String karakter ="@";
		String move ="";
		int xA=1;
		int yA=1;
		int maxX=21;
		int maxY=21;
		
		Boolean finish = true;
		
		
		
		
		while(!karakter.equals(finish)) {
			for (int x = 0; x <= maxX; x++) {
				for (int y = 0; y <= maxY; y++) {
					if (x==xA && y==yA) 
				     {
				      System.out.print(karakter);
				     } else if(x==20 && y==21) {
						System.out.print("");
					}else if(x==0 ||x==21||y==0||y==21){
						System.out.print("*");
					}else
						System.out.print(" ");
						
				}
					System.out.println();
			
			}
			System.out.print("Masukan arah (a ke kiri, d ke kanan, w keatas, s kebawah) : ");
			move = scan.nextLine();
		
			
			if (move.equalsIgnoreCase("w")) {
				xA = xA - 1;
			    if (xA < 0 ) yA = 0;
			}if (move.equalsIgnoreCase("s")) {
				xA = xA + 1;
			    if ( xA > maxX) yA = maxY;
				
			}if (move.equalsIgnoreCase("a")) {
				yA = yA - 1;
				if ( yA < 0 ) xA = 0;
			}if (move.equalsIgnoreCase("d")) {
				yA = yA + 1;
				if ( yA < 1 ) yA = maxY;
			}
		System.out.println("you win");
		}
		
	}
}
