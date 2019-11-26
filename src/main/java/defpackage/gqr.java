package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: gqr */
public final class gqr implements aizu {
    public static final Creator CREATOR = new gqq();
    private ajzq a;

    public gqr(ajzq ajzq) {
        this.a = ajzq;
    }

    public final int describeContents() {
        return 0;
    }

    public gqr(Parcel parcel) {
        try {
            this.a = (ajzq) aamj.a(parcel, new ajzq());
        } catch (aocg e) {
            xtl.a("Invalid ReelItemWatchResponse", e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(parcel, this.a);
    }
}
