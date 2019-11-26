package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: tdm */
final class tdm implements Creator {
    tdm() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new tdn[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new tdn(parcel);
    }
}
