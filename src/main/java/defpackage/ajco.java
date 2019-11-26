package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajco */
final class ajco implements Creator {
    ajco() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajcp[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajcp(parcel);
    }
}
