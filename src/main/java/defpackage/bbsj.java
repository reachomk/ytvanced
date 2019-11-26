package defpackage;

/* renamed from: bbsj */
final class bbsj implements Runnable {
    private final bbmd a;
    private final bbmg b;

    bbsj(bbmd bbmd, bbmg bbmg) {
        this.a = bbmd;
        this.b = bbmg;
    }

    public final void run() {
        this.b.b(this.a);
    }
}
