package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sfh */
final class sfh implements Creator {
    sfh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sfi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sfi(parcel);
    }
}
