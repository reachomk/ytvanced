package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;
import java.util.List;

/* renamed from: aajq */
public final class aajq implements Parcelable, Comparable {
    public static final Creator CREATOR = new aajt();
    public final int a;
    public final String b;
    public final boolean c;
    public final List d;

    public aajq(aahr aahr) {
        this(aahr.u(), aahr.h(), aahr.w(), aahr.a.y);
    }

    public final int describeContents() {
        return 0;
    }

    public aajq(String str) {
        this(-2, str, false, new ArrayList());
    }

    public aajq(int i, String str, boolean z, List list) {
        this.a = i;
        this.b = xvd.a(str);
        this.c = z;
        this.d = (List) amqw.a((Object) list);
    }

    public final String toString() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof aajq) {
            aajq aajq = (aajq) obj;
            if (this.a == aajq.a && this.b.equals(aajq.b) && this.c == aajq.c && this.d.equals(aajq.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        throw new UnsupportedOperationException();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeInt(this.d.size());
        for (anze a : this.d) {
            xup.a(a, parcel);
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        aajq aajq = (aajq) obj;
        return aajq != null ? this.a - aajq.a : 1;
    }
}
