package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pmg */
public final class pmg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new plh[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = str;
        IBinder iBinder = str2;
        plu plu = iBinder;
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 4) {
                iBinder = qot.k(parcel, readInt);
            } else if (c == 5) {
                plu = (plu) qot.a(parcel, readInt, plu.CREATOR);
            } else if (c != 6) {
                qot.b(parcel, readInt);
            } else {
                z = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new plh(str, str2, iBinder, plu, z);
    }
}
