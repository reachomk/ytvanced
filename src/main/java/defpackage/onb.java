package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: onb */
final class onb implements Creator {
    onb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omy[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omy(parcel);
    }
}
