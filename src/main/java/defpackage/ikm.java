package defpackage;

/* renamed from: ikm */
public final class ikm implements akoq {
    private final ikl a;

    ikm(ikl ikl) {
        this.a = ikl;
    }

    public static ikl a(akor akor) {
        Object a = akor.a("segmentedPlaylistContextDecoratorController");
        if (a instanceof ikl) {
            return (ikl) a;
        }
        return null;
    }

    public static awjr b(akor akor) {
        Object a = akor.a("segmentedPlaylistContextDecoratorRenderer");
        if (a instanceof awjr) {
            return (awjr) a;
        }
        return null;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("segmentedPlaylistContextDecoratorController", this.a);
        akor.a("segmentedPlaylistContextDecoratorRenderer", aknh.c(i));
    }
}
