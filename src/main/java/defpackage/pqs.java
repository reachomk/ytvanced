package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pqs */
public final class pqs implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        long j = 0;
        long j2 = j;
        long j3 = j2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                j = qot.f(parcel, readInt);
            } else if (c == 3) {
                j2 = qot.f(parcel, readInt);
            } else if (c == 4) {
                str = qot.j(parcel, readInt);
            } else if (c == 5) {
                str2 = qot.j(parcel, readInt);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                j3 = qot.f(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pjc(j, j2, str, str2, j3);
    }
}
