package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ajre */
final class ajre implements Creator {
    ajre() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ajrb[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ajrb(parcel);
    }
}
