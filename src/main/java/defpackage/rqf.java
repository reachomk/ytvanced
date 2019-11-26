package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: rqf */
public final class rqf extends qou {
    public static final Creator CREATOR = new rqi();
    private final int a;
    private final int b;

    public rqf(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.b(parcel, 2, this.b);
        qov.a(parcel, i);
    }
}
