package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pia */
public final class pia implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phe[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = str2;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = qot.j(parcel, readInt);
            } else if (c == 2) {
                str2 = qot.j(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str3 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new phe(str, str2, str3);
    }
}
