package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Status;

/* renamed from: rqt */
public final class rqt implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rqq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Status status = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 1) {
                qot.b(parcel, readInt);
            } else {
                status = (Status) qot.a(parcel, readInt, Status.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rqq(status);
    }
}
