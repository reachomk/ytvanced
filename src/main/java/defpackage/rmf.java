package defpackage;

import android.os.Parcel;

/* renamed from: rmf */
public abstract class rmf extends rjn implements rmg {
    public rmf() {
        super("com.google.android.gms.ads.internal.client.IAdMetadataListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a();
        parcel2.writeNoException();
        return true;
    }
}
