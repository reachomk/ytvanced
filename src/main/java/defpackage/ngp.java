package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: ngp */
public final class ngp implements Parcelable {
    public static final Creator CREATOR = new ngs();
    public final ngn a;
    private final ngq b;

    public ngp(ngn ngn) {
        this.b = ngn.a();
        this.a = ngn;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.b.toString());
        this.a.writeToParcel(parcel, i);
    }

    public final int hashCode() {
        return ((this.b.hashCode() + 527) * 31) + this.a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ngp) {
            ngp ngp = (ngp) obj;
            if (this.b == ngp.b && this.a.equals(ngp.a)) {
                return true;
            }
        }
        return false;
    }
}
