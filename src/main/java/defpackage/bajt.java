package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bajt */
public abstract class bajt extends dhx implements baju {
    public bajt() {
        super("com.google.vr.vrcore.library.api.IGvrLayout");
    }

    public static baju asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IGvrLayout");
        if (queryLocalInterface instanceof baju) {
            return (baju) queryLocalInterface;
        }
        return new bajw(iBinder);
    }

    /* Access modifiers changed, original: protected */
    public boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        String str = "com.google.vr.vrcore.library.api.IObjectWrapper";
        baka baka = null;
        IInterface rootView;
        IBinder readStrongBinder;
        IInterface queryLocalInterface;
        boolean enableAsyncReprojection;
        switch (i) {
            case 2:
                long nativeGvrContext = getNativeGvrContext();
                parcel2.writeNoException();
                parcel2.writeLong(nativeGvrContext);
                break;
            case 3:
                rootView = getRootView();
                parcel2.writeNoException();
                dhw.a(parcel2, rootView);
                break;
            case 4:
                rootView = getUiLayout();
                parcel2.writeNoException();
                dhw.a(parcel2, rootView);
                break;
            case 5:
                onPause();
                parcel2.writeNoException();
                break;
            case 6:
                onResume();
                parcel2.writeNoException();
                break;
            case 7:
                shutdown();
                parcel2.writeNoException();
                break;
            case 8:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                setPresentationView(baka);
                parcel2.writeNoException();
                break;
            case 9:
                enableAsyncReprojection = enableAsyncReprojection(parcel.readInt());
                parcel2.writeNoException();
                dhw.a(parcel2, enableAsyncReprojection);
                break;
            case 10:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                enableAsyncReprojection = enableCardboardTriggerEmulation(baka);
                parcel2.writeNoException();
                dhw.a(parcel2, enableAsyncReprojection);
                break;
            case 11:
                setStereoModeEnabled(dhw.a(parcel));
                parcel2.writeNoException();
                break;
            case 12:
                onBackPressed();
                parcel2.writeNoException();
                break;
            case 13:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                setReentryIntent(baka);
                parcel2.writeNoException();
                break;
            case 14:
                readStrongBinder = parcel.readStrongBinder();
                if (readStrongBinder != null) {
                    queryLocalInterface = readStrongBinder.queryLocalInterface(str);
                    if (queryLocalInterface instanceof baka) {
                        baka = (baka) queryLocalInterface;
                    } else {
                        baka = new bakc(readStrongBinder);
                    }
                }
                enableAsyncReprojection = setOnDonNotNeededListener(baka);
                parcel2.writeNoException();
                dhw.a(parcel2, enableAsyncReprojection);
                break;
            default:
                return false;
        }
        return true;
    }
}
