public class HorseRunner {
    public static void main(String[] args)
    {
        Horse horse1 = new Mustang("Secretariat", 12000);
        Horse horse2 = new Mustang("Dusty Trail",22000);
        Horse horse3 = new Mustang("Silver",12000);
        Horse horse4 = new Mustang("Mule", 12000);
        Horse horse5 = new Mustang("Donkey",22000);
        Horse horse6 = new Mustang("Pony",12000);

        Horse[] horses = new Horse[6];
        Horse[] secondHorses = new Horse[6];

        horses[1] = horse1;
        horses[3] = horse2;
        horses[5] = horse3;
        HorseBarn barn = new HorseBarn(horses);

        secondHorses[1] = horse4;
        secondHorses[3] = horse5;
        secondHorses[5] = horse6;
        HorseBarn secondbarn = new HorseBarn(secondHorses);

        System.out.println(barn);
        System.out.println("Dusty Trail is in space: " + barn.findHorseSpace("Dusty Trail"));

        barn.consolidate();

        System.out.println(barn);
        System.out.println("Dusty Trail is now in space: " + barn.findHorseSpace("Dusty Trail"));

        System.out.println(secondbarn);
        System.out.println("Pony is in space: " + secondbarn.findHorseSpace("Pony"));

        secondbarn.consolidate();

        System.out.println(secondbarn);
        System.out.println("Pony is in space: " + secondbarn.findHorseSpace("Pony"));
    }
}
