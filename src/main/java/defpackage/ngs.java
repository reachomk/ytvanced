package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ngs */
final class ngs implements Creator {
    ngs() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ngp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ngp((ngn) ngq.a(parcel.readString()).i.createFromParcel(parcel));
    }
}
