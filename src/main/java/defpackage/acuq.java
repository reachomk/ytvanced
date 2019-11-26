package defpackage;

import java.util.List;

/* renamed from: acuq */
final class acuq implements afsw {
    public final /* synthetic */ abda a;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;
    public final /* synthetic */ afot d;
    public final /* synthetic */ afpt e;
    public final /* synthetic */ acun f;

    acuq(acun acun, abda abda, List list, String str, afot afot, afpt afpt) {
        this.f = acun;
        this.a = abda;
        this.b = list;
        this.c = str;
        this.d = afot;
        this.e = afpt;
    }

    public final void a(bqn bqn) {
        String valueOf = String.valueOf(asnf.class.getCanonicalName());
        String str = "Volley request failed for type ";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        xtl.a("GEL_DELAYED_EVENT_DEBUG", valueOf, (Throwable) bqn);
        if (this.f.b.a()) {
            valueOf = String.valueOf(bqn);
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 25);
            stringBuilder.append("Encountered VolleyError: ");
            stringBuilder.append(valueOf);
            stringBuilder.toString();
            this.f.d.execute(new acup(this, bqn));
        }
    }
}
