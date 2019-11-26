package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pzv */
public final class pzv implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pzs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        IBinder iBinder = null;
        psa psa = iBinder;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                iBinder = qot.k(parcel, readInt);
            } else if (c == 3) {
                psa = (psa) qot.a(parcel, readInt, psa.CREATOR);
            } else if (c == 4) {
                z = qot.c(parcel, readInt);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                z2 = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pzs(i, iBinder, psa, z, z2);
    }
}
