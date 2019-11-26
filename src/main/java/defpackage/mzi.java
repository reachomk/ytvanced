package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService.Stub.Proxy;
import java.util.List;
import java.util.Map;

/* renamed from: mzi */
public abstract class mzi extends dhx implements mzj {
    public mzi() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IControlsOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        boolean a;
        switch (i) {
            case 1:
                IControlsOverlayService proxy;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IControlsOverlayService");
                    proxy = queryLocalInterface instanceof IControlsOverlayService ? (IControlsOverlayService) queryLocalInterface : new Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a(proxy);
                parcel2.writeNoException();
                break;
            case 2:
                a((aicd) dhw.a(parcel, aicd.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                a((aajq[]) parcel.createTypedArray(aajq.CREATOR), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                b(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 6:
                c(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 7:
                d(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 8:
                e(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 9:
                b();
                parcel2.writeNoException();
                break;
            case 10:
                c();
                parcel2.writeNoException();
                break;
            case 11:
                a((aich) dhw.a(parcel, aich.CREATOR));
                parcel2.writeNoException();
                break;
            case 12:
                a(parcel.readString(), dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 13:
                f(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 14:
                a(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 15:
                d();
                parcel2.writeNoException();
                break;
            case 16:
                e();
                parcel2.writeNoException();
                break;
            case 17:
                a = a(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dhw.a(parcel2, a);
                break;
            case 18:
                a = b(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dhw.a(parcel2, a);
                break;
            case 19:
                g(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 20:
                h(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 21:
                a((ajis) dhw.a(parcel, ajis.CREATOR));
                parcel2.writeNoException();
                break;
            case 22:
                a((Map) parcel.readHashMap(dhw.a));
                parcel2.writeNoException();
                break;
            case 23:
                f();
                parcel2.writeNoException();
                break;
            case 24:
                a((List) parcel.createTypedArrayList(ajis.CREATOR));
                parcel2.writeNoException();
                break;
            case 25:
                i(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 27:
                j(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
