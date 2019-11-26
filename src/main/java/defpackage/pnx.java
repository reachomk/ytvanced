package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pnx */
public final class pnx extends riy implements pnu {
    public pnx(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ICastContext");
    }

    public final boolean a() {
        Parcel a = a(2, aX_());
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final void a(pnq pnq) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) pnq);
        b(3, aX_);
    }

    public final void b(pnq pnq) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) pnq);
        b(4, aX_);
    }

    public final poe b() {
        poe poh;
        Parcel a = a(5, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ISessionManager");
            poh = queryLocalInterface instanceof poe ? (poe) queryLocalInterface : new poh(readStrongBinder);
        } else {
            poh = null;
        }
        a.recycle();
        return poh;
    }

    public final pny c() {
        pny pob;
        Parcel a = a(6, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.cast.framework.IDiscoveryManager");
            pob = queryLocalInterface instanceof pny ? (pny) queryLocalInterface : new pob(readStrongBinder);
        } else {
            pob = null;
        }
        a.recycle();
        return pob;
    }

    public final boolean d() {
        Parcel a = a(12, aX_());
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }
}
