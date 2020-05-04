package LabOne;

public class Runner {

//    Create at least 5 different classes that can be instantiated as objects
//    One of those classes needs to extend another

//    create an interface and implement it in one of your classes

    public static void main(String[] args) {

        Guitar myGuitar = new Guitar(6, "classic");
        Guitar otherGuitar = new Guitar(6, "electric");
        SmartSpeaker googleHome = new SmartSpeaker(true, 3, "Google");
        MusicInstrument yetAnotherGuitar = new Guitar(6, "classic");
        MusicInstrument myFlute = new Flute();


        System.out.println(myGuitar.getType());
        System.out.println(otherGuitar.getType());
        System.out.println(googleHome.isSmart());





    }




}
