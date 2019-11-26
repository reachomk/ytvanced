package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService;

/* renamed from: nak */
public final class nak extends dhu implements nai {
    public nak(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceTextureClient");
    }

    public final void a(ISurfaceTextureService iSurfaceTextureService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iSurfaceTextureService);
        b(1, aK_);
    }
}
