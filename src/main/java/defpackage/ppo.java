package defpackage;

import android.os.Parcel;

/* renamed from: ppo */
public abstract class ppo extends rjn implements ppp {
    public ppo() {
        super("com.google.android.gms.cast.internal.ICastDeviceControllerListener");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a(parcel.readInt());
                break;
            case 2:
                a((pjb) rjz.a(parcel, pjb.CREATOR), parcel.readString(), parcel.readString(), rjz.a(parcel));
                break;
            case 3:
                b(parcel.readInt());
                break;
            case 4:
                parcel.readString();
                parcel.readDouble();
                rjz.a(parcel);
                b();
                break;
            case 5:
                a(parcel.readString(), parcel.readString());
                break;
            case 6:
                a(parcel.readString(), parcel.createByteArray());
                break;
            case 7:
                d(parcel.readInt());
                break;
            case 8:
                c(parcel.readInt());
                break;
            case 9:
                e(parcel.readInt());
                break;
            case 10:
                parcel.readString();
                a(parcel.readLong(), parcel.readInt());
                break;
            case 11:
                parcel.readString();
                a(parcel.readLong());
                break;
            case 12:
                a((poi) rjz.a(parcel, poi.CREATOR));
                break;
            case 13:
                a((ppi) rjz.a(parcel, ppi.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
