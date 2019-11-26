package defpackage;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;

/* renamed from: wb */
public abstract class wb extends Binder implements vy {
    public wb() {
        attachInterface(this, "android.support.v4.media.session.IMediaSession");
    }

    public final IBinder asBinder() {
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "android.support.v4.media.session.IMediaSession";
        if (i != 1598968902) {
            String str2 = "android.support.v4.media.session.IMediaControllerCallback";
            boolean z = false;
            xm xmVar = null;
            String readString;
            IBinder readStrongBinder;
            IInterface queryLocalInterface;
            vx vzVar;
            Bundle bundle;
            Uri uri;
            ve veVar;
            switch (i) {
                case 1:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    Bundle bundle2 = parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        xmVar = (xm) xm.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, bundle2, xmVar);
                    parcel2.writeNoException();
                    return true;
                case 2:
                    KeyEvent keyEvent;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        keyEvent = (KeyEvent) KeyEvent.CREATOR.createFromParcel(parcel);
                    }
                    boolean a = a(keyEvent);
                    parcel2.writeNoException();
                    parcel2.writeInt(a);
                    return true;
                case 3:
                    parcel.enforceInterface(str);
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface(str2);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof vx)) {
                            vzVar = new vz(readStrongBinder);
                        } else {
                            vzVar = (vx) queryLocalInterface;
                        }
                    }
                    a(vzVar);
                    parcel2.writeNoException();
                    return true;
                case 4:
                    parcel.enforceInterface(str);
                    readStrongBinder = parcel.readStrongBinder();
                    if (readStrongBinder != null) {
                        queryLocalInterface = readStrongBinder.queryLocalInterface(str2);
                        if (queryLocalInterface == null || !(queryLocalInterface instanceof vx)) {
                            vzVar = new vz(readStrongBinder);
                        } else {
                            vzVar = (vx) queryLocalInterface;
                        }
                    }
                    b(vzVar);
                    parcel2.writeNoException();
                    return true;
                case 5:
                    parcel.enforceInterface(str);
                    a();
                    parcel2.writeNoException();
                    parcel2.writeInt(1);
                    return true;
                case 6:
                    parcel.enforceInterface(str);
                    readString = b();
                    parcel2.writeNoException();
                    parcel2.writeString(readString);
                    return true;
                case 7:
                    parcel.enforceInterface(str);
                    readString = c();
                    parcel2.writeNoException();
                    parcel2.writeString(readString);
                    return true;
                case 8:
                    parcel.enforceInterface(str);
                    PendingIntent d = d();
                    parcel2.writeNoException();
                    if (d != null) {
                        parcel2.writeInt(1);
                        d.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 9:
                    parcel.enforceInterface(str);
                    long e = e();
                    parcel2.writeNoException();
                    parcel2.writeLong(e);
                    return true;
                case 10:
                    parcel.enforceInterface(str);
                    xq f = f();
                    parcel2.writeNoException();
                    if (f != null) {
                        parcel2.writeInt(1);
                        f.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 11:
                    parcel.enforceInterface(str);
                    i = parcel.readInt();
                    i2 = parcel.readInt();
                    parcel.readString();
                    a(i, i2);
                    parcel2.writeNoException();
                    return true;
                case 12:
                    parcel.enforceInterface(str);
                    i = parcel.readInt();
                    i2 = parcel.readInt();
                    parcel.readString();
                    b(i, i2);
                    parcel2.writeNoException();
                    return true;
                case 13:
                    parcel.enforceInterface(str);
                    s();
                    parcel2.writeNoException();
                    return true;
                case 14:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    c(readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 15:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    d(readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 16:
                    parcel.enforceInterface(str);
                    uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(uri, bundle);
                    parcel2.writeNoException();
                    return true;
                case 17:
                    parcel.enforceInterface(str);
                    a(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 18:
                    parcel.enforceInterface(str);
                    t();
                    parcel2.writeNoException();
                    return true;
                case 19:
                    parcel.enforceInterface(str);
                    u();
                    parcel2.writeNoException();
                    return true;
                case 20:
                    parcel.enforceInterface(str);
                    v();
                    parcel2.writeNoException();
                    return true;
                case 21:
                    parcel.enforceInterface(str);
                    w();
                    parcel2.writeNoException();
                    return true;
                case 22:
                    parcel.enforceInterface(str);
                    x();
                    parcel2.writeNoException();
                    return true;
                case 23:
                    parcel.enforceInterface(str);
                    y();
                    parcel2.writeNoException();
                    return true;
                case 24:
                    parcel.enforceInterface(str);
                    b(parcel.readLong());
                    parcel2.writeNoException();
                    return true;
                case 25:
                    vo voVar;
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        voVar = (vo) vo.CREATOR.createFromParcel(parcel);
                    }
                    a(voVar);
                    parcel2.writeNoException();
                    return true;
                case 26:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    e(readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 27:
                    parcel.enforceInterface(str);
                    vj g = g();
                    parcel2.writeNoException();
                    if (g != null) {
                        parcel2.writeInt(1);
                        g.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 28:
                    parcel.enforceInterface(str);
                    xs h = h();
                    parcel2.writeNoException();
                    if (h != null) {
                        parcel2.writeInt(1);
                        h.writeToParcel(parcel2, 1);
                    } else {
                        parcel2.writeInt(0);
                    }
                    return true;
                case 29:
                    parcel.enforceInterface(str);
                    i();
                    parcel2.writeNoException();
                    parcel2.writeTypedList(null);
                    return true;
                case 30:
                    parcel.enforceInterface(str);
                    j();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 31:
                    parcel.enforceInterface(str);
                    k();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 32:
                    parcel.enforceInterface(str);
                    i = l();
                    parcel2.writeNoException();
                    parcel2.writeInt(i);
                    return true;
                case 33:
                    parcel.enforceInterface(str);
                    r();
                    parcel2.writeNoException();
                    return true;
                case 34:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 35:
                    parcel.enforceInterface(str);
                    readString = parcel.readString();
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    b(readString, bundle);
                    parcel2.writeNoException();
                    return true;
                case 36:
                    parcel.enforceInterface(str);
                    uri = parcel.readInt() != 0 ? (Uri) Uri.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(uri, bundle);
                    parcel2.writeNoException();
                    return true;
                case 37:
                    parcel.enforceInterface(str);
                    n();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 38:
                    parcel.enforceInterface(str);
                    o();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 39:
                    parcel.enforceInterface(str);
                    b(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 40:
                    parcel.enforceInterface(str);
                    parcel.readInt();
                    z();
                    parcel2.writeNoException();
                    return true;
                case 41:
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        veVar = (ve) ve.CREATOR.createFromParcel(parcel);
                    }
                    a(veVar);
                    parcel2.writeNoException();
                    return true;
                case 42:
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        veVar = (ve) ve.CREATOR.createFromParcel(parcel);
                    }
                    a(veVar, parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 43:
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        veVar = (ve) ve.CREATOR.createFromParcel(parcel);
                    }
                    b(veVar);
                    parcel2.writeNoException();
                    return true;
                case 44:
                    parcel.enforceInterface(str);
                    a(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case 45:
                    parcel.enforceInterface(str);
                    m();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 46:
                    parcel.enforceInterface(str);
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    a(z);
                    parcel2.writeNoException();
                    return true;
                case 47:
                    parcel.enforceInterface(str);
                    p();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case 48:
                    parcel.enforceInterface(str);
                    c(parcel.readInt());
                    parcel2.writeNoException();
                    return true;
                case cv.aT /*49*/:
                    parcel.enforceInterface(str);
                    a(parcel.readFloat());
                    parcel2.writeNoException();
                    return true;
                case cv.aU /*50*/:
                    parcel.enforceInterface(str);
                    q();
                    parcel2.writeNoException();
                    parcel2.writeInt(0);
                    return true;
                case cv.aV /*51*/:
                    parcel.enforceInterface(str);
                    vo voVar2 = parcel.readInt() != 0 ? (vo) vo.CREATOR.createFromParcel(parcel) : null;
                    if (parcel.readInt() != 0) {
                        bundle = (Bundle) Bundle.CREATOR.createFromParcel(parcel);
                    }
                    a(voVar2, bundle);
                    parcel2.writeNoException();
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }
        parcel2.writeString(str);
        return true;
    }
}
