package defpackage;

import android.app.PendingIntent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rrj */
public final class rrj extends qou {
    public static final Creator CREATOR = new rri();
    private final int a;
    private final rrh b;
    private final rry c;
    private final PendingIntent d;
    private final rrx e;
    private final rqv f;

    public static rrj a(rrx rrx, rqv rqv) {
        rrx.asBinder();
        return new rrj(2, null, null, null, rrx, rqv != null ? rqv.asBinder() : null);
    }

    public rrj(int i, rrh rrh, IBinder iBinder, PendingIntent pendingIntent, IBinder iBinder2, IBinder iBinder3) {
        IInterface queryLocalInterface;
        rry rsa;
        rrx rrz;
        this.a = i;
        this.b = rrh;
        rqv rqv = null;
        if (iBinder != null) {
            queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
            rsa = queryLocalInterface instanceof rry ? (rry) queryLocalInterface : new rsa(iBinder);
        } else {
            rsa = null;
        }
        this.c = rsa;
        this.d = pendingIntent;
        if (iBinder2 != null) {
            queryLocalInterface = iBinder2.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
            rrz = queryLocalInterface instanceof rrx ? (rrx) queryLocalInterface : new rrz(iBinder2);
        } else {
            rrz = null;
        }
        this.e = rrz;
        if (iBinder3 != null) {
            IInterface queryLocalInterface2 = iBinder3.queryLocalInterface("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
            if (queryLocalInterface2 instanceof rqv) {
                rqv = (rqv) queryLocalInterface2;
            } else {
                rqv = new rqx(iBinder3);
            }
        }
        this.f = rqv;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = qov.a(parcel);
        qov.b(parcel, 1, this.a);
        qov.a(parcel, 2, this.b, i);
        rry rry = this.c;
        IBinder iBinder = null;
        qov.a(parcel, 3, rry != null ? rry.asBinder() : null);
        qov.a(parcel, 4, this.d, i);
        rrx rrx = this.e;
        qov.a(parcel, 5, rrx != null ? rrx.asBinder() : null);
        rqv rqv = this.f;
        if (rqv != null) {
            iBinder = rqv.asBinder();
        }
        qov.a(parcel, 6, iBinder);
        qov.a(parcel, a);
    }
}
