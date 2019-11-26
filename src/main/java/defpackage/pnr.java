package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: pnr */
public final class pnr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pko[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        List list = str;
        pjr pjr = list;
        plh plh = pjr;
        double d = 0.0d;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel2, readInt);
                    break;
                case 3:
                    list = qot.r(parcel2, readInt);
                    break;
                case 4:
                    z = qot.c(parcel2, readInt);
                    break;
                case 5:
                    pjr = (pjr) qot.a(parcel2, readInt, pjr.CREATOR);
                    break;
                case 6:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 7:
                    plh = (plh) qot.a(parcel2, readInt, plh.CREATOR);
                    break;
                case 8:
                    z3 = qot.c(parcel2, readInt);
                    break;
                case 9:
                    d = qot.i(parcel2, readInt);
                    break;
                case 10:
                    z4 = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pko(str, list, z, pjr, z2, plh, z3, d, z4);
    }
}
