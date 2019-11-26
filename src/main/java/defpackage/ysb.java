package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;

/* renamed from: ysb */
public final class ysb extends yig implements zab {
    public final xoi f;
    public final yzw g;
    public final ysg h;
    private final String i;
    private final String j;
    private final ywk k;

    public ysb(Context context, ywk ywk, xoi xoi, Handler handler, yjf yjf, String str, String str2, yzw yzw, ysg ysg) {
        super(context, handler, ywk.i, ywk);
        this.f = (xoi) amqw.a((Object) xoi);
        this.i = (String) amqw.a((Object) str);
        this.j = (String) amqw.a((Object) str2);
        this.g = (yzw) amqw.a((Object) yzw);
        this.h = (ysg) amqw.a((Object) ysg);
        this.k = (ywk) amqw.a((Object) ywk);
        if (yjf.a() > 0 && ((int) (yjf.a() / 4)) - 1 > 0) {
            yzw.b.setFilters(new InputFilter[]{new LengthFilter(r3)});
        }
    }

    public final void f() {
        this.g.a();
        this.h.a();
    }

    public final void a(String str) {
        ywk ywk = this.k;
        String str2 = this.i;
        yue yue = ywk.f;
        yue.a.a(null, null, str, str2, afsy.a(new yud(yue), yug.a));
        this.g.a();
        this.h.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.j, null, new yse(this), new ysd(this));
    }

    public final void bl_() {
        super.bl_();
        this.h.a();
    }
}
