package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpk */
public abstract class rpk extends rjn implements rph {
    public rpk() {
        super("com.google.android.gms.ads.internal.formats.client.IOnContentAdLoadedListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rpa roz;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeContentAd");
            roz = queryLocalInterface instanceof rpa ? (rpa) queryLocalInterface : new roz(readStrongBinder);
        } else {
            roz = null;
        }
        a(roz);
        parcel2.writeNoException();
        return true;
    }
}
