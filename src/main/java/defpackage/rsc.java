package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationRequest;

/* renamed from: rsc */
public final class rsc implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Parcel parcel2 = parcel;
        int a = qot.a(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = qot.d(parcel2, readInt);
                    break;
                case 2:
                    j = qot.f(parcel2, readInt);
                    break;
                case 3:
                    j2 = qot.f(parcel2, readInt);
                    break;
                case 4:
                    z = qot.c(parcel2, readInt);
                    break;
                case 5:
                    j3 = qot.f(parcel2, readInt);
                    break;
                case 6:
                    i2 = qot.d(parcel2, readInt);
                    break;
                case 7:
                    f = qot.h(parcel2, readInt);
                    break;
                case 8:
                    j4 = qot.f(parcel2, readInt);
                    break;
                default:
                    qot.b(parcel2, readInt);
                    break;
            }
        }
        qot.s(parcel2, a);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4);
    }
}
