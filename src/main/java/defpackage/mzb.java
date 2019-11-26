package defpackage;

import android.graphics.Bitmap;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService.Stub.Proxy;

/* renamed from: mzb */
public abstract class mzb extends dhx implements myy {
    public mzb() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IAdOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                IAdOverlayService proxy;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IAdOverlayService");
                    proxy = queryLocalInterface instanceof IAdOverlayService ? (IAdOverlayService) queryLocalInterface : new Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a(proxy);
                break;
            case 2:
                a(dhw.a(parcel));
                break;
            case 3:
                b(dhw.a(parcel));
                break;
            case 4:
                a(dhw.b(parcel));
                break;
            case 5:
                a(parcel.readInt());
                break;
            case 6:
                a((Bitmap) dhw.a(parcel, Bitmap.CREATOR));
                break;
            case 7:
                e(dhw.a(parcel));
                break;
            case 8:
                b(dhw.b(parcel));
                break;
            case 9:
                c(dhw.a(parcel));
                break;
            case 10:
                d(dhw.a(parcel));
                break;
            case 11:
                b(parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
