package defpackage;

/* renamed from: agdc */
final class agdc implements agin {
    private final /* synthetic */ agci a;

    public final void a(agqp agqp) {
        String a = agqp.a();
        if (this.a.j.a(a) != null) {
            String valueOf = String.valueOf(a);
            String str = "Removing offline widevine license for videoId";
            if (valueOf.length() == 0) {
                valueOf = new String(str);
            } else {
                str.concat(valueOf);
            }
            try {
                ((aesg) this.a.e.get()).a(a);
            } catch (aesi e) {
                xtl.b("Error occurred removing Widevine license for the video. Removing anyway", e);
            }
        }
        if (this.a.c.c()) {
            avqv avqv = (avqv) avqw.B.createBuilder();
            avqv.a(a);
            avqv.c(12);
            ((agps) this.a.d.get()).a((avqw) ((anxl) avqv.build()));
        }
    }

    /* synthetic */ agdc(agci agci) {
        this.a = agci;
    }
}
