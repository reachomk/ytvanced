package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dpd */
final class dpd implements Runnable {
    private final /* synthetic */ dos a;

    dpd(dos dos) {
        this.a = dos;
    }

    public final void run() {
        Map map;
        dfz a = dfz.a(this.a.aD);
        String str = "1001680686";
        synchronized (a.b) {
            a.c.add(str);
            a.d.remove(str);
        }
        Context context = this.a.aD;
        String str2 = "<Android_YT_Open_App>";
        if (TextUtils.isEmpty(str2)) {
            map = null;
        } else {
            map = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                map.put("screen_name", str2);
            }
        }
        dfr dfr = new dfr(context, "1001680686", map);
        a = dfz.a(dfr.a);
        str = dfr.b;
        synchronized (a.b) {
            if (!a.c.contains(str)) {
                if (!a.d.containsKey(str)) {
                    a.a.a(str, a.e);
                    a.d.put(str, Long.valueOf(a.e));
                }
            }
        }
        try {
            dgg dgg = new dgg();
            String str3 = dfr.b;
            dgg.a = str3;
            dgg.c = true;
            dgg.d = dfr.c;
            dgg.b = a.d.containsKey(str3);
            dfq.a(dfr.a, dgg);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
