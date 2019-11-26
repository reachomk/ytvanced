package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: pit */
public final class pit implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pig[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                list = qot.c(parcel, readInt, pie.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new pig(i, list);
    }
}
