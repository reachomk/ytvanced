package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pry */
public final class pry implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new prj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        long j = 0;
        long j2 = j;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = qot.c(parcel, readInt);
            } else if (c == 2) {
                j2 = qot.f(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                j = qot.f(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new prj(z, j, j2);
    }
}
