package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings.Secure;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aeab */
public final class aeab {
    public static final String a = xtl.b("MDX.ProgressApi");
    public final xgq b;
    private final Context c;

    aeab(xgq xgq, Context context) {
        this.b = xgq;
        this.c = context;
    }

    public final void a(String str, String str2) {
        String string = Secure.getString(this.c.getContentResolver(), "android_id");
        String str3 = Build.MODEL;
        xhg b = xhc.b("https://www.youtube.com/api/lounge/screens/em");
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("deviceId", string);
            jSONObject.put("deviceDescription", str3);
            jSONObject.put("event", amqw.a((Object) str2));
            Map hashMap = new HashMap();
            hashMap.put("screenId", (String) amqw.a((Object) str));
            hashMap.put("method", "updateSignInStatus");
            hashMap.put("params", jSONObject.toString());
            b.c = xhb.a(hashMap, "ISO-8859-1");
            new aeaa(this).execute(new xhc[]{b.a()});
        } catch (UnsupportedEncodingException | JSONException unused) {
            str2 = "Error while creating the POST payload for the TV Sign-in progress API";
            xtl.a(a, str2);
            afpc.a(2, afpf.mdx, str2);
        }
    }
}
