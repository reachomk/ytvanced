package defpackage;

import android.os.IBinder;
import android.os.Parcel;

/* renamed from: mzf */
public final class mzf extends dhu implements mzd {
    public mzf(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiMediaViewClient");
    }

    public final int a() {
        Parcel a = a(1, aK_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int b() {
        Parcel a = a(2, aK_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void b(int i, int i2) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeInt(i2);
        b(3, aK_);
    }

    public final void c() {
        b(4, aK_());
    }

    public final void a(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(5, aK_);
    }

    public final void b(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(6, aK_);
    }

    public final void c(int i) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        b(7, aK_);
    }

    public final void d() {
        b(8, aK_());
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(9, aK_);
    }
}
