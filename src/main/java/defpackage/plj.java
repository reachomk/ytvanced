package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: plj */
public final class plj extends qou {
    public static final Creator CREATOR = new pmy();
    public final int a;
    public final int b;
    public final int c;

    public plj(int i, int i2, int i3) {
        this.a = i;
        this.b = i2;
        this.c = i3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.b(parcel, 3, this.b);
        qov.b(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
