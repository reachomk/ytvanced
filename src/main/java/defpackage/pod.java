package defpackage;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: pod */
public final class pod extends riy implements poa {
    public pod(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.cast.framework.IReconnectionService");
    }

    public final void a() {
        b(1, aX_());
    }

    public final int a(Intent intent, int i, int i2) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) intent);
        aX_.writeInt(i);
        aX_.writeInt(i2);
        Parcel a = a(2, aX_);
        i = a.readInt();
        a.recycle();
        return i;
    }

    public final IBinder a(Intent intent) {
        Parcel aX_ = aX_();
        rjz.a(aX_, (Parcelable) intent);
        Parcel a = a(3, aX_);
        IBinder readStrongBinder = a.readStrongBinder();
        a.recycle();
        return readStrongBinder;
    }

    public final void b() {
        b(4, aX_());
    }
}
