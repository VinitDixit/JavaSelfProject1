package TestLearn.appraisalSystem;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Hike hike=(rating,tenure)->{
            if(tenure>1){
                if(rating ==5){
                    return 0.10;
                } else if (rating ==4) {
                    return 0.07;
                }else if (rating ==3) {
                    return 0.05;
                }else if (rating ==2 || rating ==1) {
                    return -1;
                }
            }
            return 0;
        };

        Employee employee101= new Employee(101,"John","Snow");
        employee101.setSalary(50000.0);
        employee101.setUnderNoticePeriod('N');
        employee101.setTenure(10f);

        Appraisal johnAppraisal = new Appraisal();
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter rating for John Snow");
        johnAppraisal.setRating(sc.nextInt());

        System.out.println("Enter appraisal comment for John Snow");
        johnAppraisal.setComment(sc.next());

        employee101.setAppraisal(johnAppraisal);

        //calculate hike based upon rating and tenure
        double hikePercent = hike.applyHike(johnAppraisal.getRating(), employee101.getTenure());
        employee101.getAppraisal().setHikePercent(hikePercent);

        System.out.println(employee101.toString());
        System.out.println(employee101.getAppraisal().toString());

        //calculate salary based upon hike
        double newSalary = Hike.calculateSalary(employee101.getSalary(), hikePercent);
        employee101.setSalary(newSalary);

        System.out.println(employee101.toString());


    }

}
