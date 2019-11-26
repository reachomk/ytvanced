package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rto */
public final class rto implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rtc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        rta rta = str3;
        String str4 = rta;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 4) {
                str3 = qot.j(parcel, readInt);
            } else if (c == 5) {
                rta = (rta) qot.a(parcel, readInt, rta.CREATOR);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                str4 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rtc(str, str2, str3, rta, str4);
    }
}
