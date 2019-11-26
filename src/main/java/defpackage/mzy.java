package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mzy */
public final class mzy extends dhu implements mzw {
    public mzy(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPaidContentOverlayClient");
    }

    public final void a() {
        b(1, aK_());
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(2, aK_);
    }

    public final void a(CharSequence charSequence) {
        Parcel aK_ = aK_();
        dhw.a(aK_, charSequence);
        b(3, aK_);
    }

    public final void a(long j) {
        Parcel aK_ = aK_();
        aK_.writeLong(j);
        b(4, aK_);
    }

    public final void b(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(5, aK_);
    }

    public final void c(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(6, aK_);
    }
}
