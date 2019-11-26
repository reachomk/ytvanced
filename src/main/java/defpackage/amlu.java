package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: amlu */
public final class amlu extends dhu implements amlr {
    amlu(IBinder iBinder) {
        super(iBinder, "com.google.android.youtube.player.internal.IPlayerStateChangeListener");
    }

    public final void a() {
        b(1, aK_());
    }

    public final void a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        b(2, aK_);
    }

    public final void b() {
        b(3, aK_());
    }

    public final void c() {
        b(4, aK_());
    }

    public final void d() {
        b(5, aK_());
    }

    public final void b(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        b(6, aK_);
    }
}
