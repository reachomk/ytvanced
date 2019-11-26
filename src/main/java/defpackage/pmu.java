package defpackage;

import android.os.IInterface;
import android.os.Parcel;

/* renamed from: pmu */
public abstract class pmu extends rjn implements pmv {
    public pmu() {
        super("com.google.android.gms.cast.framework.media.IImagePicker");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        pyb a;
        if (i == 1) {
            pjw pjw = (pjw) rjz.a(parcel, pjw.CREATOR);
            parcel.readInt();
            a = a(pjw);
            parcel2.writeNoException();
            rjz.b(parcel2, a);
        } else if (i == 2) {
            IInterface b = b();
            parcel2.writeNoException();
            rjz.a(parcel2, b);
        } else if (i == 3) {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(13280009);
        } else if (i != 4) {
            return false;
        } else {
            a = a((pjw) rjz.a(parcel, pjw.CREATOR), (plj) rjz.a(parcel, plj.CREATOR));
            parcel2.writeNoException();
            rjz.b(parcel2, a);
        }
        return true;
    }
}
