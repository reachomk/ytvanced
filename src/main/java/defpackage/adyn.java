package defpackage;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adyn */
public final class adyn {
    private static final String a;

    private adyn() {
    }

    public static JSONObject a(adja adja) {
        JSONObject jSONObject = new JSONObject();
        Iterator it = adja.iterator();
        while (it.hasNext()) {
            adjc adjc = (adjc) it.next();
            try {
                jSONObject.put(adjc.a, adjc.b);
            } catch (JSONException e) {
                String str = a;
                String valueOf = String.valueOf(adja);
                StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
                stringBuilder.append("Error converting ");
                stringBuilder.append(valueOf);
                stringBuilder.append(" to JSON ");
                xtl.b(str, stringBuilder.toString(), e);
            }
        }
        return jSONObject;
    }

    public static JSONArray a(adiv adiv, adja adja) {
        String valueOf;
        String str = "Error converting ";
        String str2 = " to JSON ";
        JSONArray jSONArray = new JSONArray();
        try {
            jSONArray.put(0, adiv);
        } catch (JSONException e) {
            String str3 = a;
            valueOf = String.valueOf(adiv);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 26);
            stringBuilder.append(str);
            stringBuilder.append(valueOf);
            stringBuilder.append(str2);
            xtl.b(str3, stringBuilder.toString(), e);
        }
        JSONObject jSONObject = new JSONObject();
        Iterator it = adja.iterator();
        while (it.hasNext()) {
            adjc adjc = (adjc) it.next();
            try {
                jSONObject.put(adjc.a, adjc.b);
            } catch (JSONException e2) {
                String str4 = a;
                String valueOf2 = String.valueOf(adja);
                StringBuilder stringBuilder2 = new StringBuilder(valueOf2.length() + 26);
                stringBuilder2.append(str);
                stringBuilder2.append(valueOf2);
                stringBuilder2.append(str2);
                xtl.b(str4, stringBuilder2.toString(), e2);
                return jSONArray;
            }
        }
        try {
            jSONArray.put(1, jSONObject);
            return jSONArray;
        } catch (JSONException e3) {
            str = a;
            valueOf = String.valueOf(jSONObject);
            StringBuilder stringBuilder3 = new StringBuilder(valueOf.length() + 29);
            stringBuilder3.append("Error adding params ");
            stringBuilder3.append(valueOf);
            stringBuilder3.append(str2);
            xtl.b(str, stringBuilder3.toString(), e3);
            return jSONArray;
        }
    }

    static {
        String valueOf = String.valueOf(adyn.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
