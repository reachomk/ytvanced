package defpackage;

/* renamed from: pfd */
final class pfd implements pew {
    private final pgd a;
    private final pfg b = new pfg();

    public pfd(pgd pgd) {
        this.a = pgd;
    }

    public final void a() {
    }

    public final void a(String str, String str2) {
        if ("ga_appName".equals(str)) {
            this.b.a = str2;
        } else if ("ga_appVersion".equals(str)) {
            this.b.b = str2;
        } else if ("ga_logLevel".equals(str)) {
            this.b.c = str2;
        } else {
            this.a.a().c("String xml configuration name not recognized", str);
        }
    }

    public final void a(String str, boolean z) {
        if ("ga_dryRun".equals(str)) {
            this.b.e = z;
        } else {
            this.a.a().c("Bool xml configuration name not recognized", str);
        }
    }

    public final void a(String str, int i) {
        if ("ga_dispatchPeriod".equals(str)) {
            this.b.d = i;
        } else {
            this.a.a().c("Int xml configuration name not recognized", str);
        }
    }

    public final /* synthetic */ peu b() {
        return this.b;
    }
}
