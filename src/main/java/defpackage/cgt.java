package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;

@Deprecated
/* renamed from: cgt */
public abstract class cgt extends cgj {
    public static boolean a;
    public static Integer b;
    public final View c;
    private final cgw d;

    public cgt(View view) {
        this.c = (View) chw.a((Object) view);
        this.d = new cgw(view);
    }

    public void b(Drawable drawable) {
    }

    public void a(cgr cgr) {
        cgw cgw = this.d;
        int c = cgw.c();
        int b = cgw.b();
        if (cgw.a(c, b)) {
            cgr.a(c, b);
            return;
        }
        if (!cgw.b.contains(cgr)) {
            cgw.b.add(cgr);
        }
        if (cgw.c == null) {
            ViewTreeObserver viewTreeObserver = cgw.a.getViewTreeObserver();
            cgw.c = new cgv(cgw);
            viewTreeObserver.addOnPreDrawListener(cgw.c);
        }
    }

    public final void b(cgr cgr) {
        this.d.b.remove(cgr);
    }

    public void a(Drawable drawable) {
        this.d.a();
    }

    public final void a(cfz cfz) {
        b((Object) cfz);
    }

    public final cfz d() {
        Object tag;
        Integer num = b;
        if (num == null) {
            tag = this.c.getTag();
        } else {
            tag = this.c.getTag(num.intValue());
        }
        if (tag == null) {
            return null;
        }
        if (tag instanceof cfz) {
            return (cfz) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    public final String toString() {
        String valueOf = String.valueOf(this.c);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 12);
        stringBuilder.append("Target for: ");
        stringBuilder.append(valueOf);
        return stringBuilder.toString();
    }

    public final void b(Object obj) {
        Integer num = b;
        if (num == null) {
            a = true;
            this.c.setTag(obj);
            return;
        }
        this.c.setTag(num.intValue(), obj);
    }
}
