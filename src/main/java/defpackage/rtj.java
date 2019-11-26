package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rtj */
public final class rtj implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rsx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rtf rtf = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                rtf = (rtf) qot.a(parcel, readInt, rtf.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new rsx(rtf);
    }
}
