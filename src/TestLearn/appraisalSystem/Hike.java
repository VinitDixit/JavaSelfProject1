package TestLearn.appraisalSystem;

public interface Hike {
    double applyHike(int rating,float tenure);
    static double calculateSalary(double salary,double hike){
        return salary+(salary*hike);
    };
}
