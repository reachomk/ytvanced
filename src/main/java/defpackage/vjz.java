package defpackage;

/* renamed from: vjz */
public final class vjz extends vjx {
    public vjz() {
        super(vjy.NOT_REQUESTED);
    }

    public final synchronized void a(vjy vjy) {
        if (a() != vjy.COMPLETE) {
            b(vjy);
        } else {
            xtl.c("Terminal stage exception");
            throw new vkb();
        }
    }
}
