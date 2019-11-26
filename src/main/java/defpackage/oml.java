package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oml */
final class oml implements Creator {
    oml() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omi[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omi(parcel);
    }
}
