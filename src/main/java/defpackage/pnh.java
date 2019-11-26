package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: pnh */
public final class pnh implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new plu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        List list = null;
        int[] iArr = list;
        String str = iArr;
        IBinder iBinder = str;
        long j = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    list = qot.r(parcel2, readInt);
                    break;
                case 3:
                    iArr = qot.o(parcel2, readInt);
                    break;
                case 4:
                    j = qot.f(parcel2, readInt);
                    break;
                case 5:
                    str = qot.j(parcel2, readInt);
                    break;
                case 6:
                    i = qot.d(parcel2, readInt);
                    break;
                case 7:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 8:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 9:
                    i4 = qot.d(parcel2, readInt);
                    break;
                case 10:
                    i5 = qot.d(parcel2, readInt);
                    break;
                case 11:
                    i6 = qot.d(parcel2, readInt);
                    break;
                case 12:
                    i7 = qot.d(parcel2, readInt);
                    break;
                case 13:
                    i8 = qot.d(parcel2, readInt);
                    break;
                case 14:
                    i9 = qot.d(parcel2, readInt);
                    break;
                case 15:
                    i10 = qot.d(parcel2, readInt);
                    break;
                case 16:
                    i11 = qot.d(parcel2, readInt);
                    break;
                case 17:
                    i12 = qot.d(parcel2, readInt);
                    break;
                case 18:
                    i13 = qot.d(parcel2, readInt);
                    break;
                case 19:
                    i14 = qot.d(parcel2, readInt);
                    break;
                case 20:
                    i15 = qot.d(parcel2, readInt);
                    break;
                case 21:
                    i16 = qot.d(parcel2, readInt);
                    break;
                case 22:
                    i17 = qot.d(parcel2, readInt);
                    break;
                case 23:
                    i18 = qot.d(parcel2, readInt);
                    break;
                case 24:
                    i19 = qot.d(parcel2, readInt);
                    break;
                case 25:
                    i20 = qot.d(parcel2, readInt);
                    break;
                case 26:
                    i21 = qot.d(parcel2, readInt);
                    break;
                case 27:
                    i22 = qot.d(parcel2, readInt);
                    break;
                case 28:
                    i23 = qot.d(parcel2, readInt);
                    break;
                case 29:
                    i24 = qot.d(parcel2, readInt);
                    break;
                case 30:
                    i25 = qot.d(parcel2, readInt);
                    break;
                case 31:
                    i26 = qot.d(parcel2, readInt);
                    break;
                case ' ':
                    i27 = qot.d(parcel2, readInt);
                    break;
                case '!':
                    iBinder = qot.k(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new plu(list, iArr, j, str, i, i2, i3, i4, i5, i6, i7, i8, i9, i10, i11, i12, i13, i14, i15, i16, i17, i18, i19, i20, i21, i22, i23, i24, i25, i26, i27, iBinder);
    }
}
