package defpackage;

import android.net.Uri;
import android.util.SparseArray;

/* renamed from: njc */
final class njc implements ngo {
    public static int a = 1;
    public int b;
    public final SparseArray c = new SparseArray();

    private njc() {
    }

    public final Uri a(int i) {
        return (Uri) this.c.get(i);
    }

    public final void a() {
        this.c.clear();
    }

    /* synthetic */ njc(byte b) {
    }
}
