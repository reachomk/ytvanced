package defpackage;

import android.net.Uri;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bcgb */
public final class bcgb {
    public static void a(JSONObject jSONObject, String str, int i) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        bcgg.a(Integer.valueOf(i), (Object) "value must not be null");
        try {
            jSONObject.put(str, i);
        } catch (JSONException unused) {
            throw new IllegalStateException("JSONException thrown in violation of contract, ex");
        }
    }

    public static void a(JSONObject jSONObject, String str, String str2) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        bcgg.a((Object) str2, (Object) "value must not be null");
        try {
            jSONObject.put(str, str2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void a(JSONObject jSONObject, String str, JSONObject jSONObject2) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        bcgg.a((Object) jSONObject2, (Object) "value must not be null");
        try {
            jSONObject.put(str, jSONObject2);
        } catch (JSONException e) {
            throw new IllegalStateException("JSONException thrown in violation of contract", e);
        }
    }

    public static void b(JSONObject jSONObject, String str, String str2) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        if (str2 != null) {
            try {
                jSONObject.put(str, str2);
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
    }

    public static String a(JSONObject jSONObject, String str) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        String str2 = "field \"";
        StringBuilder stringBuilder;
        if (jSONObject.has(str)) {
            String string = jSONObject.getString(str);
            if (string != null) {
                return string;
            }
            stringBuilder = new StringBuilder();
            stringBuilder.append(str2);
            stringBuilder.append(str);
            stringBuilder.append("\" is mapped to a null value");
            throw new JSONException(stringBuilder.toString());
        }
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(str);
        stringBuilder.append("\" not found in json object");
        throw new JSONException(stringBuilder.toString());
    }

    public static String b(JSONObject jSONObject, String str) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return string;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" is mapped to a null value");
        throw new JSONException(stringBuilder.toString());
    }

    public static Uri c(JSONObject jSONObject, String str) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" is mapped to a null value");
        throw new JSONException(stringBuilder.toString());
    }

    public static Uri d(JSONObject jSONObject, String str) {
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        if (!jSONObject.has(str)) {
            return null;
        }
        String string = jSONObject.getString(str);
        if (string != null) {
            return Uri.parse(string);
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("field \"");
        stringBuilder.append(str);
        stringBuilder.append("\" is mapped to a null value");
        throw new JSONException(stringBuilder.toString());
    }

    public static Map e(JSONObject jSONObject, String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        bcgg.a((Object) jSONObject, (Object) "json must not be null");
        bcgg.a((Object) str, (Object) "field must not be null");
        if (jSONObject.has(str)) {
            jSONObject = jSONObject.getJSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                linkedHashMap.put(str2, (String) bcgg.a(jSONObject.getString(str2), (Object) "additional parameter values must not be null"));
            }
        }
        return linkedHashMap;
    }

    public static JSONObject a(Map map) {
        bcgg.a(map);
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            bcgg.a(entry.getKey(), (Object) "map entries must not have null keys");
            bcgg.a(entry.getValue(), (Object) "map entries must not have null values");
            bcgb.a(jSONObject, (String) entry.getKey(), (String) entry.getValue());
        }
        return jSONObject;
    }
}
