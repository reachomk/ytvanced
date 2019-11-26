package defpackage;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: afpc */
public final class afpc {
    private static afpi a;
    private static Queue b = new ArrayBlockingQueue(10);

    public static void a(afpi afpi) {
        a = (afpi) amqw.a((Object) afpi);
        Queue queue = b;
        if (queue != null) {
            for (afph afph = (afph) queue.poll(); afph != null; afph = (afph) b.poll()) {
                Throwable th = afph.c;
                if (th == null) {
                    int i = afph.e;
                    afpf afpf = afph.a;
                    String str = afph.b;
                    String str2 = afph.d;
                    afpi afpi2 = a;
                    if (afpi2 == null) {
                        Queue queue2 = b;
                        if (!(queue2 == null || queue2.offer(new afph(i, afpf, str, str2)))) {
                            xtl.d(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", new Object[]{afpe.a(i), afpf, str}));
                        }
                    } else if (afpi2.d) {
                        afpi2.a.execute(new afpk(afpi2, str, i, afpf, str2));
                    } else {
                        xtl.d(String.format("ECatcher disabled: level: %s, category: %s, message: %s", new Object[]{afpe.a(i), afpf, str}));
                    }
                } else {
                    afpc.a(afph.e, afph.a, afph.b, th);
                }
            }
        }
        b = null;
    }

    public static void a(int i, afpf afpf, String str) {
        afpc.a(i, afpf, str, new Exception());
    }

    public static void a(int i, afpf afpf, String str, Throwable th) {
        afpi afpi = a;
        if (afpi == null) {
            Queue queue = b;
            if (!(queue == null || queue.offer(new afph(i, afpf, str, th)))) {
                xtl.b(String.format("ECatcher log not initialized: level: %s, category: %s, message: %s", new Object[]{afpe.a(i), afpf, str}), th);
            }
            return;
        }
        afpi.a(i, afpf, str, th);
    }

    public static void a(int i, afpf afpf, String str, double d) {
        if (Math.random() < d) {
            afpc.a(i, afpf, str);
        }
    }

    public static void a(afpf afpf, String str, Exception exception, double d) {
        if (Math.random() < d) {
            afpc.a(2, afpf, str, (Throwable) exception);
        }
    }
}
