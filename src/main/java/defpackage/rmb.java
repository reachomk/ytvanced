package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: rmb */
public final class rmb extends riy implements rlz {
    rmb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManager");
    }

    public final boolean c() {
        throw null;
    }

    public final void g() {
        throw null;
    }

    public final void h() {
        throw null;
    }

    public final void j() {
        throw null;
    }

    public final void k() {
        throw null;
    }

    public final String l() {
        throw null;
    }

    public final void m() {
        throw null;
    }

    public final void n() {
        throw null;
    }

    public final boolean p() {
        throw null;
    }

    public final void q() {
        throw null;
    }

    public final void s() {
        throw null;
    }

    public final void t() {
        throw null;
    }

    public final String u() {
        throw null;
    }

    public final rmh v() {
        throw null;
    }

    public final rlq w() {
        throw null;
    }

    public final String x() {
        throw null;
    }

    public final void z() {
        throw null;
    }

    public final qcs a() {
        Parcel a = a(1, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final void b() {
        b(2, aX_());
    }

    public final boolean a(rky rky) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) rky);
        Parcel a = a(4, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final void d() {
        b(5, aX_());
    }

    public final void e() {
        b(6, aX_());
    }

    public final void a(rlq rlq) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rlq);
        b(7, aX_);
    }

    public final void a(rmh rmh) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rmh);
        b(8, aX_);
    }

    public final void f() {
        b(9, aX_());
    }

    public final rkz i() {
        Parcel a = a(12, aX_());
        rkz rkz = (rkz) rjz.a(a, rkz.CREATOR);
        a.recycle();
        return rkz;
    }

    public final void a(rkz rkz) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) rkz);
        b(13, aX_);
    }

    public final void a(rll rll) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rll);
        b(20, aX_);
    }

    public final void o() {
        Parcel aX_ = aX_();
        rjz.a(aX_, false);
        b(22, aX_);
    }

    public final void a(qlw qlw) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qlw);
        b(24, aX_);
    }

    public final rmt r() {
        rmt rmv;
        Parcel a = a(26, aX_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IVideoController");
            rmv = queryLocalInterface instanceof rmt ? (rmt) queryLocalInterface : new rmv(readStrongBinder);
        } else {
            rmv = null;
        }
        a.recycle();
        return rmv;
    }

    public final void a(boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, z);
        b(34, aX_);
    }

    public final void a(rmg rmg) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rmg);
        b(36, aX_);
    }

    public final Bundle y() {
        Parcel a = a(37, aX_());
        Bundle bundle = (Bundle) rjz.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle;
    }
}
