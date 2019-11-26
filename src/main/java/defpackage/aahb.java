package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aahb */
public final class aahb extends afns {
    private aagw a;

    private aahb() {
    }

    public final int a() {
        return 1;
    }

    public aahb(aagw aagw) {
        this.a = aagw;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("type", this.a.a);
        afns.a(jSONObject, "actions", this.a.b);
        afns.a(jSONObject, "events", this.a.c);
        afns.a(jSONObject, "app", (afnt) this.a.d);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new aagw(jSONObject.getInt("type"), aaha.e.a(jSONObject.getJSONArray("actions")), aahi.c.a(jSONObject.getJSONArray("events")), (aahe) aahe.i.b(jSONObject, "app"));
        }
        throw new JSONException("Unsupported version");
    }
}
