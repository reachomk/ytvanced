package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: pjo */
public final class pjo extends qou {
    public static final Creator CREATOR = new ppv();
    private int a;

    pjo(int i) {
        this.a = i;
    }

    public pjo() {
        this(0);
    }

    public final String toString() {
        int i = this.a;
        String str = i != 0 ? i != 2 ? "UNKNOWN" : "INVISIBLE" : "STRONG";
        return String.format("joinOptions(connectionType=%s)", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        i = qov.a(parcel);
        qov.b(parcel, 2, this.a);
        qov.a(parcel, i);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof pjo)) {
            return false;
        }
        return this.a == ((pjo) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a)});
    }
}
