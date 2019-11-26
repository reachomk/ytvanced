package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService;

/* renamed from: nad */
public final class nad extends dhu implements nab {
    public nad(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPlayerUiClient");
    }

    public final void a(IPlayerUiService iPlayerUiService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iPlayerUiService);
        b(1, aK_);
    }

    public final void a(boolean z) {
        Parcel aK_ = aK_();
        dhw.a(aK_, z);
        b(2, aK_);
    }
}
