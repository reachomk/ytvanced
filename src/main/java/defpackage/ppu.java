package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ppu */
public final class ppu implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pjr[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        boolean z = false;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                z = qot.c(parcel, readInt);
            } else if (c != 3) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pjr(z, str);
    }
}
