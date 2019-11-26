package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omo */
public final class omo extends omp {
    public static final Creator CREATOR = new omr();
    public final String a;
    public final String b;
    public final String c;

    public omo(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    omo(Parcel parcel) {
        super("----");
        this.a = (String) ozp.a(parcel.readString());
        this.b = (String) ozp.a(parcel.readString());
        this.c = (String) ozp.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omo omo = (omo) obj;
            return ozp.a(this.b, omo.b) && ozp.a(this.a, omo.a) && ozp.a(this.c, omo.c);
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
        return hashCode + i;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.a;
        String str3 = this.b;
        int length = String.valueOf(str).length();
        StringBuilder stringBuilder = new StringBuilder(((length + 23) + String.valueOf(str2).length()) + String.valueOf(str3).length());
        stringBuilder.append(str);
        stringBuilder.append(": domain=");
        stringBuilder.append(str2);
        stringBuilder.append(", description=");
        stringBuilder.append(str3);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeString(this.c);
    }
}
