package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qtg */
public final class qtg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qtd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        psa psa = null;
        int i = 0;
        pzs pzs = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                psa = (psa) qot.a(parcel, readInt, psa.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                pzs = (pzs) qot.a(parcel, readInt, pzs.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new qtd(i, psa, pzs);
    }
}
