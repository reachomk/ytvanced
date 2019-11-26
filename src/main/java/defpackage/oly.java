package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: oly */
public final class oly extends omp {
    public static final Creator CREATOR = new omb();
    private final String a;
    private final String b;
    private final int c;
    private final byte[] e;

    public oly(String str, String str2, int i, byte[] bArr) {
        super("APIC");
        this.a = str;
        this.b = str2;
        this.c = i;
        this.e = bArr;
    }

    oly(Parcel parcel) {
        super("APIC");
        this.a = (String) ozp.a(parcel.readString());
        this.b = (String) ozp.a(parcel.readString());
        this.c = parcel.readInt();
        this.e = (byte[]) ozp.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oly oly = (oly) obj;
            return this.c == oly.c && ozp.a(this.a, oly.a) && ozp.a(this.b, oly.b) && Arrays.equals(this.e, oly.e);
        }
    }

    public final int hashCode() {
        int i = (this.c + 527) * 31;
        String str = this.a;
        int i2 = 0;
        i = (i + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        if (str != null) {
            i2 = str.hashCode();
        }
        return ((i + i2) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 25) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(str2);
        stringBuilder.append(", description=");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeByteArray(this.e);
    }
}
