package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.List;

/* renamed from: rro */
public final class rro implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rrp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rqj rqj = rrp.b;
        List list = rrp.a;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                rqj = (rqj) qot.a(parcel, readInt, rqj.CREATOR);
            } else if (c == 2) {
                list = qot.c(parcel, readInt, pyq.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rrp(rqj, list, str);
    }
}
