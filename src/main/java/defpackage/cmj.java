package defpackage;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.litho.ComponentHost;
import java.util.List;

/* renamed from: cmj */
public final class cmj {
    public Canvas a;
    public int b;
    public int c;
    public final /* synthetic */ ComponentHost d;

    public final boolean a() {
        return this.a != null && this.b < this.c;
    }

    public final void b() {
        if (this.a != null) {
            int i = this.b;
            aaf aaf = this.d.a;
            int c = aaf != null ? aaf.c() : 0;
            while (i < c) {
                long nanoTime = System.nanoTime();
                cqb cqb = (cqb) this.d.a.e(i);
                Object obj = cqb.d;
                if (obj instanceof View) {
                    this.b = i + 1;
                    return;
                }
                if (cqb.f) {
                    Object b;
                    boolean d = cno.d();
                    if (d || this.d.j.c) {
                        b = cqb.c.b();
                    } else {
                        b = null;
                    }
                    if (d) {
                        String valueOf = String.valueOf(b);
                        String str = "draw: ";
                        if (valueOf.length() == 0) {
                            valueOf = new String(str);
                        } else {
                            str.concat(valueOf);
                        }
                        cno.a();
                    }
                    ((Drawable) obj).draw(this.a);
                    if (d) {
                        cno.c();
                    }
                    long nanoTime2 = System.nanoTime();
                    cmh cmh = this.d.j;
                    if (cmh.c) {
                        List list = cmh.b;
                        double d2 = (double) (nanoTime2 - nanoTime);
                        Double.isNaN(d2);
                        list.add(Double.valueOf(d2 / 1000000.0d));
                        this.d.j.a.add(b);
                    }
                }
                i++;
            }
            this.b = this.c;
        }
    }

    public /* synthetic */ cmj(ComponentHost componentHost) {
        this.d = componentHost;
    }
}
