package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxf */
public final class rxf implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rvz[] rvzArr = null;
        int i = 0;
        String[] strArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c == 3) {
                rvzArr = (rvz[]) qot.b(parcel, readInt, rvz.CREATOR);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                strArr = qot.q(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rvs(i, rvzArr, strArr);
    }
}
