package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rtg */
public final class rtg implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rsu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        byte[] bArr = null;
        long j = 0;
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                bArr = qot.m(parcel, readInt);
            } else if (c == 3) {
                j = qot.f(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rsu(bArr, j, str);
    }
}
