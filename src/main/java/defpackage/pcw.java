package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pcw */
public final class pcw implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pcs[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        boolean z = false;
        IBinder iBinder = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                z = qot.c(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                iBinder = qot.k(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pcs(z, iBinder);
    }
}
