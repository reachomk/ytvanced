package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajec */
final class ajec implements Creator {
    ajec() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajed[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajed(parcel);
    }
}
