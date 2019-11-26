package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: pib */
public final class pib implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phf[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Status status = null;
        List list = null;
        String[] strArr = list;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                status = (Status) qot.a(parcel, readInt, Status.CREATOR);
            } else if (c == 2) {
                list = qot.c(parcel, readInt, phj.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                strArr = qot.q(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new phf(status, list, strArr);
    }
}
