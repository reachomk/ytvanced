package defpackage;

import android.location.Location;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rkx */
public final class rkx implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rky[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        Bundle bundle = null;
        List list = bundle;
        String str = list;
        rno rno = str;
        Location location = rno;
        String str2 = location;
        Bundle bundle2 = str2;
        Bundle bundle3 = bundle2;
        List list2 = bundle3;
        String str3 = list2;
        String str4 = str3;
        long j = 0;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel2, readInt);
                    break;
                case 2:
                    j = qot.f(parcel2, readInt);
                    break;
                case 3:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 4:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 5:
                    list = qot.r(parcel2, readInt);
                    break;
                case 6:
                    z = qot.c(parcel2, readInt);
                    break;
                case 7:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 8:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 9:
                    str = qot.j(parcel2, readInt);
                    break;
                case 10:
                    rno = (rno) qot.a(parcel2, readInt, rno.CREATOR);
                    break;
                case 11:
                    location = (Location) qot.a(parcel2, readInt, Location.CREATOR);
                    break;
                case 12:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 13:
                    bundle2 = qot.l(parcel2, readInt);
                    break;
                case 14:
                    bundle3 = qot.l(parcel2, readInt);
                    break;
                case 15:
                    list2 = qot.r(parcel2, readInt);
                    break;
                case 16:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 17:
                    str4 = qot.j(parcel2, readInt);
                    break;
                case 18:
                    z3 = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new rky(i, j, bundle, i2, list, z, i3, z2, str, rno, location, str2, bundle2, bundle3, list2, str3, str4, z3);
    }
}
