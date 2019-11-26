package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: odv */
final class odv implements Creator {
    odv() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ods[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ods(parcel);
    }
}
