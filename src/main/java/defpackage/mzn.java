package defpackage;

import android.os.Parcel;

/* renamed from: mzn */
public abstract class mzn extends dhx implements mzk {
    public mzn() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IDataBusClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a((ngp) dhw.a(parcel, ngp.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((ngp[]) parcel.createTypedArray(ngp.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
