package defpackage;

import android.net.Uri;
import java.net.MalformedURLException;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: afns */
public abstract class afns {
    public abstract int a();

    public abstract void a(JSONObject jSONObject);

    public abstract Object b(JSONObject jSONObject, int i);

    public final JSONObject c() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("__version__", a());
            a(jSONObject);
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public final Object b(JSONObject jSONObject) {
        return b(jSONObject, jSONObject.getInt("__version__"));
    }

    public static final JSONArray a(List list) {
        amqw.a((Object) list);
        JSONArray jSONArray = new JSONArray();
        for (afnt afnt : list) {
            jSONArray.put(afnt != null ? afnt.c().c() : JSONObject.NULL);
        }
        return jSONArray;
    }

    public final List a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            arrayList.add(!jSONArray.isNull(i) ? b(jSONArray.getJSONObject(i)) : null);
        }
        return arrayList;
    }

    protected static void a(JSONObject jSONObject, String str, Object obj) {
        jSONObject.put(str, obj != null ? obj.toString() : JSONObject.NULL);
    }

    protected static String a(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? jSONObject.getString(str) : null;
    }

    protected static void a(JSONObject jSONObject, String str, afnt afnt) {
        jSONObject.put(str, afnt != null ? afnt.c().c() : JSONObject.NULL);
    }

    public final Object b(JSONObject jSONObject, String str) {
        return !jSONObject.isNull(str) ? b(jSONObject.getJSONObject(str)) : null;
    }

    protected static Uri c(JSONObject jSONObject, String str) {
        try {
            return !jSONObject.isNull(str) ? xvt.a(jSONObject.getString(str)) : null;
        } catch (MalformedURLException e) {
            xtl.a("Malformed URL", e);
            throw new JSONException("Malformed URL Exception");
        }
    }

    protected static void a(JSONObject jSONObject, String str, List list) {
        if (list != null) {
            jSONObject.put(str, afns.a(list));
        } else {
            jSONObject.put(str, JSONObject.NULL);
        }
    }

    public final List d(JSONObject jSONObject, String str) {
        return a(jSONObject.getJSONArray(str));
    }

    protected static void b(JSONObject jSONObject, String str, List list) {
        JSONArray jSONArray = new JSONArray();
        for (Uri uri : list) {
            if (uri == null) {
                jSONArray.put(JSONObject.NULL);
            } else {
                jSONArray.put(uri.toString());
            }
        }
        jSONObject.put(str, jSONArray);
    }

    protected static List e(JSONObject jSONObject, String str) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = jSONObject.getJSONArray(str);
        for (int i = 0; i < jSONArray.length(); i++) {
            if (jSONArray.isNull(i)) {
                arrayList.add(null);
            } else {
                try {
                    arrayList.add(xvt.a(jSONArray.getString(i)));
                } catch (MalformedURLException e) {
                    xtl.a("Malformed URL", e);
                    throw new JSONException("Malformed URL Exception");
                }
            }
        }
        return arrayList;
    }
}
