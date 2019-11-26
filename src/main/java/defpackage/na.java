package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: na */
final class na implements Creator {
    na() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new nb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new nb(parcel);
    }
}
