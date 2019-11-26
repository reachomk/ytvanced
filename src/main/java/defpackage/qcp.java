package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: qcp */
public final class qcp implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new qcd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int a = qot.a(parcel);
        Bundle bundle = null;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            if (((char) readInt) != 2) {
                qot.b(parcel, readInt);
            } else {
                bundle = qot.l(parcel, readInt);
            }
        }
        qot.s(parcel, a);
        return new qcd(bundle);
    }
}
