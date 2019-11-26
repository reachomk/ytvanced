package defpackage;

import android.content.Intent;

/* renamed from: anpp */
final class anpp implements Runnable {
    private final /* synthetic */ Intent a;
    private final /* synthetic */ Intent b;
    private final /* synthetic */ anpq c;

    anpp(anpq anpq, Intent intent, Intent intent2) {
        this.c = anpq;
        this.a = intent;
        this.b = intent2;
    }

    public final void run() {
        this.c.a(this.a);
        this.c.b(this.b);
    }
}
