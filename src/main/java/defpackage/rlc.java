package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rlc */
public final class rlc implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rkz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        rkz[] rkzArr = str;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel, readInt);
                    break;
                case 3:
                    i = qot.d(parcel, readInt);
                    break;
                case 4:
                    i2 = qot.d(parcel, readInt);
                    break;
                case 5:
                    z = qot.c(parcel, readInt);
                    break;
                case 6:
                    i3 = qot.d(parcel, readInt);
                    break;
                case 7:
                    i4 = qot.d(parcel, readInt);
                    break;
                case 8:
                    rkzArr = (rkz[]) qot.b(parcel, readInt, rkz.CREATOR);
                    break;
                case 9:
                    z2 = qot.c(parcel, readInt);
                    break;
                case 10:
                    z3 = qot.c(parcel, readInt);
                    break;
                case 11:
                    z4 = qot.c(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new rkz(str, i, i2, z, i3, i4, rkzArr, z2, z3, z4);
    }
}
