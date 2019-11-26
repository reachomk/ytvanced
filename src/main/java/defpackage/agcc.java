package defpackage;

/* renamed from: agcc */
final /* synthetic */ class agcc implements Runnable {
    private final agca a;
    private final agqz b;

    agcc(agca agca, agqz agqz) {
        this.a = agca;
        this.b = agqz;
    }

    public final void run() {
        agca agca = this.a;
        agqz agqz = this.b;
        for (agea agea : agca.a.j.c(agxj.b(agqz.f))) {
            agea.a(agqz);
            agca.a.a(agea.c());
        }
    }
}
