package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ppl */
public final class ppl implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ppi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        pjb pjb = null;
        pjp pjp = pjb;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    d = qot.i(parcel, readInt);
                    break;
                case 3:
                    z = qot.c(parcel, readInt);
                    break;
                case 4:
                    i = qot.d(parcel, readInt);
                    break;
                case 5:
                    pjb = (pjb) qot.a(parcel, readInt, pjb.CREATOR);
                    break;
                case 6:
                    i2 = qot.d(parcel, readInt);
                    break;
                case 7:
                    pjp = (pjp) qot.a(parcel, readInt, pjp.CREATOR);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new ppi(d, z, i, pjb, i2, pjp);
    }
}
