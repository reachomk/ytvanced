package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajdu */
final class ajdu implements Creator {
    ajdu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajdv[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajdv(parcel);
    }
}
