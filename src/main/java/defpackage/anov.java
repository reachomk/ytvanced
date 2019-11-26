package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;

/* renamed from: anov */
final class anov {
    public final Messenger a;
    public final anpx b;

    anov(IBinder iBinder) {
        String interfaceDescriptor = iBinder.getInterfaceDescriptor();
        if ("android.os.IMessenger".equals(interfaceDescriptor)) {
            this.a = new Messenger(iBinder);
            this.b = null;
        } else if ("com.google.android.gms.iid.IMessengerCompat".equals(interfaceDescriptor)) {
            this.b = new anpx(iBinder);
            this.a = null;
        } else {
            String valueOf = String.valueOf(interfaceDescriptor);
            interfaceDescriptor = "Invalid interface descriptor: ";
            if (valueOf.length() == 0) {
                valueOf = new String(interfaceDescriptor);
            } else {
                valueOf = interfaceDescriptor.concat(valueOf);
            }
            Log.w("MessengerIpcClient", valueOf);
            throw new RemoteException();
        }
    }
}
