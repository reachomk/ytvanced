package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rue */
public final class rue implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rty[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rty(i, str);
    }
}
