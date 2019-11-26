package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qqy */
public final class qqy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qqv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        int i = 0;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qqv(i, str, str2);
    }
}
