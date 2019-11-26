package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: omi */
public final class omi extends omp {
    public static final Creator CREATOR = new oml();
    private final String a;
    private final String b;
    private final String c;
    private final byte[] e;

    public omi(String str, String str2, String str3, byte[] bArr) {
        super("GEOB");
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.e = bArr;
    }

    omi(Parcel parcel) {
        super("GEOB");
        this.a = (String) ozp.a(parcel.readString());
        this.b = (String) ozp.a(parcel.readString());
        this.c = (String) ozp.a(parcel.readString());
        this.e = (byte[]) ozp.a(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omi omi = (omi) obj;
            return ozp.a(this.a, omi.a) && ozp.a(this.b, omi.b) && ozp.a(this.c, omi.c) && Arrays.equals(this.e, omi.e);
        }
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + Arrays.hashCode(this.e);
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        String str4 = this.c;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder stringBuilder = new StringBuilder((((length + 36) + length2) + String.valueOf(str3).length()) + String.valueOf(str4).length());
        stringBuilder.append(str);
        stringBuilder.append(": mimeType=");
        stringBuilder.append(str2);
        stringBuilder.append(", filename=");
        stringBuilder.append(str3);
        stringBuilder.append(", description=");
        stringBuilder.append(str4);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeByteArray(this.e);
    }
}
