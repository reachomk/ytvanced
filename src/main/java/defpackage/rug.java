package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: rug */
public abstract class rug extends rjn implements ruh {
    public rug() {
        super("com.google.android.gms.people.internal.IPeopleCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                parcel.readInt();
                rjz.a(parcel, Bundle.CREATOR);
                rjz.a(parcel, Bundle.CREATOR);
                a();
                break;
            case 2:
                a(parcel.readInt(), (Bundle) rjz.a(parcel, Bundle.CREATOR), (DataHolder) rjz.a(parcel, DataHolder.CREATOR));
                break;
            case 3:
                parcel.readInt();
                rjz.a(parcel, Bundle.CREATOR);
                rjz.a(parcel, ParcelFileDescriptor.CREATOR);
                c();
                break;
            case 4:
                parcel.readInt();
                rjz.a(parcel, Bundle.CREATOR);
                parcel.createTypedArray(DataHolder.CREATOR);
                b();
                break;
            case 5:
                parcel.readInt();
                rjz.a(parcel, Bundle.CREATOR);
                rjz.a(parcel, ParcelFileDescriptor.CREATOR);
                rjz.a(parcel, Bundle.CREATOR);
                d();
                break;
            case 6:
                parcel.readInt();
                rjz.a(parcel, ruv.CREATOR);
                e();
                break;
            case 7:
                parcel.readInt();
                rjz.a(parcel, rvh.CREATOR);
                f();
                break;
            case 8:
                parcel.readInt();
                g();
                break;
            case 9:
                parcel.readInt();
                parcel.createTypedArrayList(rsx.CREATOR);
                rjz.a(parcel, rsz.CREATOR);
                h();
                break;
            case 10:
                parcel.readInt();
                parcel.createTypedArrayList(rtb.CREATOR);
                rjz.a(parcel, rsz.CREATOR);
                i();
                break;
            case 11:
                parcel.readInt();
                rjz.a(parcel);
                k();
                break;
            case 12:
                parcel.readInt();
                rjz.a(parcel, rty.CREATOR);
                l();
                break;
            case 13:
                parcel.readInt();
                rjz.a(parcel, rsy.CREATOR);
                rjz.a(parcel, rsz.CREATOR);
                j();
                break;
            case 14:
                parcel.readInt();
                rjz.a(parcel, rth.CREATOR);
                m();
                break;
            case 15:
                parcel.readInt();
                parcel.readString();
                n();
                break;
            case 16:
                parcel.readInt();
                rjz.a(parcel, rtz.CREATOR);
                o();
                break;
            case 17:
                parcel.readInt();
                parcel.createTypedArrayList(rsy.CREATOR);
                p();
                break;
            default:
                return false;
        }
        return true;
    }
}
