package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baif */
public final class baif extends baih {
    public static final Creator CREATOR = new baie();
    public int a;
    public boolean b;

    public final int describeContents() {
        return 0;
    }

    public baif(Parcel parcel) {
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
