package defpackage;

import java.util.List;

/* renamed from: agbw */
final /* synthetic */ class agbw implements Runnable {
    private final agbu a;
    private final String b;
    private final List c;

    agbw(agbu agbu, String str, List list) {
        this.a = agbu;
        this.b = str;
        this.c = list;
    }

    public final void run() {
        agbu agbu = this.a;
        String str = this.b;
        List list = this.c;
        if (agbu.b.v()) {
            agbu.c(str, list);
        }
    }
}
