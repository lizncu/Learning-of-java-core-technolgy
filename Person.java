package testasd;

public abstract class Person {
    private String name;
    public Person(String name)
        {
            this.name=name;
        }
        public abstract String getDescription();
        public String getname()
        {
            return name;
        }
    }

