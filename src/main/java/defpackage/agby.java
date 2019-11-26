package defpackage;

/* renamed from: agby */
final /* synthetic */ class agby implements Runnable {
    private final agbu a;
    private final String b;

    agby(agbu agbu, String str) {
        this.a = agbu;
        this.b = str;
    }

    public final void run() {
        agbu agbu = this.a;
        String str = this.b;
        if (agbu.b.v()) {
            agbu.j(str);
        }
    }
}
