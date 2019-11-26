package defpackage;

import android.util.Log;

/* renamed from: ahl */
final class ahl implements Runnable {
    private final /* synthetic */ ahi a;

    ahl(ahi ahi) {
        this.a = ahi;
    }

    public final void run() {
        ahp a = this.a.a.a();
        while (a != null) {
            int i = a.b;
            if (i == 1) {
                this.a.b.a(a.c, a.d);
            } else if (i == 2) {
                this.a.b.a(a.c, (aht) a.h);
            } else if (i != 3) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append("Unsupported message, what=");
                stringBuilder.append(a.b);
                Log.e("ThreadUtil", stringBuilder.toString());
            } else {
                this.a.b.b(a.c, a.d);
            }
            a = this.a.a.a();
        }
    }
}
