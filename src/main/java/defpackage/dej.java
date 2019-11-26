package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: dej */
public abstract class dej extends dhx implements deg {
    public dej() {
        super("com.firebase.jobdispatcher.IRemoteJobService");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            def deh;
            Bundle bundle = (Bundle) dhw.a(parcel, Bundle.CREATOR);
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder != null) {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.firebase.jobdispatcher.IJobCallback");
                deh = queryLocalInterface instanceof def ? (def) queryLocalInterface : new deh(readStrongBinder);
            } else {
                deh = null;
            }
            a(bundle, deh);
        } else if (i != 2) {
            return false;
        } else {
            a((Bundle) dhw.a(parcel, Bundle.CREATOR), dhw.a(parcel));
        }
        return true;
    }
}
