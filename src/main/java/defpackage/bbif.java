package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: bbif */
public final class bbif {
    private static final Logger a = Logger.getLogger(bbif.class.getName());

    private bbif() {
    }

    public static bbio a(barz barz, bbio bbio) {
        bbii bbii = new bbii(barz);
        bbif.a(barz, new bbik(bbio, bbii), true);
        return bbii;
    }

    public static Object a(barx barx, bauw bauw, barv barv, Object obj) {
        String str;
        Throwable e;
        bbij bbij = new bbij();
        barv barv2 = new barv(barv);
        barv2.c = bbij;
        barz a = barx.a(bauw, barv2);
        try {
            bbih bbih = new bbih(a);
            bbif.a(a, obj, new bbim(bbih));
            while (true) {
                str = "Call was interrupted";
                if (bbih.isDone()) {
                    a = bbih.get();
                    return a;
                }
                try {
                    Thread currentThread = Thread.currentThread();
                    bbij.a(currentThread);
                    Runnable runnable = (Runnable) bbij.poll();
                    if (runnable == null) {
                        bbij.b = currentThread;
                        while (true) {
                            runnable = (Runnable) bbij.poll();
                            if (runnable != null) {
                                break;
                            }
                            LockSupport.park(bbij);
                            bbij.a(currentThread);
                        }
                        bbij.b = null;
                    }
                    while (true) {
                        try {
                            runnable.run();
                        } catch (Throwable th) {
                            bbij.a.logp(Level.WARNING, "io.grpc.stub.ClientCalls$ThreadlessExecutor", "waitAndDrain", "Runnable threw exception", th);
                        }
                        runnable = (Runnable) bbij.poll();
                        if (runnable != null) {
                        }
                    }
                } catch (InterruptedException e2) {
                    Thread.currentThread().interrupt();
                    throw bavx.c.a(str).b(e2).b();
                } catch (Throwable th2) {
                    bbij.b = null;
                }
            }
        } catch (InterruptedException e22) {
            Thread.currentThread().interrupt();
            throw bavx.c.a(str).b(e22).b();
        } catch (ExecutionException e3) {
            bawe bawe;
            e22 = e3.getCause();
            Throwable th3 = (Throwable) amqw.a((Object) e22, (Object) "t");
            while (th3 != null) {
                if (!(th3 instanceof bawb)) {
                    if (th3 instanceof bawe) {
                        bawe bawe2 = (bawe) th3;
                        bawe = new bawe(bawe2.a, bawe2.b);
                        break;
                    }
                    th3 = th3.getCause();
                } else {
                    bawe = new bawe(((bawb) th3).a, null);
                    break;
                }
            }
            bawe = bavx.d.a("unexpected exception").b(e22).b();
            throw bawe;
        } catch (RuntimeException e222) {
            throw bbif.a(a, e222);
        } catch (Error e2222) {
            throw bbif.a(a, e2222);
        }
    }

    private static RuntimeException a(barz barz, Throwable th) {
        try {
            barz.a(null, th);
        } catch (Throwable th2) {
            a.logp(Level.SEVERE, "io.grpc.stub.ClientCalls", "cancelThrow", "RuntimeException encountered while closing call", th2);
        }
        if (th instanceof RuntimeException) {
            throw ((RuntimeException) th);
        } else if (th instanceof Error) {
            throw ((Error) th);
        } else {
            throw new AssertionError(th);
        }
    }

    private static void a(barz barz, Object obj, basc basc) {
        bbif.a(barz, basc, false);
        try {
            barz.a(obj);
            barz.a();
        } catch (RuntimeException e) {
            throw bbif.a(barz, e);
        } catch (Error e2) {
            throw bbif.a(barz, e2);
        }
    }

    private static void a(barz barz, basc basc, boolean z) {
        barz.a(basc, new baum());
        if (z) {
            barz.a(1);
        } else {
            barz.a(2);
        }
    }
}
