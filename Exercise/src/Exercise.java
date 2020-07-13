import java.util.ArrayList;

public class Exercise {

    // field declaration //

    String name;
    String description;
    int duration;
    String position;

    // Constructor //

    Exercise(String name, String description, int duration, String position) {

        this.name        = name;
        this.description = description;
        this.duration    = duration;
        this.position    = position;
    }

    // Method for initializing Exercise Ojects and creating a new ArrayList


    public static void objectCreation(){

        Exercise E1    = new Exercise("Push Up", "Place your hands on the floor. Raise up onto your toes so that all of your body weightis on your hands and your feet. Bend your elbows and lower your chest down toward the floor. Then, push off the floor and extend them so that you return to starting position", 30, "floor");
        Exercise E2    = new Exercise("Planks", "Start on the floor on your hands and knees. Lower your forearms to the floor with elbows positioned under your shoulders and your hands shoulder-width apart. Maintain a straight line from heels through the top of your head, looking down at the floor. Now, tighten your abs and hold", 90, "floor");
        Exercise E3    = new Exercise("Squats", "Stand with feet a little wider than shoulder-width apart, hips stacked over knees, and knees over ankles. Extend arms out straight so they are parallel with the ground, palms facing down.  Goto a squat and exhale, then explode back up to standing, driving through heels", 45, "standup");
        Exercise E4    = new Exercise("Backward Kick", "Get in an all-fours position with your knees and hands on the floor. Your backis straight. Lift your leg up, and straighten it. Form a 90 degree angle in the ankle.  Raise your leg with your heel pushing up and constantly forming a 90 degree angle in between the legs. Return to the starting position and repeat", 60, "floor");
        Exercise E5    = new Exercise("Leg Curl", "Stand up on, shift your weight to  one feet and pull another heel toward your buttocks Stay for 15 seconds, then repeat with your other leg", 90, "standup");
        Exercise E6    = new Exercise("Sidewards Back Stretch", "Go into standing position, put your hands on your hips and then stretch with one hand over your head to the opposite side. Repeat with other hand", 60, "standup");






        ArrayList<Exercise> list = new ArrayList<>();

         list.add(E1);
         list.add(E2);
         list.add(E3);
         list.add(E4);
         list.add(E5);
         list.add(E6);

        for (Exercise exercise : list) {
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println("Name: "  + exercise.name + " --- " + "Duration: " + exercise.duration + "s");
            System.out.println("-----------------------------------------------------------------------------");
            System.out.println(exercise.description);
        }
    }

}



