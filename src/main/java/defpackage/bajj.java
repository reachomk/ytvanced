package defpackage;

import android.os.Parcel;

/* renamed from: bajj */
public abstract class bajj extends dhx implements bajg {
    public bajj() {
        super("com.google.vr.vrcore.controller.api.IControllerListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            a();
            parcel2.writeNoException();
            parcel2.writeInt(25);
        } else if (i != 2) {
            switch (i) {
                case 9:
                    baim b = b();
                    parcel2.writeNoException();
                    dhw.b(parcel2, b);
                    break;
                case 10:
                    a((baig) dhw.a(parcel, baig.CREATOR));
                    break;
                case 11:
                    a((baio) dhw.a(parcel, baio.CREATOR));
                    break;
                case 12:
                    a((baii) dhw.a(parcel, baii.CREATOR));
                    break;
                default:
                    return false;
            }
        } else {
            a(parcel.readInt(), parcel.readInt());
        }
        return true;
    }
}
