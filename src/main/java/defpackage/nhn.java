package defpackage;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: nhn */
public final class nhn implements ngn {
    public static final Creator CREATOR = new nhq();
    private final Bitmap a;

    private nhn() {
        this.a = null;
    }

    public final int describeContents() {
        return 0;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof nhn)) {
            return false;
        }
        return amqq.a(this.a, ((nhn) obj).a);
    }

    public final ngq a() {
        return ngq.VIDEO_CHANNEL_THUMBNAIL;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.a, i);
    }

    /* synthetic */ nhn(Parcel parcel) {
        this.a = (Bitmap) parcel.readParcelable(Bitmap.class.getClassLoader());
    }

    static {
        nhn nhn = new nhn();
    }
}
