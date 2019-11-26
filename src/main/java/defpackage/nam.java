package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService.Stub.Proxy;

/* renamed from: nam */
public abstract class nam extends dhx implements nan {
    public nam() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISurveyOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                ISurveyOverlayService proxy;
                IBinder readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.ISurveyOverlayService");
                    proxy = queryLocalInterface instanceof ISurveyOverlayService ? (ISurveyOverlayService) queryLocalInterface : new Proxy(readStrongBinder);
                } else {
                    proxy = null;
                }
                a(proxy);
                break;
            case 2:
                a();
                break;
            case 3:
                a(dhw.a(parcel));
                break;
            case 4:
                a(parcel.readString(), parcel.createStringArrayList(), dhw.a(parcel));
                break;
            case 5:
                b();
                break;
            case 6:
                a(parcel.readInt());
                break;
            case 7:
                c();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
