package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: abqx */
public final class abqx extends abrc {
    public static final Creator CREATOR = new abqw();

    public abqx(auck auck) {
        super(auck);
    }

    public final int describeContents() {
        return 0;
    }

    abqx(Parcel parcel) {
        super((auck) ((ajrb) parcel.readParcelable(ajrb.class.getClassLoader())).a(auck.e));
    }

    public final String a() {
        return ((auck) this.a).b;
    }

    public final boolean b() {
        return ((auck) this.a).c.size() > 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ajrb((anze) this.a), 0);
    }
}
