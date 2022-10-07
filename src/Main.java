public class Main {

    public static void main(String[] args) {
  Ussr ussr = new Ussr(324,1000000);
  France france = new France(400,900);
  England england = new England(500,600);
  ussr.print();
  france.print();
  england.print();


Axis germany = createObject("Germany" );
Axis italy = createObject("Italy");
Axis japon = createObject("Japon");
germany.print();
italy.print();
japon.print();


    }
    public static Axis createObject(String className){
        switch (className){
            case "Germany":
                Germany germany = new Germany(324,2343);
                return germany;
            case "Italy":
                Italy italy = new Italy(324,2345);
                return italy;

            case "Japon":
                Japon japon = new Japon(234,324);
                return japon;

                }
                return null;
        }
    }






