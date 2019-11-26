package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

/* renamed from: ajdv */
public final class ajdv implements Parcelable {
    public static final Creator CREATOR = new ajdu();
    public final String a;
    public final ajcy b;
    public final ajed c;
    public final ajfh d;
    public final ajfq e;

    public ajdv(String str, ajcy ajcy, ajed ajed, ajfh ajfh, ajfq ajfq) {
        this.a = str;
        this.b = ajcy;
        this.c = ajed;
        this.d = ajfh;
        this.e = ajfq;
    }

    public final int describeContents() {
        return 0;
    }

    public ajdv(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readString();
        this.b = (ajcy) parcel.readParcelable(classLoader);
        this.c = (ajed) parcel.readParcelable(classLoader);
        this.d = (ajfh) parcel.readParcelable(classLoader);
        this.e = (ajfq) parcel.readParcelable(classLoader);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, 0);
        parcel.writeParcelable(this.c, 0);
        parcel.writeParcelable(this.d, 0);
        parcel.writeParcelable(this.e, 0);
    }

    public final String toString() {
        return String.format(Locale.US, "State { videoId=%s }", new Object[]{this.a});
    }
}
