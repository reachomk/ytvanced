package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxe */
public final class rxe implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        rvs[] rvsArr = str2;
        byte[] bArr = rvsArr;
        long j = 0;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    str = qot.j(parcel, readInt);
                    break;
                case 3:
                    str2 = qot.j(parcel, readInt);
                    break;
                case 4:
                    rvsArr = (rvs[]) qot.b(parcel, readInt, rvs.CREATOR);
                    break;
                case 5:
                    z = qot.c(parcel, readInt);
                    break;
                case 6:
                    bArr = qot.m(parcel, readInt);
                    break;
                case 7:
                    j = qot.f(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new rvu(str, str2, rvsArr, z, bArr, j);
    }
}
