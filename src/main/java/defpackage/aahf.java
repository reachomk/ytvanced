package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aahf */
public final class aahf extends afns {
    private aaha a;

    private aahf() {
    }

    public final int a() {
        return 1;
    }

    public aahf(aaha aaha) {
        this.a = aaha;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("type", this.a.a);
        jSONObject.put("linkUrl", this.a.b);
        jSONObject.put("title", this.a.c);
        afns.b(jSONObject, "trackingUris", this.a.d);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new aaha(jSONObject.getInt("type"), afns.c(jSONObject, "linkUrl"), jSONObject.getString("title"), afns.e(jSONObject, "trackingUris"));
        }
        throw new JSONException("Unsupported version");
    }
}
