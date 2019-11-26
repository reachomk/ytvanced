package defpackage;

/* renamed from: ur */
public class ur {
    public final Object b;
    public boolean c;
    public boolean d;
    public int e;

    ur(Object obj) {
        this.b = obj;
    }

    /* Access modifiers changed, original: 0000 */
    public void a(Object obj) {
    }

    public final void b(Object obj) {
        if (this.c || this.d) {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("sendResult() called when either sendResult() or sendError() had already been called for: ");
            stringBuilder.append(this.b);
            throw new IllegalStateException(stringBuilder.toString());
        }
        this.c = true;
        a(obj);
    }

    /* Access modifiers changed, original: final */
    public final boolean a() {
        return this.c || this.d;
    }
}
