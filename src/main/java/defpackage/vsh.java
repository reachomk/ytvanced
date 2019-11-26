package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: vsh */
final class vsh implements Creator {
    vsh() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new vse[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new vse((vso) parcel.readParcelable(vso.class.getClassLoader()));
    }
}
