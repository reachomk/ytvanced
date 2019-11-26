package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: phz */
public final class phz implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new phd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        phh phh = null;
        byte[] bArr = phh;
        int i = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = qot.j(parcel, readInt);
            } else if (c == 3) {
                phh = (phh) qot.a(parcel, readInt, phh.CREATOR);
            } else if (c == 4) {
                i = qot.d(parcel, readInt);
            } else if (c != 5) {
                qot.b(parcel, readInt);
            } else {
                bArr = qot.m(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new phd(str, phh, i, bArr);
    }
}
