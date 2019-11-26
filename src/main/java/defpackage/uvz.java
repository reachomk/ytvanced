package defpackage;

import android.content.Context;
import android.util.Pair;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: uvz */
public final class uvz extends xlb implements bqm {
    private static final xsy a = new xsy(100, 10000, 3);
    private final Context b;
    private Map k;
    private final ust l;
    private final utc m;
    private final xsw n;

    public uvz(Context context, String str, ust ust, utc utc, xsv xsv, bqj bqj, bqk bqk) {
        String replace = "https://www.googleapis.com/reauth/v1beta/users/%user_id%/reauthProofTokens".replace("%user_id%", "me");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("credentialType", "password");
            jSONObject.put("credential", str);
            super(replace, jSONObject, bqj, bqk);
            this.b = context;
            this.l = (ust) amqw.a((Object) ust);
            this.m = (utc) amqw.a((Object) utc);
            this.n = ((xsv) amqw.a((Object) xsv)).a(a);
            this.f = this;
        } catch (JSONException unused) {
            throw new RuntimeException("Error while creating password verification request");
        }
    }

    public final bqi d() {
        return bqi.HIGH;
    }

    public final Map c() {
        if (this.k == null) {
            this.k = new HashMap();
            this.k.put("Content-Type", "application/json");
            afpz b = this.m.b(this.l);
            if (b.a()) {
                Pair d = b.d();
                this.k.put((String) d.first, (String) d.second);
            } else if (b.b()) {
                throw new bpx(b.e());
            } else {
                Exception f = b.f();
                if (f instanceof IOException) {
                    throw new bpx(this.b.getString(R.string.common_error_connection), f);
                }
                throw new bpx();
            }
        }
        return this.k;
    }

    public final int aZ_() {
        return (int) this.n.b();
    }

    public final int b() {
        return (int) this.n.b;
    }

    public final void a_(bqn bqn) {
        boolean z = bqn instanceof bpx;
        if (!z && !xic.a(bqn)) {
            throw bqn;
        } else if (!this.n.a()) {
            throw bqn;
        } else if (!z) {
        } else {
            if (b() > 1) {
                throw bqn;
            } else if (this.l != afpt.g) {
                this.k = null;
                this.m.c(this.l);
            }
        }
    }
}
