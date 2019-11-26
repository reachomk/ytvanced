package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.Arrays;

/* renamed from: aafx */
public final class aafx implements afnt, Parcelable {
    public static final Creator CREATOR = new aafw();
    public static final aafz b = new aafz();
    public aogi a;

    public aafx(aogi aogi) {
        this.a = (aogi) amqw.a((Object) aogi);
    }

    public final int describeContents() {
        return 0;
    }

    public final String a() {
        return this.a.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a});
    }

    public final boolean equals(Object obj) {
        if (obj == null || !getClass().equals(obj.getClass())) {
            return false;
        }
        return amqq.a(this.a, ((aafx) obj).a);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        xup.a(this.a, parcel);
    }

    public final /* synthetic */ afns c() {
        return new aafz(this);
    }

    public final int b() {
        int a = aogh.a(this.a.d);
        return a == 0 ? 1 : a;
    }
}
