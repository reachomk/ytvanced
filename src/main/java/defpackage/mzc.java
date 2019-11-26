package defpackage;

import android.os.Parcel;

/* renamed from: mzc */
public abstract class mzc extends dhx implements mzd {
    public mzc() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiMediaViewClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                i = a();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 2:
                i = b();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 3:
                b(parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 4:
                c();
                parcel2.writeNoException();
                break;
            case 5:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                b(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                c(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 8:
                d();
                parcel2.writeNoException();
                break;
            case 9:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
