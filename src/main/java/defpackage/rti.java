package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rti */
public final class rti implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rsw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        rta rta = str2;
        rsu rsu = rta;
        String str3 = rsu;
        double d = 0.0d;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = qot.d(parcel2, readInt);
                    break;
                case 3:
                    str = qot.j(parcel2, readInt);
                    break;
                case 4:
                    rta = (rta) qot.a(parcel2, readInt, rta.CREATOR);
                    break;
                case 5:
                    rsu = (rsu) qot.a(parcel2, readInt, rsu.CREATOR);
                    break;
                case 6:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    str3 = qot.j(parcel2, readInt);
                    break;
                case 8:
                    z = qot.c(parcel2, readInt);
                    break;
                case 9:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 10:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 11:
                    d = qot.i(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new rsw(i, str, str2, rta, rsu, i2, str3, z, z2, d);
    }
}
