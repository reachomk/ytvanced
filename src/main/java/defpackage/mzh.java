package defpackage;

import android.os.Parcel;

/* renamed from: mzh */
public abstract class mzh extends dhx implements mze {
    public mzh() {
        super("com.google.android.apps.youtube.embeddedplayer.service.jar.client.IApiPlayerClient");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        switch (i) {
            case 1:
                a();
                parcel2.writeNoException();
                break;
            case 2:
                b();
                parcel2.writeNoException();
                break;
            case 3:
                c();
                parcel2.writeNoException();
                break;
            case 4:
                d();
                parcel2.writeNoException();
                break;
            case 5:
                a(parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong(), dhw.a(parcel), dhw.a(parcel), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                e();
                parcel2.writeNoException();
                break;
            case 7:
                f();
                parcel2.writeNoException();
                break;
            case 8:
                g();
                parcel2.writeNoException();
                break;
            case 9:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 10:
                a(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 11:
                a(parcel.readLong());
                parcel2.writeNoException();
                break;
            case 12:
                h();
                parcel2.writeNoException();
                break;
            case 13:
                b(parcel.readLong(), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 14:
                a(dhw.a(parcel), parcel.readLong());
                parcel2.writeNoException();
                break;
            case 15:
                b(parcel.readLong());
                parcel2.writeNoException();
                break;
            case 16:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 17:
                i();
                parcel2.writeNoException();
                break;
            case 18:
                j();
                parcel2.writeNoException();
                break;
            case 19:
                k();
                parcel2.writeNoException();
                break;
            case 20:
                String b = b(parcel.readString());
                parcel2.writeNoException();
                parcel2.writeString(b);
                break;
            default:
                return false;
        }
        return true;
    }
}
