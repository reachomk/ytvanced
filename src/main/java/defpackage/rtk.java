package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rtk */
public final class rtk implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rsy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        List list = null;
        int i = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c == 3) {
                list = qot.c(parcel, readInt, rtf.CREATOR);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rsy(i, list, str);
    }
}
