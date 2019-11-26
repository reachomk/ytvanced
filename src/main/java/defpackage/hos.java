package defpackage;

/* renamed from: hos */
public final /* synthetic */ class hos implements Runnable {
    private final hot a;
    private final String b;
    private final afsw c;

    public hos(hot hot, String str, afsw afsw) {
        this.a = hot;
        this.b = str;
        this.c = afsw;
    }

    public final void run() {
        hot hot = this.a;
        String str = this.b;
        afsw afsw = this.c;
        hoy hoy = (hoy) hot.d.get();
        xak.b();
        xvd.a(str);
        ajrr ajrr = null;
        if (((eki) hoy.a.get()).d()) {
            Object a = ((agwc) hoy.b.get()).b().n().a(str);
            if (a != null) {
                hoc hoc = (hoc) hoy.c.get();
                akab akab = (akab) hoc.a(agqk.class, akab.class, (agqk) amqw.a(a), null);
                ajxx ajxx = (ajxx) hoc.a(agqk.class, ajxx.class, (agqk) amqw.a(a), null);
                if (!(akab == null || ajxx == null)) {
                    ajrr = new ajrr();
                    akaq akaq = new akaq();
                    akbc akbc = new akbc();
                    ajrp ajrp = new ajrp();
                    ajrp.c = ajxx;
                    ajrr.c = ajrp;
                    ajru ajru = new ajru();
                    ajru.b = akaq;
                    ajrr.a = ajru;
                    new ajrt().b = akbc;
                    akaq.a = new ajrt[]{r1};
                    akaz akaz = new akaz();
                    akaz.a = akab;
                    akbc.d = akaz;
                    akbc.c = true;
                    akcm.a(ajrr, asic.k);
                }
            }
        }
        if (ajrr != null) {
            aaff aaff = new aaff(ajrr);
            aaff.a("browse_response_enable_logging", Boolean.valueOf(false));
            Object valueOf = Boolean.valueOf(true);
            aaff.a("browse_response_new_response_needed", valueOf);
            aaff.a("browse_response_is_loading_response", valueOf);
            hot.b.execute(new hov(afsw, aaff));
        }
    }
}
