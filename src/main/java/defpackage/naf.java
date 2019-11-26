package defpackage;

import android.os.Parcel;
import java.util.List;

/* renamed from: naf */
public abstract class naf extends dhx implements nac {
    public naf() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.ISubtitlesOverlayClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((List) parcel.createTypedArrayList(ajjc.CREATOR));
                break;
            case 2:
                a();
                break;
            case 3:
                b();
                break;
            case 4:
                a(parcel.readFloat());
                break;
            case 5:
                a((ajji) dhw.a(parcel, ajji.CREATOR));
                break;
            case 6:
                a(parcel.readInt(), parcel.readInt());
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
