public class KonversiNumber {
    public static void main(String[] args) {

        //Widening
        byte tipeDataByte = 10;
        short tipeDataShort = tipeDataByte;
        int tipeDataInt = tipeDataShort;
        long tipeDataLong = tipeDataInt;
        float tipeDataFloat = tipeDataLong;
        double tipeDataDouble = tipeDataFloat;

        //Narrowing
        int typeInt = 128;
        byte typeByte = (byte) typeInt;

        System.out.println(typeByte);
    }
}
