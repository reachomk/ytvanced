package defpackage;

import java.io.UnsupportedEncodingException;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: xlb */
public class xlb extends xle {
    private final JSONObject a;
    private final bqj b;
    private final boolean k;

    public xlb(String str, JSONObject jSONObject, bqj bqj, bqk bqk) {
        this(str, jSONObject, bqj, bqk, false);
    }

    public xlb(String str, JSONObject jSONObject, bqj bqj, bqk bqk, boolean z) {
        super(1, str, bqk);
        this.a = jSONObject;
        this.b = bqj;
        this.k = z;
    }

    public final bqh a(bqd bqd) {
        try {
            return bqh.a(new JSONObject(new String(bqd.b, bqp.a(bqd.c, "utf-8"))), bqp.a(bqd));
        } catch (UnsupportedEncodingException | JSONException e) {
            return bqh.a(new bqf(e));
        }
    }

    public final byte[] a() {
        byte[] bArr = null;
        try {
            JSONObject jSONObject = this.a;
            if (jSONObject != null) {
                bArr = jSONObject.toString().getBytes("utf-8");
            }
            return bArr;
        } catch (UnsupportedEncodingException e) {
            xtl.a("Unable to encode JSON request", e);
            return null;
        }
    }

    public final String e() {
        return this.k ? "application/json" : "application/json; charset=utf-8";
    }
}
