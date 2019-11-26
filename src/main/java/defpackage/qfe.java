package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qfe */
public final class qfe extends riy implements qff {
    qfe(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gcm.INetworkTaskCallback");
    }

    public final void a(int i) {
        Parcel aX_ = aX_();
        aX_.writeInt(i);
        b(2, aX_);
    }
}
