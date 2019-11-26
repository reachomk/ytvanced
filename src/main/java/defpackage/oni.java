package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oni */
final class oni implements Creator {
    oni() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new onj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new onj(parcel);
    }
}
