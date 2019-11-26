package defpackage;

import android.text.TextUtils;

/* renamed from: abjn */
public final class abjn extends aaml {
    public String a;
    public String b;
    public int c;

    public abjn(aamd aamd, afpt afpt) {
        super("thumbnails", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.b((TextUtils.isEmpty(this.a) ^ 1) ^ (TextUtils.isEmpty(this.b) ^ 1));
    }

    public final /* synthetic */ anzd c() {
        atjv atjv = (atjv) atjw.f.createBuilder();
        int i = this.c;
        atjv.copyOnWrite();
        atjw atjw = (atjw) atjv.instance;
        atjw.a |= 8;
        atjw.e = (long) i;
        String str = this.a;
        if (str == null) {
            str = this.b;
            if (str != null) {
                atjv.copyOnWrite();
                atjw = (atjw) atjv.instance;
                atjw.a |= 4;
                atjw.d = str;
            }
        } else {
            atjv.copyOnWrite();
            atjw = (atjw) atjv.instance;
            atjw.a |= 2;
            atjw.c = str;
        }
        return atjv;
    }
}
