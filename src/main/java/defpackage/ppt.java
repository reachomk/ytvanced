package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ppt */
public final class ppt implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjm[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        float f = 0.0f;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                f = qot.h(parcel, readInt);
            } else if (c == 3) {
                f2 = qot.h(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                f3 = qot.h(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pjm(f, f2, f3);
    }
}
