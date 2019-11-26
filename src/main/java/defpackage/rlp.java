package defpackage;

import android.os.Parcel;

/* renamed from: rlp */
public abstract class rlp extends rjn implements rlq {
    public rlp() {
        super("com.google.android.gms.ads.internal.client.IAdListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a();
                break;
            case 2:
                a(parcel.readInt());
                break;
            case 3:
                b();
                break;
            case 4:
                c();
                break;
            case 5:
                d();
                break;
            case 6:
                e();
                break;
            case 7:
                f();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
