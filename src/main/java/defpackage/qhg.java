package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qhg */
public final class qhg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qfy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = str2;
        String str4 = str3;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                str2 = qot.j(parcel, readInt);
            } else if (c == 4) {
                str4 = qot.j(parcel, readInt);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                str3 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qfy(str, str2, str3, str4);
    }
}
