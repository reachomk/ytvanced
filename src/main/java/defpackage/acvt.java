package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acvt */
final class acvt implements Creator {
    acvt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new acvu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acvu(parcel);
    }
}
