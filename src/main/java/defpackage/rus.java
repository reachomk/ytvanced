package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rus */
public final class rus implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ruv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        List list = str;
        String str2 = list;
        Long l = str2;
        Long l2 = l;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                list = qot.c(parcel, readInt, rvr.CREATOR);
            } else if (c == 4) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 5) {
                l = qot.g(parcel, readInt);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                l2 = qot.g(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new ruv(str, list, str2, l, l2);
    }
}
