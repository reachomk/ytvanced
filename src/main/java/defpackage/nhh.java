package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: nhh */
public final class nhh implements Parcelable {
    public static final Creator CREATOR = new nhk();
    public final int a;
    public final int b;

    public nhh(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public nhh(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhh) {
            nhh nhh = (nhh) obj;
            if (this.a == nhh.a && this.b == nhh.b) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }
}
