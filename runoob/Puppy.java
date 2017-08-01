public class Puppy{
    int puppyAge;
    public Puppy(String name) {
        System.out.println("The name of the puppy is: " + name);
    }

    public void setAge(int age) {
        puppyAge = age;
    }

    public int getAge() {
        System.out.println("The age of the puppy is: " + puppyAge);
        return puppyAge;
    }
        
    public static void main(String []args) {
        Puppy myPuppy = new Puppy("tommy");
        myPuppy.setAge(3);
        myPuppy.getAge();
        System.out.println("The value of puppyAge is: " + myPuppy.puppyAge);
    }
}
