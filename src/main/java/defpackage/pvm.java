package defpackage;

import android.os.RemoteException;
import android.os.TransactionTooLargeException;
import com.google.android.gms.common.api.Status;

/* renamed from: pvm */
public abstract class pvm {
    public abstract void a(Status status);

    public abstract void a(RuntimeException runtimeException);

    public abstract void a(ptx ptx);

    public abstract void a(puq puq, boolean z);

    public static Status a(RemoteException remoteException) {
        StringBuilder stringBuilder = new StringBuilder();
        if (remoteException instanceof TransactionTooLargeException) {
            stringBuilder.append("TransactionTooLargeException: ");
        }
        stringBuilder.append(remoteException.getLocalizedMessage());
        return new Status(8, stringBuilder.toString());
    }
}
