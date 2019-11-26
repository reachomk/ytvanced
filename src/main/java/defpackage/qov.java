package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: qov */
public final class qov {
    public static void a(Parcel parcel, int i, int i2) {
        parcel.writeInt(i | (i2 << 16));
    }

    private static int b(Parcel parcel, int i) {
        parcel.writeInt(i | -65536);
        parcel.writeInt(0);
        return parcel.dataPosition();
    }

    public static void a(Parcel parcel, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.setDataPosition(i - 4);
        parcel.writeInt(dataPosition - i);
        parcel.setDataPosition(dataPosition);
    }

    public static int a(Parcel parcel) {
        return qov.b(parcel, 20293);
    }

    public static void a(Parcel parcel, int i, boolean z) {
        qov.a(parcel, i, 4);
        parcel.writeInt(z);
    }

    public static void b(Parcel parcel, int i, int i2) {
        qov.a(parcel, i, 4);
        parcel.writeInt(i2);
    }

    public static void a(Parcel parcel, Integer num) {
        if (num != null) {
            qov.a(parcel, 3, 4);
            parcel.writeInt(num.intValue());
        }
    }

    public static void a(Parcel parcel, int i, long j) {
        qov.a(parcel, i, 8);
        parcel.writeLong(j);
    }

    public static void a(Parcel parcel, int i, Long l) {
        if (l != null) {
            qov.a(parcel, i, 8);
            parcel.writeLong(l.longValue());
        }
    }

    public static void a(Parcel parcel, int i, float f) {
        qov.a(parcel, i, 4);
        parcel.writeFloat(f);
    }

    public static void a(Parcel parcel, int i, double d) {
        qov.a(parcel, i, 8);
        parcel.writeDouble(d);
    }

    public static void a(Parcel parcel, int i, String str) {
        if (str != null) {
            i = qov.b(parcel, i);
            parcel.writeString(str);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, IBinder iBinder) {
        if (iBinder != null) {
            i = qov.b(parcel, i);
            parcel.writeStrongBinder(iBinder);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable parcelable, int i2) {
        if (parcelable != null) {
            i = qov.b(parcel, i);
            parcelable.writeToParcel(parcel, i2);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, Bundle bundle) {
        if (bundle != null) {
            i = qov.b(parcel, i);
            parcel.writeBundle(bundle);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, byte[] bArr) {
        if (bArr != null) {
            i = qov.b(parcel, i);
            parcel.writeByteArray(bArr);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, byte[][] bArr) {
        if (bArr != null) {
            i = qov.b(parcel, i);
            parcel.writeInt(r0);
            for (byte[] writeByteArray : bArr) {
                parcel.writeByteArray(writeByteArray);
            }
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, int[] iArr) {
        if (iArr != null) {
            i = qov.b(parcel, i);
            parcel.writeIntArray(iArr);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, long[] jArr) {
        if (jArr != null) {
            i = qov.b(parcel, i);
            parcel.writeLongArray(jArr);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, String[] strArr) {
        if (strArr != null) {
            i = qov.b(parcel, i);
            parcel.writeStringArray(strArr);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, List list) {
        if (list != null) {
            i = qov.b(parcel, i);
            parcel.writeStringList(list);
            qov.a(parcel, i);
        }
    }

    public static void a(Parcel parcel, int i, Parcelable[] parcelableArr, int i2) {
        if (parcelableArr != null) {
            i = qov.b(parcel, i);
            parcel.writeInt(r0);
            for (Parcelable parcelable : parcelableArr) {
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    qov.a(parcel, parcelable, i2);
                }
            }
            qov.a(parcel, i);
        }
    }

    public static void b(Parcel parcel, int i, List list) {
        if (list != null) {
            i = qov.b(parcel, i);
            int size = list.size();
            parcel.writeInt(size);
            for (int i2 = 0; i2 < size; i2++) {
                Parcelable parcelable = (Parcelable) list.get(i2);
                if (parcelable == null) {
                    parcel.writeInt(0);
                } else {
                    qov.a(parcel, parcelable, 0);
                }
            }
            qov.a(parcel, i);
        }
    }

    private static void a(Parcel parcel, Parcelable parcelable, int i) {
        int dataPosition = parcel.dataPosition();
        parcel.writeInt(1);
        int dataPosition2 = parcel.dataPosition();
        parcelable.writeToParcel(parcel, i);
        int dataPosition3 = parcel.dataPosition();
        parcel.setDataPosition(dataPosition);
        parcel.writeInt(dataPosition3 - dataPosition2);
        parcel.setDataPosition(dataPosition3);
    }
}
