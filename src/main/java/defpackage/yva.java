package defpackage;

/* renamed from: yva */
final /* synthetic */ class yva implements bbnw {
    private final yuh a;

    yva(yuh yuh) {
        this.a = yuh;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        String valueOf = String.valueOf(((yke) obj).getChannelId());
        String str = "https://www.youtube.com/channel/";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        yuh.a(valueOf);
    }
}
