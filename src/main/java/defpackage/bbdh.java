package defpackage;

/* renamed from: bbdh */
final class bbdh implements Runnable {
    private final /* synthetic */ bbde a;

    bbdh(bbde bbde) {
        this.a = bbde;
    }

    public final void run() {
        this.a.C.a(2, "Entering SHUTDOWN state");
        this.a.m.a(basp.SHUTDOWN);
    }
}
