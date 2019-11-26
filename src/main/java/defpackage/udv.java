package defpackage;

import android.database.Cursor;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: udv */
final /* synthetic */ class udv implements udy {
    private final uds a;

    udv(uds uds) {
        this.a = uds;
    }

    public final Object a() {
        uds uds = this.a;
        Cursor query = uds.a.query(uds.b, uds.f, null, null, null);
        if (query == null) {
            return Collections.emptyMap();
        }
        try {
            int count = query.getCount();
            if (count == 0) {
                Object emptyMap = Collections.emptyMap();
                return emptyMap;
            }
            Map hashMap;
            if (count > 256) {
                hashMap = new HashMap(count, 1.0f);
            } else {
                hashMap = new zj(count);
            }
            while (query.moveToNext()) {
                hashMap.put(query.getString(0), query.getString(1));
            }
            query.close();
            return hashMap;
        } finally {
            query.close();
        }
    }
}
