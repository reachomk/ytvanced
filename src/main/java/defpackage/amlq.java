package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: amlq */
public final class amlq extends dhu implements amln {
    amlq(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IOnFullscreenListener");
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(1, aK_);
    }
}
