package defpackage;

import java.util.Arrays;
import java.util.PriorityQueue;

/* renamed from: zsj */
public final class zsj {
    public final PriorityQueue a = new PriorityQueue(1);
    public int b;
    private zsk[] c = new zsk[1];

    zsj() {
    }

    public final void a(float f, float f2) {
        int i = this.b;
        zsk[] zskArr = this.c;
        int length = zskArr.length;
        if (i >= length) {
            this.c = (zsk[]) Arrays.copyOf(zskArr, length + length);
        }
        zskArr = this.c;
        zsk zsk = zskArr[i];
        if (zsk == null) {
            zskArr[i] = new zsk(i, f, f2);
        } else {
            zsk.a = i;
            zsk.b = f;
            zsk.c = f2;
        }
        this.b++;
        this.a.add(this.c[i]);
    }

    public final amqp a(int i) {
        if (i < 0 || i >= this.b) {
            return ampo.a;
        }
        return amqp.b(this.c[i]);
    }
}
