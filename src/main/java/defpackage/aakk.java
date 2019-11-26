package defpackage;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import java.util.HashMap;
import java.util.Map.Entry;

/* renamed from: aakk */
final class aakk implements Creator {
    aakk() {
    }

    public final /* bridge */ /* synthetic */ Object[] newArray(int i) {
        return new aakl[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        aakl aakl = new aakl();
        HashMap readHashMap = parcel.readHashMap(Boolean.class.getClassLoader());
        if (readHashMap != null) {
            for (Entry entry : readHashMap.entrySet()) {
                aakl.a((String) entry.getKey(), ((Boolean) entry.getValue()).booleanValue());
            }
        }
        readHashMap = parcel.readHashMap(Long.class.getClassLoader());
        if (readHashMap != null) {
            for (Entry entry2 : readHashMap.entrySet()) {
                aakl.a.put((String) entry2.getKey(), Long.valueOf(((Long) entry2.getValue()).longValue()));
            }
        }
        HashMap readHashMap2 = parcel.readHashMap(String.class.getClassLoader());
        if (readHashMap2 != null) {
            for (Entry entry3 : readHashMap2.entrySet()) {
                aakl.a((String) entry3.getKey(), (String) entry3.getValue());
            }
        }
        return aakl;
    }
}
