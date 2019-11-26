package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: prt */
public abstract class prt extends rjn implements prq {
    public prt() {
        super("com.google.android.gms.clearcut.internal.IClearcutLoggerCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 2:
                rjz.a(parcel, Status.CREATOR);
                a();
                break;
            case 3:
                rjz.a(parcel, Status.CREATOR);
                parcel.readLong();
                b();
                break;
            case 4:
                rjz.a(parcel, Status.CREATOR);
                d();
                break;
            case 5:
                rjz.a(parcel, Status.CREATOR);
                parcel.readLong();
                e();
                break;
            case 6:
                rjz.a(parcel, Status.CREATOR);
                parcel.createTypedArray(pri.CREATOR);
                g();
                break;
            case 7:
                rjz.a(parcel, DataHolder.CREATOR);
                h();
                break;
            case 8:
                rjz.a(parcel, Status.CREATOR);
                rjz.a(parcel, prj.CREATOR);
                c();
                break;
            case 9:
                rjz.a(parcel, Status.CREATOR);
                rjz.a(parcel, prj.CREATOR);
                f();
                break;
            default:
                return false;
        }
        return true;
    }
}
