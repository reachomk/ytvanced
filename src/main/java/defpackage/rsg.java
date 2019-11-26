package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rsg */
public final class rsg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rqj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        long j = 50;
        long j2 = Long.MAX_VALUE;
        boolean z = true;
        float f = 0.0f;
        int i = Integer.MAX_VALUE;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = qot.c(parcel2, readInt);
            } else if (c == 2) {
                j = qot.f(parcel2, readInt);
            } else if (c == 3) {
                f = qot.h(parcel2, readInt);
            } else if (c == 4) {
                j2 = qot.f(parcel2, readInt);
            } else if (c != 5) {
                qot.b(parcel2, readInt);
            } else {
                i = qot.d(parcel2, readInt);
            }
        }
        qot.s(parcel2, a);
        return new rqj(z, j, f, j2, i);
    }
}
