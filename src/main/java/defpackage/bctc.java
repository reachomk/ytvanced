package defpackage;

import java.io.DataInput;
import java.io.IOException;

/* renamed from: bctc */
public final class bctc {
    public static bcpt a(DataInput dataInput, String str) {
        int readUnsignedByte = dataInput.readUnsignedByte();
        if (readUnsignedByte == 67) {
            return bcta.a(bcth.a(dataInput, str));
        }
        if (readUnsignedByte == 70) {
            bcti bcti = new bcti(str, dataInput.readUTF(), (int) bctc.a(dataInput), (int) bctc.a(dataInput));
            return bcti.equals(bcpt.a) ? bcpt.a : bcti;
        } else if (readUnsignedByte == 80) {
            return bcth.a(dataInput, str);
        } else {
            throw new IOException("Invalid encoding");
        }
    }

    static long a(DataInput dataInput) {
        long readUnsignedByte;
        long j;
        int readUnsignedByte2 = dataInput.readUnsignedByte();
        int i = readUnsignedByte2 >> 6;
        if (i == 1) {
            readUnsignedByte = (long) (dataInput.readUnsignedByte() | ((((readUnsignedByte2 << 26) >> 2) | (dataInput.readUnsignedByte() << 16)) | (dataInput.readUnsignedByte() << 8)));
            j = 60000;
        } else if (i == 2) {
            readUnsignedByte = (((((((long) readUnsignedByte2) << 58) >> 26) | ((long) (dataInput.readUnsignedByte() << 24))) | ((long) (dataInput.readUnsignedByte() << 16))) | ((long) (dataInput.readUnsignedByte() << 8))) | ((long) dataInput.readUnsignedByte());
            j = 1000;
        } else if (i == 3) {
            return dataInput.readLong();
        } else {
            readUnsignedByte = (long) ((readUnsignedByte2 << 26) >> 26);
            j = 1800000;
        }
        return readUnsignedByte * j;
    }
}
