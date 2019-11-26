package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.google.android.apps.youtube.app.watch.nextgenwatch.ui.NextGenWatchLayout;
import com.google.android.youtube.R;

/* renamed from: lqd */
public final class lqd implements lqg {
    private final Drawable a;
    private final Drawable b;
    private final int c;
    private final /* synthetic */ NextGenWatchLayout d;

    public lqd(NextGenWatchLayout nextGenWatchLayout, Context context) {
        this.d = nextGenWatchLayout;
        this.a = ra.a(context, (int) R.drawable.miniplayer_innerglow);
        this.b = ra.a(context, (int) R.drawable.miniplayer_shadow);
        this.c = context.getResources().getDimensionPixelOffset(R.dimen.watch_while_mini_player_shadow_size);
    }

    public final int a() {
        return 8;
    }

    public final int b() {
        return 64;
    }

    public final void b(lla lla) {
    }

    public final void c() {
    }

    public final int d() {
        return 3;
    }

    public final void a(float f) {
        this.a.setAlpha(xpr.a(f));
        this.b.setAlpha(xpr.a(f));
    }

    public final void a(lla lla) {
        Rect i = lla.i();
        this.a.setBounds(i);
        this.b.setBounds(i.left - this.c, i.top - this.c, i.right + this.c, i.bottom + this.c);
    }

    public final void a(Canvas canvas, View view) {
        if (view == this.d.g && view.getVisibility() == 0) {
            this.b.draw(canvas);
        }
    }

    public final void b(Canvas canvas, View view) {
        if (view == this.d.g && view.getVisibility() == 0) {
            this.a.draw(canvas);
        }
    }

    public final int a(int i) {
        int i2 = 3;
        if (i == 2) {
            NextGenWatchLayout nextGenWatchLayout = this.d;
            if (nextGenWatchLayout.b.e()) {
                i2 = 1;
            }
            return nextGenWatchLayout.a(i2);
        } else if (i == 1 || i == 3) {
            return (this.d.h() ? i == 3 : i == 1) ? 32 : 64;
        } else {
            return 0;
        }
    }
}
