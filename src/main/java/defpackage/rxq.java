package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxq */
public final class rxq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwa[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                i2 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rwa(i, i2);
    }
}
