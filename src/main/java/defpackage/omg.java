package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omg */
public final class omg extends omp {
    public static final Creator CREATOR = new omj();
    public final String a;
    public final String b;
    private final String c;

    public omg(String str, String str2, String str3) {
        super("COMM");
        this.c = str;
        this.a = str2;
        this.b = str3;
    }

    omg(Parcel parcel) {
        super("COMM");
        this.c = (String) ozp.a(parcel.readString());
        this.a = (String) ozp.a(parcel.readString());
        this.b = (String) ozp.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omg omg = (omg) obj;
            return ozp.a(this.a, omg.a) && ozp.a(this.c, omg.c) && ozp.a(this.b, omg.b);
        }
    }

    public final int hashCode() {
        String str = this.c;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.a;
        hashCode = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.c;
        String str3 = this.a;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 25) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(": language=");
        stringBuilder.append(str2);
        stringBuilder.append(", description=");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.c);
        parcel.writeString(this.b);
    }
}
