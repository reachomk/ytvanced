package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService;

/* renamed from: mzs */
public final class mzs extends dhu implements mzq {
    public mzs(IBinder iBinder) {
        super(iBinder, "com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedImageClientServiceClient");
    }

    public final void a(IEmbedImageClientService iEmbedImageClientService) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) iEmbedImageClientService);
        b(1, aK_);
    }

    public final void a(ngm ngm, Bitmap bitmap) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (Parcelable) ngm);
        dhw.a(aK_, (Parcelable) bitmap);
        b(2, aK_);
    }
}
