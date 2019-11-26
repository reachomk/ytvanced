package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phv */
public final class phv implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        boolean z = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                qot.b(parcel, readInt);
            } else {
                z = qot.c(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new phw(z);
    }
}
