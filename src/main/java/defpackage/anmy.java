package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmy */
public final class anmy extends qou {
    public static final Creator CREATOR = new annb();
    public final int a;

    public anmy(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, i);
    }

    static {
        anmy anmy = new anmy(1);
        anmy = new anmy(2);
        anmy = new anmy(3);
    }
}
