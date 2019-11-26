package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Rect;
import android.graphics.RectF;

/* renamed from: aul */
class aul implements auq {
    public final RectF a = new RectF();

    aul() {
    }

    public void a() {
        aus.b = new auo(this);
    }

    public final void a(aun aun, Context context, ColorStateList colorStateList, float f, float f2, float f3) {
        aus aus = new aus(context.getResources(), colorStateList, f, f2, f3);
        aus.g = aun.b();
        aus.invalidateSelf();
        aun.a(aus);
        d(aun);
    }

    private final void d(aun aun) {
        Rect rect = new Rect();
        aul.e(aun).getPadding(rect);
        aun.a((int) Math.ceil((double) b(aun)), (int) Math.ceil((double) c(aun)));
        aun.a(rect.left, rect.top, rect.right, rect.bottom);
    }

    public final void a(aun aun, ColorStateList colorStateList) {
        aus e = aul.e(aun);
        e.a(colorStateList);
        e.invalidateSelf();
    }

    public final void a(aun aun, float f) {
        aus e = aul.e(aun);
        if (f >= 0.0f) {
            f = (float) ((int) (f + 0.5f));
            if (e.c != f) {
                e.c = f;
                e.f = true;
                e.invalidateSelf();
            }
            d(aun);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid radius ");
        stringBuilder.append(f);
        stringBuilder.append(". Must be >= 0");
        throw new IllegalArgumentException(stringBuilder.toString());
    }

    public final void a(aun aun) {
        aus e = aul.e(aun);
        e.a(0.0f, e.d);
    }

    public final void b(aun aun, float f) {
        aus e = aul.e(aun);
        e.a(e.e, f);
        d(aun);
    }

    public final float b(aun aun) {
        aus e = aul.e(aun);
        float f = e.d;
        f = Math.max(f, (e.c + ((float) e.a)) + (f / 2.0f));
        float f2 = e.d + ((float) e.a);
        return (f + f) + (f2 + f2);
    }

    public final float c(aun aun) {
        aus e = aul.e(aun);
        float f = e.d;
        f = Math.max(f, (e.c + ((float) e.a)) + ((f * 1.5f) / 2.0f));
        float f2 = (e.d * 1.5f) + ((float) e.a);
        return (f + f) + (f2 + f2);
    }

    private static aus e(aun aun) {
        return (aus) aun.c();
    }
}
