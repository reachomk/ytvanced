package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: amlf */
public final class amlf extends dhu implements amlg {
    amlf(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IConnectionCallbacks");
    }

    public final void a(String str, IBinder iBinder) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        aK_.writeStrongBinder(iBinder);
        b(1, aK_);
    }
}
