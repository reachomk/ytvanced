package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qtd */
public final class qtd extends qou {
    public static final Creator CREATOR = new qtg();
    public final psa a;
    public final pzs b;
    private final int c;

    qtd(int i, psa psa, pzs pzs) {
        this.c = i;
        this.a = psa;
        this.b = pzs;
    }

    public qtd() {
        this(1, new psa(8, null), null);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.c);
        qov.a(parcel, 2, this.a, i);
        qov.a(parcel, 3, this.b, i);
        qov.a(parcel, a);
    }
}
