package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rxr */
public final class rxr implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rwb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                list = qot.c(parcel, readInt, rvy.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rwb(list);
    }
}
