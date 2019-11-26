package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: oms */
public final class oms extends omp {
    public static final Creator CREATOR = new omv();
    private final String a;
    private final byte[] b;

    public oms(String str, byte[] bArr) {
        super("PRIV");
        this.a = str;
        this.b = bArr;
    }

    oms(Parcel parcel) {
        super("PRIV");
        this.a = (String) ozp.a(parcel.readString());
        this.b = (byte[]) ozp.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oms oms = (oms) obj;
            return ozp.a(this.a, oms.a) && Arrays.equals(this.b, oms.b);
        }
    }

    public final int hashCode() {
        String str = this.a;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.b);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(": owner=");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeByteArray(this.b);
    }
}
