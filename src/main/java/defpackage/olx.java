package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: olx */
final class olx implements Creator {
    olx() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new olu[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new olu(parcel);
    }
}
