package defpackage;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: aahj */
public final class aahj extends afns {
    private aahe a;

    private aahj() {
    }

    public final int a() {
        return 1;
    }

    public aahj(aahe aahe) {
        this.a = aahe;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(JSONObject jSONObject) {
        Object uri;
        jSONObject.put("name", this.a.a);
        jSONObject.put("packageName", this.a.h);
        jSONObject.put("icon", this.a.b);
        jSONObject.put("price", this.a.c);
        jSONObject.put("hasRating", this.a.d);
        jSONObject.put("rating", (double) this.a.e);
        Uri uri2 = this.a.g;
        if (uri2 != null) {
            uri = uri2.toString();
        } else {
            uri = JSONObject.NULL;
        }
        jSONObject.put("ratingImage", uri);
        jSONObject.put("reviews", this.a.f);
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ Object b(JSONObject jSONObject, int i) {
        if (i == 1) {
            return new aahe(jSONObject.getString("name"), jSONObject.optString("packageName", null), afns.c(jSONObject, "icon"), jSONObject.getString("price"), jSONObject.getBoolean("hasRating"), (float) jSONObject.getDouble("rating"), afns.c(jSONObject, "ratingImage"), jSONObject.getInt("reviews"));
        }
        throw new JSONException("Unsupported version");
    }
}
