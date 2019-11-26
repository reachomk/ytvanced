package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: pof */
public final class pof extends riy implements poc {
    public pof(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.ISession");
    }

    public final qcs a() {
        Parcel a = a(1, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final boolean b() {
        Parcel a = a(5, aX_());
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final boolean c() {
        Parcel a = a(9, aX_());
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }

    public final void d() {
        Parcel aX_ = aX_();
        aX_.writeInt(8);
        b(12, aX_);
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(13, aX_);
    }

    public final void e() {
        Parcel aX_ = aX_();
        aX_.writeInt(8);
        b(15, aX_);
    }
}
