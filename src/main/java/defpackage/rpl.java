package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: rpl */
public abstract class rpl extends rjn implements rpm {
    public rpl() {
        super("com.google.android.gms.ads.internal.formats.client.IOnCustomClickListener");
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
        a(rpe, parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
