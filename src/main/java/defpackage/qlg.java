package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: qlg */
public final class qlg extends riy implements qld {
    qlg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    public final void a(Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        b(1, aX_);
    }

    public final void a() {
        b(2, aX_());
    }

    public final void b() {
        b(3, aX_());
    }

    public final void c() {
        b(4, aX_());
    }

    public final void d() {
        b(5, aX_());
    }

    public final void b(Bundle bundle) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) bundle);
        aX_ = a(6, aX_);
        if (aX_.readInt() != 0) {
            bundle.readFromParcel(aX_);
        }
        aX_.recycle();
    }

    public final void e() {
        b(7, aX_());
    }

    public final void f() {
        b(8, aX_());
    }

    public final void g() {
        b(9, aX_());
    }

    public final boolean h() {
        Parcel a = a(11, aX_());
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final void a(int i, int i2, Intent intent) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        aX_.writeInt(i2);
        rjz.a(aX_, (Parcelable) intent);
        b(12, aX_);
    }

    public final void a(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(13, aX_);
    }
}
