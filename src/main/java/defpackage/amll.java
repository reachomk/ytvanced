package defpackage;

import android.os.Bundle;
import android.os.Parcel;

/* renamed from: amll */
public abstract class amll extends dhx implements amlm {
    public amll() {
        super("com.google.android.youtube.player.internal.IJarEmbedFragmentClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 2:
                a((Bundle) dhw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                break;
            case 3:
                a();
                parcel2.writeNoException();
                break;
            case 4:
                a(parcel.readInt(), parcel.readString(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 5:
                a(parcel.readLong());
                parcel2.writeNoException();
                break;
            case 6:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 8:
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
