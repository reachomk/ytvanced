package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: omz */
final class omz implements Creator {
    omz() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new omw[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new omw(parcel);
    }
}
