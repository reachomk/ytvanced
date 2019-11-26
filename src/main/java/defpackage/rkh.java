package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: rkh */
public abstract class rkh extends rjn implements rki {
    public rkh() {
        super("com.google.android.gms.ads.identifier.internal.IAdvertisingIdListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((Bundle) rjz.a(parcel, Bundle.CREATOR));
        return true;
    }
}
