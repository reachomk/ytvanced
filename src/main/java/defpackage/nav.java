package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService;

/* renamed from: nav */
public final class nav extends dhu implements nat {
    public nav(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IUiElementRegistrarClient");
    }

    public final void a(IUiElementRegistrarService iUiElementRegistrarService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iUiElementRegistrarService);
        b(1, aK_);
    }

    public final void a(int i, boolean z) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        dhw.a(aK_, z);
        b(2, aK_);
    }
}
