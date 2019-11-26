package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService.Stub.Proxy;

/* renamed from: naa */
public abstract class naa extends dhx implements nab {
    public naa() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPlayerUiClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IPlayerUiService proxy;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IPlayerUiService");
                proxy = queryLocalInterface instanceof IPlayerUiService ? (IPlayerUiService) queryLocalInterface : new Proxy(readStrongBinder);
            } else {
                proxy = null;
            }
            a(proxy);
        } else if (i != 2) {
            return false;
        } else {
            a(dhw.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
