package defpackage;

import android.widget.ImageView;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: akky */
public final class akky implements akkr {
    private Set a;

    public final synchronized void a(akkr akkr) {
        if (this.a == null) {
            this.a = new CopyOnWriteArraySet();
        }
        this.a.add(akkr);
    }

    public final synchronized void b(akkr akkr) {
        Set set = this.a;
        if (set != null) {
            set.remove(akkr);
        }
    }

    public final synchronized boolean a() {
        boolean z;
        Set set = this.a;
        z = set == null || set.isEmpty();
        return z;
    }

    public final synchronized void a(ImageView imageView, akko akko, aygk aygk) {
        if (!a()) {
            for (akkr a : this.a) {
                a.a(imageView, akko, aygk);
            }
        }
    }

    public final synchronized void d(ImageView imageView, akko akko, aygk aygk) {
        if (!a()) {
            for (akkr d : this.a) {
                d.d(imageView, akko, aygk);
            }
        }
    }

    public final synchronized void b(ImageView imageView, akko akko, aygk aygk) {
        if (!a()) {
            for (akkr b : this.a) {
                b.b(imageView, akko, aygk);
            }
        }
    }

    public final synchronized void c(ImageView imageView, akko akko, aygk aygk) {
        if (!a()) {
            for (akkr c : this.a) {
                c.c(imageView, akko, aygk);
            }
        }
    }
}
