package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pmy */
public final class pmy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new plj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c == 3) {
                i2 = qot.d(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                i3 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new plj(i, i2, i3);
    }
}
