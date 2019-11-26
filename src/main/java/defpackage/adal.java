package defpackage;

import android.net.Uri;
import android.net.Uri.Builder;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: adal */
public final class adal implements adbf {
    public static final String a = xtl.b("MDX.browserchannel");
    public int b;
    private final xgq c;
    private final xgq d;
    private final adaj e;
    private final bcaa f;
    private final Uri g;
    private final Uri h;
    private final Map i;
    private final Map j;
    private volatile String k;
    private int l;
    private String m;
    private int n = 0;

    adal(String str, bcaa bcaa, Map map, Map map2, xgq xgq, xgq xgq2) {
        this.g = Uri.parse(str);
        this.h = Uri.parse(str.replace("bind", "test"));
        amqw.a(xvt.e(this.g));
        this.j = (Map) amqw.a((Object) map2);
        this.i = (Map) amqw.a((Object) map);
        this.f = (bcaa) amqw.a((Object) bcaa);
        this.b = 1;
        this.c = xgq;
        this.d = xgq2;
        this.e = new adaj();
    }

    public final void a(adbe adbe) {
        this.e.a = new adbc(this, adbe);
    }

    public final void a() {
        aebm adap = new adap();
        a(this.i, adap);
        IOException iOException = adap.b;
        if (iOException == null) {
            int i = adap.a;
            adaj.a(i);
            if (i == 200) {
                this.e.a(adap.c.toCharArray());
                return;
            }
            return;
        }
        throw iOException;
    }

    public final void a(boolean z) {
        Map hashMap = new HashMap();
        hashMap.put("TYPE", "terminate");
        if (z) {
            hashMap.put("ui", "");
        }
        try {
            a(hashMap, new adak());
        } catch (IOException e) {
            xtl.a(a, "Terminate request failed", e);
        }
        this.k = null;
    }

    public final boolean b() {
        String uri = this.h.buildUpon().appendQueryParameter("VER", "8").appendQueryParameter("TYPE", "xmlhttp").build().toString();
        String valueOf = String.valueOf(uri);
        String str = "Test request: ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            str.concat(valueOf);
        }
        xhc a = xhc.a(uri).a();
        adao adao = new adao();
        aebj.a(this.c, a, adao);
        return adao.a;
    }

    public final void b(boolean z) {
        if (!z) {
            xak.b();
        }
        Builder appendQueryParameter = this.g.buildUpon().appendQueryParameter("RID", "rpc").appendQueryParameter("SID", this.k).appendQueryParameter("AID", String.valueOf(this.l)).appendQueryParameter("CI", !z ? "0" : "1").appendQueryParameter("TYPE", "xmlhttp");
        String str = this.m;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("gsessionid", str);
        }
        String uri = appendQueryParameter.build().toString();
        str = String.valueOf(uri);
        String str2 = "Get URL: ";
        if (str.length() == 0) {
            str = new String(str2);
        } else {
            str2.concat(str);
        }
        xhg a = xhc.a(uri);
        a(a);
        adar adar = new adar(this.e);
        aebj.a(this.c, a.a(), adar);
        IOException iOException = adar.b;
        if (iOException == null) {
            adaj.a(adar.a);
            return;
        }
        throw iOException;
    }

    public final int a(adiv adiv, adja adja) {
        aebm adaq = new adaq();
        this.n++;
        Map hashMap = new HashMap();
        hashMap.put("count", "1");
        hashMap.put(String.format("req%s__sc", new Object[]{String.valueOf(r2)}), adiv.F);
        Iterator it = adja.iterator();
        while (it.hasNext()) {
            Object[] objArr = new Object[]{String.valueOf(r2), ((adjc) it.next()).a};
            hashMap.put(String.format("req%s_%s", objArr), ((adjc) it.next()).b);
        }
        String.valueOf(hashMap).length();
        a(hashMap, adaq);
        return adaq.a;
    }

    public final String toString() {
        String str = this.k;
        String str2 = this.m;
        StringBuilder stringBuilder = new StringBuilder((String.valueOf(str).length() + 33) + String.valueOf(str2).length());
        stringBuilder.append("Session id: ");
        stringBuilder.append(str);
        stringBuilder.append(" GFE Session cookie: ");
        stringBuilder.append(str2);
        return stringBuilder.toString();
    }

    public final void a(int i) {
        this.l = i;
    }

    public final void a(String str) {
        this.k = str;
    }

    public final void b(String str) {
        this.m = str;
    }

    public final void c() {
        this.m = null;
    }

    private final synchronized void a(Map map, aebm aebm) {
        Builder appendQueryParameter = this.g.buildUpon().appendQueryParameter("RID", String.valueOf(this.b)).appendQueryParameter("VER", "8").appendQueryParameter("CVER", "1");
        if (this.k != null) {
            appendQueryParameter.appendQueryParameter("SID", this.k);
        }
        String str = this.m;
        if (str != null) {
            appendQueryParameter.appendQueryParameter("gsessionid", str);
        }
        xhg b = xhc.b(appendQueryParameter.build().toString());
        a(b);
        b.c = xhb.a(map, "ISO-8859-1");
        aebj.a(this.d, b.a(), new adan(this, aebm));
    }

    private final void a(xhg xhg) {
        String a = ((aebe) this.f.get()).a();
        if (a != null) {
            String str = "Bearer ";
            if (a.length() == 0) {
                a = new String(str);
            } else {
                a = str.concat(a);
            }
            xhg.b("Authorization", a);
        }
        a = ((aebe) this.f.get()).b();
        if (a != null) {
            xhg.b("X-Goog-PageId", a);
        }
        for (Entry entry : this.j.entrySet()) {
            xhg.b((String) entry.getKey(), (String) entry.getValue());
        }
    }
}
