package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: baiu */
final class baiu implements Creator {
    baiu() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new bais[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new bais(parcel);
    }
}
