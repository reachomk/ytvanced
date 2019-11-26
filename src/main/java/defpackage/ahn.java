package defpackage;

import android.util.Log;

/* renamed from: ahn */
final class ahn implements Runnable {
    private final /* synthetic */ ahk a;

    ahn(ahk ahk) {
        this.a = ahk;
    }

    public final void run() {
        while (true) {
            ahp a = this.a.a.a();
            if (a != null) {
                int i = a.b;
                if (i == 1) {
                    this.a.a.a(1);
                    this.a.c.a(a.c);
                } else if (i == 2) {
                    this.a.a.a(2);
                    this.a.a.a(3);
                    this.a.c.a(a.c, a.d, a.e, a.f, a.g);
                } else if (i == 3) {
                    this.a.c.a(a.c, a.d);
                } else if (i != 4) {
                    StringBuilder stringBuilder = new StringBuilder();
                    stringBuilder.append("Unsupported message, what=");
                    stringBuilder.append(a.b);
                    Log.e("ThreadUtil", stringBuilder.toString());
                } else {
                    this.a.c.a((aht) a.h);
                }
            } else {
                this.a.b.set(false);
                return;
            }
        }
    }
}
