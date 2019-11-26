package defpackage;

/* renamed from: jqs */
final class jqs implements albc {
    private final /* synthetic */ jqp a;

    jqs(jqp jqp) {
        this.a = jqp;
    }

    public final /* bridge */ /* synthetic */ void a(Object obj, int i) {
    }

    public final /* synthetic */ void a(Object obj) {
        this.a.d.edit().putInt(ebn.FEED_FILTER_BAR_TUTORIAL_SHOWN_COUNT, this.a.a() + 1).putLong(ebn.FEED_FILTER_BAR_TUTORIAL_LAST_SHOWN_TIMESTAMP, this.a.e.a()).apply();
    }
}
