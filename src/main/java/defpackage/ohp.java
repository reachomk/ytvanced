package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ohp */
public final class ohp implements oll {
    public static final Creator CREATOR = new oho();
    public final String a;
    public final byte[] b;
    public final int c;
    private final int d;

    public ohp(String str, byte[] bArr, int i, int i2) {
        this.a = str;
        this.b = bArr;
        this.d = i;
        this.c = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ohp ohp = (ohp) obj;
            return this.a.equals(ohp.a) && Arrays.equals(this.b, ohp.b) && this.d == ohp.d && this.c == ohp.c;
        }
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() + 527) * 31) + Arrays.hashCode(this.b)) * 31) + this.d) * 31) + this.c;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = "mdta: key=";
        return valueOf.length() == 0 ? new String(str) : str.concat(valueOf);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeByteArray(this.b);
        parcel.writeInt(this.d);
        parcel.writeInt(this.c);
    }

    /* synthetic */ ohp(Parcel parcel) {
        this.a = (String) ozp.a(parcel.readString());
        this.b = new byte[parcel.readInt()];
        parcel.readByteArray(this.b);
        this.d = parcel.readInt();
        this.c = parcel.readInt();
    }
}
