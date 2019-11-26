package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: qlr */
public final class qlr extends riy implements qls {
    qlr(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardItem");
    }

    public final String a() {
        Parcel a = a(1, aX_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    public final int b() {
        Parcel a = a(2, aX_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
