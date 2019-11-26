package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pht */
public final class pht implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        phg[] phgArr = str3;
        String str4 = phgArr;
        phw phw = str4;
        boolean z = false;
        int i = 1;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 11) {
                str4 = qot.j(parcel, readInt);
            } else if (c != 12) {
                switch (c) {
                    case 1:
                        str = qot.j(parcel, readInt);
                        break;
                    case 2:
                        str2 = qot.j(parcel, readInt);
                        break;
                    case 3:
                        z = qot.c(parcel, readInt);
                        break;
                    case 4:
                        i = qot.d(parcel, readInt);
                        break;
                    case 5:
                        z2 = qot.c(parcel, readInt);
                        break;
                    case 6:
                        str3 = qot.j(parcel, readInt);
                        break;
                    case 7:
                        phgArr = (phg[]) qot.b(parcel, readInt, phg.CREATOR);
                        break;
                    default:
                        qot.b(parcel, readInt);
                        break;
                }
            } else {
                phw = (phw) qot.a(parcel, readInt, phw.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new phh(str, str2, z, i, z2, str3, phgArr, str4, phw);
    }
}
