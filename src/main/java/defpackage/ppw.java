package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: ppw */
public final class ppw implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = null;
        Bundle bundle = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                list = qot.c(parcel, readInt, pyb.CREATOR);
            } else if (c == 3) {
                bundle = qot.l(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                i = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pjw(list, bundle, i);
    }
}
