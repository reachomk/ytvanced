package defpackage;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: akhr */
public abstract class akhr {
    public abstract int a();

    public abstract float b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public abstract boolean f();

    public abstract boolean g();

    public abstract boolean h();

    public abstract boolean i();

    public abstract boolean j();

    public abstract boolean k();

    public abstract int l();

    public abstract float m();

    public abstract boolean n();

    public abstract boolean o();

    public abstract float p();

    public static akhu q() {
        akeu akeu = new akeu();
        amxn amxn = (amxn) akev.a.listIterator();
        while (amxn.hasNext()) {
            ((akht) amxn.next()).a(akeu);
        }
        return akeu;
    }

    public static akhr a(akhs akhs, akhr akhr, JSONObject jSONObject, boolean z) {
        String str;
        akhu q = akhr.q();
        if (akhs == null) {
            str = "";
        } else {
            str = akhs.g;
        }
        if (akhr != null) {
            amxn amxn = (amxn) akev.a.listIterator();
            while (amxn.hasNext()) {
                akht akht = (akht) amxn.next();
                akht.b.a(q, akht.c.a(akhr));
            }
        }
        amxn amxn2 = (amxn) akev.a.listIterator();
        while (amxn2.hasNext()) {
            akht akht2 = (akht) amxn2.next();
            try {
                akht2.a(jSONObject, q, str);
            } catch (akhy | JSONException e) {
                String str2 = "Error parsing ElementsLaunchConfig.SurfaceConfig.";
                String valueOf;
                if (z) {
                    valueOf = String.valueOf(akht2.a);
                    if (valueOf.length() == 0) {
                        valueOf = new String(str2);
                    } else {
                        valueOf = str2.concat(valueOf);
                    }
                    throw new IllegalStateException(valueOf, e);
                }
                afpf afpf = afpf.elements;
                valueOf = String.valueOf(akht2.a);
                if (valueOf.length() == 0) {
                    valueOf = new String(str2);
                } else {
                    valueOf = str2.concat(valueOf);
                }
                afpc.a(2, afpf, valueOf, e);
                return q.a();
            }
        }
        return q.a();
    }
}
