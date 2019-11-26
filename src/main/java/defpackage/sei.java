package defpackage;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: sei */
final class sei implements Creator {
    sei() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new sej[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        return new sej((PendingIntent) parcel.readParcelable(PendingIntent.class.getClassLoader()), parcel.readInt() == 1, parcel.readString(), parcel.readInt(), (sem) parcel.readParcelable(sem.class.getClassLoader()), parcel.readInt() == 1);
    }
}
