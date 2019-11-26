package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pqr */
public final class pqr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pkl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        float f = 0.0f;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    f = qot.h(parcel2, readInt);
                    break;
                case 3:
                    i = qot.d(parcel2, readInt);
                    break;
                case 4:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 5:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 6:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    i5 = qot.d(parcel2, readInt);
                    break;
                case 8:
                    i6 = qot.d(parcel2, readInt);
                    break;
                case 9:
                    i7 = qot.d(parcel2, readInt);
                    break;
                case 10:
                    str = qot.j(parcel2, readInt);
                    break;
                case 11:
                    i8 = qot.d(parcel2, readInt);
                    break;
                case 12:
                    i9 = qot.d(parcel2, readInt);
                    break;
                case 13:
                    str2 = qot.j(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new pkl(f, i, i2, i3, i4, i5, i6, i7, str, i8, i9, str2);
    }
}
