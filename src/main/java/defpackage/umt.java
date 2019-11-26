package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;

/* renamed from: umt */
public final class umt extends nnj {
    private final unf a;
    private final uoz b;
    private final upf c;
    private final long d;
    private long e;
    private boolean f;

    public umt(Context context, unf unf, uoz uoz) {
        this.a = (unf) uhy.a((Object) unf);
        this.b = (uoz) uhy.a((Object) uoz);
        this.c = (upf) uhy.a(uoz.b());
        Resources resources = context.getResources();
        this.d = (long) ((resources.getDimension(R.dimen.preview_renderer_focus_area_width) / ((float) resources.getDisplayMetrics().widthPixels)) * ((float) uoz.a().g));
    }

    /* Access modifiers changed, original: protected|final */
    public final int b() {
        return 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d() {
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final void e() {
    }

    /* Access modifiers changed, original: protected|final */
    public final long f() {
        return -2;
    }

    /* Access modifiers changed, original: protected|final */
    public final long g() {
        return -3;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        this.f = true;
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final nmx a(int i) {
        return nmx.a(null, "application/octet-stream", -2);
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(int i, long j, boolean z) {
        this.e = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j, long j2) {
        this.e = j;
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(long j) {
        nlp nlp = this.a.h;
        if ((nlp == null || !nlp.d()) && Math.abs(j - this.e) >= 1000) {
            boolean z = true;
            uor a = this.c.a(j, true);
            if (a == null) {
                a = this.c.a(j);
            }
            if (a != null) {
                if (this.b.a().a(j) != a.a) {
                    z = false;
                }
                unf unf = this.a;
                a.c();
                unf.post(new unh(unf, a, z));
                a.d();
            }
            if (this.f) {
                this.f = false;
                if (j == 0) {
                    return;
                }
            }
            long j2 = this.d / 2;
            this.b.a(j - j2, j + j2);
        }
    }
}
