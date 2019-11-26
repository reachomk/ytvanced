package defpackage;

/* renamed from: aabp */
final /* synthetic */ class aabp implements amqd {
    private final aabm a;
    private final boolean b;

    aabp(aabm aabm, boolean z) {
        this.a = aabm;
        this.b = z;
    }

    public final Object a(Object obj) {
        bblt b;
        aabm aabm = this.a;
        boolean z = this.b;
        aabs aabs = aabm.a;
        Iterable iterable = aabm.b;
        int i = aabm.c;
        synchronized (aabs) {
            amqw.b(aabs.d, (Object) "Attempted to mutate a disposed entity store storage object.");
            bbmi a = bbmi.a(iterable);
            Object aaby = new aaby(i);
            bbow.a(aaby, "mapper is null");
            bbmi a2 = new bbuj(a, aaby).a(bbod.d, aacb.a, bbod.c, bbod.c);
            Object aaca = new aaca(z);
            bbow.a(aaca, "predicate is null");
            b = new bbva(new bbwc(a2, aaca).a(new aacd(aabs))).b();
        }
        return b;
    }
}
