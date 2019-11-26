package defpackage;

/* renamed from: agcd */
final /* synthetic */ class agcd implements Runnable {
    private final agce a;
    private final String b;

    agcd(agce agce, String str) {
        this.a = agce;
        this.b = str;
    }

    public final void run() {
        agce agce = this.a;
        String str = this.b;
        if (agce.i.v() && ((agci) agce.k.get()).a(str) != null) {
            xak.b();
            String valueOf = String.valueOf(str);
            String str2 = "Updating offlined video ";
            if (valueOf.length() == 0) {
                valueOf = new String(str2);
            } else {
                str2.concat(valueOf);
            }
            agfi agfi = (agfi) agce.h.get();
            agqy j = agfi.j(str);
            if (j == null) {
                String valueOf2 = String.valueOf(str);
                valueOf = "Refresh video failed because snapshot invalid for ";
                xtl.c(valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2));
            } else {
                agce.a(str, false);
                if (agfi.q(str)) {
                    avsi e = agfi.e(str);
                    ((agdo) agce.j.get()).a(null, str, null, e, ((agvs) agce.d.get()).b(e), true, 1, j.m, true, 0, false);
                    if (agce.f.c()) {
                        avqv avqv = (avqv) ((anxo) agpp.a(j, 4, null).toBuilder());
                        avqv.b(true);
                        ((agps) agce.g.get()).a((avqw) ((anxl) avqv.build()));
                    }
                } else {
                    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 48);
                    stringBuilder.append("Failed clearing player response for ");
                    stringBuilder.append(str);
                    stringBuilder.append(" in database");
                    xtl.c(stringBuilder.toString());
                }
            }
        }
    }
}
