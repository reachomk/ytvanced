package defpackage;

import android.os.Parcel;

/* renamed from: rlo */
public abstract class rlo extends rjn implements rll {
    public rlo() {
        super("com.google.android.gms.ads.internal.client.IAdClickListener");
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
