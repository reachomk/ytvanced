package defpackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: altr */
public final class altr implements alua {
    public final String a;
    public final File b;
    public final AtomicInteger c = new AtomicInteger(0);
    private final Executor d;
    private anjv e;

    public altr(String str, Executor executor) {
        this.a = str;
        this.d = executor;
        this.b = new File(str);
        altq altq = new altq(this);
    }

    public final anjv a(altm altm, Object obj, alva alva) {
        return anic.a(anjf.a(new altt(alva, obj), this.d), new altx(this, altm), aniv.a);
    }

    public final anjv a(altm altm, alvd alvd) {
        return anic.a(anjf.a(new altz(this, altm), this.d), new alty(altm, alvd), aniv.a);
    }

    public final void a(amro amro) {
        this.e = anjf.a(new altv(amro), this.d);
    }

    public final void a() {
        anjv anjv = this.e;
        if (anjv != null && !anjv.isDone()) {
            try {
                this.e.get();
            } catch (ExecutionException unused) {
            } catch (InterruptedException unused2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void a(List list) {
        Process exec = Runtime.getRuntime().exec((String[]) list.toArray(new String[list.size()]));
        if (exec.waitFor() != 0) {
            String str = new String(anaz.a(exec.getErrorStream()));
            String valueOf = String.valueOf(list);
            StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 28) + str.length());
            stringBuilder.append("Could not execute ");
            stringBuilder.append(valueOf);
            stringBuilder.append(" because: ");
            stringBuilder.append(str);
            throw new IOException(stringBuilder.toString());
        }
    }
}
