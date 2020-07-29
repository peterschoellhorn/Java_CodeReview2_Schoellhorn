import java.util.ArrayList;

public class IntervalWorkout extends Exercise{
  String workoutName;
  int repetitionsCount;
  int breakTime;
  public ArrayList<Exercise> workOut;

  public IntervalWorkout( String workoutName, int repetitionsCount) {

    this.workoutName=workoutName;
    this.repetitionsCount=repetitionsCount;
    this.breakTime=30;
    this.workOut= new ArrayList<>();

  }

    //loop1 reps in loop2 exercises

    public void newWorkout(int reps){
      this.workOut.add(exercises.get(0));
      this.workOut.add(exercises.get(1));
      this.workOut.add(exercises.get(2));

      System.out.println("*****************************");
      System.out.println(" Interval Workout STARTS !!! ");
      System.out.println("*****************************");
      System.out.println("=============================\n");

      for (int i = 0; i < reps; i++) {


        System.out.println("ROUND "+ (1+i)+":");
        for (int i2=0; i2 < workOut.size();i2++) {
          System.out.println("* "+workOut.get(i2).name);}
        System.out.println("=============================");
        System.out.println("DO THE BREAK ("+breakTime+" SECONDS)");
        System.out.println("=============================");
      }
    }
  }
