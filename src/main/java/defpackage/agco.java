package defpackage;

/* renamed from: agco */
final /* synthetic */ class agco implements Runnable {
    private final agci a;
    private final String b;
    private final String c;
    private final agqq d;

    agco(agci agci, String str, String str2, agqq agqq) {
        this.a = agci;
        this.b = str;
        this.c = str2;
        this.d = agqq;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        String str2 = this.c;
        agqq agqq = this.d;
        if (agci.j.v() && agci.a(str) != null) {
            agci.a(str, str2, agqq, agqf.ACTIVE);
        }
    }
}
