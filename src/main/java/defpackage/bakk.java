package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: bakk */
final class bakk implements Creator {
    bakk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bakl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bakl(parcel);
    }
}
