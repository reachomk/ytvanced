package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baid */
public final class baid extends baih {
    public static final Creator CREATOR = new baic();
    public int a;
    public boolean b;

    public final int describeContents() {
        return 0;
    }

    public baid(Parcel parcel) {
        a(parcel);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public final void a(Parcel parcel) {
        super.a(parcel);
        this.a = parcel.readInt();
        this.b = parcel.readInt() != 0;
    }
}
