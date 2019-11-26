package defpackage;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;

/* renamed from: yoh */
public final class yoh extends yig {
    public final yol f;
    public final String g;
    public final yxf h;
    public final xoi i;
    public final yob j = new yob(new yok(this));
    public final ywk k;
    public yki l;

    public static amul a(yki yki) {
        if (yki == null) {
            return amul.g();
        }
        amuo amuo = new amuo();
        if ((yki instanceof ylf) && !TextUtils.isEmpty(((ylf) yki).getDeleteToken())) {
            amuo.c(yod.DELETE);
        }
        if ((yki instanceof yld) && !TextUtils.isEmpty(((yld) yki).getText())) {
            amuo.c(yod.COPY);
        }
        if ((yki instanceof ylh) && !TextUtils.isEmpty(((ylh) yki).getShareToken())) {
            amuo.c(yod.SHARE);
        }
        if ((yki instanceof ykz) && !TextUtils.isEmpty(((ykz) yki).getPlaylistKey())) {
            amuo.c(yod.COPY);
        }
        if ((yki instanceof ykc) && !TextUtils.isEmpty(((ykc) yki).getChannelKey())) {
            amuo.c(yod.COPY);
        }
        return amuo.a();
    }

    public yoh(Context context, ywk ywk, xoi xoi, Handler handler, yol yol, String str, yxf yxf) {
        super(context, handler, ywk.i, ywk);
        this.f = (yol) amqw.a((Object) yol);
        this.g = xvd.a(str);
        this.h = (yxf) amqw.a((Object) yxf);
        this.i = (xoi) amqw.a((Object) xoi);
        this.k = (ywk) amqw.a((Object) ywk);
        yxf.a(false);
        yxf.b(true);
        yxf.a.a(this.j);
    }

    /* Access modifiers changed, original: protected|final */
    public final yih b() {
        return new yih(this.g, null, new yoj(this), new yom(this));
    }
}
