package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: nlj */
public final class nlj implements Parcelable {
    public static final Creator CREATOR = new nlm();
    public final int a;
    public final int b;
    public final int c;
    public final byte[] d;
    private int e;

    public nlj(int i, int i2, int i3, byte[] bArr) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = bArr;
    }

    public final int describeContents() {
        return 0;
    }

    nlj(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readInt();
        this.d = parcel.readInt() != 0 ? parcel.createByteArray() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            nlj nlj = (nlj) obj;
            return this.a == nlj.a && this.b == nlj.b && this.c == nlj.c && Arrays.equals(this.d, nlj.d);
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
        parcel.writeInt(this.d != null ? 1 : 0);
        byte[] bArr = this.d;
        if (bArr != null) {
            parcel.writeByteArray(bArr);
        }
    }
}
