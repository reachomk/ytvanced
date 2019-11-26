package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: ujm */
final class ujm implements Creator {
    ujm() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new ujj[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new ujj(parcel);
    }
}
