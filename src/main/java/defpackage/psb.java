package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: psb */
public final class psb implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pri[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        prn prn = null;
        byte[] bArr = prn;
        int[] iArr = bArr;
        String[] strArr = iArr;
        int[] iArr2 = strArr;
        byte[][] bArr2 = iArr2;
        rvw[] rvwArr = bArr2;
        boolean z = true;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    prn = (prn) qot.a(parcel, readInt, prn.CREATOR);
                    break;
                case 3:
                    bArr = qot.m(parcel, readInt);
                    break;
                case 4:
                    iArr = qot.o(parcel, readInt);
                    break;
                case 5:
                    strArr = qot.q(parcel, readInt);
                    break;
                case 6:
                    iArr2 = qot.o(parcel, readInt);
                    break;
                case 7:
                    bArr2 = qot.n(parcel, readInt);
                    break;
                case 8:
                    z = qot.c(parcel, readInt);
                    break;
                case 9:
                    rvwArr = (rvw[]) qot.b(parcel, readInt, rvw.CREATOR);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new pri(prn, bArr, iArr, strArr, iArr2, bArr2, z, rvwArr);
    }
}
