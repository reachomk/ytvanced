package defpackage;

/* renamed from: aihb */
final /* synthetic */ class aihb implements aihc {
    private final aigy a;

    aihb(aigy aigy) {
        this.a = aigy;
    }

    public final void a(boolean z) {
        aigy aigy = this.a;
        if (aigy.getParent() != null) {
            aigy.getParent().requestDisallowInterceptTouchEvent(z);
        }
        aigy.a();
    }
}
