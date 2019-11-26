package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: yng */
public final class yng extends yig {
    public final String f;
    public final ywk g;
    public ylx h = ylx.h().a();
    public bbnc i;
    public bbnc j;
    public CharSequence k;
    public CharSequence l;
    public yko m;
    private final xsd n;

    yng(Context context, Handler handler, ywk ywk, String str, xsd xsd) {
        super(context, handler, ywk.i, ywk);
        this.f = xvd.a(str);
        this.n = (xsd) amqw.a((Object) xsd);
        this.g = (ywk) amqw.a((Object) ywk);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.f, new ynf(this));
    }

    public final void bl_() {
        super.bl_();
        bbnc bbnc = this.i;
        if (bbnc != null) {
            if (!bbnc.c()) {
                this.i.bK_();
            }
            this.i = null;
        }
        bbnc = this.j;
        if (bbnc != null) {
            if (!bbnc.c()) {
                this.j.bK_();
            }
            this.j = null;
        }
    }

    public final void f() {
        if (!TextUtils.isEmpty(this.l) && !TextUtils.isEmpty(this.k)) {
            yma g = this.h.g();
            ylw ylw = new ylw();
            ylw.b = Boolean.valueOf(TextUtils.equals(this.k, this.l));
            String str = this.f;
            if (str != null) {
                ylw.a = str;
                str = "";
                if (ylw.a == null) {
                    str = str.concat(" chatEntityKey");
                }
                if (ylw.b == null) {
                    str = String.valueOf(str).concat(" viewerIsChatOwner");
                }
                if (str.isEmpty()) {
                    this.h = g.a(new ylt(ylw.a, ylw.b.booleanValue())).a();
                    this.n.a(this.h);
                    return;
                }
                String str2 = "Missing required properties:";
                if (str.length() == 0) {
                    str = new String(str2);
                } else {
                    str = str2.concat(str);
                }
                throw new IllegalStateException(str);
            }
            throw new NullPointerException("Null chatEntityKey");
        }
    }
}
