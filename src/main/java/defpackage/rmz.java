package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: rmz */
public final class rmz extends qou {
    public static final Creator CREATOR = new rnc();
    private final int a;

    public rmz(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
