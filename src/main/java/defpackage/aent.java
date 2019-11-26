package defpackage;

import android.util.Pair;
import java.util.ArrayDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: aent */
final class aent implements Runnable {
    public aeof a;
    public Future b;
    public final /* synthetic */ aenq c;
    private final ArrayDeque d = new ArrayDeque();
    private final BlockingQueue e = new LinkedBlockingQueue();
    private boolean f = false;

    public final void a(aepc aepc) {
        try {
            this.e.put(aepc);
        } catch (InterruptedException unused) {
        }
    }

    public final void run() {
        while (true) {
            try {
                aepc aepc = (aepc) this.e.take();
                if (aepc.equals(aenq.a)) {
                    if (!this.f) {
                        a(this.a.a());
                        this.f = true;
                    }
                    this.c.a(this);
                    return;
                } else if (!aepc.g) {
                    if (!this.f) {
                        a(this.a.a());
                        this.f = true;
                    }
                    aenq aenq = this.c;
                    byte[] bArr = aepc.b;
                    aenq.a(this, aepc, bArr, 0, bArr.length);
                } else if (this.f) {
                    afpc.a(2, afpf.onesie, "encrypted_data_after_clear_data");
                    this.c.a(this);
                    return;
                } else {
                    this.d.addLast(new Pair(aepc, Integer.valueOf(aepc.b.length)));
                    a(this.a.a(aepc.b));
                }
            } catch (InterruptedException unused) {
                return;
            }
        }
    }

    private final void a(byte[] bArr) {
        if (bArr != null) {
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i >= length) {
                    return;
                }
                if (Thread.interrupted()) {
                    throw new InterruptedException();
                }
                Pair pair = (Pair) this.d.removeFirst();
                aepc aepc = (aepc) pair.first;
                int intValue = ((Integer) pair.second).intValue();
                int min = Math.min(intValue, length - i);
                this.c.a(this, aepc, bArr, i, min);
                i += min;
                if (min < intValue) {
                    if (aepc.k != aepc.a) {
                        aepb aepb = aepc.k;
                        aepc.k = aepb.a(aepb.a() + ((long) min), aepb.b());
                    }
                    this.d.addFirst(new Pair(aepc, Integer.valueOf(intValue - min)));
                }
            }
        }
    }

    /* synthetic */ aent(aenq aenq) {
        this.c = aenq;
    }
}
