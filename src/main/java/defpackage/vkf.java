package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vkf */
final class vkf implements Creator {
    vkf() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vkc[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vkc(parcel);
    }
}
