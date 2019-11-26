package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajft */
final class ajft implements Creator {
    ajft() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajfq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajfq(parcel);
    }
}
