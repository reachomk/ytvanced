package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omu */
public final class omu extends omp {
    public static final Creator CREATOR = new omx();
    private final String a;
    private final String b;

    public omu(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    omu(Parcel parcel) {
        super((String) ozp.a(parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) ozp.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omu omu = (omu) obj;
            return this.d.equals(omu.d) && ozp.a(this.a, omu.a) && ozp.a(this.b, omu.b);
        }
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        hashCode = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        str = this.b;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        String str = this.d;
        String str2 = this.b;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 8) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(": value=");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
