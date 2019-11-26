package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sgb */
final class sgb implements Creator {
    sgb() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sgc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sgc(parcel);
    }
}
