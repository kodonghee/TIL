public class ProfilePrint{
    byte age;
    String name;
    boolean isMarried;

    public void setAge(byte myAge){
        age = myAge;
    }

    public byte getAge(){
        return age;
    }

    public void setName(String myName){
        name = myName;
    }

    public String getName(){
        return name;
    }

    public void setMarried(boolean flag){
        isMarried = flag;
    }

    public boolean isMarried(){
        return isMarried;
    }

    public static void main(String[] args){
        ProfilePrint profilePrint = new ProfilePrint();

        profilePrint.setAge((byte) 29);
        profilePrint.setName("donghee");
        profilePrint.setMarried(false);
        System.out.println(profilePrint.getAge());
        System.out.println(profilePrint.getName());
        System.out.println(profilePrint.isMarried());
    }
}
