public class Guest {


    //properties
    private String name;
    private int age;
    private int wallet;
    private int sobriety;
    private boolean banned;
    private char currency;




    //constructor
    public Guest(String name, int age, int wallet, int sobriety, boolean banned, char currency){

        this.name = name;
        this.age = age;
        this.wallet = wallet;
        this.sobriety = sobriety;
        this.banned = banned;
        this.currency = currency;
    }


    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWallet() {
        return wallet;
    }

    public void setWallet(int wallet) {
        this.wallet = wallet;
    }

    public int getSobriety() {
        return sobriety;
    }

    public void setSobriety(int sobriety) {
        this.sobriety = sobriety;
    }

    public boolean getIsBanned() {
        return banned;
    }

    public void setBanned(boolean banned) {
        this.banned = banned;
    }

    public char getCurrency() {
        return currency;
    }

    public void setCurrency(char currency) {
        this.currency = currency;
    }

}
