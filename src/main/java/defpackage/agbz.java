package defpackage;

/* renamed from: agbz */
final /* synthetic */ class agbz implements Runnable {
    private final agca a;

    agbz(agca agca) {
        this.a = agca;
    }

    public final void run() {
        agca agca = this.a;
        agxq agxq = (agxq) agca.a.g.a();
        if (agxq != null && agca.a.f.equals(agxq.b())) {
            for (agqz agqz : agxq.a().values()) {
                if (agqz.b()) {
                    String b = agxj.b(agqz.f);
                    for (String str : agca.a.h(b)) {
                        agea a = agca.a.j.a(str);
                        if (a == null) {
                            agqt a2 = agca.a.a(str);
                            if (a2 != null) {
                                a = agca.a.j.a(a2.a, null);
                                agca.a.a(a.c());
                            } else {
                                xtl.c("pudl transfer video list not in database");
                            }
                        }
                        a.a(b);
                    }
                }
            }
        }
    }
}
