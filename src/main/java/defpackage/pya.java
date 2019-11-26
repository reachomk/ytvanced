package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: pya */
public final class pya implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new pyb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        int i = 0;
        Uri uri = null;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = qot.d(parcel, readInt);
            } else if (c == 2) {
                uri = (Uri) qot.a(parcel, readInt, Uri.CREATOR);
            } else if (c == 3) {
                i2 = qot.d(parcel, readInt);
            } else if (c != 4) {
                qot.b(parcel, readInt);
            } else {
                i3 = qot.d(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new pyb(i, uri, i2, i3);
    }
}
