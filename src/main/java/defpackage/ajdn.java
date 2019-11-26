package defpackage;

import java.util.Random;

/* renamed from: ajdn */
final /* synthetic */ class ajdn implements Runnable {
    private final ajdh a;
    private final String b;

    ajdn(ajdh ajdh, String str) {
        this.a = ajdh;
        this.b = str;
    }

    public final void run() {
        ajdh ajdh = this.a;
        String str = this.b;
        if (ajdh.j) {
            long j = ajdh.m * ((long) ajdh.h);
            if (j > ((long) ajdh.f) && ((float) (ajdh.a() / j)) > ajdh.g) {
                xtl.d("Threshold for long playtime and rebuffer rate have been met, ceaseing all rebuffer reports");
                ajdh.j = false;
            } else if (new Random().nextDouble() < ((double) ajdh.i)) {
                ajdf ajdf = ajdh.d;
                tkt a = ajdf.b.a();
                a.a(12);
                a.a("rebuffers", str);
                ajdf.a.a(a);
            }
        }
        ajdh.m++;
    }
}
