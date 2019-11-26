package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rty */
public final class rty extends qou {
    public static final Creator CREATOR = new rue();
    private final int a;
    private final String b;

    public rty(int i, String str) {
        this.a = i;
        this.b = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }
}
