package defpackage;

import android.graphics.Rect;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService.Stub.Proxy;

/* renamed from: nag */
public abstract class nag extends dhx implements nah {
    public nag() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurfaceHolderClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ISurfaceHolderService proxy;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurfaceHolderService");
                    proxy = queryLocalInterface instanceof ISurfaceHolderService ? (ISurfaceHolderService) queryLocalInterface : new Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a(proxy);
                parcel2.writeNoException();
                break;
            case 2:
                boolean a = a();
                parcel2.writeNoException();
                dhw.a(parcel2, a);
                break;
            case 3:
                Rect b = b();
                parcel2.writeNoException();
                dhw.b(parcel2, b);
                break;
            case 4:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                a(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                c();
                parcel2.writeNoException();
                break;
            case 8:
                b(parcel.readInt());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
