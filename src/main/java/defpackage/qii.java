package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.iid.MessengerCompat;

/* renamed from: qii */
public final class qii implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new MessengerCompat[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        return readStrongBinder != null ? new MessengerCompat(readStrongBinder) : null;
    }
}
