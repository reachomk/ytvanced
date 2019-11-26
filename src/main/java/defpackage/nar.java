package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;

/* renamed from: nar */
public abstract class nar extends dhx implements nao {
    public nar() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IThumbnailOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
        } else if (i == 2) {
            b();
        } else if (i == 3) {
            c();
        } else if (i != 4) {
            return false;
        } else {
            a((Bitmap) dhw.a(parcel, Bitmap.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
