package defpackage;

import java.util.concurrent.Executor;

/* renamed from: dtk */
final class dtk implements Runnable {
    private final /* synthetic */ Executor a;
    private final /* synthetic */ Executor b;
    private final /* synthetic */ dtl c;

    dtk(dtl dtl, Executor executor, Executor executor2) {
        this.c = dtl;
        this.a = executor;
        this.b = executor2;
    }

    public final void run() {
        zyt zyt = (zyt) this.c.j.get();
        zyt.a(this.a);
        ((aaly) this.c.k.get()).a(this.b, zyt);
        htf htf = (htf) this.c.l.get();
        String str = "com.youtube.mainapp.android";
        this.b.execute(new hti(htf, str));
        this.b.execute(new hth(htf, str));
        this.a.execute(new xtk((xti) this.c.a.get(), zyt.a()));
    }
}
