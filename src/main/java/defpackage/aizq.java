package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aizq */
public final class aizq implements aizu {
    public static final Creator CREATOR = new aizt();
    public final aiqq a;
    public final int b;

    public aizq(aiqq aiqq, int i) {
        this.a = aiqq;
        this.b = i;
    }

    public final int describeContents() {
        return 0;
    }

    public aizq(Parcel parcel) {
        this.a = (aiqq) parcel.readParcelable(getClass().getClassLoader());
        this.b = parcel.readInt();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, 0);
        parcel.writeInt(this.b);
    }
}
