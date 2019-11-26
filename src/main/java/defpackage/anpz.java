package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: anpz */
final class anpz implements Creator {
    anpz() {
    }

    public final /* synthetic */ Object[] newArray(int i) {
        return new anpx[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new anpx(readStrongBinder) : null;
    }
}
