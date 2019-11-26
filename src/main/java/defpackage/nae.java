package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: nae */
public final class nae extends dhu implements nac {
    public nae(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISubtitlesOverlayClient");
    }

    public final void a(List list) {
        Parcel aK_ = aK_();
        aK_.writeTypedList(list);
        b(1, aK_);
    }

    public final void a() {
        b(2, aK_());
    }

    public final void b() {
        b(3, aK_());
    }

    public final void a(float f) {
        Parcel aK_ = aK_();
        aK_.writeFloat(f);
        b(4, aK_);
    }

    public final void a(ajji ajji) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) ajji);
        b(5, aK_);
    }

    public final void a(int i, int i2) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeInt(i2);
        b(6, aK_);
    }
}
