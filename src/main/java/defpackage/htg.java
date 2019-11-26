package defpackage;

/* renamed from: htg */
public final class htg implements bcud {
    private final /* synthetic */ hte a;

    public htg(hte hte) {
        this.a = hte;
    }

    public final void bM_() {
    }

    public final void a(Throwable th) {
        xtl.c(String.format("MobileInfraHotConfig observer error %s", new Object[]{th.toString()}));
        afpc.a(2, afpf.system_health, "MobileInfraHotConfig observer error", th);
    }

    public final /* synthetic */ void e_(Object obj) {
        avao avao = (avao) obj;
        if (avao.d.size() != 0) {
            int[] a = anhe.a(avao.d);
            hte hte = this.a;
            xak.b();
            hte.a.a();
            hte.b.a(hte.a, "__internal.youtube_phenotype", new String[0], a);
            hte.a.c();
        }
    }
}
