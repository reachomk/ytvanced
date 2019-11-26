package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: rsd */
public final class rsd implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new LocationAvailability[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        long j = 0;
        rqr[] rqrArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = qot.d(parcel, readInt);
            } else if (c == 2) {
                i3 = qot.d(parcel, readInt);
            } else if (c == 3) {
                j = qot.f(parcel, readInt);
            } else if (c == 4) {
                i = qot.d(parcel, readInt);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                rqrArr = (rqr[]) qot.b(parcel, readInt, rqr.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new LocationAvailability(i, i2, i3, j, rqrArr);
    }
}
