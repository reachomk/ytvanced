package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rrr */
public final class rrr extends qou {
    public static final Creator CREATOR = new rrq();
    private final int a;
    private final rrp b;
    private final rrs c;
    private final rqv d;

    rrr(int i, rrp rrp, IBinder iBinder, IBinder iBinder2) {
        rrs rru;
        this.a = i;
        this.b = rrp;
        rqv rqv = null;
        if (iBinder != null) {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
            rru = queryLocalInterface instanceof rrs ? (rrs) queryLocalInterface : new rru(iBinder);
        } else {
            rru = null;
        }
        this.c = rru;
        if (iBinder2 != null) {
            IInterface queryLocalInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof rqv) {
                rqv = (rqv) queryLocalInterface2;
            } else {
                rqv = new rqx(iBinder2);
            }
        }
        this.d = rqv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        rrs rrs = this.c;
        IBinder iBinder = null;
        qov.a(parcel, 3, rrs != null ? rrs.asBinder() : null);
        rqv rqv = this.d;
        if (rqv != null) {
            iBinder = rqv.asBinder();
        }
        qov.a(parcel, 4, iBinder);
        qov.a(parcel, a);
    }
}
