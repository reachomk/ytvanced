package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: acws */
final class acws implements Creator {
    acws() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new acwp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new acwp(parcel);
    }
}
