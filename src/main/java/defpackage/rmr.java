package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: rmr */
public final class rmr extends riy implements rms {
    rmr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IMuteThisAdReason");
    }

    public final String a() {
        Parcel a = a(1, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }
}
