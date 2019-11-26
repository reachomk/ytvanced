package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: afrx */
public final class afrx implements afsa {
    private final SharedPreferences a;

    public afrx(SharedPreferences sharedPreferences) {
        this.a = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final boolean b() {
        return true;
    }

    public final void a(Map map, afsl afsl) {
        String str = "";
        String string = this.a.getString("net_detour_header", str);
        String string2 = this.a.getString("net_detour_cookies", str);
        if (afmt.b(this.a) == afmt.TEST) {
            map.put("X-Google-Project-Override", "apikey");
        }
        if (!TextUtils.isEmpty(string)) {
            map.put("X-Google-DapperTraceInfo", string);
        }
        if (!TextUtils.isEmpty(string2)) {
            int i;
            dip dip;
            dio dio = new dio(str);
            ArrayList arrayList = new ArrayList();
            Iterator it = amqz.a(10).a(string2.trim()).iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    break;
                }
                String[] split = ((String) it.next()).split(" ");
                arrayList.add(new dip(Long.parseLong(split[0]), Long.parseLong(split[1]), split[2]));
            }
            dio.a = arrayList;
            long currentTimeMillis = System.currentTimeMillis() / 1000;
            ArrayList arrayList2 = dio.a;
            int size = arrayList2.size();
            while (i < size) {
                dip = (dip) arrayList2.get(i);
                if (dip.a <= currentTimeMillis && currentTimeMillis <= dip.b) {
                    break;
                }
                i++;
            }
            dip = null;
            if (dip != null) {
                map.put("Cookie", dip.c);
            }
        }
    }

    public final aulc a() {
        return aulc.UNKNOWN;
    }
}
