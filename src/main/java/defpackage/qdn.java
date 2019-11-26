package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: qdn */
public final class qdn extends riy implements qdk {
    public qdn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final qcs a(qcs qcs, String str, int i) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        aX_.writeInt(i);
        Parcel a = a(2, aX_);
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int a(qcs qcs, String str, boolean z) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (IInterface) qcs);
        aX_.writeString(str);
        rjz.a(aX_, z);
        Parcel a = a(3, aX_);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
