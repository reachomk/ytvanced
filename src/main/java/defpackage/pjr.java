package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: pjr */
public final class pjr extends qou {
    public static final Creator CREATOR = new ppu();
    public boolean a;
    public String b;

    pjr(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public pjr() {
        this(false, ppj.a(Locale.getDefault()));
    }

    public final String toString() {
        return String.format("LaunchOptions(relaunchIfRunning=%b, language=%s)", new Object[]{Boolean.valueOf(this.a), this.b});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.a(parcel, 2, this.a);
        qov.a(parcel, 3, this.b);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof pjr) {
            pjr pjr = (pjr) obj;
            return this.a == pjr.a && ppj.a(this.b, pjr.b);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), this.b});
    }
}
