package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: amjr */
public final class amjr implements Parcelable {
    public static final Creator CREATOR = new amju();
    public final Uri a;
    public final Long b;

    public amjr(Uri uri, Long l) {
        this.a = uri;
        this.b = l;
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeValue(this.a);
        parcel.writeValue(this.b);
    }

    /* synthetic */ amjr(Parcel parcel) {
        this.a = (Uri) parcel.readValue(null);
        this.b = (Long) parcel.readValue(null);
    }
}
