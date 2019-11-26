package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: jcu */
public final class jcu {
    public static final String[] a = new String[0];
    public final SharedPreferences b;

    public jcu(SharedPreferences sharedPreferences) {
        this.b = (SharedPreferences) amqw.a((Object) sharedPreferences);
    }

    public final boolean a() {
        return this.b.getBoolean("debugForceInnertubeCapabilityEnable", false);
    }

    public final void a(String str, String str2) {
        this.b.edit().putString(str, str2).commit();
    }

    public static String a(Map map) {
        return (map == null || map.size() == 0) ? "" : new JSONObject(map).toString();
    }

    public static Map a(String str) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                Iterator keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String str2 = (String) keys.next();
                    Object obj = jSONObject.get(str2);
                    if (obj instanceof JSONObject) {
                        JSONObject jSONObject2 = (JSONObject) obj;
                        HashMap hashMap2 = new HashMap();
                        hashMap.put(str2, hashMap2);
                        Iterator keys2 = jSONObject2.keys();
                        while (keys2.hasNext()) {
                            String str3 = (String) keys2.next();
                            hashMap2.put(str3, Boolean.valueOf(jSONObject2.getBoolean(str3)));
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        return hashMap;
    }
}
