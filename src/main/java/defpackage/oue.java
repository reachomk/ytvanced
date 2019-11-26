package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: oue */
final class oue implements Creator {
    oue() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new oub[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new oub(parcel);
    }
}
