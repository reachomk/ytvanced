package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qab */
public final class qab implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pyu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Bundle bundle = null;
        psc[] pscArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                bundle = qot.l(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                pscArr = (psc[]) qot.b(parcel, readInt, psc.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new pyu(bundle, pscArr);
    }
}
