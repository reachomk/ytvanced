package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

@qlp
/* renamed from: rnp */
public final class rnp extends qou {
    public static final Creator CREATOR = new rns();
    public final boolean a;
    public final boolean b;
    public final boolean c;

    public rnp(pbn pbn) {
        this(pbn.a, pbn.b, pbn.c);
    }

    public rnp(boolean z, boolean z2, boolean z3) {
        this.a = z;
        this.b = z2;
        this.c = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, 4, this.c);
        qov.a(parcel, i);
    }
}
