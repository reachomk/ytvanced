package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ruy */
public final class ruy implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rvj rvj = null;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                rvj = (rvj) qot.a(parcel, readInt, rvj.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rvb(rvj, str);
    }
}
