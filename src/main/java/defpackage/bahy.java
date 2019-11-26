package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bahy */
public final class bahy extends dhu implements bahz {
    public bahy(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.common.api.IVrCoreSdkService");
    }

    public final boolean b() {
        Parcel aK_ = aK_();
        aK_.writeInt(25);
        aK_ = a(1, aK_);
        boolean a = dhw.a(aK_);
        aK_.recycle();
        return a;
    }

    public final bahv c() {
        bahv bahu;
        Parcel a = a(2, aK_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.common.api.IDaydreamManager");
            bahu = queryLocalInterface instanceof bahv ? (bahv) queryLocalInterface : new bahu(readStrongBinder);
        } else {
            bahu = null;
        }
        a.recycle();
        return bahu;
    }

    public final bakj d() {
        bakj baki;
        Parcel a = a(4, aK_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.logging.api.IVrCoreLoggingService");
            baki = queryLocalInterface instanceof bakj ? (bakj) queryLocalInterface : new baki(readStrongBinder);
        } else {
            baki = null;
        }
        a.recycle();
        return baki;
    }
}
