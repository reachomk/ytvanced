package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qer */
public final class qer implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qeb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                i2 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qeb(i, i2);
    }
}
