package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;

/* renamed from: mzo */
public abstract class mzo extends dhx implements mzp {
    public mzo() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IEmbedFragmentClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a((Bitmap) dhw.a(parcel, Bitmap.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                a(dhw.b(parcel));
                parcel2.writeNoException();
                break;
            case 3:
                b(dhw.b(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 5:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                b(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 7:
                String a = a(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(a);
                break;
            default:
                return false;
        }
        return true;
    }
}
