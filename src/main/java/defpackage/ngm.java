package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ngm */
public final class ngm implements Parcelable {
    public static final Creator CREATOR = new ngl();
    public final int a;
    public final int b;

    public ngm(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final int describeContents() {
        return 0;
    }

    public ngm(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt());
    }

    public final int hashCode() {
        return ((this.a + 527) * 31) + this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngm) {
            ngm ngm = (ngm) obj;
            if (this.a == ngm.a && this.b == ngm.b) {
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
