package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qms */
public final class qms implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qmp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                i = qot.d(parcel, readInt);
            } else if (c == 4) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 5) {
                z = qot.c(parcel, readInt);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                z2 = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qmp(str, i, i2, z, z2);
    }
}
