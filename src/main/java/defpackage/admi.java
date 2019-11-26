package defpackage;

import org.json.JSONObject;

/* renamed from: admi */
public final class admi {
    public static final String a;
    public final JSONObject b;

    public admi(JSONObject jSONObject) {
        this.b = jSONObject;
    }

    static {
        String valueOf = String.valueOf(admi.class.getCanonicalName());
        String str = "MDX.";
        a = xtl.b(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
    }
}
