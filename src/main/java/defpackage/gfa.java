package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

/* renamed from: gfa */
public final class gfa implements gep, ggb {
    public final Context a;
    public final geu b;
    public Bitmap c;
    public gey d;
    public gej e;
    public View f;
    public TextView g;
    public RecyclerView h;
    public boolean i;
    public float j;

    public gfa(Context context, geu geu) {
        this.a = context;
        this.b = geu;
    }

    public final void d() {
    }

    public final void e() {
    }

    public final void f() {
        gfu.a(this);
        this.i ^= 1;
    }

    public final View a() {
        return this.f;
    }

    public final float b() {
        return !this.i ? this.j : 0.0f;
    }

    public final float c() {
        return this.i ? this.j : 0.0f;
    }
}
