package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import java.util.concurrent.LinkedBlockingQueue;

/* renamed from: qqb */
public final class qqb implements Runnable, pte, pth {
    private static qqb b;
    public int a = 0;
    private final LinkedBlockingQueue c = new LinkedBlockingQueue();
    private final qae d;
    private final Handler e;

    private qqb(Context context) {
        HandlerThread handlerThread = new HandlerThread("DG");
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        this.e = new Handler(looper);
        this.d = new qpx(context, looper, this, this);
    }

    static synchronized qqb a(Context context) {
        qqb qqb;
        synchronized (qqb.class) {
            if (b == null) {
                b = new qqb(context);
            }
            qqb = b;
        }
        return qqb;
    }

    public final void a(qqa qqa) {
        this.c.offer(qqa);
        this.e.post(this);
    }

    public final void run() {
        pzr.a(this.e);
        if (this.d.i()) {
            b();
            return;
        }
        if (!this.d.j() && this.c.size() > 0) {
            this.d.q();
        }
    }

    public final void a(Bundle bundle) {
        pzr.a(this.e);
        b();
    }

    public final void a(int i) {
        pzr.a(this.e);
        StringBuilder stringBuilder = new StringBuilder(25);
        stringBuilder.append("Disconnected: ");
        stringBuilder.append(i);
        a(stringBuilder.toString());
    }

    public final void a(psa psa) {
        pzr.a(this.e);
        String valueOf = String.valueOf(psa);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 19);
        stringBuilder.append("Connection failed: ");
        stringBuilder.append(valueOf);
        a(stringBuilder.toString());
    }

    public final void a(Runnable runnable) {
        if (Looper.myLooper() == this.e.getLooper()) {
            runnable.run();
        } else {
            this.e.post(runnable);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x01c5 A:{SYNTHETIC, Splitter:B:105:0x01c5} */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0252 A:{SYNTHETIC, Splitter:B:128:0x0252} */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:267:0x038f  */
    /* JADX WARNING: Removed duplicated region for block: B:268:0x0395  */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x0252 A:{SYNTHETIC, Splitter:B:128:0x0252} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:116:0x0212 */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x029e A:{Splitter:B:105:0x01c5, ExcHandler: ClassNotFoundException (r0_82 'e' java.lang.ClassNotFoundException)} */
    /* JADX WARNING: Missing block: B:143:0x029e, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:146:0x02a6, code skipped:
            throw new defpackage.qcl("Couldn't load VM class", r0);
     */
    /* JADX WARNING: Missing block: B:168:0x02e6, code skipped:
            r0 = th;
     */
    private final void b() {
        /*
        r25 = this;
        r1 = r25;
    L_0x0002:
        r0 = r1.c;
        r0 = r0.poll();
        r2 = r0;
        r2 = (defpackage.qqa) r2;
        if (r2 == 0) goto L_0x03a3;
    L_0x000d:
        r0 = r2.e;
        if (r0 != 0) goto L_0x0002;
    L_0x0011:
        r0 = r1.d;	 Catch:{ Exception -> 0x037a }
        r0 = r0.v();	 Catch:{ Exception -> 0x037a }
        r0 = (defpackage.qqk) r0;	 Catch:{ Exception -> 0x037a }
        r0 = r0.a();	 Catch:{ Exception -> 0x037a }
        r3 = r2.d;	 Catch:{ Exception -> 0x037a }
        r4 = r1.a;	 Catch:{ Exception -> 0x037a }
        r3 = r3.a;	 Catch:{ Exception -> 0x037a }
        r5 = "openHandles";
        r3.putInt(r5, r4);	 Catch:{ Exception -> 0x037a }
        r3 = r2.c;	 Catch:{ Exception -> 0x037a }
        r4 = r2.d;	 Catch:{ Exception -> 0x037a }
        r3 = r0.a(r3, r4);	 Catch:{ Exception -> 0x037a }
        if (r3 != 0) goto L_0x003d;
    L_0x0032:
        r3 = r2.c;	 Catch:{ Exception -> 0x037a }
        r0.a(r3);	 Catch:{ Exception -> 0x037a }
    L_0x0037:
        r17 = r0;
        r18 = r2;
        goto L_0x035b;
    L_0x003d:
        r4 = r1.d;	 Catch:{ Exception -> 0x037a }
        r4 = r4.x;	 Catch:{ Exception -> 0x037a }
        r5 = new qcf;	 Catch:{ Exception -> 0x037a }
        r5.<init>(r4);	 Catch:{ Exception -> 0x037a }
        r6 = new qcj;	 Catch:{ Exception -> 0x037a }
        r6.<init>(r4);	 Catch:{ Exception -> 0x037a }
        r7 = new qco;	 Catch:{ Exception -> 0x037a }
        r7.<init>(r4, r5, r6);	 Catch:{ Exception -> 0x037a }
        r4 = new qck;	 Catch:{ Exception -> 0x037a }
        r4.<init>(r7);	 Catch:{ Exception -> 0x037a }
        r5 = r3.a;	 Catch:{ Exception -> 0x037a }
        if (r5 == 0) goto L_0x0037;
    L_0x0059:
        r5 = r3.b;	 Catch:{ Exception -> 0x0357 }
        if (r5 == 0) goto L_0x0037;
    L_0x005d:
        r6 = r5;
        r6 = (android.os.Bundle) r6;	 Catch:{ Exception -> 0x0357 }
        r7 = "h";
        r6 = r6.getString(r7);	 Catch:{ Exception -> 0x0357 }
        if (r6 == 0) goto L_0x034d;
    L_0x0068:
        r7 = new qch;	 Catch:{ Exception -> 0x0357 }
        r7.<init>(r6);	 Catch:{ Exception -> 0x0357 }
        r3 = r3.a;	 Catch:{ Exception -> 0x0357 }
        r6 = new android.os.ParcelFileDescriptor$AutoCloseInputStream;	 Catch:{ all -> 0x0340 }
        r6.<init>(r3);	 Catch:{ all -> 0x0340 }
        r4 = r4.a;	 Catch:{ all -> 0x0333 }
        r8 = defpackage.qco.a;	 Catch:{ all -> 0x0333 }
        monitor-enter(r8);	 Catch:{ all -> 0x0333 }
        r10 = 0;
        r11 = defpackage.qco.a;	 Catch:{ qcg -> 0x009b }
        r11 = r11.a(r7);	 Catch:{ qcg -> 0x009b }
        r12 = 1;
        if (r11 != 0) goto L_0x008d;
    L_0x0083:
        r11 = r4.c;	 Catch:{ qcg -> 0x009b }
        r11 = r11.a(r7);	 Catch:{ qcg -> 0x009b }
        if (r11 == 0) goto L_0x008c;
    L_0x008b:
        goto L_0x008d;
    L_0x008c:
        r12 = 0;
    L_0x008d:
        monitor-exit(r8);	 Catch:{ all -> 0x0096 }
        if (r12 == 0) goto L_0x009c;
    L_0x0090:
        r17 = r0;
        r18 = r2;
        goto L_0x01c2;
    L_0x0096:
        r0 = move-exception;
        r18 = r2;
        goto L_0x032d;
    L_0x009b:
        monitor-exit(r8);	 Catch:{ all -> 0x0096 }
    L_0x009c:
        r8 = r4.b;	 Catch:{ all -> 0x0333 }
        r11 = java.util.UUID.randomUUID();	 Catch:{ all -> 0x0333 }
        r11 = r11.toString();	 Catch:{ all -> 0x0333 }
        r11 = java.lang.String.valueOf(r11);	 Catch:{ all -> 0x0333 }
        r12 = ".apk";
        r11 = r11.concat(r12);	 Catch:{ all -> 0x0333 }
        r12 = new java.io.File;	 Catch:{ all -> 0x0333 }
        r8 = defpackage.qcf.a(r8);	 Catch:{ all -> 0x0333 }
        r12.<init>(r8, r11);	 Catch:{ all -> 0x0333 }
        r8 = new java.io.FileOutputStream;	 Catch:{ Exception -> 0x031d, all -> 0x0319 }
        r8.<init>(r12);	 Catch:{ Exception -> 0x031d, all -> 0x0319 }
        r11 = r6.getChannel();	 Catch:{ all -> 0x030c }
        r15 = r8.getChannel();	 Catch:{ all -> 0x02fd }
        r17 = r11.size();	 Catch:{ all -> 0x02ec }
        r19 = 0;
        r13 = r15;
        r14 = r11;
        r9 = r15;
        r15 = r19;
        r13.transferFrom(r14, r15, r17);	 Catch:{ all -> 0x02e8 }
        r13 = r4.c;	 Catch:{ all -> 0x02e8 }
        r14 = new qci;	 Catch:{ all -> 0x02e8 }
        r14.<init>(r12, r10, r10);	 Catch:{ all -> 0x02e8 }
        r15 = r13.c;	 Catch:{ all -> 0x02e8 }
        monitor-enter(r15);	 Catch:{ all -> 0x02e8 }
        r10 = r13.a();	 Catch:{ all -> 0x02dc }
        r17 = r0;
        r0 = r13.c;	 Catch:{ all -> 0x02dc }
        r1 = r10.a();	 Catch:{ all -> 0x02dc }
        r0.add(r1);	 Catch:{ all -> 0x02dc }
        r0 = r10.a();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x00ff;
    L_0x00f3:
        r1 = r0.exists();	 Catch:{ all -> 0x02dc }
        if (r1 != 0) goto L_0x00ff;
    L_0x00f9:
        r0 = r0.mkdirs();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x02b2;
    L_0x00ff:
        r0 = r10.b;	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x02b2;
    L_0x0103:
        r1 = r10.c;	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x02b2;
    L_0x0107:
        r0 = r0.exists();	 Catch:{ all -> 0x02dc }
        if (r0 != 0) goto L_0x0115;
    L_0x010d:
        r0 = r10.b;	 Catch:{ all -> 0x02dc }
        r0 = r0.mkdirs();	 Catch:{ all -> 0x02dc }
        if (r0 == 0) goto L_0x02b2;
    L_0x0115:
        r0 = r10.c;	 Catch:{ IOException -> 0x02b2 }
        r0 = r0.exists();	 Catch:{ IOException -> 0x02b2 }
        if (r0 != 0) goto L_0x0125;
    L_0x011d:
        r0 = r10.c;	 Catch:{ IOException -> 0x02b2 }
        r0 = r0.createNewFile();	 Catch:{ IOException -> 0x02b2 }
        if (r0 == 0) goto L_0x02b2;
    L_0x0125:
        r0 = r14.a;	 Catch:{ all -> 0x02dc }
        r1 = r10.a;	 Catch:{ all -> 0x02dc }
        defpackage.qcf.a(r0, r1);	 Catch:{ all -> 0x02dc }
        r0 = r7.a;	 Catch:{ all -> 0x02dc }
        r0 = r13.a(r0);	 Catch:{ all -> 0x02dc }
        r1 = r0.a();	 Catch:{ all -> 0x02dc }
        r1 = r1.exists();	 Catch:{ all -> 0x02dc }
        if (r1 == 0) goto L_0x0157;
    L_0x013c:
        r1 = r13.a();	 Catch:{ all -> 0x02dc }
        r14 = r13.c;	 Catch:{ all -> 0x02dc }
        r18 = r2;
        r2 = r1.a();	 Catch:{ all -> 0x02da }
        r14.add(r2);	 Catch:{ all -> 0x02da }
        r2 = r0.a();	 Catch:{ all -> 0x02da }
        r1 = r1.a();	 Catch:{ all -> 0x02da }
        defpackage.qcf.a(r2, r1);	 Catch:{ all -> 0x02da }
        goto L_0x0159;
    L_0x0157:
        r18 = r2;
    L_0x0159:
        r13.a(r10);	 Catch:{ all -> 0x02da }
        r1 = r10.a();	 Catch:{ all -> 0x02da }
        r0 = r0.a();	 Catch:{ all -> 0x02da }
        defpackage.qcf.a(r1, r0);	 Catch:{ all -> 0x02da }
        r0 = r13.a;	 Catch:{ all -> 0x02da }
        r0 = defpackage.qcf.a(r0);	 Catch:{ all -> 0x02da }
        r1 = r13.b;	 Catch:{ all -> 0x02da }
        r1 = r1.a();	 Catch:{ all -> 0x02da }
        r0 = r0.list();	 Catch:{ all -> 0x02da }
        r10 = r0.length;	 Catch:{ all -> 0x02da }
        r14 = 0;
    L_0x0179:
        if (r14 >= r10) goto L_0x01b1;
    L_0x017b:
        r19 = r10;
        r10 = r0[r14];	 Catch:{ all -> 0x02da }
        r10 = r13.a(r10);	 Catch:{ all -> 0x02da }
        r20 = r10.b();	 Catch:{ all -> 0x02da }
        if (r20 != 0) goto L_0x018c;
    L_0x0189:
        r20 = r0;
        goto L_0x01aa;
    L_0x018c:
        r20 = r0;
        r0 = r10.c;	 Catch:{ all -> 0x02da }
        r21 = r0.exists();	 Catch:{ all -> 0x02da }
        if (r21 == 0) goto L_0x01a3;
    L_0x0196:
        r21 = r0.lastModified();	 Catch:{ all -> 0x02da }
        r23 = 1209600000; // 0x48190800 float:156704.0 double:5.97621805E-315;
        r21 = r21 + r23;
        r0 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1));
        if (r0 < 0) goto L_0x01aa;
    L_0x01a3:
        r0 = r10.a();	 Catch:{ all -> 0x02da }
        defpackage.qqf.a(r0);	 Catch:{ all -> 0x02da }
    L_0x01aa:
        r14 = r14 + 1;
        r10 = r19;
        r0 = r20;
        goto L_0x0179;
    L_0x01b1:
        r13.b();	 Catch:{ all -> 0x02e3 }
        monitor-exit(r15);	 Catch:{ all -> 0x02e3 }
        r0 = 0;
        defpackage.qco.a(r0, r9);	 Catch:{ all -> 0x02fb }
        defpackage.qco.a(r0, r11);	 Catch:{ all -> 0x030a }
        defpackage.qco.a(r0, r8);	 Catch:{ Exception -> 0x0317 }
        r12.delete();	 Catch:{ all -> 0x032f }
    L_0x01c2:
        r1 = defpackage.qco.a;	 Catch:{ all -> 0x032f }
        monitor-enter(r1);	 Catch:{ all -> 0x032f }
        r0 = defpackage.qco.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = r0.a(r7);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = (java.lang.Class) r0;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        if (r0 == 0) goto L_0x01db;
    L_0x01cf:
        r2 = r4.c;	 Catch:{ qcg -> 0x0212, ClassNotFoundException -> 0x029e }
        r7 = r7.a;	 Catch:{ qcg -> 0x0212, ClassNotFoundException -> 0x029e }
        r7 = r2.a(r7);	 Catch:{ qcg -> 0x0212, ClassNotFoundException -> 0x029e }
        r2.a(r7);	 Catch:{ qcg -> 0x0212, ClassNotFoundException -> 0x029e }
        goto L_0x0212;
    L_0x01db:
        r0 = r4.c;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = r0.a(r7);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        if (r0 == 0) goto L_0x0274;
    L_0x01e3:
        r2 = r4.d;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r8 = r0.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = r2.a(r8);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        if (r2 == 0) goto L_0x0265;
    L_0x01ed:
        r2 = new dalvik.system.DexClassLoader;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r8 = r0.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r8 = r8.getAbsolutePath();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = r0.b;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = r0.getAbsolutePath();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r9 = r4.b;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r9 = r9.getClassLoader();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r10 = 0;
        r2.<init>(r8, r0, r10, r9);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = "com.google.ccc.abuse.droidguard.DroidGuard";
        r0 = r2.loadClass(r0);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = defpackage.qco.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = r2.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2.put(r7, r0);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
    L_0x0212:
        monitor-exit(r1);	 Catch:{ all -> 0x029c }
        r1 = new qcn;	 Catch:{ all -> 0x032f }
        r2 = r4.b;	 Catch:{ all -> 0x032f }
        r1.<init>(r0, r2, r5);	 Catch:{ all -> 0x032f }
        r0 = r1.a;	 Catch:{ Exception -> 0x025e }
        r0 = r0.getClass();	 Catch:{ Exception -> 0x025e }
        r2 = "init";
        r4 = 0;
        r5 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x025e }
        r0 = r0.getDeclaredMethod(r2, r5);	 Catch:{ Exception -> 0x025e }
        r2 = r1.a;	 Catch:{ Exception -> 0x025e }
        r5 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x025e }
        r0 = r0.invoke(r2, r5);	 Catch:{ Exception -> 0x025e }
        r0 = (java.lang.Boolean) r0;	 Catch:{ Exception -> 0x025e }
        r0.booleanValue();	 Catch:{ Exception -> 0x025e }
        r0 = r1.a;	 Catch:{ Exception -> 0x0257 }
        r0 = r0.getClass();	 Catch:{ Exception -> 0x0257 }
        r2 = "close";
        r4 = 0;
        r5 = new java.lang.Class[r4];	 Catch:{ Exception -> 0x0257 }
        r0 = r0.getDeclaredMethod(r2, r5);	 Catch:{ Exception -> 0x0257 }
        r1 = r1.a;	 Catch:{ Exception -> 0x0257 }
        r2 = new java.lang.Object[r4];	 Catch:{ Exception -> 0x0257 }
        r0.invoke(r1, r2);	 Catch:{ Exception -> 0x0257 }
        r0 = 0;
        defpackage.qck.a(r0, r6);	 Catch:{ all -> 0x033e }
        if (r3 == 0) goto L_0x035b;
    L_0x0252:
        defpackage.qck.a(r0, r3);	 Catch:{ Exception -> 0x0374 }
        goto L_0x035b;
    L_0x0257:
        r0 = move-exception;
        r1 = new qcl;	 Catch:{ all -> 0x032f }
        r1.<init>(r0);	 Catch:{ all -> 0x032f }
        throw r1;	 Catch:{ all -> 0x032f }
    L_0x025e:
        r0 = move-exception;
        r1 = new qcl;	 Catch:{ all -> 0x032f }
        r1.<init>(r0);	 Catch:{ all -> 0x032f }
        throw r1;	 Catch:{ all -> 0x032f }
    L_0x0265:
        r0 = r0.a();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        defpackage.qqf.a(r0);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0 = new java.lang.ClassNotFoundException;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = "APK signature verification failed";
        r0.<init>(r2);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        throw r0;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
    L_0x0274:
        r0 = new qcl;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = r7.a;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r4 = java.lang.String.valueOf(r2);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r4 = r4.length();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r4 = r4 + 30;
        r5 = new java.lang.StringBuilder;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r5.<init>(r4);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r4 = "VM key ";
        r5.append(r4);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r5.append(r2);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = " not found in the cache";
        r5.append(r2);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r2 = r5.toString();	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        r0.<init>(r2);	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
        throw r0;	 Catch:{ qcg -> 0x02a7, ClassNotFoundException -> 0x029e }
    L_0x029c:
        r0 = move-exception;
        goto L_0x02b0;
    L_0x029e:
        r0 = move-exception;
        r2 = new qcl;	 Catch:{ all -> 0x029c }
        r4 = "Couldn't load VM class";
        r2.<init>(r4, r0);	 Catch:{ all -> 0x029c }
        throw r2;	 Catch:{ all -> 0x029c }
    L_0x02a7:
        r0 = move-exception;
        r2 = new qcl;	 Catch:{ all -> 0x029c }
        r4 = "Exception in VM cache lookup";
        r2.<init>(r4, r0);	 Catch:{ all -> 0x029c }
        throw r2;	 Catch:{ all -> 0x029c }
    L_0x02b0:
        monitor-exit(r1);	 Catch:{ all -> 0x029c }
        throw r0;	 Catch:{ all -> 0x032f }
    L_0x02b2:
        r18 = r2;
        r0 = new qcg;	 Catch:{ all -> 0x02da }
        r1 = java.lang.String.valueOf(r10);	 Catch:{ all -> 0x02da }
        r2 = r1.length();	 Catch:{ all -> 0x02da }
        r2 = r2 + 31;
        r4 = new java.lang.StringBuilder;	 Catch:{ all -> 0x02da }
        r4.<init>(r2);	 Catch:{ all -> 0x02da }
        r2 = "Failed to make directores for ";
        r4.append(r2);	 Catch:{ all -> 0x02da }
        r4.append(r1);	 Catch:{ all -> 0x02da }
        r1 = ".";
        r4.append(r1);	 Catch:{ all -> 0x02da }
        r1 = r4.toString();	 Catch:{ all -> 0x02da }
        r0.<init>(r1);	 Catch:{ all -> 0x02da }
        throw r0;	 Catch:{ all -> 0x02da }
    L_0x02da:
        r0 = move-exception;
        goto L_0x02df;
    L_0x02dc:
        r0 = move-exception;
        r18 = r2;
    L_0x02df:
        r13.b();	 Catch:{ all -> 0x02e3 }
        throw r0;	 Catch:{ all -> 0x02e3 }
    L_0x02e3:
        r0 = move-exception;
        monitor-exit(r15);	 Catch:{ all -> 0x02e3 }
        throw r0;	 Catch:{ all -> 0x02e6 }
    L_0x02e6:
        r0 = move-exception;
        goto L_0x02f0;
    L_0x02e8:
        r0 = move-exception;
        r18 = r2;
        goto L_0x02f0;
    L_0x02ec:
        r0 = move-exception;
        r18 = r2;
        r9 = r15;
    L_0x02f0:
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x02f2 }
    L_0x02f2:
        r0 = move-exception;
        r2 = r0;
        if (r9 != 0) goto L_0x02f7;
    L_0x02f6:
        goto L_0x02fa;
    L_0x02f7:
        defpackage.qco.a(r1, r9);	 Catch:{ all -> 0x02fb }
    L_0x02fa:
        throw r2;	 Catch:{ all -> 0x02fb }
    L_0x02fb:
        r0 = move-exception;
        goto L_0x0300;
    L_0x02fd:
        r0 = move-exception;
        r18 = r2;
    L_0x0300:
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x0302 }
    L_0x0302:
        r0 = move-exception;
        r2 = r0;
        if (r11 == 0) goto L_0x0309;
    L_0x0306:
        defpackage.qco.a(r1, r11);	 Catch:{ all -> 0x030a }
    L_0x0309:
        throw r2;	 Catch:{ all -> 0x030a }
    L_0x030a:
        r0 = move-exception;
        goto L_0x030f;
    L_0x030c:
        r0 = move-exception;
        r18 = r2;
    L_0x030f:
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x0311 }
    L_0x0311:
        r0 = move-exception;
        r2 = r0;
        defpackage.qco.a(r1, r8);	 Catch:{ Exception -> 0x0317 }
        throw r2;	 Catch:{ Exception -> 0x0317 }
    L_0x0317:
        r0 = move-exception;
        goto L_0x0320;
    L_0x0319:
        r0 = move-exception;
        r18 = r2;
        goto L_0x0329;
    L_0x031d:
        r0 = move-exception;
        r18 = r2;
    L_0x0320:
        r1 = new qcq;	 Catch:{ all -> 0x0328 }
        r2 = "VM couldn't be stored";
        r1.<init>(r2, r0);	 Catch:{ all -> 0x0328 }
        throw r1;	 Catch:{ all -> 0x0328 }
    L_0x0328:
        r0 = move-exception;
    L_0x0329:
        r12.delete();	 Catch:{ all -> 0x032f }
        throw r0;	 Catch:{ all -> 0x032f }
    L_0x032d:
        monitor-exit(r8);	 Catch:{ all -> 0x0331 }
        throw r0;	 Catch:{ all -> 0x032f }
    L_0x032f:
        r0 = move-exception;
        goto L_0x0336;
    L_0x0331:
        r0 = move-exception;
        goto L_0x032d;
    L_0x0333:
        r0 = move-exception;
        r18 = r2;
    L_0x0336:
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x0338 }
    L_0x0338:
        r0 = move-exception;
        r2 = r0;
        defpackage.qck.a(r1, r6);	 Catch:{ all -> 0x033e }
        throw r2;	 Catch:{ all -> 0x033e }
    L_0x033e:
        r0 = move-exception;
        goto L_0x0343;
    L_0x0340:
        r0 = move-exception;
        r18 = r2;
    L_0x0343:
        r1 = r0;
        throw r1;	 Catch:{ all -> 0x0345 }
    L_0x0345:
        r0 = move-exception;
        r2 = r0;
        if (r3 == 0) goto L_0x034c;
    L_0x0349:
        defpackage.qck.a(r1, r3);	 Catch:{ Exception -> 0x0374 }
    L_0x034c:
        throw r2;	 Catch:{ Exception -> 0x0374 }
    L_0x034d:
        r18 = r2;
        r0 = new qcl;	 Catch:{ Exception -> 0x0374 }
        r1 = "Missing key";
        r0.<init>(r1);	 Catch:{ Exception -> 0x0374 }
        throw r0;	 Catch:{ Exception -> 0x0374 }
    L_0x0357:
        r0 = move-exception;
        r4 = r25;
        goto L_0x037c;
    L_0x035b:
        r0 = new qqe;	 Catch:{ Exception -> 0x0374 }
        r1 = r18;
        r2 = r1.d;	 Catch:{ Exception -> 0x0370 }
        r2 = r2.a();	 Catch:{ Exception -> 0x0370 }
        r2 = (long) r2;
        r4 = r25;
        r5 = r17;
        r0.<init>(r4, r5, r2);	 Catch:{ Exception -> 0x036e }
        goto L_0x039d;
    L_0x036e:
        r0 = move-exception;
        goto L_0x037d;
    L_0x0370:
        r0 = move-exception;
        r4 = r25;
        goto L_0x037d;
    L_0x0374:
        r0 = move-exception;
        r4 = r25;
        r1 = r18;
        goto L_0x037d;
    L_0x037a:
        r0 = move-exception;
        r4 = r1;
    L_0x037c:
        r1 = r2;
    L_0x037d:
        r2 = new qqe;
        r0 = r0.toString();
        r0 = java.lang.String.valueOf(r0);
        r3 = "Initialization failed: ";
        r5 = r0.length();
        if (r5 != 0) goto L_0x0395;
    L_0x038f:
        r0 = new java.lang.String;
        r0.<init>(r3);
        goto L_0x0399;
    L_0x0395:
        r0 = r3.concat(r0);
    L_0x0399:
        r2.<init>(r4, r0);
        r0 = r2;
    L_0x039d:
        r1.c(r0);
        r1 = r4;
        goto L_0x0002;
    L_0x03a3:
        r4 = r1;
        r25.a();
        return;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qqb.b():void");
    }

    private final void a(String str) {
        while (true) {
            qqa qqa = (qqa) this.c.poll();
            if (qqa != null) {
                qqa.c(new qqe(this, str));
            } else {
                return;
            }
        }
    }

    public final void a() {
        if (this.c.isEmpty() && this.a == 0 && this.d.i()) {
            this.d.e();
        }
    }
}
