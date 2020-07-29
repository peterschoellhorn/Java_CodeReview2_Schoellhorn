import java.util.ArrayList;

public class Exercise {

    // field declaration //
    String name;
    String description;
    int duration;
    String position;
    public static ArrayList<Exercise>exercises;
    static ArrayList<Exercise> workOutArray;

    // Constructor //
    Exercise(String name, String description, int duration, String position) {
        this.name        = name;
        this.description = description;
        this.duration    = duration;
        this.position    = position;
    }

    public Exercise() {
    }

    // Method for initializing Exercise Ojects and creating a new ArrayList

    public static void objectCreation() {
        Exercise pushUp =
            new Exercise("Push-Ups", "Place your hands on the floor. Raise up onto your toes so that all\n" +
                "of your body weight is on your hands and your feet.\nBend your elbows and lower your chest down toward " +
                "the floor.\nThen, push off the floor and extend them so that you return to starting position", 30,
                "floor");

        Exercise planks =
            new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor\n" +
                "with elbows positioned under your shoulders and your hands shoulder-width apart.\n" +
                "Maintain a straight line from heels through the top of your head, looking down at the floor.\n" +
                "Now, tighten your abs and hold", 90, "floor");

        Exercise squats =
            new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart," +
                "\nhips stacked over knees, and knees over ankles." +
                "\nExtend arms out straight so they are parallel with the ground, palms facing down." +
                "\nGoto a squat and exhale, then explode back up to standing, driving through heels", 45, "standup");

        Exercise kick =
            new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the\n" +
                "floor. Your back is straight. Lift your leg up, and straighten it.\n" +
                "Form a 90 degree angle in the ankle. Raise your leg with your heel pushing up and constantly forming a " +
                "90 degree angle in between the legs.\nReturn to the starting position and repeat", 60, "floor");

        Exercise curl =
            new Exercise("Leg Curl", "Stand up on, shift your weight to one feet and pull another heel toward your buttocks." +
                "\nStay for 15 seconds, then repeat with your other leg", 90, "standup");

        Exercise stretch =
            new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips\n" +
                "then stretch with one hand over your head to the opposite side. Repeat with other hand", 60, "standup");

        exercises = new ArrayList<>();
        exercises.add(pushUp);
        exercises.add(planks);
        exercises.add(squats);
        exercises.add(kick);
        exercises.add(curl);
        exercises.add(stretch);
    }
    public static void printAll() {
        for (Exercise value : exercises) {
            System.out.println("---------------------------------------------");
            System.out.println("Name: " + value.name + " --- " + "Duration: " + value.duration + "s");
            System.out.println("---------------------------------------------");
            System.out.println(value.description);}
    }
    public static void printExFloor() {
        for (Exercise value : exercises) {
            if (value.position.equals("floor"))
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Name: " + value.name + " --- " + "Duration: " + value.duration + "s");}
    }
    public static void printExFloorAndLong() {
        for (Exercise value : exercises) {
            int duration=value.duration;
            if (value.position.equals("floor") & duration > 60)
                System.out.println("-----------------------------------------------------------------------------");
                System.out.println("Name: " + value.name + " --- " + "Duration: " + value.duration + "s");}
    }
}



