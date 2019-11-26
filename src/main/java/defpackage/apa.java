package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

/* renamed from: apa */
public abstract class apa {
    public final apd a = new apd();
    public boolean b = false;

    public boolean Y_() {
        return false;
    }

    public void Z_() {
    }

    public abstract int a();

    public int a(int i) {
        return 0;
    }

    public abstract aqj a(ViewGroup viewGroup, int i);

    public void a(RecyclerView recyclerView) {
    }

    public void a(aqj aqj) {
    }

    public abstract void a(aqj aqj, int i);

    public long b(int i) {
        return -1;
    }

    public final aqj b(ViewGroup viewGroup, int i) {
        aqj a = a(viewGroup, i);
        if (a.a.getParent() == null) {
            a.f = i;
            return a;
        }
        throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
    }

    public final void a(boolean z) {
        if (this.a.a()) {
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }
        this.b = z;
    }

    public final void a(apc apc) {
        this.a.registerObserver(apc);
    }

    public final void b(apc apc) {
        this.a.unregisterObserver(apc);
    }

    public final void aa_() {
        this.a.b();
    }

    public final void c(int i) {
        this.a.a(i, 1);
    }

    public final void a(int i, int i2) {
        this.a.a(i, i2);
    }

    public final void d(int i) {
        this.a.b(i, 1);
    }

    public final void b(int i, int i2) {
        this.a.d(i, i2);
    }

    public final void c(int i, int i2) {
        this.a.b(i, i2);
    }

    public final void e(int i) {
        this.a.c(i, 1);
    }

    public final void d(int i, int i2) {
        this.a.c(i, i2);
    }
}
