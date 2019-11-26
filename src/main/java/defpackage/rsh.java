package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rsh */
public final class rsh implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rqr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        long j = -1;
        long j2 = j;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 3) {
                j = qot.f(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                j2 = qot.f(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rqr(i, i2, j, j2);
    }
}
