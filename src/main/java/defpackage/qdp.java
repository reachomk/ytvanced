package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qdp */
public final class qdp extends riy implements qdm {
    public qdp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final qcs a(qcs qcs, String str, int i, qcs qcs2) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        aX_.writeInt(i);
        rjz.a(aX_, (IInterface) qcs2);
        Parcel a = a(2, aX_);
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
