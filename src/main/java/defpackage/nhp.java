package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: nhp */
public final class nhp implements ngn {
    public static final Creator CREATOR = new nhs();
    private final nhr a;
    private final nht b;

    private nhp(nhr nhr, nht nht) {
        this.a = (nhr) amqw.a((Object) nhr);
        this.b = (nht) amqw.a((Object) nht);
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhp) {
            nhp nhp = (nhp) obj;
            if (amqq.a(this.a, nhp.a) && amqq.a(this.b, nhp.b)) {
                return true;
            }
        }
        return false;
    }

    public final ngq a() {
        return ngq.VIDEO_DETAILS;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        this.a.writeToParcel(parcel, i);
        this.b.writeToParcel(parcel, i);
    }

    /* synthetic */ nhp(Parcel parcel) {
        this((nhr) nhr.CREATOR.createFromParcel(parcel), (nht) nht.CREATOR.createFromParcel(parcel));
    }

    static {
        nhp nhp = new nhp(nhr.a, nht.a);
    }
}
