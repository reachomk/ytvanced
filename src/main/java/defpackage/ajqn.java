package defpackage;

/* renamed from: ajqn */
final /* synthetic */ class ajqn implements Runnable {
    private final ajqo a;

    ajqn(ajqo ajqo) {
        this.a = ajqo;
    }

    public final void run() {
        ajqo ajqo = this.a;
        ajqo.a(ajqo.j);
        if (ajqo.g > ajqo.e || (ajqo.f <= ajqo.c && ajqo.h <= ajqo.d)) {
            xtl.c("VideoQualityPromoRenderer triggered when criteria not met.");
            return;
        }
        ajqo.a();
        ajqo.i.setChanged();
        ajqo.i.notifyObservers(ajqo.a);
    }
}
