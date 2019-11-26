package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aagx */
public final class aagx extends afns {
    private aagv a;

    private aagx() {
    }

    public final int a() {
        return 1;
    }

    public aagx(aagv aagv) {
        this.a = aagv;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("offset", this.a.a);
        jSONObject.put("isPercentageOffset", this.a.b);
        afns.a(jSONObject, "pingUri", (Object) this.a.c);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new aagv(jSONObject.getInt("offset"), jSONObject.getBoolean("isPercentageOffset"), afns.c(jSONObject, "pingUri"));
        }
        throw new JSONException("Unsupported version");
    }
}
