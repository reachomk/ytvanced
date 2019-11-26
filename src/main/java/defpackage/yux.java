package defpackage;

/* renamed from: yux */
public final /* synthetic */ class yux implements bbnw {
    private final yuh a;

    public yux(yuh yuh) {
        this.a = yuh;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        aadq aadq = (aadq) obj;
        if (aadq instanceof yld) {
            yuh.a(((yld) aadq).getText().toString());
        } else if (aadq instanceof ykc) {
            yuh.a.b(((ykc) aadq).getChannelKey()).a(yke.class).a(bbmt.a()).a(new yva(yuh)).a();
        } else if (aadq instanceof ykz) {
            yuh.a.b(((ykz) aadq).getPlaylistKey()).a(ylb.class).a(new yuz(yuh)).a(bbmt.a()).a();
        }
    }
}
