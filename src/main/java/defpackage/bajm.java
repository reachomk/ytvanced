package defpackage;

import android.os.Parcel;

/* renamed from: bajm */
public abstract class bajm extends dhx implements bajk {
    public bajm() {
        super("com.google.vr.vrcore.controller.api.IControllerServiceListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(25);
        } else if (i != 2) {
            return false;
        } else {
            a(parcel.readInt());
        }
        return true;
    }
}
