package defpackage;

/* renamed from: acfd */
public final class acfd extends aaml {
    private final arol a;

    public acfd(aamd aamd, afpt afpt, String str) {
        super("gaming/game_title", aamd, afpt, aall.ENABLED);
        arol arol = (arol) aroi.d.createBuilder();
        arol.copyOnWrite();
        aroi aroi = (aroi) arol.instance;
        if (str != null) {
            aroi.a |= 2;
            aroi.c = str;
            this.a = arol;
            return;
        }
        throw new NullPointerException();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b((((aroi) this.a.instance).a & 2) != 0);
    }

    public final /* bridge */ /* synthetic */ anzd c() {
        return this.a;
    }
}
