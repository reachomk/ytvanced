package defpackage;

import android.text.TextUtils;

/* renamed from: abfw */
public final class abfw extends aaml {
    public String a;

    public abfw(aamd aamd, afpt afpt) {
        super("playlist/delete", aamd, afpt);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        atfe atfe = (atfe) atfb.d.createBuilder();
        String str = this.a;
        atfe.copyOnWrite();
        atfb atfb = (atfb) atfe.instance;
        if (str != null) {
            atfb.a |= 2;
            atfb.c = str;
            return atfe;
        }
        throw new NullPointerException();
    }
}
