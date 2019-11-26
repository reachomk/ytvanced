package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: opx */
public final class opx implements Parcelable {
    public static final Creator CREATOR = new opw();
    public final int a;
    public final nzw[] b;
    private int c;

    public opx(nzw... nzwArr) {
        int length = nzwArr.length;
        oxz.b(length > 0);
        this.b = nzwArr;
        this.a = length;
    }

    public final int describeContents() {
        return 0;
    }

    opx(Parcel parcel) {
        int readInt = parcel.readInt();
        this.a = readInt;
        this.b = new nzw[readInt];
        for (readInt = 0; readInt < this.a; readInt++) {
            this.b[readInt] = (nzw) parcel.readParcelable(nzw.class.getClassLoader());
        }
    }

    public final nzw a(int i) {
        return this.b[i];
    }

    public final int hashCode() {
        int i = this.c;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.b) + 527;
        this.c = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            opx opx = (opx) obj;
            return this.a == opx.a && Arrays.equals(this.b, opx.b);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        for (int i2 = 0; i2 < this.a; i2++) {
            parcel.writeParcelable(this.b[i2], 0);
        }
    }
}
