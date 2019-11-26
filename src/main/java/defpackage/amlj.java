package defpackage;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.view.KeyEvent;
import java.util.List;

/* renamed from: amlj */
public abstract class amlj extends dhx implements amlk {
    public amlj() {
        super("com.google.android.youtube.player.internal.IEmbeddedPlayer");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        amln amln = null;
        boolean o;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 1:
                c(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 2:
                a(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 3:
                b(parcel.readString(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 4:
                a(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 5:
                b(parcel.readString(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 6:
                a((List) parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 7:
                b((List) parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
                parcel2.writeNoException();
                break;
            case 8:
                l();
                parcel2.writeNoException();
                break;
            case 9:
                m();
                parcel2.writeNoException();
                break;
            case 10:
                o = o();
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 11:
                o = p();
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 12:
                o = q();
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 13:
                r();
                parcel2.writeNoException();
                break;
            case 14:
                s();
                parcel2.writeNoException();
                break;
            case 15:
                i = t();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 16:
                i = u();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 17:
                c(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 18:
                d(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 19:
                d(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 20:
                a(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 21:
                i = k();
                parcel2.writeNoException();
                parcel2.writeInt(i);
                break;
            case 22:
                b(parcel.readInt());
                parcel2.writeNoException();
                break;
            case 23:
                a(parcel.readString());
                parcel2.writeNoException();
                break;
            case 24:
                b(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 25:
                e(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 26:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IOnFullscreenListener");
                    if (queryLocalInterface instanceof amln) {
                        amln = (amln) queryLocalInterface;
                    } else {
                        amln = new amlq(readStrongBinder);
                    }
                }
                a(amln);
                parcel2.writeNoException();
                break;
            case 27:
                amlt amlt;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaylistEventListener");
                    if (queryLocalInterface instanceof amlt) {
                        amlt = (amlt) queryLocalInterface;
                    } else {
                        amlt = new amlv(readStrongBinder);
                    }
                }
                a(amlt);
                parcel2.writeNoException();
                break;
            case 28:
                amlr amlr;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlayerStateChangeListener");
                    if (queryLocalInterface instanceof amlr) {
                        amlr = (amlr) queryLocalInterface;
                    } else {
                        amlr = new amlu(readStrongBinder);
                    }
                }
                a(amlr);
                parcel2.writeNoException();
                break;
            case 29:
                amlp amlp;
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.youtube.player.internal.IPlaybackEventListener");
                    if (queryLocalInterface instanceof amlp) {
                        amlp = (amlp) queryLocalInterface;
                    } else {
                        amlp = new amls(readStrongBinder);
                    }
                }
                a(amlp);
                parcel2.writeNoException();
                break;
            case 30:
                n();
                parcel2.writeNoException();
                break;
            case 31:
                v();
                parcel2.writeNoException();
                break;
            case 32:
                a((Configuration) dhw.a(parcel, Configuration.CREATOR));
                parcel2.writeNoException();
                break;
            case 33:
                e();
                parcel2.writeNoException();
                break;
            case 34:
                f();
                parcel2.writeNoException();
                break;
            case 35:
                g();
                parcel2.writeNoException();
                break;
            case 36:
                h();
                parcel2.writeNoException();
                break;
            case 37:
                a(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 38:
                i();
                parcel2.writeNoException();
                break;
            case 39:
                Bundle w = w();
                parcel2.writeNoException();
                dhw.b(parcel2, w);
                break;
            case 40:
                o = a((Bundle) dhw.a(parcel, Bundle.CREATOR));
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 41:
                o = a(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 42:
                o = b(parcel.readInt(), (KeyEvent) dhw.a(parcel, KeyEvent.CREATOR));
                parcel2.writeNoException();
                dhw.a(parcel2, o);
                break;
            case 43:
                IInterface j = j();
                parcel2.writeNoException();
                dhw.a(parcel2, j);
                break;
            default:
                return false;
        }
        return true;
    }
}
