package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService.Stub.Proxy;

/* renamed from: mzu */
public abstract class mzu extends dhx implements mzv {
    public mzu() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ILiveOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ILiveOverlayService proxy;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ILiveOverlayService");
                    proxy = queryLocalInterface instanceof ILiveOverlayService ? (ILiveOverlayService) queryLocalInterface : new Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a(proxy);
                parcel2.writeNoException();
                break;
            case 2:
                a(dhw.b(parcel), dhw.b(parcel), dhw.a(parcel), dhw.b(parcel), parcel.readInt(), dhw.b(parcel), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                a(dhw.b(parcel), dhw.b(parcel), dhw.b(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                a();
                parcel2.writeNoException();
                break;
            case 5:
                i = b();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 6:
                i = c();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 7:
                a((Bitmap) dhw.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
