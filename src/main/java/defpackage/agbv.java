package defpackage;

import java.util.ArrayList;

/* renamed from: agbv */
final /* synthetic */ class agbv implements Runnable {
    private final agbu a;
    private final String b;
    private final avrp c;
    private final long d;

    agbv(agbu agbu, String str, avrp avrp, long j) {
        this.a = agbu;
        this.b = str;
        this.c = avrp;
        this.d = j;
    }

    public final void run() {
        agbu agbu = this.a;
        String str = this.b;
        avrp avrp = this.c;
        long j = this.d;
        if (agbu.b.v()) {
            agqt a = agbu.a(str);
            if (a != null) {
                ArrayList arrayList = new ArrayList();
                for (String a2 : a.b) {
                    agqy a3 = ((agci) agbu.d.get()).a(a2);
                    if (a3 != null) {
                        arrayList.add(a3.a);
                    }
                }
                agbu.a(str, arrayList, avrp, j, false, true, 0, ((agvs) agbu.a.get()).g(), agqq.OFFLINE_IMMEDIATELY, -1, zzp.b, 0);
            }
        }
    }
}
