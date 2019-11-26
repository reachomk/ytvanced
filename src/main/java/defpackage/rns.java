package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rns */
public final class rns implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rnp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                z = qot.c(parcel, readInt);
            } else if (c == 3) {
                z2 = qot.c(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                z3 = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rnp(z, z2, z3);
    }
}
