package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pqq */
public final class pqq implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pkk[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pkk(str, str2);
    }
}
