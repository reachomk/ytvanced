package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: prw */
public final class prw implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new prn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        String str3 = str2;
        String str4 = str3;
        int i = 0;
        int i2 = 0;
        boolean z = true;
        boolean z2 = false;
        int i3 = 0;
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
                    str2 = qot.j(parcel, readInt);
                    break;
                case 6:
                    str3 = qot.j(parcel, readInt);
                    break;
                case 7:
                    z = qot.c(parcel, readInt);
                    break;
                case 8:
                    str4 = qot.j(parcel, readInt);
                    break;
                case 9:
                    z2 = qot.c(parcel, readInt);
                    break;
                case 10:
                    i3 = qot.d(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new prn(str, i, i2, str2, str3, z, str4, z2, i3);
    }
}
