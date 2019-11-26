package defpackage;

import android.content.Context;
import android.text.TextUtils;
import java.util.Map;

/* renamed from: fvk */
public abstract class fvk implements aaap {
    public final xoi a;
    public final Context b;
    public final aiuu c;
    public fvm d;
    private final adqf e;
    private final airv f;
    private final fvj g = new fvj(this);

    protected fvk(adqf adqf, airv airv, xoi xoi, Context context, aiuu aiuu) {
        this.e = (adqf) amqw.a((Object) adqf);
        this.f = (airv) amqw.a((Object) airv);
        this.a = (xoi) amqw.a((Object) xoi);
        this.b = (Context) amqw.a((Object) context);
        this.c = (aiuu) amqw.a((Object) aiuu);
    }

    public abstract String a(apxu apxu);

    public abstract void a(String str);

    public abstract String b(apxu apxu);

    public abstract void b(String str);

    public final void a(apxu apxu, Map map) {
        String a = a(apxu);
        if (TextUtils.isEmpty(a)) {
            c(b(apxu));
        } else {
            a(a);
        }
    }

    public final void c(String str) {
        String str2 = str;
        this.f.a(str2, airv.a, "", "", 0, this.g);
    }

    /* Access modifiers changed, original: protected|final */
    public final adqe a() {
        return this.e.c();
    }
}
