package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sel */
final class sel extends sdt {
    public static final Creator CREATOR = new sek();

    sel(sgz sgz, sgn sgn) {
        super(sgz, sgn);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        if (this.b != null) {
            parcel.writeInt(0);
            parcel.writeString(this.b.name());
            return;
        }
        parcel.writeInt(1);
    }
}
