package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: abrd */
final class abrd implements Creator {
    abrd() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new abra[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new abra(parcel);
    }
}
