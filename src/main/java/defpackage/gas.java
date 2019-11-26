package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: gas */
public final class gas implements Parcelable {
    public static final Creator CREATOR = new gav();
    public final List a;
    private final Map b = gas.a(this.a);

    public gas(ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) amqw.a((Object) reelWatchEndpointOuterClass$ReelWatchEndpoint));
        this.a = Collections.unmodifiableList(arrayList);
    }

    public final int describeContents() {
        return 0;
    }

    public gas(List list) {
        this.a = (List) amqw.a((Object) list);
    }

    private static Map a(List list) {
        HashMap hashMap = new HashMap(list.size());
        for (int i = 0; i < list.size(); i++) {
            hashMap.put(((ReelWatchEndpointOuterClass$ReelWatchEndpoint) list.get(i)).c, Integer.valueOf(i));
        }
        return hashMap;
    }

    public static gas a(Parcel parcel) {
        ArrayList arrayList = new ArrayList(r1);
        for (Parcelable parcelable : parcel.readParcelableArray(ajrb.class.getClassLoader())) {
            arrayList.add((ReelWatchEndpointOuterClass$ReelWatchEndpoint) ((ajrb) parcelable).a(ReelWatchEndpointOuterClass$ReelWatchEndpoint.m));
        }
        return new gas(Collections.unmodifiableList(arrayList));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        ajrb[] ajrbArr = new ajrb[this.a.size()];
        int i2 = 0;
        for (anze ajrb : this.a) {
            int i3 = i2 + 1;
            ajrbArr[i2] = new ajrb(ajrb);
            i2 = i3;
        }
        parcel.writeParcelableArray(ajrbArr, 0);
    }

    public static Map a(gas gas, Map map) {
        if (map == null) {
            map = new HashMap();
        } else if (!(map instanceof HashMap)) {
            map = new HashMap(map);
        }
        Object obj = "com.google.android.libraries.youtube.innertube.bundle";
        Bundle bundle = (Bundle) xsb.a(map, obj, Bundle.class);
        if (bundle == null) {
            bundle = new Bundle();
            map.put(obj, bundle);
        }
        bundle.putParcelable("ReelToReelListBundleKey", gas);
        return map;
    }

    public final int a(String str) {
        if (!(this.a == null || str == null)) {
            Integer num = (Integer) this.b.get(str);
            if (num != null && num.intValue() >= 0 && num.intValue() < this.a.size()) {
                return num.intValue();
            }
        }
        return -1;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("[ReelToReelList");
        stringBuilder.append(" size=");
        stringBuilder.append(this.a.size());
        for (ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint : this.a) {
            stringBuilder.append(" video[");
            stringBuilder.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.c);
            stringBuilder.append("]=");
            stringBuilder.append(reelWatchEndpointOuterClass$ReelWatchEndpoint.b);
        }
        stringBuilder.append(']');
        return stringBuilder.toString();
    }
}
