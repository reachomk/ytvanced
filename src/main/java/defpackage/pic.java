package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pic */
public final class pic implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phg[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                bundle = qot.l(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new phg(i, bundle);
    }
}
