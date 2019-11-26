package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: adhw */
public abstract class adhw implements Parcelable {
    public static final Creator CREATOR = new adhv();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public final int describeContents() {
        return 0;
    }

    public abstract boolean e();

    public abstract Uri f();

    public abstract adjb g();

    public abstract String h();

    public abstract Map i();

    public static adhy a() {
        adia adia = new adia();
        adia.a(true);
        adia.b(false);
        adia.c(false);
        return adia;
    }

    public static adhw a(int i) {
        return adhw.a().a(i).a(new HashMap()).a();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(b());
        parcel.writeParcelable(f(), i);
        parcel.writeString(h());
        parcel.writeSerializable(g());
        parcel.writeByte(c());
        parcel.writeByte(d());
        parcel.writeByte(e());
        Map i2 = i();
        parcel.writeInt(i2.size());
        for (Entry entry : i2.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public static Map a(Parcel parcel) {
        int readInt = parcel.readInt();
        HashMap hashMap = new HashMap(readInt);
        for (int i = 0; i < readInt; i++) {
            hashMap.put(parcel.readString(), parcel.readString());
        }
        return hashMap;
    }
}
