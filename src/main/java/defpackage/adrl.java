package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: adrl */
final class adrl implements adbl {
    private final /* synthetic */ adrf a;

    public final void a(String str) {
        if (!this.a.l) {
            Object str2;
            String str3;
            try {
                str2 = new JSONObject(str2).getJSONObject("data").getString("screenId");
                String valueOf = String.valueOf(str2);
                str3 = "Connected to Cast screen. Initiating cloud connection to ";
                if (valueOf.length() == 0) {
                    valueOf = new String(str3);
                } else {
                    str3.concat(valueOf);
                }
                adio b = adio.h().a(new adjb(str2)).a(this.a.g.bv_()).a(adix.CAST).b();
                adrf adrf = this.a;
                adtm adtm = adrf.f;
                adtw Q = adrf.Q();
                adrf adrf2 = this.a;
                adrf.a(adtm.a(b, Q, adrf2, adrf2.h, 0));
                this.a.l = true;
            } catch (JSONException e) {
                afpf afpf = afpf.mdx;
                String valueOf2 = String.valueOf(str2);
                String str4 = "Cannot parse cast message:";
                if (valueOf2.length() == 0) {
                    valueOf2 = new String(str4);
                } else {
                    valueOf2 = str4.concat(valueOf2);
                }
                afpc.a(2, afpf, valueOf2, e);
                str3 = adrf.e;
                str2 = String.valueOf(str2);
                valueOf2 = "Cannot parse Cast message: ";
                if (str2.length() == 0) {
                    str2 = new String(valueOf2);
                } else {
                    str2 = valueOf2.concat(str2);
                }
                xtl.b(str3, str2, e);
            }
        }
    }

    public final void a(tcd tcd) {
        this.a.k = tcd.b();
        if (!this.a.l) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("type", "getMdxSessionStatus");
                tcd.a(this.a.j, jSONObject.toString());
            } catch (JSONException e) {
                String str = "Could not create mdx session status message";
                afpc.a(2, afpf.mdx, str, e);
                xtl.a(adrf.e, str, e);
            }
        }
    }

    public final void a(int i) {
        this.a.a(adpr.LAUNCH_FAIL_TIMEOUT, 8, i);
    }

    /* synthetic */ adrl(adrf adrf) {
        this.a = adrf;
    }
}
