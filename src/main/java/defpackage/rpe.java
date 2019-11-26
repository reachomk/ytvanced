package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpe */
public final class rpe extends riy implements rpb {
    rpe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
    }

    public final String a() {
        Parcel a = a(4, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final qcs b() {
        Parcel a = a(9, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final boolean a(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        Parcel a = a(10, aX_);
        boolean a2 = rjz.a(a);
        a.recycle();
        return a2;
    }
}
