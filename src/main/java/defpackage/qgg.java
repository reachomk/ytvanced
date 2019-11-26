package defpackage;

import android.os.Parcel;
import com.google.android.gms.googlehelp.GoogleHelp;
import com.google.android.gms.googlehelp.internal.common.TogglingData;

/* renamed from: qgg */
public abstract class qgg extends rjn implements qgh {
    public qgg() {
        super("com.google.android.gms.googlehelp.internal.common.IGoogleHelpCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((GoogleHelp) rjz.a(parcel, GoogleHelp.CREATOR));
                parcel2.writeNoException();
                break;
            case 2:
                rjz.a(parcel, TogglingData.CREATOR);
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
                e();
                parcel2.writeNoException();
                break;
            case 6:
                f();
                parcel2.writeNoException();
                break;
            case 7:
                a();
                break;
            case 8:
                g();
                break;
            case 9:
                parcel.readInt();
                h();
                parcel2.writeNoException();
                break;
            case 10:
                i();
                parcel2.writeNoException();
                break;
            case 11:
                j();
                parcel2.writeNoException();
                break;
            case 12:
                k();
                parcel2.writeNoException();
                break;
            case 13:
                parcel.createByteArray();
                l();
                parcel2.writeNoException();
                break;
            case 14:
                m();
                parcel2.writeNoException();
                break;
            case 15:
                parcel.createByteArray();
                n();
                parcel2.writeNoException();
                break;
            case 16:
                o();
                parcel2.writeNoException();
                break;
            case 17:
                rjz.a(parcel, qfv.CREATOR);
                p();
                parcel2.writeNoException();
                break;
            case 18:
                parcel.createByteArray();
                q();
                parcel2.writeNoException();
                break;
            case 19:
                r();
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
