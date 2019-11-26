package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService.Stub.Proxy;

/* renamed from: nal */
public abstract class nal extends dhx implements nai {
    public nal() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceTextureClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            return false;
        }
        ISurfaceTextureService proxy;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceTextureService");
            proxy = queryLocalInterface instanceof ISurfaceTextureService ? (ISurfaceTextureService) queryLocalInterface : new Proxy(readStrongBinder);
        } else {
            proxy = null;
        }
        a(proxy);
        parcel2.writeNoException();
        return true;
    }
}
