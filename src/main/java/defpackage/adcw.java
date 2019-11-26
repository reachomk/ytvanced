package defpackage;

import android.text.format.DateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: adcw */
public final class adcw extends ConcurrentHashMap {
    public static final String a = xtl.b("MDX.dial.cache");
    public static final long b = TimeUnit.DAYS.toMillis(60);
    private static final long e = TimeUnit.MINUTES.toMillis(15);
    private static final long f = TimeUnit.DAYS.toMillis(31);
    private static final long g = TimeUnit.DAYS.toMillis(1);
    public final xsc c;
    public final ConcurrentHashMap d = new ConcurrentHashMap(5);
    private final int h;
    private final int i;
    private final xhv j;

    public adcw(xhv xhv, xsc xsc, boolean z) {
        this.j = xhv;
        this.c = xsc;
        int i = Integer.MAX_VALUE;
        this.i = !z ? 10 : Integer.MAX_VALUE;
        if (!z) {
            i = 5;
        }
        this.h = i;
    }

    private final long c() {
        long a = this.c.a();
        long j = g;
        return (a / j) * j;
    }

    public final String a() {
        return this.j.e() ? this.j.h()[2] : "";
    }

    public final adcv a(String str) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        adcv adcv;
        if (this.d.containsKey(str)) {
            adcv = (adcv) this.d.get(str);
        } else {
            adcv = adcv.a(c(), str);
        }
        return adcv;
    }

    public final Map b() {
        adcv a = a(a());
        if (a == null || a.a().equals("<unknown ssid>")) {
            return Collections.emptyMap();
        }
        Map map = (Map) super.get(a);
        if (map == null) {
            map = Collections.emptyMap();
        }
        return map;
    }

    public final adda a(adjg adjg, adda adda) {
        return a(a(a()), adjg, adda, true);
    }

    public final adda a(adcv adcv, adjg adjg, adda adda, boolean z) {
        if (adcv == null || adcv.a().isEmpty() || adcv.a().equals("<unknown ssid>") || !adcv.a().equals(adda.d())) {
            return null;
        }
        if (!containsKey(adcv)) {
            if (this.d.size() >= this.h) {
                ArrayList arrayList = new ArrayList(this.d.values());
                Collections.sort(arrayList);
                String a = ((adcv) arrayList.get(0)).a();
                super.remove(this.d.remove(a));
                a = String.valueOf(a);
                String str = "removed oldest ssid: ";
                if (a.length() == 0) {
                    a = new String(str);
                } else {
                    str.concat(a);
                }
            }
            put(adcv, new ConcurrentHashMap(10));
            this.d.put(adcv.a(), adcv);
        }
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) get(adcv);
        if (z) {
            adcv.a = c();
        }
        if (!concurrentHashMap.containsKey(adjg) && concurrentHashMap.size() >= this.i) {
            ArrayList arrayList2 = new ArrayList(concurrentHashMap.values());
            Collections.sort(arrayList2);
            adda adda2 = (adda) arrayList2.get(0);
            for (Entry entry : concurrentHashMap.entrySet()) {
                if (entry.getValue() == adda2) {
                    adda2 = (adda) concurrentHashMap.remove(entry.getKey());
                    if (adda2 != null) {
                        String valueOf = String.valueOf(adda2.b());
                        String str2 = "removed oldest device: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str2);
                        } else {
                            str2.concat(valueOf);
                        }
                    }
                }
            }
        }
        if (z) {
            long a2 = this.c.a();
            long j = e;
            adda.a = (a2 / j) * j;
        }
        return (adda) concurrentHashMap.put(adjg, adda);
    }

    public final void clear() {
        this.d.clear();
        super.clear();
    }

    public static boolean a(long j, long j2) {
        return j > f + j2 || j2 > j;
    }

    public static adda a(JSONObject jSONObject) {
        Object str;
        long optLong = jSONObject.optLong("ts", 0);
        Object obj = "";
        String optString = jSONObject.optString("name", obj);
        String optString2 = jSONObject.optString("ssid", obj);
        String optString3 = jSONObject.optString("mac", obj);
        String str2 = "timeout";
        int i = jSONObject.has(str2) ? jSONObject.getInt(str2) : 0;
        boolean optBoolean = jSONObject.optBoolean("wol");
        String valueOf = String.valueOf(DateFormat.format("MM/dd/yyyy", optLong));
        if (optString2 != null) {
            str2 = " Wi-Fi:";
            str = optString2.length() == 0 ? new String(str2) : str2.concat(optString2);
        } else {
            str = obj;
        }
        if (optString3 != null) {
            String str3 = " MAC:";
            if (optString3.length() == 0) {
                obj = new String(str3);
            } else {
                obj = str3.concat(optString3);
            }
        }
        String.valueOf(optString).length();
        valueOf.length();
        String.valueOf(str).length();
        String.valueOf(obj).length();
        return adda.a(optLong, optString, optString3, i, optString2, optBoolean);
    }
}
