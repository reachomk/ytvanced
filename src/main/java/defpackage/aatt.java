package defpackage;

import android.text.TextUtils;

/* renamed from: aatt */
public final class aatt extends aaml {
    public String a;
    public String b;

    public aatt(aamd aamd, afpt afpt) {
        super("conversation/get", aamd, afpt);
        g();
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        boolean z = true;
        if (TextUtils.isEmpty(this.a) && TextUtils.isEmpty(this.b)) {
            z = false;
        }
        amqw.b(z);
    }

    public final /* synthetic */ anzd c() {
        asdy asdy;
        aseb aseb = (aseb) asdy.e.createBuilder();
        String str = this.a;
        if (str != null) {
            aseb.copyOnWrite();
            asdy = (asdy) aseb.instance;
            asdy.a |= 2;
            asdy.c = str;
        }
        str = this.b;
        if (str != null) {
            aseb.copyOnWrite();
            asdy = (asdy) aseb.instance;
            asdy.a |= 16;
            asdy.d = str;
        }
        return aseb;
    }
}
