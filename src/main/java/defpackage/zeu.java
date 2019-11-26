package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zeu */
final class zeu implements Creator {
    zeu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zer[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new zer(parcel);
    }
}
