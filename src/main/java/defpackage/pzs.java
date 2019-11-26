package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pzs */
public final class pzs extends qou {
    public static final Creator CREATOR = new pzv();
    public final psa a;
    public final boolean b;
    public final boolean c;
    private final int d;
    private final IBinder e;

    pzs(int i, IBinder iBinder, psa psa, boolean z, boolean z2) {
        this.d = i;
        this.e = iBinder;
        this.a = psa;
        this.b = z;
        this.c = z2;
    }

    public final pyy a() {
        IBinder iBinder = this.e;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
        if (queryLocalInterface instanceof pyy) {
            return (pyy) queryLocalInterface;
        }
        return new qaq(iBinder);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.d);
        qov.a(parcel, 2, this.e);
        qov.a(parcel, 3, this.a, i);
        qov.a(parcel, 4, this.b);
        qov.a(parcel, 5, this.c);
        qov.a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof pzs) {
            pzs pzs = (pzs) obj;
            return this.a.equals(pzs.a) && a().equals(pzs.a());
        }
    }
}
