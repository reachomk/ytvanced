package defpackage;

/* renamed from: ygl */
final class ygl implements akoq {
    private final String a;
    private final int b;
    private final ycv c;

    public ygl(String str, int i, ycv ycv) {
        this.a = (String) amqw.a((Object) str);
        this.b = i;
        this.c = ycv;
    }

    public final void a(akor akor, aknh aknh, int i) {
        akor.a("conversation_id", this.a);
        akor.a("BACKGROUND_COLOR", Integer.valueOf(this.b));
        akor.a("RELATED_VIDEO_ITEM_PRESENT_MODEL_KEY", this.c);
    }
}
