package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sej */
final class sej extends sdr {
    public static final Creator CREATOR = new sei();

    sej(PendingIntent pendingIntent, boolean z, String str, int i, sem sem, boolean z2) {
        super(pendingIntent, z, str, i, sem, z2);
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
        parcel.writeInt(this.b);
        parcel.writeString(this.c);
        parcel.writeInt(this.d);
        parcel.writeParcelable(this.e, i);
        parcel.writeInt(this.f);
    }
}
