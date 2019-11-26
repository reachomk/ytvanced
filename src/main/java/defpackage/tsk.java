package defpackage;

/* renamed from: tsk */
final class tsk extends tsm {
    private final /* synthetic */ tsl a;

    tsk(tsl tsl) {
        this.a = tsl;
    }

    public final void a(tsj tsj) {
        if (!((Boolean) this.a.b.get(tsj)).booleanValue()) {
            this.a.b.put(tsj, Boolean.valueOf(true));
            tsl tsl = this.a;
            tsl.c++;
            tsl.c();
        }
    }
}
