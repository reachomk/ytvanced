package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anmp */
public final class anmp implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new anmu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        byte[] bArr = str2;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
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
                    str = qot.j(parcel, readInt);
                    break;
                case 4:
                    str2 = qot.j(parcel, readInt);
                    break;
                case 5:
                    bArr = qot.m(parcel, readInt);
                    break;
                case 6:
                    z2 = qot.c(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new anmu(i, z, str, str2, bArr, z2);
    }
}
