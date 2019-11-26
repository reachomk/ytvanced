package defpackage;

/* renamed from: anhj */
final class anhj extends anhk {
    anhj(anjv anjv, Class cls, anim anim) {
        super(anjv, cls, anim);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void b(Object obj) {
        a((anjv) obj);
    }

    /* Access modifiers changed, original: final|bridge|synthetic */
    public final /* bridge */ /* synthetic */ Object a(Object obj, Throwable th) {
        obj = (anim) obj;
        Object a = obj.a(th);
        amqw.a(a, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", obj);
        return a;
    }
}
