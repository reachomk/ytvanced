package defpackage;

import android.os.Parcel;

/* renamed from: ammb */
public abstract class ammb extends dhx implements ammc {
    public ammb() {
        super("com.google.android.youtube.player.internal.IThumbnailLoaderService");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a(parcel.readString());
                break;
            case 2:
                a(parcel.readString(), parcel.readInt());
                break;
            case 3:
                a();
                break;
            case 4:
                b();
                break;
            case 5:
                c();
                break;
            case 6:
                d();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
