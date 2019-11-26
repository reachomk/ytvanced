package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: aafe */
final class aafe implements Creator {
    aafe() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aaff[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        try {
            return new aaff((ajrr) aamj.a(parcel, new ajrr()));
        } catch (aocg unused) {
            return null;
        }
    }
}
