package defpackage;

import org.json.JSONArray;

/* renamed from: adbc */
public final class adbc implements adai {
    private static final String a = xtl.b("MDX.browserchannel");
    private final adbf b;
    private final adbe c;

    adbc(adbf adbf, adbe adbe) {
        this.b = (adbf) amqw.a((Object) adbf);
        this.c = (adbe) amqw.a((Object) adbe);
    }

    public final void a(String str) {
        try {
            String str2 = "Received chunk:";
            String valueOf = String.valueOf(str);
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            JSONArray jSONArray = new JSONArray(str);
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                int i2 = jSONArray2.getInt(0);
                this.b.a(i2);
                jSONArray2 = jSONArray2.getJSONArray(1);
                if (jSONArray2.length() > 0) {
                    if (i2 == 0) {
                        this.b.a(jSONArray2.getString(1));
                    } else if (i2 == 1) {
                        this.b.b(jSONArray2.getString(1));
                    } else if (i2 > 1) {
                        this.c.a(jSONArray2);
                    }
                }
            }
        } catch (Exception e) {
            xtl.a(a, "Chunk stream error", e);
        }
    }
}
