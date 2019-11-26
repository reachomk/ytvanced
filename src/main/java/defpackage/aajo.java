package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Locale;

/* renamed from: aajo */
public final class aajo implements Parcelable {
    public static final Creator CREATOR = new aajr();
    public final int a;

    public aajo() {
        this(0);
    }

    public final int describeContents() {
        return 0;
    }

    public aajo(awgr awgr) {
        this(awgr.b);
    }

    aajo(int i) {
        this.a = i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof aajo) {
            if (this.a == ((aajo) obj).a) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        Locale locale = Locale.US;
        Object[] objArr = new Object[1];
        int i = this.a;
        String str = i != 0 ? i != 1 ? i != 3 ? "Invalid" : "TOP_BOTTOM" : "SBS_LR" : "MONO";
        objArr[0] = str;
        return String.format(locale, "PlayerThreedRendererModel{layout=%s}", objArr);
    }
}
