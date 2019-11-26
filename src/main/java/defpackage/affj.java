package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Surface;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: affj */
public final class affj {
    private static final Pattern c = Pattern.compile("[\\.$]");
    public final boolean a;
    public afkj b;
    private final xsc d;
    private final Deque e;
    private final Handler f;

    public affj(xsc xsc, afjc afjc) {
        arvt b = afjc.d.b();
        boolean z = false;
        if (b != null) {
            auuo auuo = b.k;
            if (auuo == null) {
                auuo = auuo.k;
            }
            aorz aorz = auuo.i;
            if (aorz == null) {
                aorz = aorz.j;
            }
            if (aorz.h) {
                z = true;
            }
        }
        this.a = z;
        this.d = xsc;
        this.e = new ArrayDeque();
        this.f = new Handler(Looper.getMainLooper());
    }

    public final void a(afne afne) {
        a(1, afne);
    }

    public final void b(afne afne) {
        a(2, afne);
    }

    public final void a(afkj afkj, afne afne) {
        if (this.a) {
            this.b = afkj;
            if (afkj == null) {
                a(4, afne);
                return;
            }
            a(3, afne);
        }
    }

    public final void a(afkn afkn, afne afne) {
        a(5, afne, 0, afkn, null);
    }

    public final void a(Surface surface, afne afne) {
        if (this.a) {
            if (surface == null) {
                afkn afkn = afkn.NONE;
                StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                StringBuilder stringBuilder = new StringBuilder();
                int min = Math.min(10, stackTrace.length);
                for (int i = 1; i < min; i++) {
                    String a = affj.a(r4.getClassName(), stackTrace[i].getMethodName());
                    String num = Integer.toString(r4.getLineNumber());
                    String[] split = c.split(a);
                    for (int i2 = 0; i2 < split.length; i2++) {
                        if (split[i2].length() > 4) {
                            split[i2] = split[i2].substring(0, 4);
                        }
                    }
                    stringBuilder.append(affj.a(split));
                    stringBuilder.append(".");
                    stringBuilder.append(num);
                    if (i != min - 1) {
                        stringBuilder.append("-");
                    }
                }
                a(8, afne, 0, afkn, stringBuilder.toString());
                return;
            }
            a(7, afne, surface.hashCode(), afkn.NONE, null);
        }
    }

    private static String a(String... strArr) {
        return TextUtils.join(".", strArr);
    }

    public final void c(afne afne) {
        a(10, afne);
    }

    public final void d(afne afne) {
        a(11, afne);
    }

    public final void e(afne afne) {
        a(12, afne);
    }

    public final void f(afne afne) {
        a(13, afne);
    }

    public final void g(afne afne) {
        a(14, afne);
    }

    public final void h(afne afne) {
        a(15, afne);
    }

    public final void a(aeuy aeuy) {
        if (this.a) {
            List arrayList = new ArrayList();
            while (this.e.size() > 0) {
                arrayList.add((affk) this.e.remove());
                if (arrayList.size() == 10 || this.e.isEmpty()) {
                    aeuy.a("dedi", (aevf) new affl(arrayList));
                    if (this.e.size() > 0) {
                        arrayList = new ArrayList();
                    }
                }
            }
        }
    }

    public final void a(int i, afne afne) {
        a(i, afne, 0, afkn.NONE, null);
    }

    public final void a(int i, afne afne, int i2, afkn afkn, String str) {
        if (this.a) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                this.e.add(new afey(i, this.d.b(), afne, i2, afkn, str));
                if (this.e.size() > 512) {
                    this.e.remove();
                }
                return;
            }
            this.f.post(new affi(this, afne, i, i2, afkn, str));
        }
    }
}
