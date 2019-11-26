package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvb */
public final class rvb extends qou implements ruz {
    public static final Creator CREATOR = new ruy();
    private final rvj a;
    private final String b;

    public rvb(rvj rvj, String str) {
        this.a = rvj;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, a);
    }
}
