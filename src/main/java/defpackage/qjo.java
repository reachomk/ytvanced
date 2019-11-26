package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qjo */
public final class qjo extends riy implements qjm {
    qjo(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.IMediationAdapterListener");
    }

    public final void a() {
        b(1, aX_());
    }

    public final void b() {
        b(2, aX_());
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(3, aX_);
    }

    public final void c() {
        b(4, aX_());
    }

    public final void d() {
        b(5, aX_());
    }

    public final void e() {
        b(6, aX_());
    }

    public final void f() {
        b(8, aX_());
    }

    public final void a(String str, String str2) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        aX_.writeString(str2);
        b(9, aX_);
    }

    public final void a(rpb rpb, String str) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) rpb);
        aX_.writeString(str);
        b(10, aX_);
    }
}
