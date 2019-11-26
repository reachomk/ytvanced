package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ahgb */
final class ahgb implements Creator {
    ahgb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ahgc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ahgc(parcel);
    }
}
