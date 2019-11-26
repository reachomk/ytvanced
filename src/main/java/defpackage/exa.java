package defpackage;

import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: exa */
final class exa extends afsv {
    private final String a;
    private final String b;

    exa(String str, String str2, String str3) {
        super(1, str, null);
        this.a = str2;
        this.b = str3;
    }

    public final byte[] a() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("event", this.a);
            Map hashMap = new HashMap();
            hashMap.put("screenId", this.b);
            hashMap.put("method", "updateRemoteTransactionStatus");
            hashMap.put("params", jSONObject.toString());
            return xhb.a(hashMap, "ISO-8859-1").d();
        } catch (UnsupportedEncodingException | JSONException e) {
            xtl.a(ewx.a, "Error while creating POST payload for the RemoteTransaction progress API.", e);
            return null;
        }
    }

    public final bqh a(bqd bqd) {
        int i = bqd.a;
        if (i == 200 || i == 204) {
            return bqh.a(null, null);
        }
        xtl.a(ewx.a, "ERROR status code from external message response");
        return bqh.a(new bqn(bqd));
    }
}
