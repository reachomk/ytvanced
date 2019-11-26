package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rux */
public final class rux implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new ruw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rvj rvj = null;
        Long l = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                rvj = (rvj) qot.a(parcel, readInt, rvj.CREATOR);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                l = qot.g(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new ruw(rvj, l);
    }
}
