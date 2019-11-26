package defpackage;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;

/* renamed from: rwr */
public abstract class rwr extends rjn implements rwp {
    public rwr() {
        super("com.google.android.gms.phenotype.internal.IPhenotypeCallbacks");
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 1:
                a((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 2:
                b((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 3:
                d((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 4:
                a((Status) rjz.a(parcel, Status.CREATOR), (rvu) rjz.a(parcel, rvu.CREATOR));
                break;
            case 5:
                e((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 6:
                a((Status) rjz.a(parcel, Status.CREATOR), (rvw) rjz.a(parcel, rvw.CREATOR));
                break;
            case 7:
                a((Status) rjz.a(parcel, Status.CREATOR), (rvx) rjz.a(parcel, rvx.CREATOR));
                break;
            case 8:
                f((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 9:
                a((Status) rjz.a(parcel, Status.CREATOR), (rvz) rjz.a(parcel, rvz.CREATOR));
                break;
            case 10:
                b((Status) rjz.a(parcel, Status.CREATOR), (rvu) rjz.a(parcel, rvu.CREATOR));
                break;
            case 11:
                g((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 12:
                h((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 13:
                a((Status) rjz.a(parcel, Status.CREATOR), (rwb) rjz.a(parcel, rwb.CREATOR));
                break;
            case 14:
                c((Status) rjz.a(parcel, Status.CREATOR));
                break;
            case 15:
                i((Status) rjz.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        return true;
    }
}
