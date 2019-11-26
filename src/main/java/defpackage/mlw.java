package defpackage;

import android.content.Context;

/* renamed from: mlw */
final class mlw implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ Context b;
    private final /* synthetic */ String c;
    private final /* synthetic */ String d;
    private final /* synthetic */ String e;
    private final /* synthetic */ String f;
    private final /* synthetic */ boolean g;
    private final /* synthetic */ mlx h;

    mlw(boolean z, Context context, String str, String str2, String str3, String str4, boolean z2, mlx mlx) {
        this.a = z;
        this.b = context;
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = z2;
        this.h = mlx;
    }

    public final void run() {
        try {
            mlp a = mlp.a(this.a, this.b, this.c, this.d, this.e, this.f, this.g);
            mlx mlx = this.h;
            a.j++;
            mlx.a(a);
        } catch (Exception e) {
            this.h.a(e);
        }
    }
}
