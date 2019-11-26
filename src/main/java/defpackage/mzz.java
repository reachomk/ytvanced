package defpackage;

import android.os.Parcel;

/* renamed from: mzz */
public abstract class mzz extends dhx implements mzw {
    public mzz() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IPaidContentOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                a(dhw.a(parcel));
                break;
            case 3:
                a(dhw.b(parcel));
                break;
            case 4:
                a(parcel.readLong());
                break;
            case 5:
                b(dhw.a(parcel));
                break;
            case 6:
                c(dhw.a(parcel));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
