package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qmf */
public final class qmf implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qmg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                i = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qmg(str, i);
    }
}
