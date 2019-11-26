package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: aahi */
public final class aahi implements afnt, Parcelable {
    public static final Creator CREATOR = new aahl();
    public static final aahk c = new aahk();
    public final int a;
    public final Uri b;

    public aahi(int i, Uri uri) {
        this.a = i;
        this.b = uri;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null && getClass().equals(obj.getClass())) {
            aahi aahi = (aahi) obj;
            if (amqq.a(Integer.valueOf(this.a), Integer.valueOf(aahi.a)) && amqq.a(this.b, aahi.b)) {
                return true;
            }
        }
        return false;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeParcelable(this.b, 0);
    }

    public final /* synthetic */ afns c() {
        return new aahk(this);
    }
}
