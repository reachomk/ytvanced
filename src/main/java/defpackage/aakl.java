package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;

/* renamed from: aakl */
public final class aakl implements Parcelable {
    public static final Creator CREATOR = new aakk();
    public final HashMap a = new HashMap();
    private final HashMap b = new HashMap();
    private final HashMap c = new HashMap();

    public final int describeContents() {
        return 0;
    }

    public final void a(String str, boolean z) {
        this.b.put(str, Boolean.valueOf(z));
    }

    public final boolean a(String str) {
        return this.b.containsKey(str) && ((Boolean) this.b.get(str)).booleanValue();
    }

    public final void a(String str, String str2) {
        this.c.put(str, str2);
    }

    public final String b(String str) {
        return this.c.containsKey(str) ? (String) this.c.get(str) : "";
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeMap(this.b);
        parcel.writeMap(this.a);
        parcel.writeMap(this.c);
    }
}
