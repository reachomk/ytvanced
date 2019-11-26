package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bajl */
public final class bajl extends dhu implements baji {
    public bajl(IBinder iBinder) {
        super(iBinder, "com.google.vr.vrcore.controller.api.IControllerService");
    }

    public final int a() {
        Parcel aK_ = aK_();
        aK_.writeInt(25);
        aK_ = a(1, aK_);
        int readInt = aK_.readInt();
        aK_.recycle();
        return readInt;
    }

    public final boolean a(int i, String str, bajg bajg) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        aK_.writeString(str);
        dhw.a(aK_, (IInterface) bajg);
        Parcel a = a(5, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean a(String str) {
        Parcel aK_ = aK_();
        aK_.writeString(str);
        Parcel a = a(6, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean a(bajk bajk) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) bajk);
        Parcel a = a(8, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final boolean b(bajk bajk) {
        Parcel aK_ = aK_();
        dhw.a(aK_, (IInterface) bajk);
        Parcel a = a(9, aK_);
        boolean a2 = dhw.a(a);
        a.recycle();
        return a2;
    }

    public final int b() {
        Parcel a = a(10, aK_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final void a(int i, bais bais) {
        Parcel aK_ = aK_();
        aK_.writeInt(i);
        dhw.a(aK_, (Parcelable) bais);
        b(11, aK_);
    }
}
