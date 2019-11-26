package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adee */
public final /* synthetic */ class adee implements bqj {
    private final adeg a;

    public adee(adeg adeg) {
        this.a = adeg;
    }

    public final void a(Object obj) {
        String string;
        adeg adeg = this.a;
        try {
            string = ((JSONObject) obj).getString("crash_report_id");
        } catch (JSONException e) {
            xtl.a(adeb.a, "Failed extracting crash report id from response", e);
            string = null;
        }
        adeg.a(string);
    }
}
