package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: alac */
final class alac implements Creator {
    alac() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new alad[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new alad(parcel);
    }
}
