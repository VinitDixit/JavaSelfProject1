package TestLearn.builderPattern;

/*Builder pattern -->
used when no. of fields are too many. So using constructor is not a good choice.
we can provide only those fields which are required.
Help to create immutable object as no setter are present. So obj. once created will remain same
*/
public class User {
    private String firstName;
    private String lastName;
    private Long id;
    private int age;
    private String gender;

    @Override
    public String toString(){
        return "User::"+firstName+" "+lastName+ " ::ID::"+id+" ::Age::"+age;
    }
    private User(UserBuilder userBuilder){
        this.firstName=userBuilder.firstName;
        this.lastName=userBuilder.lastName;
        this.age=userBuilder.age;
        this.id=userBuilder.id;
        this.gender=userBuilder.gender;
    }

    public static class UserBuilder{
        private String firstName;
        private String lastName;
        private Long id;
        private int age;
        private String gender;

        public UserBuilder name(String firstName,String lastName){
            this.firstName=firstName;
            this.lastName=lastName;
            return this;
        }

        public UserBuilder id(Long id){
            this.id=id;
            return this;
        }

        public UserBuilder age(int age){
            this.age=age;
            return this;
        }
        public UserBuilder gender(String gender){
            this.gender=gender;
            return this;
        }

        public User build(){
            User user=new User(this);
            return user;
        }
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getId() {
        return id;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
