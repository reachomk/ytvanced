package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.graphics.Region.Op;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.os.Build.VERSION;
import com.google.android.youtube.R;
import java.util.Objects;

/* renamed from: hu */
public class hu extends Drawable implements id, sw {
    private static final Paint f = new Paint(1);
    public hw a;
    public final im[] b;
    public final im[] c;
    public boolean d;
    public Rect e;
    private final Matrix g;
    private final Path h;
    private final Path i;
    private final RectF j;
    private final RectF k;
    private final Region l;
    private final Region m;
    private ia n;
    private final Paint o;
    private final Paint p;
    private final hr q;
    private final if r;
    private final ic s;
    private PorterDuffColorFilter t;
    private PorterDuffColorFilter u;

    private static int a(int i, int i2) {
        return (i * (i2 + (i2 >>> 7))) >>> 8;
    }

    public final int getOpacity() {
        return -3;
    }

    public static hu a(Context context, float f) {
        int a = hi.a(context, R.attr.colorSurface, hu.class.getSimpleName());
        hu huVar = new hu();
        huVar.a(context);
        huVar.a(ColorStateList.valueOf(a));
        huVar.b(f);
        return huVar;
    }

    public hu() {
        this(new ia());
    }

    public hu(ia iaVar) {
        this(new hw(iaVar));
    }

    private hu(hw hwVar) {
        this.b = new im[4];
        this.c = new im[4];
        this.g = new Matrix();
        this.h = new Path();
        this.i = new Path();
        this.j = new RectF();
        this.k = new RectF();
        this.l = new Region();
        this.m = new Region();
        this.o = new Paint(1);
        this.p = new Paint(1);
        this.q = new hr();
        this.s = new ic();
        this.a = hwVar;
        this.p.setStyle(Style.STROKE);
        this.o.setStyle(Style.FILL);
        f.setColor(-1);
        f.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        i();
        a(getState());
        this.r = new hx(this);
        hwVar.a.a((id) this);
    }

    public final ConstantState getConstantState() {
        return this.a;
    }

    public final Drawable mutate() {
        this.a = new hw(this.a);
        return this;
    }

    public final void a(ia iaVar) {
        this.a.a.i.remove(this);
        this.a.a = iaVar;
        iaVar.a((id) this);
        invalidateSelf();
    }

    public final ia a() {
        return this.a.a;
    }

    public final void a(ColorStateList colorStateList) {
        hw hwVar = this.a;
        if (hwVar.d != colorStateList) {
            hwVar.d = colorStateList;
            onStateChange(getState());
        }
    }

    public final void b(ColorStateList colorStateList) {
        hw hwVar = this.a;
        if (hwVar.e != colorStateList) {
            hwVar.e = colorStateList;
            onStateChange(getState());
        }
    }

    public final void setTintMode(Mode mode) {
        hw hwVar = this.a;
        if (hwVar.h != mode) {
            hwVar.h = mode;
            i();
            super.invalidateSelf();
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        this.a.g = colorStateList;
        i();
        super.invalidateSelf();
    }

    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    public final void a(float f, int i) {
        a(f);
        b(ColorStateList.valueOf(i));
    }

    public final void a(float f) {
        this.a.l = f;
        invalidateSelf();
    }

    public final void setAlpha(int i) {
        hw hwVar = this.a;
        if (hwVar.m != i) {
            hwVar.m = i;
            super.invalidateSelf();
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.a.c = colorFilter;
        super.invalidateSelf();
    }

    public final Region getTransparentRegion() {
        this.l.set(getBounds());
        a(e(), this.h);
        this.m.setPath(this.h, this.l);
        this.l.op(this.m, Op.DIFFERENCE);
        return this.l;
    }

    private final RectF e() {
        Rect bounds = getBounds();
        this.j.set((float) bounds.left, (float) bounds.top, (float) bounds.right, (float) bounds.bottom);
        return this.j;
    }

    public final boolean getPadding(Rect rect) {
        Rect rect2 = this.e;
        if (rect2 == null) {
            return super.getPadding(rect);
        }
        rect.set(rect2);
        return true;
    }

    public final void a(Context context) {
        this.a.b = new fs(context);
        g();
    }

    private final int b(int i) {
        fs fsVar = this.a.b;
        if (fsVar == null) {
            return i;
        }
        float f = f();
        if (!fsVar.a || sc.c(i, 255) != fsVar.c) {
            return i;
        }
        float f2 = fsVar.d;
        float f3 = 0.0f;
        if (f2 > 0.0f && f > 0.0f) {
            f3 = Math.min(((((float) Math.log1p((double) (f / f2))) * 4.5f) + 2.0f) / 100.0f, 1.0f);
        }
        return fp.a(i, fsVar.b, f3);
    }

    public final float b() {
        return this.a.n;
    }

    public final void b(float f) {
        hw hwVar = this.a;
        if (hwVar.n != f) {
            hwVar.n = f;
            g();
        }
    }

    private final float f() {
        return b() + this.a.o;
    }

    private final void g() {
        float f = f();
        this.a.q = (int) Math.ceil((double) (0.75f * f));
        this.a.r = (int) Math.ceil((double) (f * 0.25f));
        i();
        super.invalidateSelf();
    }

    public final void a(int i) {
        hw hwVar = this.a;
        if (hwVar.s != i) {
            hwVar.s = i;
            super.invalidateSelf();
        }
    }

    public final void c() {
        invalidateSelf();
    }

    public final void invalidateSelf() {
        this.d = true;
        super.invalidateSelf();
    }

    public final void d() {
        this.q.a(-12303292);
        this.a.t = false;
        super.invalidateSelf();
    }

    private final boolean h() {
        return (this.a.u == Style.FILL_AND_STROKE || this.a.u == Style.STROKE) && this.p.getStrokeWidth() > 0.0f;
    }

    /* Access modifiers changed, original: protected|final */
    public final void onBoundsChange(Rect rect) {
        this.d = true;
        super.onBoundsChange(rect);
    }

    public void draw(Canvas canvas) {
        this.o.setColorFilter(this.t);
        int alpha = this.o.getAlpha();
        this.o.setAlpha(hu.a(alpha, this.a.m));
        this.p.setColorFilter(this.u);
        this.p.setStrokeWidth(this.a.l);
        int alpha2 = this.p.getAlpha();
        this.p.setAlpha(hu.a(alpha2, this.a.m));
        int i = 0;
        if (this.d) {
            this.n = new ia(a());
            ia iaVar = this.n;
            iaVar.a(c(iaVar.a.a), c(iaVar.b.a), c(iaVar.c.a), c(iaVar.d.a));
            this.s.a(this.n, this.a.k, k(), this.i);
            a(e(), this.h);
            this.d = false;
        }
        hw hwVar = this.a;
        int i2 = hwVar.p;
        if (i2 != 1 && hwVar.q > 0 && (i2 == 2 || VERSION.SDK_INT < 21 || !(this.a.a.a() || this.h.isConvex()))) {
            int i3;
            canvas.save();
            hwVar = this.a;
            double d = (double) hwVar.r;
            double sin = Math.sin(Math.toRadians((double) hwVar.s));
            Double.isNaN(d);
            int i4 = (int) (d * sin);
            hw hwVar2 = this.a;
            d = (double) hwVar2.r;
            sin = Math.cos(Math.toRadians((double) hwVar2.s));
            Double.isNaN(d);
            i2 = (int) (d * sin);
            if (VERSION.SDK_INT < 21) {
                Rect clipBounds = canvas.getClipBounds();
                i3 = -this.a.q;
                clipBounds.inset(i3, i3);
                clipBounds.offset(i4, i2);
                canvas.clipRect(clipBounds, Op.REPLACE);
            }
            canvas.translate((float) i4, (float) i2);
            i4 = getBounds().width();
            i2 = this.a.q;
            int height = getBounds().height();
            i3 = this.a.q;
            Bitmap createBitmap = Bitmap.createBitmap(i4 + (i2 + i2), height + (i3 + i3), Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap);
            float f = (float) (getBounds().left - this.a.q);
            float f2 = (float) (getBounds().top - this.a.q);
            canvas2.translate(-f, -f2);
            if (this.a.r != 0) {
                canvas2.drawPath(this.h, this.q.a);
            }
            while (i < 4) {
                this.b[i].a(this.q, this.a.q, canvas2);
                this.c[i].a(this.q, this.a.q, canvas2);
                i++;
            }
            hw hwVar3 = this.a;
            double d2 = (double) hwVar3.r;
            double sin2 = Math.sin(Math.toRadians((double) hwVar3.s));
            Double.isNaN(d2);
            i = (int) (d2 * sin2);
            hw hwVar4 = this.a;
            sin = (double) hwVar4.r;
            double cos = Math.cos(Math.toRadians((double) hwVar4.s));
            Double.isNaN(sin);
            int i5 = (int) (sin * cos);
            canvas2.translate((float) (-i), (float) (-i5));
            canvas2.drawPath(this.h, f);
            canvas2.translate((float) i, (float) i5);
            canvas.drawBitmap(createBitmap, f, f2, null);
            createBitmap.recycle();
            canvas.restore();
        }
        if (this.a.u == Style.FILL_AND_STROKE || this.a.u == Style.FILL) {
            hu.a(canvas, this.o, this.h, this.a.a, e());
        }
        if (h()) {
            hu.a(canvas, this.p, this.i, this.n, k());
        }
        this.o.setAlpha(alpha);
        this.p.setAlpha(alpha2);
    }

    private static void a(Canvas canvas, Paint paint, Path path, ia iaVar, RectF rectF) {
        if (iaVar.a()) {
            float f = iaVar.b.a;
            canvas.drawRoundRect(rectF, f, f, paint);
            return;
        }
        canvas.drawPath(path, paint);
    }

    private final float c(float f) {
        return Math.max(f - j(), 0.0f);
    }

    public final void getOutline(Outline outline) {
        hw hwVar = this.a;
        if (hwVar.p != 2) {
            if (hwVar.a.a()) {
                outline.setRoundRect(getBounds(), this.a.a.a.a);
                return;
            }
            a(e(), this.h);
            if (this.h.isConvex()) {
                outline.setConvexPath(this.h);
            }
        }
    }

    private final void a(RectF rectF, Path path) {
        ic icVar = this.s;
        hw hwVar = this.a;
        ia iaVar = hwVar.a;
        float f = hwVar.k;
        icVar.a(iaVar, f, rectF, this.r, path);
        if (this.a.j != 1.0f) {
            this.g.reset();
            Matrix matrix = this.g;
            float f2 = this.a.j;
            matrix.setScale(f2, f2, rectF.width() / 2.0f, rectF.height() / 2.0f);
            path.transform(this.g);
        }
    }

    private final boolean i() {
        PorterDuffColorFilter porterDuffColorFilter = this.t;
        PorterDuffColorFilter porterDuffColorFilter2 = this.u;
        hw hwVar = this.a;
        this.t = a(hwVar.g, hwVar.h, this.o, true);
        hwVar = this.a;
        this.u = a(hwVar.f, hwVar.h, this.p, false);
        hwVar = this.a;
        if (hwVar.t) {
            this.q.a(hwVar.g.getColorForState(getState(), 0));
        }
        if (Objects.equals(porterDuffColorFilter, this.t) && Objects.equals(porterDuffColorFilter2, this.u)) {
            return false;
        }
        return true;
    }

    private final PorterDuffColorFilter a(ColorStateList colorStateList, Mode mode, Paint paint, boolean z) {
        PorterDuffColorFilter porterDuffColorFilter = null;
        int colorForState;
        if (colorStateList != null && mode != null) {
            colorForState = colorStateList.getColorForState(getState(), 0);
            if (z) {
                colorForState = b(colorForState);
            }
            porterDuffColorFilter = new PorterDuffColorFilter(colorForState, mode);
        } else if (z) {
            colorForState = paint.getColor();
            int b = b(colorForState);
            if (b != colorForState) {
                return new PorterDuffColorFilter(b, Mode.SRC_IN);
            }
        }
        return porterDuffColorFilter;
    }

    public boolean isStateful() {
        boolean z = true;
        if (!super.isStateful()) {
            ColorStateList colorStateList = this.a.g;
            if (colorStateList == null || !colorStateList.isStateful()) {
                colorStateList = this.a.f;
                if (colorStateList == null || !colorStateList.isStateful()) {
                    colorStateList = this.a.e;
                    if (colorStateList == null || !colorStateList.isStateful()) {
                        colorStateList = this.a.d;
                        if (colorStateList == null) {
                            z = false;
                        } else if (colorStateList.isStateful()) {
                            return z;
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return z;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean onStateChange(int[] iArr) {
        boolean a = a(iArr);
        boolean i = i();
        boolean z = true;
        if (!(a || i)) {
            z = false;
        }
        if (z) {
            invalidateSelf();
        }
        return z;
    }

    private final boolean a(int[] iArr) {
        int color;
        boolean z = false;
        if (this.a.d != null) {
            color = this.o.getColor();
            int colorForState = this.a.d.getColorForState(iArr, color);
            if (color != colorForState) {
                this.o.setColor(colorForState);
                z = true;
            }
        }
        if (this.a.e != null) {
            color = this.p.getColor();
            int colorForState2 = this.a.e.getColorForState(iArr, color);
            if (color != colorForState2) {
                this.p.setColor(colorForState2);
                return true;
            }
        }
        return z;
    }

    private final float j() {
        return h() ? this.p.getStrokeWidth() / 2.0f : 0.0f;
    }

    private final RectF k() {
        RectF e = e();
        float j = j();
        this.k.set(e.left + j, e.top + j, e.right - j, e.bottom - j);
        return this.k;
    }

    /* synthetic */ hu(hw hwVar, byte b) {
        this(hwVar);
    }
}
