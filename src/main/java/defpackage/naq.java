package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: naq */
public final class naq extends dhu implements nao {
    public naq(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IThumbnailOverlayClient");
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

    public final void a(Bitmap bitmap) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) bitmap);
        b(4, aK_);
    }
}
