package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oli */
final class oli implements Creator {
    oli() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new olj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new olj(parcel);
    }
}
