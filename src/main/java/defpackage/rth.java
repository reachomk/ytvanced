package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rth */
public final class rth extends qou {
    public static final Creator CREATOR = new rtt();
    private boolean a;

    public rth(boolean z) {
        this.a = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
