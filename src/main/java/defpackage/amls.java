package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: amls */
public final class amls extends dhu implements amlp {
    amls(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IPlaybackEventListener");
    }

    public final void a() {
        b(1, aK_());
    }

    public final void b() {
        b(2, aK_());
    }

    public final void c() {
        b(3, aK_());
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(4, aK_);
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(5, aK_);
    }
}
