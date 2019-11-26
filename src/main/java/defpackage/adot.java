package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adot */
final class adot {
    public final adow a;
    public int b;
    public List c;

    adot(adow adow) {
        this(adow, null);
    }

    adot(adow adow, String str) {
        this.a = adow;
        int i = 0;
        this.b = 0;
        this.c = new ArrayList();
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                JSONArray jSONArray = jSONObject.getJSONArray("timestamps");
                this.b = jSONObject.getInt("occurs");
                while (i < jSONArray.length()) {
                    this.c.add(Long.valueOf(jSONArray.getLong(i)));
                    i++;
                }
            } catch (JSONException e) {
                throw new IllegalArgumentException(e);
            }
        }
    }

    public final long a() {
        if (this.c.isEmpty()) {
            return 0;
        }
        List list = this.c;
        return ((Long) list.get(list.size() - 1)).longValue();
    }

    public final String toString() {
        JSONObject jSONObject = new JSONObject();
        JSONArray jSONArray = new JSONArray();
        for (Long longValue : this.c) {
            jSONArray.put(longValue.longValue());
        }
        try {
            jSONObject.put("occurs", this.b);
            jSONObject.put("timestamps", jSONArray);
            return jSONObject.toString();
        } catch (JSONException unused) {
            return "";
        }
    }
}
