package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ppv */
public final class ppv implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                i = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pjo(i);
    }
}
