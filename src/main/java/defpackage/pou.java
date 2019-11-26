package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pou */
public final class pou implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new poi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        String str = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                str = qot.j(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new poi(str);
    }
}
