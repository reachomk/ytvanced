package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: oud */
public final class oud implements Parcelable {
    public static final Creator CREATOR = new oug();
    public final int a;
    public final int[] b;
    public final int c;
    public final int d;

    oud(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = new int[parcel.readByte()];
        parcel.readIntArray(this.b);
        this.c = parcel.readInt();
        this.d = parcel.readInt();
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return (((((this.a * 31) + Arrays.hashCode(this.b)) * 31) + this.c) * 31) + this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            oud oud = (oud) obj;
            return this.a == oud.a && Arrays.equals(this.b, oud.b) && this.c == oud.c && this.d == oud.d;
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b.length);
        parcel.writeIntArray(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d);
    }
}
