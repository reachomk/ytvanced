package defpackage;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adym */
public abstract class adym {
    public abstract adiv a();

    public abstract JSONObject b();

    public static adym a(JSONArray jSONArray) {
        adiv a = adiv.a(jSONArray.getString(0));
        String str;
        if (a != null) {
            JSONObject optJSONObject = jSONArray.optJSONObject(1);
            adxw adxw = new adxw();
            adxw.a = a;
            if (optJSONObject == null) {
                optJSONObject = new JSONObject();
            }
            adxw.b = optJSONObject;
            String str2 = "";
            if (adxw.a == null) {
                str2 = str2.concat(" method");
            }
            if (adxw.b == null) {
                str2 = String.valueOf(str2).concat(" data");
            }
            if (str2.isEmpty()) {
                return new adxx(adxw.a, adxw.b);
            }
            str = "Missing required properties:";
            if (str2.length() == 0) {
                str2 = new String(str);
            } else {
                str2 = str.concat(str2);
            }
            throw new IllegalStateException(str2);
        }
        throw new JSONException(String.format("Invalid method name (%s) on message: %s", new Object[]{str, jSONArray}));
    }

    public final int c() {
        return b().optInt("senderMsn", -1);
    }
}
