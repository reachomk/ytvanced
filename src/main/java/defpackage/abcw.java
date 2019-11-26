package defpackage;

import android.text.TextUtils;

/* renamed from: abcw */
public final class abcw extends aaml {
    public String a;

    public abcw(aamd aamd, afpt afpt) {
        super("live/stop_broadcast", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        atip atip = (atip) atiq.d.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            atip.copyOnWrite();
            atiq atiq = (atiq) atip.instance;
            if (str != null) {
                atiq.a |= 2;
                atiq.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        return atip;
    }
}
