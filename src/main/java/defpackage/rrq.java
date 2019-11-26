package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rrq */
public final class rrq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rrr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rrp rrp = null;
        IBinder iBinder = rrp;
        IBinder iBinder2 = iBinder;
        int i = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                rrp = (rrp) qot.a(parcel, readInt, rrp.CREATOR);
            } else if (c == 3) {
                iBinder = qot.k(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                iBinder2 = qot.k(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rrr(i, rrp, iBinder, iBinder2);
    }
}
