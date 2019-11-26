package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rvl */
public final class rvl implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        rvj rvj = null;
        String str = null;
        String str2 = str;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                rvj = (rvj) qot.a(parcel, readInt, rvj.CREATOR);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rvk(rvj, str, str2);
    }
}
