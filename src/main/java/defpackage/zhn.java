package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zhn */
final class zhn implements Creator {
    zhn() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zho[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zho(parcel);
    }
}
