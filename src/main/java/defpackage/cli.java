package defpackage;

import android.content.res.ColorStateList;
import android.text.Layout.Alignment;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import java.util.Arrays;

/* renamed from: cli */
public final class cli {
    public TextPaint a = new TextPaint(1);
    public float b;
    public float c;
    public float d;
    public int e;
    public int f;
    public int g;
    public CharSequence h;
    public ColorStateList i;
    public float j = 1.0f;
    public float k = 0.0f;
    public float l = Float.MAX_VALUE;
    public boolean m = true;
    public TruncateAt n = null;
    public boolean o = false;
    public int p = Integer.MAX_VALUE;
    public Alignment q = Alignment.ALIGN_NORMAL;
    public yy r = zb.c;
    public int s = 0;
    public int t = 0;
    public int u = 0;
    public boolean v = false;

    cli() {
    }

    public final void a() {
        if (this.v) {
            TextPaint textPaint = new TextPaint(this.a);
            textPaint.set(this.a);
            this.a = textPaint;
            this.v = false;
        }
    }

    public final int hashCode() {
        int i = 0;
        int color = (((((((((((((((((((((((((((((((this.a.getColor() + 31) * 31) + Float.floatToIntBits(this.a.getTextSize())) * 31) + (this.a.getTypeface() != null ? this.a.getTypeface().hashCode() : 0)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + Float.floatToIntBits(0.0f)) * 31) + this.e) * 31) + this.a.linkColor) * 31) + Float.floatToIntBits(this.a.density)) * 31) + Arrays.hashCode(this.a.drawableState)) * 31) + this.f) * 31) + this.g) * 31) + Float.floatToIntBits(this.j)) * 31) + Float.floatToIntBits(this.k)) * 31) + Float.floatToIntBits(this.l)) * 31) + this.m) * 31;
        TruncateAt truncateAt = this.n;
        color = (((color + (truncateAt != null ? truncateAt.hashCode() : 0)) * 961) + this.p) * 31;
        Alignment alignment = this.q;
        color = (color + (alignment != null ? alignment.hashCode() : 0)) * 31;
        yy yyVar = this.r;
        color = (((((((color + (yyVar != null ? yyVar.hashCode() : 0)) * 31) + this.s) * 961) + Arrays.hashCode(null)) * 31) + Arrays.hashCode(null)) * 31;
        CharSequence charSequence = this.h;
        if (charSequence != null) {
            i = charSequence.hashCode();
        }
        return color + i;
    }
}
