package defpackage;

import android.text.TextUtils;

/* renamed from: abcs */
public final class abcs extends aaml {
    public String a;

    public abcs(aamd aamd, afpt afpt) {
        super("live/start_broadcast", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
    }

    public final /* synthetic */ anzd c() {
        atih atih = (atih) atii.d.createBuilder();
        if (!TextUtils.isEmpty(this.a)) {
            String str = this.a;
            atih.copyOnWrite();
            atii atii = (atii) atih.instance;
            if (str != null) {
                atii.a |= 2;
                atii.c = str;
            } else {
                throw new NullPointerException();
            }
        }
        return atih;
    }
}
