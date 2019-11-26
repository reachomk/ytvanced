package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qra */
public final class qra implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qqx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c != 2) {
                qot.b(parcel, readInt);
            } else {
                bArr = qot.m(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qqx(i, bArr);
    }
}
