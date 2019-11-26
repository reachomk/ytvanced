package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: vog */
public final class vog extends afns {
    private voh a;

    public vog(voh voh) {
        this.a = voh;
    }

    public final int a() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        jSONObject.put("a", this.a.a.ordinal());
        jSONObject.put("b", this.a.b.ordinal());
        jSONObject.put("c", this.a.c);
        jSONObject.put("h", this.a.d);
        afns.a(jSONObject, "i", (Object) this.a.e);
        afns.a(jSONObject, "j", (Object) this.a.f);
        afns.a(jSONObject, "d", (Object) this.a.g);
        afns.a(jSONObject, "e", (Object) this.a.h);
        jSONObject.put("g", this.a.j);
        jSONObject.put("f", this.a.i);
    }

    protected static voh a(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new voh(vol.values()[jSONObject.getInt("a")], vsm.values()[jSONObject.getInt("b")], jSONObject.getInt("c"), jSONObject.optLong("h", 0), afns.a(jSONObject, "i"), afns.a(jSONObject, "j"), afns.a(jSONObject, "d"), afns.a(jSONObject, "e"), jSONObject.getBoolean("g"), jSONObject.getBoolean("f"), (byte) 0);
        }
        throw new JSONException("Unsupported version");
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        return vog.a(jSONObject, i);
    }
}
