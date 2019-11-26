package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qbn */
public final class qbn implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new psc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = qot.j(parcel, readInt);
            } else if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                j = qot.f(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new psc(str, i, j);
    }
}
