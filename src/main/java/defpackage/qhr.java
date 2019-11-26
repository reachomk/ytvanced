package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qhr */
public final class qhr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qhl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        long j = 0;
        long j2 = j;
        long j3 = j2;
        Bundle bundle = null;
        int i = 0;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        boolean z2 = false;
        boolean z3 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    i = qot.d(parcel2, readInt);
                    break;
                case 3:
                    j = qot.f(parcel2, readInt);
                    break;
                case 4:
                    j2 = qot.f(parcel2, readInt);
                    break;
                case 5:
                    j3 = qot.f(parcel2, readInt);
                    break;
                case 6:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    bundle = qot.l(parcel2, readInt);
                    break;
                case 8:
                    z = qot.c(parcel2, readInt);
                    break;
                case 9:
                    i3 = qot.d(parcel2, readInt);
                    break;
                case 10:
                    z2 = qot.c(parcel2, readInt);
                    break;
                case 11:
                    z3 = qot.c(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new qhl(i, j, j2, j3, i2, bundle, z, i3, z2, z3);
    }
}
