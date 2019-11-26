package defpackage;

import android.os.Parcel;

/* renamed from: rqu */
public abstract class rqu extends rjn implements rqv {
    public rqu() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a((rqq) rjz.a(parcel, rqq.CREATOR));
        return true;
    }
}
