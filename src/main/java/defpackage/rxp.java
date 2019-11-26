package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxp */
public final class rxp implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        byte[] bArr = str2;
        long j = 0;
        double d = 0.0d;
        boolean z = false;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel2, readInt);
                    break;
                case 3:
                    j = qot.f(parcel2, readInt);
                    break;
                case 4:
                    z = qot.c(parcel2, readInt);
                    break;
                case 5:
                    d = qot.i(parcel2, readInt);
                    break;
                case 6:
                    str2 = qot.j(parcel2, readInt);
                    break;
                case 7:
                    bArr = qot.m(parcel2, readInt);
                    break;
                case 8:
                    i = qot.d(parcel2, readInt);
                    break;
                case 9:
                    i2 = qot.d(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new rvz(str, j, z, d, str2, bArr, i, i2);
    }
}
