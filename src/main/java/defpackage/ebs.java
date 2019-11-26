package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.ImageView;
import java.util.HashSet;

/* renamed from: ebs */
public final class ebs implements akkr, OnGlobalLayoutListener, fao {
    public final akkq a;
    public fal b;
    public RecyclerView c;
    public final ebr d = new ebr(this);
    public boolean e;
    public HashSet f;
    private xci g;

    public ebs(xci xci, akkq akkq, fal fal, RecyclerView recyclerView) {
        this.g = (xci) amqw.a((Object) xci);
        this.a = (akkq) amqw.a((Object) akkq);
        this.b = (fal) amqw.a((Object) fal);
        this.c = (RecyclerView) amqw.a((Object) recyclerView);
    }

    public final void a(float f) {
    }

    public final void a(int i, boolean z) {
    }

    public final void b(int i) {
    }

    public final void a(xbb xbb, boolean z) {
        xci xci = this.g;
        if (xci != null) {
            xci.d(xbb);
        }
        if (z) {
            fal fal = this.b;
            if (fal != null) {
                fal.b(this);
            }
        }
        this.a.b(this);
        this.e = false;
        if (this.b != null) {
            a();
            this.b = null;
        }
        RecyclerView recyclerView = this.c;
        if (recyclerView != null) {
            recyclerView.b(this.d);
            this.c = null;
        }
        this.f.clear();
        this.g = null;
    }

    private final void a() {
        fal fal = this.b;
        ViewTreeObserver e = fal != null ? fal.e() : null;
        if (e != null && e.isAlive()) {
            e.removeOnGlobalLayoutListener(this);
        }
    }

    public final void a(ImageView imageView, akko akko, aygk aygk) {
        if (this.e) {
            this.f.add(imageView);
        }
    }

    public final void b(ImageView imageView, akko akko, aygk aygk) {
        this.f.remove(imageView);
        if (this.f.isEmpty() && !this.e) {
            a(new eev(), true);
        }
    }

    public final void c(ImageView imageView, akko akko, aygk aygk) {
        a(new eey(), true);
    }

    public final void d(ImageView imageView, akko akko, aygk aygk) {
        a(new efa(), true);
    }

    public final void onGlobalLayout() {
        a();
        this.e = false;
    }

    public final boolean a(int i) {
        a(new efa(), false);
        return false;
    }
}
