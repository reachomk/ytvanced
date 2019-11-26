package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajqg */
final class ajqg implements Creator {
    ajqg() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajqd[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajqd(parcel);
    }
}
