package defpackage;

/* renamed from: aiwo */
final class aiwo implements aiwl {
    private final /* synthetic */ aiwh a;
    private final /* synthetic */ amqv b;

    aiwo(aiwh aiwh, amqv amqv) {
        this.a = aiwh;
        this.b = amqv;
    }

    public final aizm a(aiqq aiqq) {
        amqw.a((Object) aiqq);
        if (aiqq.f() != null) {
            return new aizr(aiqq);
        }
        return new aizh(aiqq.c(), this.a.b(), this.b);
    }

    public final aizm a(aizx aizx) {
        if (aizx instanceof aizs) {
            aizu aizu = ((aizs) aizx).c;
            if (aizu instanceof aizq) {
                return new aizr((aizq) aizu);
            }
            if (aizu instanceof aizg) {
                return new aizh((aizg) aizu, this.b);
            }
        }
        return null;
    }
}
