package defpackage;

import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: qsu */
public class qsu extends qss {
    private static final Object a = new Object();
    private static boolean t = false;
    private static long u = 0;
    public boolean s = false;
    private final String v;

    public static synchronized void a(Context context, boolean z) {
        synchronized (qsu.class) {
            if (!t) {
                u = System.currentTimeMillis() / 1000;
                b = qsu.b(context, z);
                t = true;
            }
        }
    }

    protected qsu(Context context, String str, boolean z) {
        super(context);
        this.v = str;
        this.s = z;
    }

    protected qsu(Context context, String str) {
        super(context);
        this.v = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0062 A:{Catch:{ qtl -> 0x0191 }} */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x017d A:{SYNTHETIC, Splitter:B:82:0x017d} */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x008f A:{Catch:{ IllegalArgumentException -> 0x0183, qtj -> 0x018a }} */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0059 */
    /* JADX WARNING: Removed duplicated region for block: B:96:0x0195  */
    /* JADX WARNING: Missing exception handler attribute for start block: B:93:0x0191 */
    /* JADX WARNING: Can't wrap try/catch for region: R(21:7|8|9|10|(1:12)|13|14|15|(1:17)(1:18)|19|(1:21)(1:22)|23|24|25|(2:27|(1:29)(2:30|31))|32|33|34|35|36|(22:38|(2:40|41)|42|43|44|45|(2:47|(1:49)(2:50|51))|52|(1:54)|55|56|57|58|59|60|61|(1:63)|64|93|94|(3:96|(1:98)|99)|100)(3:82|83|84)) */
    /* JADX WARNING: Can't wrap try/catch for region: R(22:38|(2:40|41)|42|43|44|45|(2:47|(1:49)(2:50|51))|52|(1:54)|55|56|57|58|59|60|61|(1:63)|64|93|94|(3:96|(1:98)|99)|100) */
    private static defpackage.qui b(android.content.Context r11, boolean r12) {
        /*
        r0 = b;
        if (r0 != 0) goto L_0x02de;
    L_0x0004:
        r0 = a;
        monitor-enter(r0);
        r1 = b;	 Catch:{ all -> 0x02db }
        if (r1 != 0) goto L_0x02d9;
    L_0x000b:
        r1 = "CQRnD71BfRRiXVONMYVwZebg9xeCbdUoDiZazkj3XdU=";
        r2 = "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";
        r3 = new qui;	 Catch:{ all -> 0x02db }
        r3.<init>(r11);	 Catch:{ all -> 0x02db }
        r11 = 2;
        r4 = 1;
        r5 = 0;
        r6 = new qum;	 Catch:{ qtl -> 0x0191 }
        r6.<init>();	 Catch:{ qtl -> 0x0191 }
        r6 = java.util.concurrent.Executors.newCachedThreadPool(r6);	 Catch:{ qtl -> 0x0191 }
        r3.b = r6;	 Catch:{ qtl -> 0x0191 }
        r3.g = r12;	 Catch:{ qtl -> 0x0191 }
        if (r12 == 0) goto L_0x0033;
    L_0x0026:
        r12 = r3.b;	 Catch:{ qtl -> 0x0191 }
        r6 = new qul;	 Catch:{ qtl -> 0x0191 }
        r6.<init>(r3);	 Catch:{ qtl -> 0x0191 }
        r12 = r12.submit(r6);	 Catch:{ qtl -> 0x0191 }
        r3.h = r12;	 Catch:{ qtl -> 0x0191 }
    L_0x0033:
        r12 = r3.b;	 Catch:{ qtl -> 0x0191 }
        r6 = new qun;	 Catch:{ qtl -> 0x0191 }
        r6.<init>(r3);	 Catch:{ qtl -> 0x0191 }
        r12.execute(r6);	 Catch:{ qtl -> 0x0191 }
        r12 = defpackage.psh.d;	 Catch:{ all -> 0x0059 }
        r6 = r3.a;	 Catch:{ all -> 0x0059 }
        r6 = r12.a(r6);	 Catch:{ all -> 0x0059 }
        if (r6 <= 0) goto L_0x0049;
    L_0x0047:
        r6 = 1;
        goto L_0x004a;
    L_0x0049:
        r6 = 0;
    L_0x004a:
        r3.m = r6;	 Catch:{ all -> 0x0059 }
        r6 = r3.a;	 Catch:{ all -> 0x0059 }
        r12 = r12.c(r6);	 Catch:{ all -> 0x0059 }
        if (r12 != 0) goto L_0x0056;
    L_0x0054:
        r12 = 1;
        goto L_0x0057;
    L_0x0056:
        r12 = 0;
    L_0x0057:
        r3.n = r12;	 Catch:{ all -> 0x0059 }
    L_0x0059:
        r3.a(r5, r4);	 Catch:{ qtl -> 0x0191 }
        r12 = defpackage.qyb.a();	 Catch:{ qtl -> 0x0191 }
        if (r12 == 0) goto L_0x007d;
    L_0x0062:
        r12 = defpackage.roe.m;	 Catch:{ qtl -> 0x0191 }
        r6 = defpackage.rlj.d();	 Catch:{ qtl -> 0x0191 }
        r12 = r6.a(r12);	 Catch:{ qtl -> 0x0191 }
        r12 = (java.lang.Boolean) r12;	 Catch:{ qtl -> 0x0191 }
        r12 = r12.booleanValue();	 Catch:{ qtl -> 0x0191 }
        if (r12 != 0) goto L_0x0075;
    L_0x0074:
        goto L_0x007d;
    L_0x0075:
        r12 = new java.lang.IllegalStateException;	 Catch:{ qtl -> 0x0191 }
        r1 = "Task Context initialization must not be called from the UI thread.";
        r12.<init>(r1);	 Catch:{ qtl -> 0x0191 }
        throw r12;	 Catch:{ qtl -> 0x0191 }
    L_0x007d:
        r12 = new qtk;	 Catch:{ qtl -> 0x0191 }
        r12.<init>();	 Catch:{ qtl -> 0x0191 }
        r3.d = r12;	 Catch:{ qtl -> 0x0191 }
        r12 = r3.d;	 Catch:{ qtj -> 0x018a }
        r12 = defpackage.qri.a(r1, r5);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = r12.length;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r6 = 32;
        if (r1 != r6) goto L_0x017d;
    L_0x008f:
        r1 = 4;
        r6 = 16;
        r12 = java.nio.ByteBuffer.wrap(r12, r1, r6);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1 = new byte[r6];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r12.get(r1);	 Catch:{ IllegalArgumentException -> 0x0183 }
        r12 = 0;
    L_0x009c:
        if (r12 >= r6) goto L_0x00a8;
    L_0x009e:
        r7 = r1[r12];	 Catch:{ IllegalArgumentException -> 0x0183 }
        r7 = r7 ^ 68;
        r7 = (byte) r7;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r1[r12] = r7;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r12 = r12 + 1;
        goto L_0x009c;
    L_0x00a8:
        r3.e = r1;	 Catch:{ qtj -> 0x018a }
        r12 = r3.a;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r12 = r12.getCacheDir();	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        if (r12 != 0) goto L_0x00c3;
    L_0x00b2:
        r12 = r3.a;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r1 = "dex";
        r12 = r12.getDir(r1, r5);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        if (r12 == 0) goto L_0x00bd;
    L_0x00bc:
        goto L_0x00c3;
    L_0x00bd:
        r12 = new qtl;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r12.<init>();	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        throw r12;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
    L_0x00c3:
        r1 = "1526594665595";
        r6 = new java.io.File;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7 = "%s/%s.jar";
        r8 = new java.lang.Object[r11];	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r8[r5] = r12;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r8[r4] = r1;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7 = java.lang.String.format(r7, r8);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r6.<init>(r7);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7 = r6.exists();	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        if (r7 != 0) goto L_0x00f3;
    L_0x00dc:
        r7 = r3.d;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7 = r3.e;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r2 = defpackage.qtk.a(r7, r2);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r6.createNewFile();	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7 = new java.io.FileOutputStream;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7.<init>(r6);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r8 = r2.length;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7.write(r2, r5, r8);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7.close();	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
    L_0x00f3:
        r3.b(r12, r1);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r2 = new dalvik.system.DexClassLoader;	 Catch:{ all -> 0x014a }
        r7 = r6.getAbsolutePath();	 Catch:{ all -> 0x014a }
        r8 = r12.getAbsolutePath();	 Catch:{ all -> 0x014a }
        r9 = r3.a;	 Catch:{ all -> 0x014a }
        r9 = r9.getClassLoader();	 Catch:{ all -> 0x014a }
        r10 = 0;
        r2.<init>(r7, r8, r10, r9);	 Catch:{ all -> 0x014a }
        r3.c = r2;	 Catch:{ all -> 0x014a }
        defpackage.qui.a(r6);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r3.a(r12, r1);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r2 = "%s/%s.dex";
        r6 = new java.lang.Object[r11];	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r6[r5] = r12;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r6[r4] = r1;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r12 = java.lang.String.format(r2, r6);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        defpackage.qui.a(r12);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r12 = r3.q;	 Catch:{ qtl -> 0x0191 }
        if (r12 != 0) goto L_0x0140;
    L_0x0125:
        r12 = new android.content.IntentFilter;	 Catch:{ qtl -> 0x0191 }
        r12.<init>();	 Catch:{ qtl -> 0x0191 }
        r1 = "android.intent.action.USER_PRESENT";
        r12.addAction(r1);	 Catch:{ qtl -> 0x0191 }
        r1 = "android.intent.action.SCREEN_OFF";
        r12.addAction(r1);	 Catch:{ qtl -> 0x0191 }
        r1 = r3.a;	 Catch:{ qtl -> 0x0191 }
        r2 = new quh;	 Catch:{ qtl -> 0x0191 }
        r2.<init>(r3);	 Catch:{ qtl -> 0x0191 }
        r1.registerReceiver(r2, r12);	 Catch:{ qtl -> 0x0191 }
        r3.q = r4;	 Catch:{ qtl -> 0x0191 }
    L_0x0140:
        r12 = new qsn;	 Catch:{ qtl -> 0x0191 }
        r12.<init>(r3);	 Catch:{ qtl -> 0x0191 }
        r3.l = r12;	 Catch:{ qtl -> 0x0191 }
        r3.o = r4;	 Catch:{ qtl -> 0x0191 }
        goto L_0x0191;
    L_0x014a:
        r2 = move-exception;
        defpackage.qui.a(r6);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r3.a(r12, r1);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r6 = "%s/%s.dex";
        r7 = new java.lang.Object[r11];	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7[r5] = r12;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r7[r4] = r1;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        r12 = java.lang.String.format(r6, r7);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        defpackage.qui.a(r12);	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
        throw r2;	 Catch:{ FileNotFoundException -> 0x0176, IOException -> 0x016f, qtj -> 0x0168, NullPointerException -> 0x0161 }
    L_0x0161:
        r12 = move-exception;
        r1 = new qtl;	 Catch:{ qtl -> 0x0191 }
        r1.<init>(r12);	 Catch:{ qtl -> 0x0191 }
        throw r1;	 Catch:{ qtl -> 0x0191 }
    L_0x0168:
        r12 = move-exception;
        r1 = new qtl;	 Catch:{ qtl -> 0x0191 }
        r1.<init>(r12);	 Catch:{ qtl -> 0x0191 }
        throw r1;	 Catch:{ qtl -> 0x0191 }
    L_0x016f:
        r12 = move-exception;
        r1 = new qtl;	 Catch:{ qtl -> 0x0191 }
        r1.<init>(r12);	 Catch:{ qtl -> 0x0191 }
        throw r1;	 Catch:{ qtl -> 0x0191 }
    L_0x0176:
        r12 = move-exception;
        r1 = new qtl;	 Catch:{ qtl -> 0x0191 }
        r1.<init>(r12);	 Catch:{ qtl -> 0x0191 }
        throw r1;	 Catch:{ qtl -> 0x0191 }
    L_0x017d:
        r12 = new qtj;	 Catch:{ IllegalArgumentException -> 0x0183 }
        r12.<init>();	 Catch:{ IllegalArgumentException -> 0x0183 }
        throw r12;	 Catch:{ IllegalArgumentException -> 0x0183 }
    L_0x0183:
        r12 = move-exception;
        r1 = new qtj;	 Catch:{ qtj -> 0x018a }
        r1.<init>(r12);	 Catch:{ qtj -> 0x018a }
        throw r1;	 Catch:{ qtj -> 0x018a }
    L_0x018a:
        r12 = move-exception;
        r1 = new qtl;	 Catch:{ qtl -> 0x0191 }
        r1.<init>(r12);	 Catch:{ qtl -> 0x0191 }
        throw r1;	 Catch:{ qtl -> 0x0191 }
    L_0x0191:
        r12 = r3.o;	 Catch:{ all -> 0x02db }
        if (r12 == 0) goto L_0x02d7;
    L_0x0195:
        r12 = defpackage.roe.j;	 Catch:{ all -> 0x02db }
        r1 = defpackage.rlj.d();	 Catch:{ all -> 0x02db }
        r12 = r1.a(r12);	 Catch:{ all -> 0x02db }
        r12 = (java.lang.Boolean) r12;	 Catch:{ all -> 0x02db }
        r12 = r12.booleanValue();	 Catch:{ all -> 0x02db }
        if (r12 == 0) goto L_0x01b0;
    L_0x01a7:
        r12 = "9HLYIA0MTQ+kt02LQhTJe6EsimGIeu/yQK1cr4EFCom5qsu0wtmZFzCQFxlveGI0";
        r1 = "Ge34DDT1G72DhC7p+2goHXZfFkX2J6BDC/aHGKBx82s=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
    L_0x01b0:
        r12 = "l9ngAoug++lwJa6/HPwzMXGSwMruOOnY/2d16zLXikST+QC8N56qn9rVBD9+3HYT";
        r1 = "J6ni0I45qHkdjFv0IWyYulPFtOX9+fEerwGdTgmifnQ=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "xv5n13JQWpaXdOaD45lDDITJWEgWYbyJC+hpHvF3HbnvR9NbHuTB72+E2pYHjmLa";
        r1 = "nsADJpGWTlVqhWJutg/2ZBOjkyp8kqzu+gugOGnA2Zs=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "HplK2/sMIye7zmECBYCGu/fzABwsT+LvBoHV7qKDXLNWp7YpLnq9sVJxFTMnW8Jj";
        r1 = "YN8//QqazW1MVzeIksD7x0uugUaNfBUoeBTmkijjkdA=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "/ouzUOrTlcQHh+qZu9XH7xnsogZ1ORyGzZSW3tWlRTXJVnkEpYODhgrV8dYaxdcz";
        r1 = "Zzu5xWDyE5lfZ16nAcbwOhYFENBwYtckcxUzlVlJYdo=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "FrXSMq94wGZt01ZrdMiC8e2RdFX89Qy+QVVSoIdKzQvPcR2Zp4LgbxDAazHDYDSD";
        r1 = "md63IKUUr38RJbsv3JzrAEMp8TZBG0lyhdDNEiRojY0=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "US1C+O7tnR00nV+LnJzn08iV2qTs9b7o6Sq01SSxr9MMT7J75oiieeR/ERbD/woX";
        r1 = "FZitV82AtV1rlSYmJPoF1YBDZydmY3q0KVuq5VkpSos=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "yvp57p5w6esNdE5KMO05heD7YhtOza1Vl3wfhX4boIg2TgzgwA1+GiCLBh41JcYc";
        r1 = "2uAADpHQ3tZxf0bo0CURxQFhgy4xXGBGL4Y7MKzo0qU=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "olHAITlPdMSYIjnQnULkrqnQloCv5LRjlEINlllYN/W5E5W1M07yaa28siPRETai";
        r1 = "d/rmvCMfMr06OarodrStTAbB6E4PaolM+u7nKxo/exQ=";
        r2 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r6 = android.content.Context.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "PS3Sj8e+QqguesyEFAU/pisdVwDHs850xhpKlxC6mnKeQ/qKCDtix2YBNswBxTzd";
        r1 = "83uwIY6lf0v/NtX+tmU1zQ4Na69HrUgjEJd2is9MpWs=";
        r2 = new java.lang.Class[r11];	 Catch:{ all -> 0x02db }
        r6 = android.view.MotionEvent.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r6 = android.util.DisplayMetrics.class;
        r2[r4] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "V3vBUR2tAjd3NnvlcI4dWKZmWkUglMoVIGvYJevOvDJbDefVfnhlEFSQVOgjZ5Qy";
        r1 = "6bEhz6jOFzJ0TXlXIH7afo3rP6hk7QYtJ28G3iSqa7s=";
        r2 = new java.lang.Class[r11];	 Catch:{ all -> 0x02db }
        r6 = android.view.MotionEvent.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r6 = android.util.DisplayMetrics.class;
        r2[r4] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "oFCcg5Wmd1f0HGf53t8ygoprVRQi9bojrW+EQ/ojGuyZpcPx5gT7jZWY0u0QMFAa";
        r1 = "IEsALl0VaFrx7EUDb+VSwzAQfi9r2QKnOpud9+AtqDk=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "a4RRBJUyyHMkcFnuDD/V0Ic9XvjFkeHLjdzeqWnqDq1AhNfi2Lg9RhArz3BS4i+I";
        r1 = "/2PH9v3fT2WK4f/OeZhZNxQkiI8fF9/fR65mlZGCxRI=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "3FGFsPm7JNkUyYfMcgiCld+iHb+jSeFEx+e7amPHHkZX9blS1PeuMq8PnWFB5Ggk";
        r1 = "42//IacRvaQBVQSrzm3oULPtkCebADb0gFefTVTT0Hg=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "DY9EKkTTtDtT2W1NTBMTDnhHxEWj9s7qEx8tcpQ1M91Fu3kJ+7AZI0r81Yav6hO7";
        r1 = "1tciBRxujBCbgldHHCTxRdXhdvkiocC5gy1aVAqqdjY=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "sGfIqgAqTAcbXzmixt1JBNRg2/IQhu0ryuiVeZ2zqYszE6/p4zdNAcftuDjMUHF/";
        r1 = "xLbOtoCo/2BzfZSmgv5FpWcoEnsf4Sqtc1jNIzG76Gw=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "70M9S9dDYFp9qCapCmmQeZzE3sAH3MkfOjf9F/2zrXdzO3+QblhAY1/TvajOb4iY";
        r1 = "zMPJk/v6nghlvK6KJiGjVUArcbTvg8z9rIgcJ0hhE30=";
        r2 = new java.lang.Class[r5];	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r12 = "TaZAxau6gK2y1z/i9T4RbBa4+g2uL0wzo4YoUe07d90ipTS0dV8nBVWBRB6XeWoZ";
        r1 = "kfivNHCNyDbX6RAw0O+Jn+Q/DEl865mugDZIITSLE4M=";
        r2 = 3;
        r6 = new java.lang.Class[r2];	 Catch:{ all -> 0x02db }
        r7 = android.content.Context.class;
        r6[r5] = r7;	 Catch:{ all -> 0x02db }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x02db }
        r6[r4] = r7;	 Catch:{ all -> 0x02db }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x02db }
        r6[r11] = r7;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r6);	 Catch:{ all -> 0x02db }
        r12 = "+nghGA8JGNBqlJOxtlB3jp9d8/EDJf/A5rtUXqdM18V4XVPKfcTmHQFmPEcimOK2";
        r1 = "+TZzl/dMR9035PqzQwYdup9se0eu6G3KkAFAKJFu4eQ=";
        r6 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r7 = java.lang.StackTraceElement[].class;
        r6[r5] = r7;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r6);	 Catch:{ all -> 0x02db }
        r12 = "5CwvblpRepdsUL0meYsNAZDFftsGX7l4Q7vd8XrvEdGm+/KDHdPxSkwr9UPy44Cu";
        r1 = "Uctw36731wKeYv6Q52c4H2pmLY86zSpjei9HgUKCfEQ=";
        r6 = new java.lang.Class[r11];	 Catch:{ all -> 0x02db }
        r7 = android.view.View.class;
        r6[r5] = r7;	 Catch:{ all -> 0x02db }
        r7 = android.util.DisplayMetrics.class;
        r6[r4] = r7;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r6);	 Catch:{ all -> 0x02db }
        r12 = "w6qnYxsu55bXhzABxKoXlVUSZXMHEDGzYmZSXdbCAHopmg4TFLMf4rmicaId+76p";
        r1 = "exASjVpg+fmtkq6CQdswR4rndBudO44DJonGTFNGoyA=";
        r6 = new java.lang.Class[r11];	 Catch:{ all -> 0x02db }
        r7 = android.content.Context.class;
        r6[r5] = r7;	 Catch:{ all -> 0x02db }
        r7 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x02db }
        r6[r4] = r7;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r6);	 Catch:{ all -> 0x02db }
        r12 = "YuVZMUeqWPzlcKtLvZwkWkpbPKMcVMY7eFu0rx0eoZ4ySh0tQdhr8N5j/RJgIFyi";
        r1 = "sYu41MHcDIX3Vf3JdwxKhE1ZKp39+ciEjz5fr+li3jA=";
        r2 = new java.lang.Class[r2];	 Catch:{ all -> 0x02db }
        r6 = android.view.View.class;
        r2[r5] = r6;	 Catch:{ all -> 0x02db }
        r6 = android.app.Activity.class;
        r2[r4] = r6;	 Catch:{ all -> 0x02db }
        r6 = java.lang.Boolean.TYPE;	 Catch:{ all -> 0x02db }
        r2[r11] = r6;	 Catch:{ all -> 0x02db }
        r3.a(r12, r1, r2);	 Catch:{ all -> 0x02db }
        r11 = "u5d8y4ZZRp9wv2SNHpyk5mD7z6xwqJagXme/uxkSRmzVbDOkhrnPzZUKhpjGZnKO";
        r12 = "FIHX+8QRI2YV4JD53N65Rqwyumv0fOEqmHbmlPZPaw8=";
        r1 = new java.lang.Class[r4];	 Catch:{ all -> 0x02db }
        r2 = java.lang.Long.TYPE;	 Catch:{ all -> 0x02db }
        r1[r5] = r2;	 Catch:{ all -> 0x02db }
        r3.a(r11, r12, r1);	 Catch:{ all -> 0x02db }
    L_0x02d7:
        b = r3;	 Catch:{ all -> 0x02db }
    L_0x02d9:
        monitor-exit(r0);	 Catch:{ all -> 0x02db }
        goto L_0x02de;
    L_0x02db:
        r11 = move-exception;
        monitor-exit(r0);	 Catch:{ all -> 0x02db }
        throw r11;
    L_0x02de:
        r11 = b;
        return r11;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qsu.b(android.content.Context, boolean):qui");
    }

    private static qwq a(qui qui, MotionEvent motionEvent, DisplayMetrics displayMetrics) {
        Method a = qui.a("PS3Sj8e+QqguesyEFAU/pisdVwDHs850xhpKlxC6mnKeQ/qKCDtix2YBNswBxTzd", "83uwIY6lf0v/NtX+tmU1zQ4Na69HrUgjEJd2is9MpWs=");
        if (a == null || motionEvent == null) {
            throw new qtl();
        }
        try {
            return new qwq((String) a.invoke(null, new Object[]{motionEvent, displayMetrics}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new qtl(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final qpa a(Context context, qoh qoh) {
        qpa qpa = new qpa();
        if (!TextUtils.isEmpty(this.v)) {
            qpa.b = this.v;
        }
        a(qsu.b(context, this.s), context, qpa, qoh);
        if (!(qoh == null || qoh.b == null)) {
            if (((Boolean) rlj.d().a(roe.h)).booleanValue() && !qyb.b(qoh.b.b)) {
                qpq qpq = new qpq();
                qpq.a = qoh.b.b;
                qpa.P = qpq;
            }
        }
        return qpa;
    }

    /* Access modifiers changed, original: protected */
    public qpa b(Context context) {
        List list;
        qpa qpa = new qpa();
        if (!TextUtils.isEmpty(this.v)) {
            qpa.b = this.v;
        }
        qui b = qsu.b(context, this.s);
        int i = 0;
        int i2 = 1;
        if (b.o) {
            try {
                qwq a = qsu.a(b, this.c, this.r);
                qpa.g = a.a;
                qpa.h = a.b;
                qpa.i = a.c;
                if (this.q) {
                    qpa.u = a.d;
                    qpa.v = a.e;
                }
            } catch (qtl unused) {
            }
            qpk qpk = new qpk();
            if (this.e > 0 && qyb.a(this.r)) {
                qpk.n = Long.valueOf(qyb.a(this.l, this.r));
                qpk.o = Long.valueOf(qyb.a((double) (this.o - this.m), this.r));
                qpk.p = Long.valueOf(qyb.a((double) (this.p - this.n), this.r));
                qpk.s = Long.valueOf(qyb.a((double) this.m, this.r));
                qpk.t = Long.valueOf(qyb.a((double) this.n, this.r));
                if (this.q) {
                    MotionEvent motionEvent = this.c;
                    if (motionEvent != null) {
                        long a2 = qyb.a((double) (((this.m - this.o) + motionEvent.getRawX()) - this.c.getX()), this.r);
                        if (a2 != 0) {
                            qpk.q = Long.valueOf(a2);
                        }
                        a2 = qyb.a((double) (((this.n - this.p) + this.c.getRawY()) - this.c.getY()), this.r);
                        if (a2 != 0) {
                            qpk.r = Long.valueOf(a2);
                        }
                    }
                }
            }
            try {
                qwq b2 = b(this.c);
                qpk.b = b2.a;
                qpk.c = b2.b;
                qpk.i = b2.c;
                if (this.q) {
                    qpk.d = b2.e;
                    qpk.f = b2.d;
                    qpk.h = Integer.valueOf(b2.f.longValue() != 0 ? 1 : 0);
                    if (this.f > 0) {
                        double d;
                        double d2;
                        Long valueOf;
                        if (qyb.a(this.r)) {
                            d = (double) this.k;
                            d2 = (double) this.f;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            valueOf = Long.valueOf(Math.round(d / d2));
                        } else {
                            valueOf = null;
                        }
                        qpk.e = valueOf;
                        d = (double) this.j;
                        d2 = (double) this.f;
                        Double.isNaN(d);
                        Double.isNaN(d2);
                        qpk.g = Long.valueOf(Math.round(d / d2));
                    }
                    qpk.k = b2.i;
                    qpk.j = b2.j;
                    if (b2.k.longValue() == 0) {
                        i2 = 0;
                    }
                    qpk.l = Integer.valueOf(i2);
                }
            } catch (qtl unused2) {
            }
            long j = this.i;
            if (j > 0) {
                qpk.m = Long.valueOf(j);
            }
            qpa.K = qpk;
            j = this.e;
            if (j > 0) {
                qpa.y = Long.valueOf(j);
            }
            j = this.f;
            if (j > 0) {
                qpa.x = Long.valueOf(j);
            }
            j = this.g;
            if (j > 0) {
                qpa.w = Long.valueOf(j);
            }
            j = this.h;
            if (j > 0) {
                qpa.z = Long.valueOf(j);
            }
            try {
                int size = this.d.size() - 1;
                if (size > 0) {
                    qpa.L = new qpk[size];
                    while (i < size) {
                        qwq a3 = qsu.a(b, (MotionEvent) this.d.get(i), this.r);
                        qpk qpk2 = new qpk();
                        qpk2.b = a3.a;
                        qpk2.c = a3.b;
                        qpa.L[i] = qpk2;
                        i++;
                    }
                }
            } catch (qtl unused3) {
                qpa.L = null;
            }
            ArrayList arrayList = new ArrayList();
            if (b.b != null) {
                int b3 = b.b();
                arrayList.add(new rcg(b, qpa));
                qui qui = b;
                qpa qpa2 = qpa;
                arrayList.add(new rch(qui, "3FGFsPm7JNkUyYfMcgiCld+iHb+jSeFEx+e7amPHHkZX9blS1PeuMq8PnWFB5Ggk", "42//IacRvaQBVQSrzm3oULPtkCebADb0gFefTVTT0Hg=", qpa2, b3));
                arrayList.add(new rce(qui, "oFCcg5Wmd1f0HGf53t8ygoprVRQi9bojrW+EQ/ojGuyZpcPx5gT7jZWY0u0QMFAa", "IEsALl0VaFrx7EUDb+VSwzAQfi9r2QKnOpud9+AtqDk=", qpa2, u, b3));
                int i3 = b3;
                arrayList.add(new rcb(qui, "DY9EKkTTtDtT2W1NTBMTDnhHxEWj9s7qEx8tcpQ1M91Fu3kJ+7AZI0r81Yav6hO7", "1tciBRxujBCbgldHHCTxRdXhdvkiocC5gy1aVAqqdjY=", qpa2, i3));
                arrayList.add(new rci(qui, "FrXSMq94wGZt01ZrdMiC8e2RdFX89Qy+QVVSoIdKzQvPcR2Zp4LgbxDAazHDYDSD", "md63IKUUr38RJbsv3JzrAEMp8TZBG0lyhdDNEiRojY0=", qpa2, i3));
                arrayList.add(new rck(qui, "US1C+O7tnR00nV+LnJzn08iV2qTs9b7o6Sq01SSxr9MMT7J75oiieeR/ERbD/woX", "FZitV82AtV1rlSYmJPoF1YBDZydmY3q0KVuq5VkpSos=", qpa2, i3));
                arrayList.add(new rcf(qui, "sGfIqgAqTAcbXzmixt1JBNRg2/IQhu0ryuiVeZ2zqYszE6/p4zdNAcftuDjMUHF/", "xLbOtoCo/2BzfZSmgv5FpWcoEnsf4Sqtc1jNIzG76Gw=", qpa2, i3));
                arrayList.add(new rcc(qui, "/ouzUOrTlcQHh+qZu9XH7xnsogZ1ORyGzZSW3tWlRTXJVnkEpYODhgrV8dYaxdcz", "Zzu5xWDyE5lfZ16nAcbwOhYFENBwYtckcxUzlVlJYdo=", qpa2, i3));
                arrayList.add(new rda(qui, "yvp57p5w6esNdE5KMO05heD7YhtOza1Vl3wfhX4boIg2TgzgwA1+GiCLBh41JcYc", "2uAADpHQ3tZxf0bo0CURxQFhgy4xXGBGL4Y7MKzo0qU=", qpa2, i3));
                arrayList.add(new rbx(qui, "olHAITlPdMSYIjnQnULkrqnQloCv5LRjlEINlllYN/W5E5W1M07yaa28siPRETai", "d/rmvCMfMr06OarodrStTAbB6E4PaolM+u7nKxo/exQ=", qpa2, i3));
                arrayList.add(new rcn(qui, "70M9S9dDYFp9qCapCmmQeZzE3sAH3MkfOjf9F/2zrXdzO3+QblhAY1/TvajOb4iY", "zMPJk/v6nghlvK6KJiGjVUArcbTvg8z9rIgcJ0hhE30=", qpa2, i3));
                arrayList.add(new rco(qui, "+nghGA8JGNBqlJOxtlB3jp9d8/EDJf/A5rtUXqdM18V4XVPKfcTmHQFmPEcimOK2", "+TZzl/dMR9035PqzQwYdup9se0eu6G3KkAFAKJFu4eQ=", qpa2, i3, new Throwable().getStackTrace()));
                arrayList.add(new ree(qui, "5CwvblpRepdsUL0meYsNAZDFftsGX7l4Q7vd8XrvEdGm+/KDHdPxSkwr9UPy44Cu", "Uctw36731wKeYv6Q52c4H2pmLY86zSpjei9HgUKCfEQ=", qpa2, i3));
                arrayList.add(new rcl(qui, "w6qnYxsu55bXhzABxKoXlVUSZXMHEDGzYmZSXdbCAHopmg4TFLMf4rmicaId+76p", "exASjVpg+fmtkq6CQdswR4rndBudO44DJonGTFNGoyA=", qpa2, i3));
                if (((Boolean) rlj.d().a(roe.f)).booleanValue()) {
                    arrayList.add(new rby(b, "YuVZMUeqWPzlcKtLvZwkWkpbPKMcVMY7eFu0rx0eoZ4ySh0tQdhr8N5j/RJgIFyi", "sYu41MHcDIX3Vf3JdwxKhE1ZKp39+ciEjz5fr+li3jA=", qpa, b3));
                }
                if (((Boolean) rlj.d().a(roe.g)).booleanValue()) {
                    arrayList.add(new rcp(b, "u5d8y4ZZRp9wv2SNHpyk5mD7z6xwqJagXme/uxkSRmzVbDOkhrnPzZUKhpjGZnKO", "FIHX+8QRI2YV4JD53N65Rqwyumv0fOEqmHbmlPZPaw8=", qpa, b3));
                }
            }
            list = arrayList;
        } else {
            qpa.k = Long.valueOf(16384);
            list = Arrays.asList(new Callable[]{new rcg(b, qpa)});
        }
        qsu.a(list);
        return qpa;
    }

    /* Access modifiers changed, original: protected */
    public List b(qui qui, Context context, qpa qpa, qoh qoh) {
        int b = qui.b();
        ArrayList arrayList = new ArrayList();
        if (qui.o) {
            qui qui2 = qui;
            qpa qpa2 = qpa;
            arrayList.add(new rbz(qui2, "TaZAxau6gK2y1z/i9T4RbBa4+g2uL0wzo4YoUe07d90ipTS0dV8nBVWBRB6XeWoZ", "kfivNHCNyDbX6RAw0O+Jn+Q/DEl865mugDZIITSLE4M=", qpa2, b, context, qoh));
            arrayList.add(new rce(qui2, "oFCcg5Wmd1f0HGf53t8ygoprVRQi9bojrW+EQ/ojGuyZpcPx5gT7jZWY0u0QMFAa", "IEsALl0VaFrx7EUDb+VSwzAQfi9r2QKnOpud9+AtqDk=", qpa2, u, b));
            int i = b;
            arrayList.add(new rch(qui2, "3FGFsPm7JNkUyYfMcgiCld+iHb+jSeFEx+e7amPHHkZX9blS1PeuMq8PnWFB5Ggk", "42//IacRvaQBVQSrzm3oULPtkCebADb0gFefTVTT0Hg=", qpa2, i));
            arrayList.add(new rcm(qui2, "HplK2/sMIye7zmECBYCGu/fzABwsT+LvBoHV7qKDXLNWp7YpLnq9sVJxFTMnW8Jj", "YN8//QqazW1MVzeIksD7x0uugUaNfBUoeBTmkijjkdA=", qpa2, i));
            arrayList.add(new rcs(qui2, "a4RRBJUyyHMkcFnuDD/V0Ic9XvjFkeHLjdzeqWnqDq1AhNfi2Lg9RhArz3BS4i+I", "/2PH9v3fT2WK4f/OeZhZNxQkiI8fF9/fR65mlZGCxRI=", qpa2, i));
            arrayList.add(new rca(qui2, "xv5n13JQWpaXdOaD45lDDITJWEgWYbyJC+hpHvF3HbnvR9NbHuTB72+E2pYHjmLa", "nsADJpGWTlVqhWJutg/2ZBOjkyp8kqzu+gugOGnA2Zs=", qpa2, i, context));
            arrayList.add(new rcc(qui2, "/ouzUOrTlcQHh+qZu9XH7xnsogZ1ORyGzZSW3tWlRTXJVnkEpYODhgrV8dYaxdcz", "Zzu5xWDyE5lfZ16nAcbwOhYFENBwYtckcxUzlVlJYdo=", qpa2, i));
            arrayList.add(new rci(qui2, "FrXSMq94wGZt01ZrdMiC8e2RdFX89Qy+QVVSoIdKzQvPcR2Zp4LgbxDAazHDYDSD", "md63IKUUr38RJbsv3JzrAEMp8TZBG0lyhdDNEiRojY0=", qpa2, i));
            arrayList.add(new rck(qui2, "US1C+O7tnR00nV+LnJzn08iV2qTs9b7o6Sq01SSxr9MMT7J75oiieeR/ERbD/woX", "FZitV82AtV1rlSYmJPoF1YBDZydmY3q0KVuq5VkpSos=", qpa2, i));
            arrayList.add(new rcb(qui2, "DY9EKkTTtDtT2W1NTBMTDnhHxEWj9s7qEx8tcpQ1M91Fu3kJ+7AZI0r81Yav6hO7", "1tciBRxujBCbgldHHCTxRdXhdvkiocC5gy1aVAqqdjY=", qpa2, i));
            arrayList.add(new rcf(qui2, "sGfIqgAqTAcbXzmixt1JBNRg2/IQhu0ryuiVeZ2zqYszE6/p4zdNAcftuDjMUHF/", "xLbOtoCo/2BzfZSmgv5FpWcoEnsf4Sqtc1jNIzG76Gw=", qpa2, i));
            arrayList.add(new rda(qui2, "yvp57p5w6esNdE5KMO05heD7YhtOza1Vl3wfhX4boIg2TgzgwA1+GiCLBh41JcYc", "2uAADpHQ3tZxf0bo0CURxQFhgy4xXGBGL4Y7MKzo0qU=", qpa2, i));
            arrayList.add(new rbx(qui2, "olHAITlPdMSYIjnQnULkrqnQloCv5LRjlEINlllYN/W5E5W1M07yaa28siPRETai", "d/rmvCMfMr06OarodrStTAbB6E4PaolM+u7nKxo/exQ=", qpa2, i));
            arrayList.add(new rcn(qui2, "70M9S9dDYFp9qCapCmmQeZzE3sAH3MkfOjf9F/2zrXdzO3+QblhAY1/TvajOb4iY", "zMPJk/v6nghlvK6KJiGjVUArcbTvg8z9rIgcJ0hhE30=", qpa2, i));
            arrayList.add(new rcl(qui2, "w6qnYxsu55bXhzABxKoXlVUSZXMHEDGzYmZSXdbCAHopmg4TFLMf4rmicaId+76p", "exASjVpg+fmtkq6CQdswR4rndBudO44DJonGTFNGoyA=", qpa2, i));
            return arrayList;
        }
        qpa.k = Long.valueOf(16384);
        return arrayList;
    }

    /* Access modifiers changed, original: protected */
    public void a(qui qui, Context context, qpa qpa, qoh qoh) {
        if (qui.b != null) {
            qsu.a(b(qui, context, qpa, qoh));
        }
    }

    protected static void a(List list) {
        if (b != null) {
            ExecutorService executorService = b.b;
            if (!(executorService == null || list.isEmpty())) {
                try {
                    executorService.invokeAll(list, ((Long) rlj.d().a(roe.e)).longValue(), TimeUnit.MILLISECONDS);
                } catch (InterruptedException e) {
                    String.format("class methods got exception: %s", new Object[]{qyb.a(e)});
                }
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final qwq b(MotionEvent motionEvent) {
        Method a = b.a("V3vBUR2tAjd3NnvlcI4dWKZmWkUglMoVIGvYJevOvDJbDefVfnhlEFSQVOgjZ5Qy", "6bEhz6jOFzJ0TXlXIH7afo3rP6hk7QYtJ28G3iSqa7s=");
        if (a == null || motionEvent == null) {
            throw new qtl();
        }
        try {
            return new qwq((String) a.invoke(null, new Object[]{motionEvent, this.r}));
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new qtl(e);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final long a(StackTraceElement[] stackTraceElementArr) {
        Method a = b.a("+nghGA8JGNBqlJOxtlB3jp9d8/EDJf/A5rtUXqdM18V4XVPKfcTmHQFmPEcimOK2", "+TZzl/dMR9035PqzQwYdup9se0eu6G3KkAFAKJFu4eQ=");
        if (a == null || stackTraceElementArr == null) {
            throw new qtl();
        }
        try {
            return new qto((String) a.invoke(null, new Object[]{stackTraceElementArr})).a.longValue();
        } catch (IllegalAccessException | InvocationTargetException e) {
            throw new qtl(e);
        }
    }

    static {
        qsu.class.getSimpleName();
    }
}
