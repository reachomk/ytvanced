package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omw */
public final class omw extends omp {
    public static final Creator CREATOR = new omz();
    private final String a;
    private final String b;

    public omw(String str, String str2, String str3) {
        super(str);
        this.a = str2;
        this.b = str3;
    }

    omw(Parcel parcel) {
        super((String) ozp.a(parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) ozp.a(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            omw omw = (omw) obj;
            return this.d.equals(omw.d) && ozp.a(this.a, omw.a) && ozp.a(this.b, omw.b);
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
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 6) + String.valueOf(str2).length());
        stringBuilder.append(str);
        stringBuilder.append(": url=");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.d);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
