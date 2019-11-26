package defpackage;

/* renamed from: ezl */
final /* synthetic */ class ezl implements xar {
    private final ezj a;

    ezl(ezj ezj) {
        this.a = ezj;
    }

    public final void accept(Object obj) {
        ezj ezj = this.a;
        atkq atkq = (atkq) obj;
        if (!ezj.h) {
            ayhc ayhc;
            ezj.a(atkq.d, ezj.c, ezj.d, ezj.b);
            if ((atkq.a & 2) != 0) {
                atks atks = atkq.c;
                if (atks == null) {
                    atks = atks.c;
                }
                ayhc = atks.b;
                if (ayhc == null) {
                    ayhc = ayhc.e;
                }
            } else {
                ayhc = null;
            }
            if (ayhc == null) {
                ezj.e = null;
                ezj.c();
            } else {
                ezj.e = ayhc.c;
                int i = ayhc.b;
                ezj.a.postDelayed(ezj, i != 0 ? (long) i : 30000);
            }
            ezj.f = atkq.d;
        }
    }
}
