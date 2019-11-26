package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qte */
public final class qte implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qtb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        pzq pzq = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                pzq = (pzq) qot.a(parcel, readInt, pzq.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new qtb(i, pzq);
    }
}
