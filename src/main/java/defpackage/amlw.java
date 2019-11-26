package defpackage;

import android.os.Parcel;

/* renamed from: amlw */
public abstract class amlw extends dhx implements amlt {
    public amlw() {
        super("com.google.android.youtube.player.internal.IPlaylistEventListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
        } else if (i != 3) {
            return false;
        } else {
            c();
        }
        parcel2.writeNoException();
        return true;
    }
}
