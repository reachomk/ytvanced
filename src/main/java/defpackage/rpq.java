package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpq */
public abstract class rpq extends rjn implements rpn {
    public rpq() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomTemplateAdLoadedListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        rpb rpe;
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.INativeCustomTemplateAd");
            rpe = queryLocalInterface instanceof rpb ? (rpb) queryLocalInterface : new rpe(readStrongBinder);
        } else {
            rpe = null;
        }
        a(rpe);
        parcel2.writeNoException();
        return true;
    }
}
