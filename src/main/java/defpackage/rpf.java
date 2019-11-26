package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpf */
public abstract class rpf extends rjn implements rpg {
    public rpf() {
        super("com.google.android.gms.ads.internal.formats.client.IOnAppInstallAdLoadedListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rov roy;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeAppInstallAd");
            roy = queryLocalInterface instanceof rov ? (rov) queryLocalInterface : new roy(readStrongBinder);
        } else {
            roy = null;
        }
        a(roy);
        parcel2.writeNoException();
        return true;
    }
}
