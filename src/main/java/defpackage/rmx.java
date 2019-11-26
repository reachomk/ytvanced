package defpackage;

import android.os.Parcel;

/* renamed from: rmx */
public abstract class rmx extends rjn implements rmy {
    public rmx() {
        super("com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            c();
        } else if (i == 4) {
            d();
        } else if (i != 5) {
            return false;
        } else {
            rjz.a(parcel);
            e();
        }
        parcel2.writeNoException();
        return true;
    }
}
