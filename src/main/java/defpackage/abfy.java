package defpackage;

import android.text.TextUtils;

/* renamed from: abfy */
public final class abfy extends aaml {
    private String a;

    protected abfy(aamd aamd, afpt afpt) {
        super("playlist/get_settings_editor", aamd, afpt);
    }

    public final abfy c(String str) {
        this.a = aali.b(str);
        return this;
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        atfo atfo = (atfo) atfl.d.createBuilder();
        String str = this.a;
        atfo.copyOnWrite();
        atfl atfl = (atfl) atfo.instance;
        if (str != null) {
            atfl.a |= 2;
            atfl.c = str;
            return atfo;
        }
        throw new NullPointerException();
    }
}
