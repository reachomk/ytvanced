package defpackage;

import android.net.Uri;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: alqd */
abstract class alqd extends afsv {
    private final afsa b;
    public final afsw h_;

    alqd(Uri uri, afsa afsa, afsw afsw) {
        super(0, uri.toString(), (bqk) afsw);
        this.b = afsa;
        this.h_ = afsw;
    }

    public abstract Object a(JSONObject jSONObject);

    public abstract bqm n();

    public final Map c() {
        HashMap hashMap = new HashMap();
        this.b.a(hashMap, this);
        return hashMap;
    }

    public final bqi d() {
        return bqi.IMMEDIATE;
    }

    public bqh a(bqd bqd) {
        try {
            return bqh.a(a(new JSONObject(new String(bqd.b, bqp.a(bqd.c, "utf-8")))), bqp.a(bqd));
        } catch (JSONException e) {
            afpc.a(2, afpf.spacecast, "Unable to parse Spacecast response", e);
            return bqh.a(new bqf(e));
        } catch (UnsupportedEncodingException e2) {
            throw new RuntimeException("UTF-8 must always be supported", e2);
        }
    }
}
