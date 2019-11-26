package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: amld */
public final class amld extends dhu implements amle {
    amld(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IAsyncResultCallback");
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(1, aK_);
    }

    public final void a(long j) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        b(2, aK_);
    }
}
