package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.PendingCallback;

/* renamed from: qfp */
public final class qfp implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new PendingCallback[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PendingCallback(parcel);
    }
}
