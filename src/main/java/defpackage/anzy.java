package defpackage;

import java.util.ArrayDeque;
import java.util.Arrays;

/* renamed from: anzy */
final class anzy {
    public final ArrayDeque a = new ArrayDeque();

    private anzy() {
    }

    public final void a(anvu anvu) {
        if (anvu.j()) {
            int a = anzy.a(anvu.b());
            int i = anzw.c[a + 1];
            if (this.a.isEmpty() || ((anvu) this.a.peek()).b() >= i) {
                this.a.push(anvu);
                return;
            }
            a = anzw.c[a];
            anvu anvu2 = (anvu) this.a.pop();
            while (!this.a.isEmpty() && ((anvu) this.a.peek()).b() < a) {
                anvu2 = new anzw((anvu) this.a.pop(), anvu2, (byte) 0);
            }
            anzw anzw = new anzw(anvu2, anvu, (byte) 0);
            while (!this.a.isEmpty()) {
                if (((anvu) this.a.peek()).b() >= anzw.c[anzy.a(anzw.d) + 1]) {
                    break;
                }
                anzw = new anzw((anvu) this.a.pop(), anzw, (byte) 0);
            }
            this.a.push(anzw);
        } else if (anvu instanceof anzw) {
            anzw anzw2 = (anzw) anvu;
            a(anzw2.e);
            a(anzw2.f);
        } else {
            String valueOf = String.valueOf(anvu.getClass());
            StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 49);
            stringBuilder.append("Has a new type of ByteString been created? Found ");
            stringBuilder.append(valueOf);
            throw new IllegalArgumentException(stringBuilder.toString());
        }
    }

    private static int a(int i) {
        i = Arrays.binarySearch(anzw.c, i);
        return i < 0 ? (-(i + 1)) - 1 : i;
    }

    /* synthetic */ anzy(byte b) {
    }
}
