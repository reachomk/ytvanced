package defpackage;

import android.graphics.Bitmap;

/* renamed from: uok */
public abstract class uok implements Comparable {
    public final int a;
    public boolean b;

    protected uok(int i) {
        this.a = i;
    }

    public abstract int a();

    public abstract void a(int i, Bitmap bitmap);

    public abstract void a(Exception exception);

    public abstract boolean a(int i);

    public abstract int b();

    public abstract void c();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return ((uok) obj).a - this.a;
    }
}
