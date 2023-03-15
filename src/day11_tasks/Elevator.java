package day11_tasks;

public class Elevator {
    public static void main(String[] args) {
        int floorNum=8;
        String companies = "Floor1";
        String companies2= "Floor2";
        String companies3= "Floor3";
        boolean selectFloor = floorNum == 1 || floorNum == 2 || floorNum == 3;
        if (selectFloor) {

            switch (floorNum) {
                case 1:
                    System.out.println(companies + ": Lobby, Verizon, Starbucks");
                    break;
                case 2:
                    System.out.println(companies2 + ": Cybertek, NASA, Intelsat");
                    break;
                default:
                    System.out.println(companies3 + ": Lyft, BofA, Stake house");

            }

        } else {
            System.out.println("Invalid floor");
        }
    }
}
/*
 Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cybertek, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"
			 anything else: print "Invalid floor - 6"

			 Note:
			 	Solution 1: use nested if statement
				Solution 2: use switch statement
				Solution 2: use if & switch statements mixed
 */