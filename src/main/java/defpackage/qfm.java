package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.gcm.OneoffTask;

/* renamed from: qfm */
public final class qfm implements Creator {
    public final /* synthetic */ Object[] newArray(int i) {
        return new OneoffTask[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new OneoffTask(parcel);
    }
}
