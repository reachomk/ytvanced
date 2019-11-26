package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajiv */
public final class ajiv implements Creator {
    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajis[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajis(parcel);
    }
}
