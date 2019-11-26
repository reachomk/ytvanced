package defpackage;

/* renamed from: anjm */
public final class anjm extends anhl {
    private anjl a;

    public final boolean cancel(boolean z) {
        anjl anjl = this.a;
        if (!super.cancel(z)) {
            return false;
        }
        anjl.a = true;
        if (!z) {
            anjl.b = false;
        }
        anjl.a();
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        this.a = null;
    }

    /* Access modifiers changed, original: protected|final */
    public final String ax_() {
        anjl anjl = this.a;
        if (anjl == null) {
            return null;
        }
        int length = anjl.d.length;
        int i = anjl.c.get();
        StringBuilder stringBuilder = new StringBuilder(49);
        stringBuilder.append("inputCount=[");
        stringBuilder.append(length);
        stringBuilder.append("], remaining=[");
        stringBuilder.append(i);
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    public /* synthetic */ anjm(anjl anjl) {
        this.a = anjl;
    }
}
