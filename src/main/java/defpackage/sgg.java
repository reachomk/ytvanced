package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sgg */
final class sgg implements Creator {
    sgg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sge[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sge(parcel);
    }
}
