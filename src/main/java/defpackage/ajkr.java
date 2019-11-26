package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.net.Uri;
import android.os.Build.VERSION;
import java.util.concurrent.Executor;

/* renamed from: ajkr */
public final class ajkr {
    public final Context a;
    public Uri b;
    private final Executor c;
    private final Executor d;
    private final bcaa e;
    private final bcaa f;
    private final Bitmap g;
    private final Paint h;
    private final int i;
    private wxg j;
    private wxg k;

    public ajkr(Context context, bcaa bcaa, bcaa bcaa2, Executor executor, Executor executor2) {
        this.a = context;
        this.e = bcaa;
        this.f = bcaa2;
        this.c = executor;
        this.d = executor2;
        int i = 1024;
        if (VERSION.SDK_INT < 21) {
            int f = xss.f(context);
            if (((ActivityManager) context.getSystemService("activity")).isLowRamDevice()) {
                i = 256;
            }
            int min = Math.min(f, i);
            this.i = min;
            this.g = Bitmap.createBitmap(min, (min * 9) / 16, Config.RGB_565);
            this.h = new Paint(3);
            return;
        }
        this.i = Math.min(1024, Math.max(xss.g(context), xss.f(context)));
        this.g = null;
        this.h = null;
    }

    public final wxg a() {
        if (this.k == null) {
            this.k = wxh.a(this.d, new ajkt(this));
        }
        return this.k;
    }

    public final void a(aaft aaft) {
        int i = this.i;
        aafo a = aaft.a(i, (i * 9) / 16);
        Uri a2 = a != null ? a.a() : null;
        if (a2 != null) {
            this.b = a2;
            akkq akkq = (akkq) this.f.get();
            Uri uri = this.b;
            if (this.j == null) {
                this.j = wxh.a(this.c, new ajku(this));
            }
            akkq.b(uri, this.j);
            return;
        }
        a(null, null);
    }

    public final void a(Bitmap bitmap, Bitmap bitmap2) {
        xak.a();
        Bitmap bitmap3 = this.g;
        if (bitmap3 == null) {
            ((ajkp) this.e.get()).a(bitmap, bitmap2);
            return;
        }
        if (bitmap == null) {
            bitmap3.eraseColor(-12303292);
        } else {
            Canvas canvas = new Canvas(bitmap3);
            int width = bitmap.getWidth();
            int i = (width * 9) / 16;
            int max = Math.max(0, (bitmap.getHeight() - i) / 2);
            canvas.drawBitmap(bitmap, new Rect(0, max, width, i + max), new Rect(0, 0, this.g.getWidth(), this.g.getHeight()), this.h);
        }
        ((ajkp) this.e.get()).a(this.g, bitmap2);
    }
}
