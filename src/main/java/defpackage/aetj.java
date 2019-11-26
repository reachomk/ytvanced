package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: aetj */
final class aetj implements aetl {
    private static final Map d;
    public final int a;
    public byte[] b;
    public final Map c;
    private final String e;
    private final Map f;

    public aetj(Context context, int i, byte[] bArr, Map map) {
        Map emptyMap;
        this.a = i;
        Map map2 = d;
        Integer valueOf = Integer.valueOf(i);
        this.e = map2.containsKey(valueOf) ? context.getResources().getString(((Integer) d.get(valueOf)).intValue()) : null;
        this.b = bArr;
        this.c = map;
        String str = (String) map.get("Key-Ids");
        if (str == null) {
            emptyMap = Collections.emptyMap();
        } else {
            HashMap hashMap = new HashMap();
            for (String split : str.split(";", 0)) {
                String[] split2 = split.split(",", 0);
                if (split2.length > 1) {
                    hashMap.put(split2[1], Integer.valueOf(aetb.a(split2[0])));
                }
            }
            emptyMap = hashMap;
        }
        this.f = emptyMap;
    }

    public final byte[] a() {
        return this.b;
    }

    public final List b() {
        String str = "Authorized-Format-Types";
        if (!this.c.containsKey(str)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (String a : amqz.a(',').a((String) this.c.get(str))) {
            arrayList.add(Integer.valueOf(aetb.a(a)));
        }
        return arrayList;
    }

    public final Map d() {
        return this.f;
    }

    public final boolean e() {
        amqw.b((this.a == 0 ? 1 : 0) ^ 1);
        switch (this.a) {
            case 300:
            case 301:
            case 303:
            case 304:
            case 305:
                return true;
            default:
                return false;
        }
    }

    public final String f() {
        return this.e;
    }

    public final String toString() {
        return Integer.toString(this.a);
    }

    static {
        amuu amuu = new amuu();
        amuu.b(Integer.valueOf(9), Integer.valueOf(R.string.error_device_unauthorized));
        Integer valueOf = Integer.valueOf(100);
        Integer valueOf2 = Integer.valueOf(R.string.error_already_pinned_on_a_device);
        amuu.b(valueOf, valueOf2);
        amuu.b(Integer.valueOf(101), Integer.valueOf(R.string.error_too_many_active_devices_for_account));
        amuu.b(Integer.valueOf(106), Integer.valueOf(R.string.error_too_many_manual_account_changes));
        amuu.b(Integer.valueOf(107), Integer.valueOf(R.string.error_too_many_active_devices_for_family));
        amuu.b(Integer.valueOf(108), Integer.valueOf(R.string.error_already_pinned_by_different_request_source));
        amuu.b(Integer.valueOf(300), Integer.valueOf(R.string.error_streaming_devices_quota_per_24h_exceeded));
        amuu.b(Integer.valueOf(301), valueOf2);
        amuu.b(Integer.valueOf(303), Integer.valueOf(R.string.error_stopped_by_another_playback));
        amuu.b(Integer.valueOf(304), Integer.valueOf(R.string.error_too_many_streams_per_user));
        amuu.b(Integer.valueOf(305), Integer.valueOf(R.string.error_too_many_streams_per_entitlement));
        amuu.b(Integer.valueOf(400), Integer.valueOf(R.string.error_video_not_found));
        amuu.b(Integer.valueOf(401), Integer.valueOf(R.string.error_geo_failure));
        amuu.b(Integer.valueOf(402), Integer.valueOf(R.string.error_streaming_not_allowed));
        amuu.b(Integer.valueOf(403), Integer.valueOf(R.string.error_unsupported_device));
        amuu.b(Integer.valueOf(405), Integer.valueOf(R.string.error_video_forbidden));
        amuu.b(Integer.valueOf(406), Integer.valueOf(R.string.error_offlining_not_allowed));
        amuu.b(Integer.valueOf(500), Integer.valueOf(R.string.error_purchase_not_found));
        amuu.b(Integer.valueOf(501), Integer.valueOf(R.string.error_rental_expired));
        amuu.b(Integer.valueOf(502), Integer.valueOf(R.string.error_purchase_refunded));
        d = amuu.b();
    }
}
