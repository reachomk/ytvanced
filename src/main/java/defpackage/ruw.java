package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ruw */
public final class ruw extends qou implements ruu {
    public static final Creator CREATOR = new rux();
    private final rvj a;
    private final Long b;

    public ruw(rvj rvj, Long l) {
        this.a = rvj;
        this.b = l;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, a);
    }
}
