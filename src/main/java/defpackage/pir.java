package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pir */
public final class pir implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pie[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel, readInt);
                    break;
                case 2:
                    j = qot.f(parcel, readInt);
                    break;
                case 3:
                    str = qot.j(parcel, readInt);
                    break;
                case 4:
                    i2 = qot.d(parcel, readInt);
                    break;
                case 5:
                    i3 = qot.d(parcel, readInt);
                    break;
                case 6:
                    str2 = qot.j(parcel, readInt);
                    break;
                default:
                    qot.b(parcel, readInt);
                    break;
            }
        }
        qot.s(parcel, a);
        return new pie(i, j, str, i2, i3, str2);
    }
}
