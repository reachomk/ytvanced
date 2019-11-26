package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpt */
public abstract class rpt extends rjn implements rpu {
    public rpt() {
        super("com.google.android.gms.ads.internal.formats.client.IOnUnifiedNativeAdLoadedListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rpv rpy;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IUnifiedNativeAd");
            rpy = queryLocalInterface instanceof rpv ? (rpv) queryLocalInterface : new rpy(readStrongBinder);
        } else {
            rpy = null;
        }
        a(rpy);
        parcel2.writeNoException();
        return true;
    }
}
