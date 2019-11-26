package defpackage;

/* renamed from: yvz */
final class yvz {
    public final String a;
    public final /* synthetic */ ywa b;

    /* Access modifiers changed, original: final|varargs */
    public final void a(String... strArr) {
        synchronized (this.b) {
            for (Object obj : strArr) {
                this.b.b.a(this.a, obj);
                this.b.c.a(obj, this.a);
            }
        }
    }

    /* Access modifiers changed, original: final */
    public final void a(Iterable iterable) {
        synchronized (this.b) {
            for (String str : iterable) {
                this.b.b.a(this.a, str);
                this.b.c.a(str, this.a);
            }
        }
    }

    /* synthetic */ yvz(ywa ywa, String str) {
        this.b = ywa;
        this.a = xvd.a(str);
    }
}
