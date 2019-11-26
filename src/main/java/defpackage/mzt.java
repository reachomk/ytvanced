package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService.Stub.Proxy;

/* renamed from: mzt */
public abstract class mzt extends dhx implements mzq {
    public mzt() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedImageClientServiceClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IEmbedImageClientService proxy;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IEmbedImageClientService");
                proxy = queryLocalInterface instanceof IEmbedImageClientService ? (IEmbedImageClientService) queryLocalInterface : new Proxy(readStrongBinder);
            } else {
                proxy = null;
            }
            a(proxy);
        } else if (i != 2) {
            return false;
        } else {
            a((ngm) dhw.a(parcel, ngm.CREATOR), (Bitmap) dhw.a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
