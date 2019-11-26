package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Objects;

/* renamed from: ngv */
public final class ngv implements ngn {
    public static final Creator CREATOR = new ngy();
    public final arcm a;

    public ngv(arcm arcm) {
        this.a = arcm;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof ngv)) {
            return false;
        }
        return amqq.a(this.a, ((ngv) obj).a);
    }

    public final ngq a() {
        return ngq.HOT_CONFIG_DATA;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
    }

    static {
        ngv ngv = new ngv(arcm.e);
    }
}
