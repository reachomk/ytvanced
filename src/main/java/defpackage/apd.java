package defpackage;

import android.database.Observable;

/* renamed from: apd */
public final class apd extends Observable {
    apd() {
    }

    public final boolean a() {
        return this.mObservers.isEmpty() ^ 1;
    }

    public final void b() {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((apc) this.mObservers.get(size)).a();
            } else {
                return;
            }
        }
    }

    public final void a(int i, int i2) {
        a(i, i2, null);
    }

    public final void a(int i, int i2, Object obj) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((apc) this.mObservers.get(size)).a(i, i2, obj);
            } else {
                return;
            }
        }
    }

    public final void b(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((apc) this.mObservers.get(size)).b(i, i2);
            } else {
                return;
            }
        }
    }

    public final void c(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((apc) this.mObservers.get(size)).c(i, i2);
            } else {
                return;
            }
        }
    }

    public final void d(int i, int i2) {
        int size = this.mObservers.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((apc) this.mObservers.get(size)).d(i, i2);
            } else {
                return;
            }
        }
    }
}
