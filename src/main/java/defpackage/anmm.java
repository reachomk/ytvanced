package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmm */
public final class anmm implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new anml[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        boolean z = false;
        String str = null;
        Bundle bundle = str;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = qot.c(parcel, readInt);
            } else if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                bundle = qot.l(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new anml(z, i, str, bundle);
    }
}
