package defpackage;

/* renamed from: ahvu */
final /* synthetic */ class ahvu implements Runnable {
    private final ahvw a;

    public ahvu(ahvw ahvw) {
        this.a = ahvw;
    }

    public final void run() {
        ahvw ahvw = this.a;
        for (ahkx as_ : ahvw.a) {
            as_.as_();
        }
        ahvw.b = null;
        ahvw.ag_();
    }
}
