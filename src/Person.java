public class Person {

    private String name;
    private int age;
    private String favoriteColor;

    public Person() {
        this("No Name", 0, "black");
    }

    public Person(String name, int age, String favoriteColor) {
        this.name = name;
        this.age = age;
        this.favoriteColor = favoriteColor;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void introduceSelf() {
        System.out.println("Hello my name is " + this.name + ". I am " + this.age + " years old " +
                "and my favorite color is " + this.favoriteColor);
    }

    public void celebrateBirthday() {
        this.age++;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", favoriteColor='" + favoriteColor + '\'' +
                '}';
    }
}
