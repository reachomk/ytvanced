package defpackage;

import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: xr */
final class xr implements Creator {
    xr() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new xo[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        Object readParcelable;
        if (VERSION.SDK_INT >= 21) {
            readParcelable = parcel.readParcelable(null);
        } else {
            readParcelable = parcel.readStrongBinder();
        }
        return new xo(readParcelable);
    }
}
