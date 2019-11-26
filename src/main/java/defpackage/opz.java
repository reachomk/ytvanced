package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: opz */
public final class opz implements Parcelable {
    public static final Creator CREATOR = new opy();
    public static final opz a = new opz(new opx[0]);
    public final int b;
    private final opx[] c;
    private int d;

    public opz(opx... opxArr) {
        this.c = opxArr;
        this.b = opxArr.length;
    }

    public final int describeContents() {
        return 0;
    }

    opz(Parcel parcel) {
        int readInt = parcel.readInt();
        this.b = readInt;
        this.c = new opx[readInt];
        for (readInt = 0; readInt < this.b; readInt++) {
            this.c[readInt] = (opx) parcel.readParcelable(opx.class.getClassLoader());
        }
    }

    public final opx a(int i) {
        return this.c[i];
    }

    public final int a(opx opx) {
        for (int i = 0; i < this.b; i++) {
            if (this.c[i] == opx) {
                return i;
            }
        }
        return -1;
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        i = Arrays.hashCode(this.c);
        this.d = i;
        return i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            opz opz = (opz) obj;
            return this.b == opz.b && Arrays.equals(this.c, opz.c);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.b);
        for (int i2 = 0; i2 < this.b; i2++) {
            parcel.writeParcelable(this.c[i2], 0);
        }
    }
}
