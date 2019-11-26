package defpackage;

import android.content.Context;

/* renamed from: vuy */
public final class vuy extends akcn implements xcp {
    private final xci a;
    private final aohu b;
    private final Context c;
    private int g = -1;

    public vuy(Context context, aohu aohu, aaas aaas, xci xci, Object obj) {
        super(aaas, obj);
        this.a = (xci) amqw.a((Object) xci);
        this.a.a((Object) this);
        this.b = (aohu) amqw.a((Object) aohu);
        this.c = (Context) amqw.a((Object) context);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a() {
        amqw.b(this.g != -1);
        aohs aohs = (aohs) this.b.g.get(this.g);
        if ((aohs.a & 2) != 0) {
            aaas aaas = this.d;
            apxu apxu = aohs.c;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, c());
        }
        aohu aohu = this.b;
        if ((aohu.a & 32) != 0) {
            Context context = this.c;
            arml arml = aohu.h;
            if (arml == null) {
                arml = arml.f;
            }
            xpr.a(context, ajqy.a(arml), 1);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void b() {
        aohu aohu = this.b;
        if ((aohu.a & 8) != 0) {
            aaas aaas = this.d;
            apxu apxu = aohu.e;
            if (apxu == null) {
                apxu = apxu.d;
            }
            aaas.a(apxu, c());
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i) {
        this.g = i;
        this.f.getButton(-1).setEnabled(true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(int i) {
        amqw.b(true);
        this.a.b(this);
        return false;
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{vvb.class};
        } else if (i == 0) {
            c(5);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
