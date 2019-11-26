package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;

/* renamed from: abra */
public final class abra extends abrc {
    public static final Creator CREATOR = new abrd();

    public abra(aufl aufl) {
        super(aufl);
    }

    public final int describeContents() {
        return 0;
    }

    abra(Parcel parcel) {
        super((aufl) ((ajrb) parcel.readParcelable(ajrb.class.getClassLoader())).a(aufl.g));
    }

    public final String a() {
        return ((aufl) this.a).b;
    }

    public final boolean b() {
        return ((aufl) this.a).c.size() > 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(new ajrb((anze) this.a), 0);
    }
}
