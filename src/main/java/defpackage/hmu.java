package defpackage;

/* renamed from: hmu */
final class hmu implements eqn {
    private final /* synthetic */ hmm a;

    hmu(hmm hmm) {
        this.a = hmm;
    }

    public final /* synthetic */ void a(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        hmm hmm;
        hmm hmm2;
        hmm hmm3;
        hmm hmm4;
        agqy a = this.a.c.a(((agqp) obj).a());
        boolean z6 = true;
        boolean z7 = false;
        if (a == null) {
            z = false;
            z6 = false;
            z2 = true;
            z3 = false;
            z4 = false;
        } else {
            z2 = a.w();
            z3 = a.x();
            z4 = a.u() == agqs.ERROR_EXPIRED;
            if (a.l()) {
                z = true;
            } else if (!a.j()) {
                z = true;
                z6 = false;
            } else if (a.p()) {
                z = true;
                z6 = false;
                z7 = true;
                z5 = true;
                hmm = this.a;
                hmm.a(hmm.e, z7);
                hmm2 = this.a;
                hmm2.a(hmm2.f, z6);
                hmm3 = this.a;
                hmm3.a(hmm3.g, z2);
                hmm3 = this.a;
                hmm3.a(hmm3.h, z3);
                hmm3 = this.a;
                hmm3.a(hmm3.i, z4);
                hmm3 = this.a;
                hmm3.a(hmm3.j, z);
                hmm4 = this.a;
                hmm4.a(hmm4.k, z5);
            } else {
                z = true;
                z6 = false;
                z7 = true;
            }
        }
        z5 = false;
        hmm = this.a;
        hmm.a(hmm.e, z7);
        hmm2 = this.a;
        hmm2.a(hmm2.f, z6);
        hmm3 = this.a;
        hmm3.a(hmm3.g, z2);
        hmm3 = this.a;
        hmm3.a(hmm3.h, z3);
        hmm3 = this.a;
        hmm3.a(hmm3.i, z4);
        hmm3 = this.a;
        hmm3.a(hmm3.j, z);
        hmm4 = this.a;
        hmm4.a(hmm4.k, z5);
    }
}
