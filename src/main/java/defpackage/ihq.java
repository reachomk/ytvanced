package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.Region.Op;
import android.view.ViewGroup.LayoutParams;
import com.google.protos.youtube.api.innertube.ElementRendererOuterClass;
import java.util.HashMap;

/* renamed from: ihq */
public final class ihq extends aiua implements enc, vvn {
    public final Rect a;
    private final eif b;
    private final akde c;
    private final bapu d;
    private final akor e = new akor();
    private final ihs f;
    private swo g;
    private ValueAnimator h;

    public ihq(Context context, eif eif, acvx acvx, akde akde, bapu bapu) {
        super(context);
        setWillNotDraw(false);
        this.b = eif;
        this.c = akde;
        this.d = bapu;
        this.e.a(new HashMap());
        this.e.a(acvx);
        this.f = new ihs();
        this.a = new Rect();
    }

    public final void a(aaga aaga) {
        ayxm al = aaga.al();
        if (al != null) {
            anxp anxp = al.k;
            if (anxp == null) {
                anxp = axak.a;
            }
            anxr access$000 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
            anxp.a(access$000);
            if (anxp.h.a(access$000.d)) {
                anxp anxp2 = al.k;
                if (anxp2 == null) {
                    anxp2 = axak.a;
                }
                anxr access$0002 = anxl.checkIsLite(ElementRendererOuterClass.elementRenderer);
                anxp2.a(access$0002);
                Object b = anxp2.h.b(access$0002.d);
                if (b == null) {
                    b = access$0002.b;
                } else {
                    b = access$0002.a(b);
                }
                this.g = ((akdk) this.d.get()).b((arbs) b);
                addView(this.c.K_());
                this.c.a_(this.e, this.g);
            }
        }
    }

    public final void draw(Canvas canvas) {
        if (this.a.isEmpty()) {
            this.a.set(new Rect(0, 0, getWidth(), getHeight()));
        }
        int save = canvas.save();
        canvas.clipRect(this.a, Op.DIFFERENCE);
        super.draw(canvas);
        canvas.restoreToCount(save);
    }

    public final boolean c() {
        return this.g != null;
    }

    public final void d() {
        if (c()) {
            setVisibility(0);
        }
    }

    public final void a(float f, float f2, float f3, int i) {
        if (this.b.c() == ejd.WATCH_WHILE_FULLSCREEN) {
            int width = (int) (((float) getWidth()) * f3);
            int height = (int) (((float) getHeight()) * f2);
            if (!this.a.equals(new Rect(width, height, ((int) (((float) getWidth()) * f)) + width, ((int) (((float) getHeight()) * f)) + height))) {
                this.h = ValueAnimator.ofObject(this.f, new Object[]{this.a, r2});
                this.h.setDuration((long) i);
                this.h.addUpdateListener(new ihp(this));
                this.h.start();
            }
        }
    }

    public final void e() {
        if (c()) {
            ValueAnimator valueAnimator = this.h;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.h = null;
            }
            this.a.setEmpty();
            setVisibility(8);
            this.c.a(null);
            removeAllViews();
        }
    }

    public final boolean a(ejd ejd) {
        return ejd.equals(ejd.WATCH_WHILE_FULLSCREEN);
    }

    public final void b(ejd ejd) {
        if (getVisibility() == 8 && a(ejd)) {
            setVisibility(0);
        } else if (getVisibility() == 0 && !a(ejd)) {
            setVisibility(8);
        }
    }

    public final LayoutParams b() {
        return new LayoutParams(-1, -1);
    }
}
