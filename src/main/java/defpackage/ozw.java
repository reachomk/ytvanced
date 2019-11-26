package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ozw */
final class ozw implements Creator {
    ozw() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ozt[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ozt(parcel);
    }
}
