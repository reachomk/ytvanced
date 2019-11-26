package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.PeriodicTask;

/* renamed from: qfo */
public final class qfo implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new PeriodicTask[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new PeriodicTask(parcel);
    }
}
