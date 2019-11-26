package defpackage;

/* renamed from: ahnx */
final /* synthetic */ class ahnx implements Runnable {
    private final ahnq a;
    private final aaju b;
    private final ahqn c;

    ahnx(ahnq ahnq, aaju aaju, ahqn ahqn) {
        this.a = ahnq;
        this.b = aaju;
        this.c = ahqn;
    }

    public final void run() {
        ahnq ahnq = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        try {
            ahry ahry = ahnq.k;
            amqw.a(obj);
            amqw.a(obj2);
            ahry.b.a(obj, obj2);
            ahry.i = obj2;
            for (ahsd a : ahry.e) {
                a.a(obj2);
            }
            ahmz ahmz = ahnq.j;
            ahmz.h = (ahqn) amqw.a(ahnq.k.i);
            ahmz.b();
            ahqh ahqh;
            if (ahnq.k.i != ahqn.RECTANGULAR) {
                if (ahnq.h == null) {
                    ahnq.h = new ahqh(ahnq.c, ahnq.d, ahnq.y);
                    ahqh = ahnq.h;
                    if (ahqh.c) {
                        ahqh.b.start();
                    }
                    ahnq.k.g = ahnq.h;
                }
                return;
            }
            ahqh = ahnq.h;
            if (ahqh != null) {
                ahqh.a();
            }
            ahnq.h = null;
            ahnq.k.g = null;
        } catch (ahsj e) {
            ahnq.b(e);
        }
    }
}
