package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qtb */
public final class qtb extends qou {
    public static final Creator CREATOR = new qte();
    private final int a;
    private final pzq b;

    qtb(int i, pzq pzq) {
        this.a = i;
        this.b = pzq;
    }

    public qtb(pzq pzq) {
        this(1, pzq);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        qov.a(parcel, a);
    }
}
