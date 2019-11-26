package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rok */
public final class rok implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new roh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rnp rnp = null;
        int i = 0;
        boolean z = false;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel, readInt);
                    break;
                case 2:
                    z = qot.c(parcel, readInt);
                    break;
                case 3:
                    i2 = qot.d(parcel, readInt);
                    break;
                case 4:
                    z2 = qot.c(parcel, readInt);
                    break;
                case 5:
                    i3 = qot.d(parcel, readInt);
                    break;
                case 6:
                    rnp = (rnp) qot.a(parcel, readInt, rnp.CREATOR);
                    break;
                case 7:
                    z3 = qot.c(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new roh(i, z, i2, z2, i3, rnp, z3);
    }
}
