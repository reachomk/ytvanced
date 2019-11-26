package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pqg */
public final class pqg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new piz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        long j = 0;
        long j2 = j;
        String str = null;
        String[] strArr = str;
        boolean z = false;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    j = qot.f(parcel, readInt);
                    break;
                case 3:
                    str = qot.j(parcel, readInt);
                    break;
                case 4:
                    j2 = qot.f(parcel, readInt);
                    break;
                case 5:
                    z = qot.c(parcel, readInt);
                    break;
                case 6:
                    strArr = qot.q(parcel, readInt);
                    break;
                case 7:
                    z2 = qot.c(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new piz(j, str, j2, z, strArr, z2);
    }
}
