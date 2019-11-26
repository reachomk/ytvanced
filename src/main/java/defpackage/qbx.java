package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qbx */
public final class qbx implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qby[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        IBinder iBinder = null;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = qot.j(parcel, readInt);
            } else if (c == 2) {
                iBinder = qot.k(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                z = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qby(str, iBinder, z);
    }
}
