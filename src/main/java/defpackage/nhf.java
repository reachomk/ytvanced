package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import java.util.Arrays;

/* renamed from: nhf */
public final class nhf implements ngn {
    public static final Creator CREATOR = new nhi();
    public static final nhf a = new nhf(null, null);
    public final CharSequence b;
    public final nhd[] c;

    public nhf(CharSequence charSequence, nhd[] nhdArr) {
        this.b = charSequence;
        this.c = nhdArr;
    }

    public final int describeContents() {
        return 0;
    }

    public nhf(Parcel parcel) {
        this((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel), (nhd[]) parcel.createTypedArray(nhd.CREATOR));
    }

    public final ngq a() {
        return ngq.RELATED_VIDEOS_SCREEN;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, Integer.valueOf(Arrays.hashCode(this.c))});
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nhf) {
            nhf nhf = (nhf) obj;
            if (amqq.a(nhf.b, this.b) && Arrays.equals(nhf.c, this.c)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        TextUtils.writeToParcel(this.b, parcel, i);
        parcel.writeTypedArray(this.c, i);
    }
}
