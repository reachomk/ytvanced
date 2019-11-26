package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: ozt */
public final class ozt implements Parcelable {
    public static final Creator CREATOR = new ozw();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public ozt(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    ozt(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = ozp.a(parcel) ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            ozt ozt = (ozt) obj;
            return this.a == ozt.a && this.b == ozt.b && this.c == ozt.c && Arrays.equals(this.d, ozt.d);
        }
    }

    public final String toString() {
        int i = this.a;
        int i2 = this.b;
        int i3 = this.c;
        boolean z = this.d != null;
        StringBuilder stringBuilder = new StringBuilder(55);
        stringBuilder.append("ColorInfo(");
        stringBuilder.append(i);
        String str = ", ";
        stringBuilder.append(str);
        stringBuilder.append(i2);
        stringBuilder.append(str);
        stringBuilder.append(i3);
        stringBuilder.append(str);
        stringBuilder.append(z);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    public final int hashCode() {
        int i = this.e;
        if (i != 0) {
            return i;
        }
        i = ((((((this.a + 527) * 31) + this.b) * 31) + this.c) * 31) + Arrays.hashCode(this.d);
        this.e = i;
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
        parcel.writeInt(this.c);
        ozp.a(parcel, this.d != null);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
