package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

/* renamed from: qot */
public final class qot {
    public static int a(Parcel parcel, int i) {
        return (i & -65536) != -65536 ? i >>> 16 : parcel.readInt();
    }

    public static void b(Parcel parcel, int i) {
        parcel.setDataPosition(parcel.dataPosition() + qot.a(parcel, i));
    }

    private static void b(Parcel parcel, int i, int i2) {
        i = qot.a(parcel, i);
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new qow(stringBuilder.toString(), parcel);
        }
    }

    public static void a(Parcel parcel, int i, int i2) {
        if (i != i2) {
            String toHexString = Integer.toHexString(i);
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(toHexString).length() + 46);
            stringBuilder.append("Expected size ");
            stringBuilder.append(i2);
            stringBuilder.append(" got ");
            stringBuilder.append(i);
            stringBuilder.append(" (0x");
            stringBuilder.append(toHexString);
            stringBuilder.append(")");
            throw new qow(stringBuilder.toString(), parcel);
        }
    }

    public static int a(Parcel parcel) {
        int readInt = parcel.readInt();
        int a = qot.a(parcel, readInt);
        int dataPosition = parcel.dataPosition();
        if (((char) readInt) != 20293) {
            String valueOf = String.valueOf(Integer.toHexString(readInt));
            String str = "Expected object header. Got 0x";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                valueOf = str.concat(valueOf);
            }
            throw new qow(valueOf, parcel);
        }
        a += dataPosition;
        if (a >= dataPosition && a <= parcel.dataSize()) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder(54);
        stringBuilder.append("Size read is invalid start=");
        stringBuilder.append(dataPosition);
        stringBuilder.append(" end=");
        stringBuilder.append(a);
        throw new qow(stringBuilder.toString(), parcel);
    }

    public static boolean c(Parcel parcel, int i) {
        qot.b(parcel, i, 4);
        return parcel.readInt() != 0;
    }

    public static int d(Parcel parcel, int i) {
        qot.b(parcel, i, 4);
        return parcel.readInt();
    }

    public static Integer e(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        if (i == 0) {
            return null;
        }
        qot.a(parcel, i, 4);
        return Integer.valueOf(parcel.readInt());
    }

    public static long f(Parcel parcel, int i) {
        qot.b(parcel, i, 8);
        return parcel.readLong();
    }

    public static Long g(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        if (i == 0) {
            return null;
        }
        qot.a(parcel, i, 8);
        return Long.valueOf(parcel.readLong());
    }

    public static float h(Parcel parcel, int i) {
        qot.b(parcel, i, 4);
        return parcel.readFloat();
    }

    public static double i(Parcel parcel, int i) {
        qot.b(parcel, i, 8);
        return parcel.readDouble();
    }

    public static String j(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + i);
        return readString;
    }

    public static IBinder k(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + i);
        return readStrongBinder;
    }

    public static Parcelable a(Parcel parcel, int i, Creator creator) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + i);
        return parcelable;
    }

    public static Bundle l(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + i);
        return readBundle;
    }

    public static byte[] m(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        byte[] createByteArray = parcel.createByteArray();
        parcel.setDataPosition(dataPosition + i);
        return createByteArray;
    }

    public static byte[][] n(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int readInt = parcel.readInt();
        byte[][] bArr = new byte[readInt][];
        for (int i2 = 0; i2 < readInt; i2++) {
            bArr[i2] = parcel.createByteArray();
        }
        parcel.setDataPosition(dataPosition + i);
        return bArr;
    }

    public static int[] o(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        int[] createIntArray = parcel.createIntArray();
        parcel.setDataPosition(dataPosition + i);
        return createIntArray;
    }

    public static long[] p(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        long[] createLongArray = parcel.createLongArray();
        parcel.setDataPosition(dataPosition + i);
        return createLongArray;
    }

    public static String[] q(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        String[] createStringArray = parcel.createStringArray();
        parcel.setDataPosition(dataPosition + i);
        return createStringArray;
    }

    public static ArrayList r(Parcel parcel, int i) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList createStringArrayList = parcel.createStringArrayList();
        parcel.setDataPosition(dataPosition + i);
        return createStringArrayList;
    }

    public static Object[] b(Parcel parcel, int i, Creator creator) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArray;
    }

    public static ArrayList c(Parcel parcel, int i, Creator creator) {
        i = qot.a(parcel, i);
        int dataPosition = parcel.dataPosition();
        if (i == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + i);
        return createTypedArrayList;
    }

    public static void s(Parcel parcel, int i) {
        if (parcel.dataPosition() != i) {
            StringBuilder stringBuilder = new StringBuilder(37);
            stringBuilder.append("Overread allowed size end=");
            stringBuilder.append(i);
            throw new qow(stringBuilder.toString(), parcel);
        }
    }
}
