package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: odt */
final class odt implements Creator {
    odt() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new odq[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new odq(parcel);
    }
}
