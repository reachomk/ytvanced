package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: zja */
final class zja implements Creator {
    zja() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new zix[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return zix.i().a(parcel.readLong()).a((Uri) parcel.readParcelable(Uri.class.getClassLoader())).a(parcel.readString()).b(parcel.readString()).b(parcel.readLong()).c(parcel.readLong()).d(parcel.readLong()).a(parcel.readInt()).b();
    }
}
