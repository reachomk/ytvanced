package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vi */
final class vi implements Creator {
    vi() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vj(parcel);
    }
}
