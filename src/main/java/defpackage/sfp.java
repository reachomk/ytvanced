package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sfp */
final class sfp implements Creator {
    sfp() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sfq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sfq(parcel);
    }
}
