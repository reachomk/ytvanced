package defpackage;

import android.text.TextUtils;

/* renamed from: aatr */
public final class aatr extends aaml {
    private final String a;
    private final String b;

    public aatr(aamd aamd, afpt afpt, String str, String str2) {
        super("conversation/get_participants", aamd, afpt);
        this.a = str;
        this.b = str2;
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
        asdz asdz = (asdz) asdw.e.createBuilder();
        String b = aali.b(this.a);
        asdz.copyOnWrite();
        asdw asdw = (asdw) asdz.instance;
        if (b != null) {
            asdw.a |= 2;
            asdw.c = b;
            b = this.b;
            asdz.copyOnWrite();
            asdw = (asdw) asdz.instance;
            if (b != null) {
                asdw.a |= 4;
                asdw.d = b;
                return asdz;
            }
            throw new NullPointerException();
        }
        throw new NullPointerException();
    }
}
