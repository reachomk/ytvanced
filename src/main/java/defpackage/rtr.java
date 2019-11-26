package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rtr */
public final class rtr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rtf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        List list = null;
        List list2 = list;
        List list3 = list2;
        String str = list3;
        rsu rsu = str;
        String str2 = rsu;
        String str3 = str2;
        String str4 = str3;
        double d = 0.0d;
        long j = 0;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 3:
                    list = qot.c(parcel2, readInt, rtc.CREATOR);
                    break;
                case 5:
                    list2 = qot.c(parcel2, readInt, rte.CREATOR);
                    break;
                case 6:
                    list3 = qot.c(parcel2, readInt, rsw.CREATOR);
                    break;
                case 7:
                    str = qot.j(parcel2, readInt);
                    break;
                case 8:
                    rsu = (rsu) qot.a(parcel2, readInt, rsu.CREATOR);
                    break;
                case 9:
                    z = qot.c(parcel2, readInt);
                    break;
                case 10:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 11:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 12:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 13:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 14:
                    i = qot.d(parcel2, readInt);
                    break;
                case 15:
                    d = qot.i(parcel2, readInt);
                    break;
                case 16:
                    j = qot.f(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new rtf(list, list2, list3, str, rsu, z, z2, str2, str3, str4, i, d, j);
    }
}
