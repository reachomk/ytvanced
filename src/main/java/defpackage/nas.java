package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService;
import com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService.Stub.Proxy;

/* renamed from: nas */
public abstract class nas extends dhx implements nat {
    public nas() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IUiElementRegistrarClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            IUiElementRegistrarService proxy;
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.apps.youtube.embeddedplayer.service.service.jar.IUiElementRegistrarService");
                proxy = queryLocalInterface instanceof IUiElementRegistrarService ? (IUiElementRegistrarService) queryLocalInterface : new Proxy(readStrongBinder);
            } else {
                proxy = null;
            }
            a(proxy);
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readInt(), dhw.a(parcel));
        }
        parcel2.writeNoException();
        return true;
    }
}
