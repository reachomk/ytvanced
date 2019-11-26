package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qsw */
public final class qsw implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qst[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                i2 = qot.d(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                intent = (Intent) qot.a(parcel, readInt, Intent.CREATOR);
            }
        }
        qot.s(parcel, a);
        return new qst(i, i2, intent);
    }
}
