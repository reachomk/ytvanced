package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvg */
public final class rvg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Integer valueOf = Integer.valueOf(3);
        while (true) {
            Boolean bool = null;
            while (parcel.dataPosition() < a) {
                int readInt = parcel.readInt();
                char c = (char) readInt;
                if (c == 3) {
                    valueOf = qot.e(parcel, readInt);
                } else if (c != 4) {
                    qot.b(parcel, readInt);
                } else {
                    int a2 = qot.a(parcel, readInt);
                    if (a2 != 0) {
                        qot.a(parcel, a2, 4);
                        bool = Boolean.valueOf(parcel.readInt() != 0);
                    }
                }
            }
            qot.s(parcel, a);
            return new rvj(valueOf, bool);
        }
    }
}
