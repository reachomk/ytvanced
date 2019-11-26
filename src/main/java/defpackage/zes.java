package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zes */
final class zes implements Creator {
    zes() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zep[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zep(parcel);
    }
}
