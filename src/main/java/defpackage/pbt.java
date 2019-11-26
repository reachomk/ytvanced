package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pbt */
public final class pbt extends riy implements pbp {
    pbt(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.adshield.internal.IAdShieldClient");
    }

    public final qcs a(qcs qcs, qcs qcs2) {
        throw null;
    }

    public final void a(String str) {
        throw null;
    }

    public final boolean a(qcs qcs) {
        throw null;
    }

    public final qcs b(qcs qcs, qcs qcs2) {
        throw null;
    }

    public final boolean b(qcs qcs) {
        throw null;
    }

    public final String c(qcs qcs) {
        throw null;
    }

    public final String a() {
        Parcel a = a(1, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final void a(String str, String str2) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        aX_.writeString(str2);
        b(2, aX_);
    }

    public final String a(qcs qcs, String str) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        Parcel a = a(8, aX_);
        str = a.readString();
        a.recycle();
        return str;
    }

    public final void d(qcs qcs) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        b(9, aX_);
    }

    public final boolean a(String str, boolean z) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, z);
        Parcel a = a(11, aX_);
        z = rjz.a(a);
        a.recycle();
        return z;
    }

    public final String a(qcs qcs, byte[] bArr) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeByteArray(bArr);
        Parcel a = a(12, aX_);
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
