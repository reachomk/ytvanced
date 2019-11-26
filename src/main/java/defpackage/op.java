package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: op */
final class op implements Creator {
    op() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new om[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new om(parcel);
    }
}
