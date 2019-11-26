package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: ajqd */
public final class ajqd implements Parcelable {
    public static final Creator CREATOR = new ajqg();
    public final Map a;

    public ajqd(Map map) {
        this.a = (Map) amqw.a((Object) map);
    }

    public final int describeContents() {
        return 0;
    }

    public ajqd(Parcel parcel) {
        ClassLoader classLoader = getClass().getClassLoader();
        int readInt = parcel.readInt();
        this.a = new HashMap();
        for (int i = 0; i < readInt; i++) {
            this.a.put(parcel.readString(), parcel.readParcelable(classLoader));
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a.size());
        for (Entry entry : this.a.entrySet()) {
            parcel.writeString((String) entry.getKey());
            parcel.writeParcelable((Parcelable) entry.getValue(), 0);
        }
    }
}
