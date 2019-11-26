package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phy */
public final class phy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        phe phe = null;
        String str = phe;
        phb phb = str;
        String str2 = phb;
        long j = 0;
        int i = 0;
        boolean z = false;
        int i2 = -1;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    phe = (phe) qot.a(parcel2, readInt, phe.CREATOR);
                    break;
                case 2:
                    j = qot.f(parcel2, readInt);
                    break;
                case 3:
                    i = qot.d(parcel2, readInt);
                    break;
                case 4:
                    str = qot.j(parcel2, readInt);
                    break;
                case 5:
                    phb = (phb) qot.a(parcel2, readInt, phb.CREATOR);
                    break;
                case 6:
                    z = qot.c(parcel2, readInt);
                    break;
                case 7:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 8:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 9:
                    str2 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new phj(phe, j, i, str, phb, z, i2, i3, str2);
    }
}
