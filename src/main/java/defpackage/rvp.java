package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvp */
public final class rvp extends qou implements rvn {
    public static final Creator CREATOR = new rvm();
    private final rvj a;
    private final String b;

    public rvp(rvj rvj, String str) {
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
