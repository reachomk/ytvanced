package defpackage;

/* renamed from: bbnd */
final class bbnd extends bbne {
    public static final long serialVersionUID = -8219729196779211169L;

    bbnd(Runnable runnable) {
        super(runnable);
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("RunnableDisposable(disposed=");
        stringBuilder.append(c());
        stringBuilder.append(", ");
        stringBuilder.append(get());
        stringBuilder.append(")");
        return stringBuilder.toString();
    }

    /* Access modifiers changed, original: protected|final|synthetic */
    public final /* synthetic */ void a(Object obj) {
        ((Runnable) obj).run();
    }
}
