package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: bake */
public final class bake extends dhu implements bakb {
    bake(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.library.api.IVrCreator");
    }

    public final bakd a(baka baka, baka baka2) {
        bakd bakf;
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) baka);
        dhw.a(aK_, (IInterface) baka2);
        Parcel a = a(4, aK_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder != null) {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.vr.vrcore.library.api.IVrNativeLibraryLoader");
            bakf = queryLocalInterface instanceof bakd ? (bakd) queryLocalInterface : new bakf(readStrongBinder);
        } else {
            bakf = null;
        }
        a.recycle();
        return bakf;
    }

    public final baju b(baka baka, baka baka2) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) baka);
        dhw.a(aK_, (IInterface) baka2);
        Parcel a = a(5, aK_);
        baju asInterface = bajt.asInterface(a.readStrongBinder());
        a.recycle();
        return asInterface;
    }
}
