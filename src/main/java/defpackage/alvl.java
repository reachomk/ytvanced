package defpackage;

import android.os.Debug;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* renamed from: alvl */
final class alvl extends Thread {
    public volatile boolean a = true;
    private final Runnable b = new alvk(this);
    private final /* synthetic */ alvi c;

    alvl(alvi alvi, String str) {
        this.c = alvi;
        super(str);
    }

    public final void run() {
        aowa aowa;
        alvf.a();
        Thread thread = this.c.c.getLooper().getThread();
        alvj alvj = this.c.b;
        if (alvj.b.a.exists()) {
            try {
                aowa = (aowa) ((anxl) ((aowd) ((anvi) ((aowd) aowa.h.createBuilder()).mergeFrom(anbk.b(alvj.b.a), anxa.c()))).build());
                String.valueOf(alvj.f).length();
                alvf.a();
                asmz asmz = (asmz) asmw.f.createBuilder();
                asmz.a(aowa);
                alvj.c.a((asmw) ((anxl) asmz.build()));
                alvj.a();
            } catch (IOException e) {
                afpc.a(2, afpf.system_health, "Unable to flush ANR", e);
            }
        }
        this.c.d.a();
        while (!alvl.interrupted()) {
            this.a = true;
            this.c.c.post(this.b);
            try {
                TimeUnit.MILLISECONDS.sleep(this.c.a);
                this.c.d.a();
                alvi alvi;
                alvj alvj2;
                long j;
                aowd aowd;
                if (Debug.isDebuggerConnected()) {
                    this.c.b.a();
                } else if (this.a) {
                    alvi = this.c;
                    alvj2 = alvi.b;
                    j = alvi.a;
                    aowa = alvj2.f;
                    if (aowa != null) {
                        aowd = (aowd) ((anxo) aowa.toBuilder());
                    } else {
                        aowd = (aowd) aowa.h.createBuilder();
                        long a = alvj2.a.a() - j;
                        aowd.copyOnWrite();
                        aowa aowa2 = (aowa) aowd.instance;
                        aowa2.a |= 8;
                        aowa2.e = a;
                    }
                    alvj2.a(aowd, j);
                    int i = alvj2.d;
                    if (i > 0) {
                        StringBuilder stringBuilder = new StringBuilder();
                        for (Object append : thread.getStackTrace()) {
                            stringBuilder.append(append);
                            stringBuilder.append("\n");
                        }
                        String stringBuilder2 = stringBuilder.toString();
                        if (stringBuilder.length() > i) {
                            stringBuilder2 = stringBuilder2.substring(0, i);
                        }
                        aowd.copyOnWrite();
                        aowa aowa3 = (aowa) aowd.instance;
                        if (stringBuilder2 != null) {
                            aowa3.a |= 4;
                            aowa3.d = stringBuilder2;
                        } else {
                            throw new NullPointerException();
                        }
                    }
                    alvj2.f = (aowa) ((anxl) aowd.build());
                    try {
                        String.valueOf(alvj2.f).length();
                        alvf.a();
                        alvg alvg = alvj2.b;
                        aowa aowa4 = alvj2.f;
                        if (!alvg.b) {
                            alvg.b = true;
                            File parentFile = alvg.a.getParentFile();
                            if (parentFile != null) {
                                parentFile.mkdirs();
                            }
                        }
                        anbk.a(aowa4.toByteArray(), alvg.a);
                    } catch (IOException e2) {
                        afpc.a(2, afpf.system_health, "Unable to record ANR", e2);
                    }
                } else {
                    alvi = this.c;
                    alvj2 = alvi.b;
                    j = alvi.a;
                    aowa = alvj2.f;
                    if (aowa != null) {
                        if (alvj2.e) {
                            aowd = (aowd) ((anxo) aowa.toBuilder());
                            aowd.copyOnWrite();
                            aowa aowa5 = (aowa) aowd.instance;
                            aowa5.a |= 1;
                            aowa5.b = true;
                            alvj2.a(aowd, j);
                            alvj2.f = (aowa) ((anxl) aowd.build());
                            String.valueOf(alvj2.f).length();
                            alvf.a();
                            asmz asmz2 = (asmz) asmw.f.createBuilder();
                            asmz2.a(alvj2.f);
                            alvj2.c.a((asmw) ((anxl) asmz2.build()));
                            alvj2.a();
                        } else {
                            alvj2.a();
                        }
                    }
                }
            } catch (InterruptedException unused) {
            }
        }
        alvf.a();
    }
}
