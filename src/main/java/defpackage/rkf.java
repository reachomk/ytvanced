package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rkf */
public final class rkf extends riy implements rkg {
    rkf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    public final void a() {
        b(3, aX_());
    }

    public final void b() {
        Parcel aX_ = aX_();
        aX_.writeIntArray(null);
        b(4, aX_);
    }

    public final void a(byte[] bArr) {
        Parcel aX_ = aX_();
        aX_.writeByteArray(bArr);
        b(5, aX_);
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(6, aX_);
    }

    public final void b(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(7, aX_);
    }

    public final void a(qcs qcs, String str) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        aX_.writeString(null);
        b(8, aX_);
    }
}
