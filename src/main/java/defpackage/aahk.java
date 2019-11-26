package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aahk */
public final class aahk extends afns {
    private aahi a;

    private aahk() {
    }

    public final int a() {
        return 1;
    }

    public aahk(aahi aahi) {
        this.a = aahi;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("type", this.a.a);
        jSONObject.put("baseUri", this.a.b);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new aahi(jSONObject.getInt("type"), afns.c(jSONObject, "baseUri"));
        }
        throw new JSONException("Unsupported version");
    }
}
