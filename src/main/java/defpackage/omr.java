package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omr */
final class omr implements Creator {
    omr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omo(parcel);
    }
}
