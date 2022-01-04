package Homework.Lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        byte b10 = 12;
        byte b8 = 014;
        byte b2 = 0b1100;
        byte b16 = 0xC;

        short s10 = 1300;
        short s8 = 02424;
        short s2 = 0b10100010100;
        short s16 = 0x514;

        int i10 = 0;
        int i8 = 00;
        int i2 = 0b0;
        int i16 = 0x0;

        long l10 = 123456789L;
        long l8 = 0726746425L;
        long l2 = 0b111010110111100110100010101L;
        long l16 = 0x75BCD15L;

        float f1 = 2.36F;
        float f2 = 2.5454F;
        double d1 = 2.36;
        double d2 = 2.5454;

        boolean b1 = true;
        boolean b22 = false;

        char c1 = 'M';
        char c2 = '\u0047';
        char c3 = 662;

  /*      System.out.println(b10);
        System.out.println(b8);
        System.out.println(b2);
        System.out.println(b16);

        System.out.println(s10);
        System.out.println(s8);
        System.out.println(s2);
        System.out.println(s16);

        System.out.println(i10);
        System.out.println(i8);
        System.out.println(i2);
        System.out.println(i16);

        System.out.println(l10);
        System.out.println(l8);
        System.out.println(l2);
        System.out.println(l16);

        System.out.println(f1);
        System.out.println(f2);
        System.out.println(d1);
        System.out.println(d2);

        System.out.println(b1);
        System.out.println(b22);

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

        int change = 4;
        change = 8;
        System.out.println(change); */

        boolean b = false;
        b = true;

        boolean toBe = false;
        b = toBe || !toBe;
        if (b) {
            System.out.println(toBe);
        }



    }

}
