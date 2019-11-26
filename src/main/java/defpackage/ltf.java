package defpackage;

import android.app.Activity;
import android.content.res.Configuration;

/* renamed from: ltf */
public final class ltf extends jip implements xcp {
    private static final amqv e = lti.a;
    private final Activity a;
    private final aknh b = this.i;
    private final aknh c;
    private final akoh d = new akoh();

    public ltf(Activity activity, abka abka, akvz akvz, xci xci, xoi xoi, acvx acvx, akdk akdk, xsc xsc, hap hap, amqp amqp) {
        super(akvz, xci, xoi, akdk, xsc, hap, amqp, abka, acvx, null);
        this.a = (Activity) amqw.a((Object) activity);
        this.d.a(this.b);
        this.c = new aknu(this.b, e);
        a(new lrn());
    }

    public final void a(aafj aafj) {
        super.a(aafj);
        b(this.a.getResources().getConfiguration());
    }

    public final aknh a() {
        return this.d;
    }

    public final void a(Configuration configuration) {
        b(configuration);
    }

    private final void b(Configuration configuration) {
        if (configuration != null) {
            if (configuration.orientation == 2) {
                this.d.a(this.b, this.c);
                return;
            }
            this.d.a(this.c, this.b);
        }
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (cls != ltf.class) {
            return super.a(cls, obj, i);
        }
        Class[] clsArr = null;
        switch (i) {
            case -1:
                clsArr = new Class[]{gzx.class, zyg.class, zyp.class, aaxd.class, aaxc.class, akwd.class};
                break;
            case 0:
                a((gzx) obj);
                break;
            case 1:
                a((zyg) obj);
                break;
            case 2:
                a((zyp) obj);
                break;
            case 3:
                a((aaxd) obj);
                break;
            case 4:
                a((aaxc) obj);
                break;
            case 5:
                a((akwd) obj);
                break;
            default:
                StringBuilder stringBuilder = new StringBuilder(32);
                stringBuilder.append("unsupported op code: ");
                stringBuilder.append(i);
                throw new IllegalStateException(stringBuilder.toString());
        }
        return clsArr;
    }
}
