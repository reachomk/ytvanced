package defpackage;

/* renamed from: agcx */
final /* synthetic */ class agcx implements Runnable {
    private final agci a;
    private final String b;

    agcx(agci agci, String str) {
        this.a = agci;
        this.b = str;
    }

    public final void run() {
        agci agci = this.a;
        String str = this.b;
        agqy j = ((agfi) agci.m.get()).j(str);
        if (j != null) {
            agqw agqw = j.j;
            if (agqw == null) {
                return;
            }
            if (agqw.c()) {
                agci.l(str);
            } else {
                agci.a(j);
            }
        }
    }
}
