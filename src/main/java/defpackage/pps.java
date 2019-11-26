package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pps */
public final class pps implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        pjm pjm = null;
        pjm pjm2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                pjm = (pjm) qot.a(parcel, readInt, pjm.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                pjm2 = (pjm) qot.a(parcel, readInt, pjm.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new pjp(pjm, pjm2);
    }
}
