package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rve */
public final class rve implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        List list = str;
        List list2 = list;
        List list3 = list2;
        List list4 = list3;
        List list5 = list4;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 9) {
                list5 = qot.c(parcel, readInt, ruw.CREATOR);
            } else if (c == 11) {
                list3 = qot.c(parcel, readInt, rvb.CREATOR);
            } else if (c == 13) {
                list4 = qot.c(parcel, readInt, rvk.CREATOR);
            } else if (c == 4) {
                list = qot.c(parcel, readInt, rvf.CREATOR);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                list2 = qot.c(parcel, readInt, rvp.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rvh(str, list, list2, list3, list4, list5);
    }
}
