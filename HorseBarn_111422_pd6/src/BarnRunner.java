public class BarnRunner {
    public static void main(String[] args) {
        HorseBarn barn = new HorseBarn(7);
        barn.horses[0] = new Horse("Trigger", 1340);
        barn.horses[2] = new Horse("Silver",1210);
        barn.horses[3] = new Horse("Lady", 1575);
        barn.horses[5] = new Horse("Patches", 1350);
        barn.horses[6] = new Horse("Duke", 1410);

        // print out what is in the barn
        System.out.println(barn);

        // test
        System.out.println("Index of Trigger should be 0 and is " +
                barn.findHorseSpace("Trigger"));
        System.out.println("Index of Silver should be 2 and is " +
                barn.findHorseSpace("Silver"));
        System.out.println("Index of Coco should be -1 and is " +
                barn.findHorseSpace("Coco"));
    }
    }
