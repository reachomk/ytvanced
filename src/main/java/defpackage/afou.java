package defpackage;

import org.json.JSONObject;

/* renamed from: afou */
final class afou extends afnq {
    private final afpa a = new afpa(this.b.a.i());
    private final /* synthetic */ afov b;

    afou(afov afov) {
        this.b = afov;
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object a(JSONObject jSONObject) {
        return new afoz(jSONObject.getString("id"), this.a.a(jSONObject.getString("key")));
    }
}
