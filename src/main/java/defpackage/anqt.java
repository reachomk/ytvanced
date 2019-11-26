package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Map;

/* renamed from: anqt */
public final class anqt extends qou {
    public static final Creator CREATOR = new anqx();
    public final Bundle a;
    public Map b;

    public anqt(Bundle bundle) {
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, i);
    }
}
