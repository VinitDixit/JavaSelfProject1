package TestLearn.immutableVsFinal;

public class DriverClass {
    public static void main(String[] args) {
       final User user1=new User(1,"Vinit");
        System.out.println("User1::"+user1.getId()+":"+user1.getName());
       //user1=new User(2,"Simpy"); not allowed as user 1 is final. So REFERENCE user1 cANNOT BE CHANGED to point to another object
        user1.setId(2);// allowed because we can still mutate the state of the object itself
        user1.setName("Simpy");
        System.out.println("User1::"+user1.getId()+":"+user1.getName());

        //String are immutable
        //it means we cannot mutate the state of the object itself i.e. THE OBJECT CANNOT BE CHANGED
        //the ref can still be changes to point to another object
        String s1= new String("Vinit");// s1 refers to Vinit object
        String s2= s1;// s1 and s2 both refers to Vinit object
        s1= new String("Simpy");// s1 ref now points to Simpy object, but s2 still point to VInit object
        System.out.println("String s1"+s1);
        System.out.println("String s2"+s2);

    }
}
