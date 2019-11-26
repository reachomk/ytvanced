package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: rxh */
public final class rxh implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new rvx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        byte[] bArr = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                bArr = qot.m(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new rvx(bArr);
    }
}
