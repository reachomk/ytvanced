package defpackage;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Iterator;

/* renamed from: bxg */
public final class bxg implements bww {
    private final bxq a;
    private final File b;
    private final long c;
    private final bwz d = new bwz();
    private brs e;

    @Deprecated
    protected bxg(File file, long j) {
        this.b = file;
        this.c = j;
        this.a = new bxq();
    }

    private final synchronized brs a() {
        if (this.e == null) {
            File file = this.b;
            long j = this.c;
            if (j > 0) {
                File file2 = new File(file, "journal.bkp");
                if (file2.exists()) {
                    File file3 = new File(file, "journal");
                    if (file3.exists()) {
                        file2.delete();
                    } else {
                        brs.a(file2, file3, false);
                    }
                }
                brs brs = new brs(file, j);
                if (brs.b.exists()) {
                    try {
                        brs.a();
                        brs.a(brs.c);
                        Iterator it = brs.g.values().iterator();
                        while (it.hasNext()) {
                            brw brw = (brw) it.next();
                            int i;
                            if (brw.e != null) {
                                brw.e = null;
                                for (i = 0; i < brs.d; i++) {
                                    brs.a(brw.a(i));
                                    brs.a(brw.b(i));
                                }
                                it.remove();
                            } else {
                                for (i = 0; i < brs.d; i++) {
                                    brs.e += brw.b[i];
                                }
                            }
                        }
                    } catch (IOException e) {
                        PrintStream printStream = System.out;
                        String valueOf = String.valueOf(file);
                        String message = e.getMessage();
                        StringBuilder stringBuilder = new StringBuilder((valueOf.length() + 36) + String.valueOf(message).length());
                        stringBuilder.append("DiskLruCache ");
                        stringBuilder.append(valueOf);
                        stringBuilder.append(" is corrupt: ");
                        stringBuilder.append(message);
                        stringBuilder.append(", removing");
                        printStream.println(stringBuilder.toString());
                        brs.close();
                        bsa.a(brs.a);
                    }
                    this.e = brs;
                }
                file.mkdirs();
                brs = new brs(file, j);
                brs.b();
                this.e = brs;
            } else {
                throw new IllegalArgumentException("maxSize <= 0");
            }
        }
        return this.e;
    }

    public final File a(bsm bsm) {
        File file = null;
        try {
            brv a = a().a(this.a.a(bsm));
            if (a != null) {
                file = a.a[0];
            }
        } catch (IOException e) {
            String str = "DiskLruCacheWrapper";
            if (Log.isLoggable(str, 5)) {
                Log.w(str, "Unable to get from disk cache", e);
                return null;
            }
        }
        return file;
    }

    public final void a(bsm bsm, bwy bwy) {
        bxc bxc;
        String a = this.a.a(bsm);
        bwz bwz = this.d;
        synchronized (bwz) {
            bxc = (bxc) bwz.a.get(a);
            if (bxc == null) {
                bxb bxb = bwz.b;
                synchronized (bxb.a) {
                    bxc = (bxc) bxb.a.poll();
                }
                if (bxc == null) {
                    bxc = new bxc();
                }
                bwz.a.put(a, bxc);
            }
            bxc.b++;
        }
        bxc.a.lock();
        try {
            brs a2 = a();
            if (a2.a(a) == null) {
                brt b = a2.b(a);
                if (b == null) {
                    String str = "Had two simultaneous puts for: ";
                    String valueOf = String.valueOf(a);
                    throw new IllegalStateException(valueOf.length() == 0 ? new String(str) : str.concat(valueOf));
                }
                try {
                    File b2;
                    synchronized (b.d) {
                        brw brw = b.a;
                        if (brw.e == b) {
                            if (!brw.d) {
                                b.b[0] = true;
                            }
                            b2 = brw.b(0);
                            if (!b.d.a.exists()) {
                                b.d.a.mkdirs();
                            }
                        } else {
                            throw new IllegalStateException();
                        }
                    }
                    if (((bud) bwy).a.a(((bud) bwy).b, b2, ((bud) bwy).c)) {
                        b.d.a(b, true);
                        b.c = true;
                    }
                    b.b();
                    this.d.a(a);
                } catch (Throwable th) {
                    b.b();
                }
            } else {
                this.d.a(a);
            }
        } catch (IOException e) {
            try {
                if (Log.isLoggable("DiskLruCacheWrapper", 5)) {
                    Log.w("DiskLruCacheWrapper", "Unable to put to disk cache", e);
                }
            } catch (Throwable th2) {
                this.d.a(a);
            }
        }
    }
}
