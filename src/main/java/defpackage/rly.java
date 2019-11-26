package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rly */
public final class rly extends riy implements rlw {
    rly(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdLoaderBuilder");
    }

    public final void b() {
        throw null;
    }

    public final void c() {
        throw null;
    }

    public final void d() {
        throw null;
    }

    public final void e() {
        throw null;
    }

    public final void f() {
        throw null;
    }

    public final rlr a() {
        rlr rlt;
        Parcel a = a(1, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IAdLoader");
            rlt = queryLocalInterface instanceof rlr ? (rlr) queryLocalInterface : new rlt(readStrongBinder);
        } else {
            rlt = null;
        }
        a.recycle();
        return rlt;
    }

    public final void a(rlq rlq) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rlq);
        b(2, aX_);
    }

    public final void a(rpg rpg) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rpg);
        b(3, aX_);
    }

    public final void a(rph rph) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rph);
        b(4, aX_);
    }

    public final void a(String str, rpn rpn, rpm rpm) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (IInterface) rpn);
        rjz.a(aX_, (IInterface) rpm);
        b(5, aX_);
    }

    public final void a(roh roh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) roh);
        b(6, aX_);
    }

    public final void a(rpu rpu) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rpu);
        b(10, aX_);
    }
}
