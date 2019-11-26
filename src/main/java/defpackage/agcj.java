package defpackage;

/* renamed from: agcj */
final /* synthetic */ class agcj implements Runnable {
    private final agci a;
    private final String b;
    private final agqq c;
    private final agqf d;

    agcj(agci agci, String str, agqq agqq, agqf agqf) {
        this.a = agci;
        this.b = str;
        this.c = agqq;
        this.d = agqf;
    }

    public final void run() {
        this.a.a(this.b, null, this.c, this.d);
    }
}
