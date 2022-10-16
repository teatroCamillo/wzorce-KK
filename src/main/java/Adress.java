public class Adress {

    private String city;
    private String street;
    private String nr;
    private String postCode;

    private Adress(String city, String street, String nr, String postCode) {
        this.city = city;
        this.street = street;
        this.nr = nr;
        this.postCode = postCode;
    }

    public static final class Builder{
        private String city;
        private String street;
        private String nr;
        private String postCode;

        public Adress build(){
            return new Adress(city, street, nr, postCode);
        }
    }



}
