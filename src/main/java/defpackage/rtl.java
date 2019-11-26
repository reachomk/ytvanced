package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rtl */
public final class rtl implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rsz[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        boolean z = false;
        String str2 = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                z = qot.c(parcel, readInt);
            } else if (c == 3) {
                str = qot.j(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str2 = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rsz(z, str, str2);
    }
}
