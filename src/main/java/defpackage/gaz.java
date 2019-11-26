package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

/* renamed from: gaz */
public final class gaz {
    public View a;
    public final OnGlobalLayoutListener b = new gay(this);
    public final Rect c = new Rect();
    public gba d;
    public int e;
    public int f;
    public boolean g = true;
    public boolean h = true;

    public final void a(View view) {
        this.a = (View) amqw.a((Object) view);
        view.getWindowVisibleDisplayFrame(this.c);
        int i = this.c.bottom;
        this.f = i;
        this.e = i;
    }

    public final void a() {
        amqw.b(this.a != null);
        if (!this.h) {
            this.h = true;
            if (this.g) {
                this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this.b);
            }
        }
    }

    public final void b() {
        amqw.b(this.a != null);
        if (this.h) {
            this.h = false;
            this.a.getViewTreeObserver().addOnGlobalLayoutListener(this.b);
        }
    }
}
