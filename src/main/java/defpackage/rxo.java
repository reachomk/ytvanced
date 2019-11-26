package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxo */
public final class rxo implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = null;
        rvz rvz = str2;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 4) {
                rvz = (rvz) qot.a(parcel, readInt, rvz.CREATOR);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                z = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rvy(str, str2, rvz, z);
    }
}
