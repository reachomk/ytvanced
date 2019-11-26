package defpackage;

import android.text.TextUtils;

/* renamed from: aatq */
public final class aatq extends aaml {
    private final String a;

    public aatq(aamd aamd, afpt afpt, String str) {
        super("conversation/get_conversation_reply_panel", aamd, afpt);
        this.a = xvd.a(str);
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        amqw.a(TextUtils.isEmpty(this.a) ^ 1);
    }

    public final /* synthetic */ anzd c() {
        asdj asdj = (asdj) asdg.d.createBuilder();
        String str = this.a;
        asdj.copyOnWrite();
        asdg asdg = (asdg) asdj.instance;
        if (str != null) {
            asdg.a |= 2;
            asdg.c = str;
            return asdj;
        }
        throw new NullPointerException();
    }
}
