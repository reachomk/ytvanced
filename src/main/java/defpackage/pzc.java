package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: pzc */
public final class pzc extends riy implements pzb {
    public pzc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    public final qcs a() {
        Parcel a = a(1, aX_());
        qcs a2 = qcr.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b() {
        Parcel a = a(2, aX_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
