package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qgk */
public final class qgk implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qgl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        int i = 0;
        Intent intent = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                i = qot.d(parcel, readInt);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                intent = (Intent) qot.a(parcel, readInt, Intent.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new qgl(i, str, intent);
    }
}
