package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rtn */
public final class rtn implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rtb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        List list = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                list = qot.c(parcel, readInt, rtf.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rtb(str, list);
    }
}
