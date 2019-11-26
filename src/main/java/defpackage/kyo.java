package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: kyo */
final class kyo implements Creator {
    kyo() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new kyl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new kyl(parcel);
    }
}
