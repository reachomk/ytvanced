package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.firebase.appindexing.internal.Thing;

/* renamed from: anml */
public final class anml extends qou {
    public static final Creator CREATOR = new anmm();
    public final Bundle a;
    private final boolean b;
    private final int c;
    private final String d;

    public anml(boolean z, int i, String str, Bundle bundle) {
        this.b = z;
        this.c = i;
        this.d = str;
        if (bundle == null) {
            bundle = new Bundle();
        }
        this.a = bundle;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 1, this.b);
        qov.b(parcel, 2, this.c);
        qov.a(parcel, 3, this.d);
        qov.a(parcel, 4, this.a);
        qov.a(parcel, i);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("worksOffline: ");
        stringBuilder.append(this.b);
        stringBuilder.append(", score: ");
        stringBuilder.append(this.c);
        if (!this.d.isEmpty()) {
            stringBuilder.append(", accountEmail: ");
            stringBuilder.append(this.d);
        }
        Bundle bundle = this.a;
        if (!(bundle == null || bundle.isEmpty())) {
            stringBuilder.append(", Properties { ");
            Thing.a(this.a, stringBuilder);
            stringBuilder.append("}");
        }
        return stringBuilder.toString();
    }
}
