package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: nl */
public final class nl implements Parcelable {
    public static final Creator CREATOR = new nk();
    public final Bundle a;

    nl(Bundle bundle) {
        this.a = bundle;
    }

    public final int describeContents() {
        return 0;
    }

    nl(Parcel parcel, ClassLoader classLoader) {
        this.a = parcel.readBundle();
        if (classLoader != null) {
            Bundle bundle = this.a;
            if (bundle != null) {
                bundle.setClassLoader(classLoader);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.a);
    }
}
