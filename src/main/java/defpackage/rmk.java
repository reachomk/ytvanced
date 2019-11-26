package defpackage;

import android.os.Parcel;

/* renamed from: rmk */
public abstract class rmk extends rjn implements rmh {
    public rmk() {
        super("com.google.android.gms.ads.internal.client.IAppEventListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        if (i != 1) {
            return false;
        }
        a(parcel.readString(), parcel.readString());
        parcel2.writeNoException();
        return true;
    }
}
