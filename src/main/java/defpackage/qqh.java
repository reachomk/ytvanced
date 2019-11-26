package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Map;

/* renamed from: qqh */
public final class qqh extends riy implements qqi {
    qqh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.droidguard.internal.IDroidGuardHandle");
    }

    public final void a(String str) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        c(1, aX_);
    }

    public final qpz a(String str, qcd qcd) {
        Parcel aX_ = aX_();
        aX_.writeString(str);
        rjz.a(aX_, (Parcelable) qcd);
        Parcel a = a(5, aX_);
        qpz qpz = (qpz) rjz.a(a, qpz.CREATOR);
        a.recycle();
        return qpz;
    }

    public final byte[] a(Map map) {
        Parcel aX_ = aX_();
        aX_.writeMap(map);
        Parcel a = a(2, aX_);
        byte[] createByteArray = a.createByteArray();
        a.recycle();
        return createByteArray;
    }

    public final void a() {
        c(3, aX_());
    }
}
