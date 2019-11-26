package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bajy */
public abstract class bajy extends dhx implements bajv {
    public bajy() {
        super("com.google.vr.vrcore.library.api.IGvrUiLayout");
    }

    public static bajv asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrUiLayout");
        if (queryLocalInterface instanceof bajv) {
            return (bajv) queryLocalInterface;
        }
        return new bajx(iBinder);
    }

    /* Access modifiers changed, original: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "com.google.vr.vrcore.library.api.IObjectWrapper";
        baka baka = null;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        switch (i) {
            case 2:
                IInterface rootView = getRootView();
                parcel2.writeNoException();
                dhw.a(parcel2, rootView);
                break;
            case 3:
                setEnabled(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 4:
                boolean isEnabled = isEnabled();
                parcel2.writeNoException();
                dhw.a(parcel2, isEnabled);
                break;
            case 5:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                setCloseButtonListener(baka);
                parcel2.writeNoException();
                break;
            case 6:
                setTransitionViewEnabled(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 7:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                setTransitionViewListener(baka);
                parcel2.writeNoException();
                break;
            case 8:
                setSettingsButtonEnabled(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 9:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                setSettingsButtonListener(baka);
                parcel2.writeNoException();
                break;
            case 10:
                setViewerName(parcel.readString());
                parcel2.writeNoException();
                break;
            default:
                return false;
        }
        return true;
    }
}
