package defpackage;

/* renamed from: yuz */
final /* synthetic */ class yuz implements bbnw {
    private final yuh a;

    yuz(yuh yuh) {
        this.a = yuh;
    }

    public final void accept(Object obj) {
        yuh yuh = this.a;
        String valueOf = String.valueOf(((ylb) obj).getPlaylistId());
        String str = "https://www.youtube.com/playlist?list=";
        if (valueOf.length() == 0) {
            valueOf = new String(str);
        } else {
            valueOf = str.concat(valueOf);
        }
        yuh.a(valueOf);
    }
}
