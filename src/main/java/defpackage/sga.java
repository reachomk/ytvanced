package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* renamed from: sga */
public final class sga {
    public static final Integer a = Integer.valueOf(18);
    public static sir b;
    private static final List f = Arrays.asList(new String[]{"https://www.googleapis.com/auth/oauth_integrations"});
    private static final sga g = new sga();
    public final sjl c = new sjl();
    public List d;
    public String e;
    private bauk h;
    private barx i;
    private String j;
    private String k;
    private anth l;

    private sga() {
    }

    public static sga a() {
        if (b != null) {
            return g;
        }
        throw new IllegalStateException("No GDI dependencies set");
    }

    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Removed duplicated region for block: B:206:0x03c5 A:{Splitter:B:3:0x0013, ExcHandler: bawe (r0_17 'e' bawe)} */
    /* JADX WARNING: Removed duplicated region for block: B:204:0x03c1 A:{Splitter:B:3:0x0013, ExcHandler: IOException (r0_16 'e' java.lang.Throwable)} */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x03b5 A:{Splitter:B:10:0x003b, ExcHandler: IllegalArgumentException (r0_15 'e' java.lang.IllegalArgumentException)} */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing block: B:24:0x009d, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:28:?, code skipped:
            throw r0;
     */
    /* JADX WARNING: Missing block: B:113:0x0193, code skipped:
            if (android.text.TextUtils.isEmpty(r9.c) != false) goto L_0x0195;
     */
    /* JADX WARNING: Missing block: B:155:0x0333, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:156:0x0334, code skipped:
            r5 = r34;
            r6 = r35;
            r13 = r36;
     */
    /* JADX WARNING: Missing block: B:163:0x0355, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:164:0x0356, code skipped:
            r5 = r34;
            r6 = r35;
            r13 = r36;
            r2 = r0;
            r1 = r32;
     */
    /* JADX WARNING: Missing block: B:165:0x0360, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:166:0x0361, code skipped:
            r5 = r34;
            r6 = r35;
     */
    /* JADX WARNING: Missing block: B:167:0x0365, code skipped:
            r2 = r0;
            r1 = r12;
     */
    /* JADX WARNING: Missing block: B:168:0x0367, code skipped:
            r8 = 2;
     */
    /* JADX WARNING: Missing block: B:185:0x038f, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:186:0x0390, code skipped:
            r5 = r34;
            r6 = r35;
     */
    /* JADX WARNING: Missing block: B:187:0x0395, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:188:0x0396, code skipped:
            r5 = r34;
            r6 = r35;
            r13 = r36;
     */
    /* JADX WARNING: Missing block: B:189:0x039d, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:190:0x039e, code skipped:
            r5 = r34;
            r6 = r35;
            r13 = r36;
     */
    /* JADX WARNING: Missing block: B:193:0x03ab, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:194:0x03ad, code skipped:
            r0 = e;
     */
    /* JADX WARNING: Missing block: B:195:0x03ae, code skipped:
            r5 = r2;
            r6 = r4;
            r1 = r12;
     */
    /* JADX WARNING: Missing block: B:196:0x03b1, code skipped:
            r8 = 2;
     */
    /* JADX WARNING: Missing block: B:197:0x03b2, code skipped:
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:198:0x03b3, code skipped:
            r12 = r1;
     */
    /* JADX WARNING: Missing block: B:199:0x03b5, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:200:0x03b6, code skipped:
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:201:0x03b8, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:202:0x03b9, code skipped:
            r5 = r2;
            r6 = r4;
            r8 = 2;
            r12 = null;
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:203:0x03be, code skipped:
            r1 = r2;
     */
    /* JADX WARNING: Missing block: B:204:0x03c1, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:206:0x03c5, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:207:0x03c6, code skipped:
            r1 = r0;
     */
    /* JADX WARNING: Missing block: B:211:0x03db, code skipped:
            return new defpackage.sfq(3, r1.getMessage(), r1);
     */
    /* JADX WARNING: Missing block: B:212:0x03dc, code skipped:
            r0 = move-exception;
     */
    /* JADX WARNING: Missing block: B:213:0x03dd, code skipped:
            r5 = r2;
            r6 = r4;
            r8 = 2;
            r12 = null;
            r2 = r0;
     */
    /* JADX WARNING: Missing block: B:217:0x03ec, code skipped:
            r2 = new defpackage.sfe(r34.getPackageName(), r35, r38.a, r13.b, b.a());
            r2 = defpackage.antp.a(r13.e);
     */
    /* JADX WARNING: Missing block: B:218:0x040c, code skipped:
            if (r2 == null) goto L_0x040e;
     */
    /* JADX WARNING: Missing block: B:219:0x040e, code skipped:
            r2 = defpackage.antp.UNRECOGNIZED;
     */
    /* JADX WARNING: Missing block: B:221:0x0414, code skipped:
            switch(r2.ordinal()) {
                case 0: goto L_0x0426;
                case 1: goto L_0x0424;
                case 2: goto L_0x0422;
                case 3: goto L_0x0420;
                case 4: goto L_0x041e;
                case 5: goto L_0x041b;
                case 6: goto L_0x0418;
                default: goto L_0x0417;
            };
     */
    /* JADX WARNING: Missing block: B:222:0x0418, code skipped:
            r8 = 11;
     */
    /* JADX WARNING: Missing block: B:223:0x041b, code skipped:
            r8 = 13;
     */
    /* JADX WARNING: Missing block: B:224:0x041e, code skipped:
            r8 = 7;
     */
    /* JADX WARNING: Missing block: B:225:0x0420, code skipped:
            r8 = 5;
     */
    /* JADX WARNING: Missing block: B:226:0x0422, code skipped:
            r8 = 6;
     */
    /* JADX WARNING: Missing block: B:227:0x0424, code skipped:
            r8 = 4;
     */
    /* JADX WARNING: Missing block: B:228:0x0426, code skipped:
            r8 = 3;
     */
    /* JADX WARNING: Missing block: B:229:0x0427, code skipped:
            r2.a(defpackage.sfz.a(r8), defpackage.aodi.EVENT_MALFORMED_RESPONSE);
            r2 = java.lang.String.valueOf(r12);
            r4 = new java.lang.StringBuilder(r2.length() + 36);
            r4.append("Invalid GetTokenForServiceResponse: ");
            r4.append(r2);
            android.util.Log.w("GDIInternal", r4.toString(), r1);
     */
    /* JADX WARNING: Missing block: B:233:0x0463, code skipped:
            return new defpackage.sfq(102, r0);
     */
    /* JADX WARNING: Missing block: B:234:0x0464, code skipped:
            r2 = r1.a;
            r3 = r2.m.r;
     */
    /* JADX WARNING: Missing block: B:235:0x047a, code skipped:
            return new defpackage.sfq(r3, r2.n, new defpackage.sfs(r3, r1.getMessage()));
     */
    public final defpackage.sfq a(android.content.Context r34, java.lang.String r35, defpackage.ansx r36, java.lang.String[] r37, defpackage.sfi r38, boolean r39, java.util.List r40) {
        /*
        r33 = this;
        r1 = r33;
        r2 = r34;
        r4 = r35;
        r3 = r37;
        r5 = r38;
        r6 = r40;
        r10 = 1;
        r11 = 3;
        if (r39 != 0) goto L_0x0013;
    L_0x0010:
        r13 = r36;
        goto L_0x0048;
    L_0x0013:
        r13 = r36.toBuilder();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03dc, IllegalArgumentException -> 0x03b5 }
        r13 = (defpackage.anxo) r13;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13 = (defpackage.answ) r13;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13.copyOnWrite();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r14 = r13.instance;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r14 = (defpackage.ansx) r14;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r14.i = r10;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13.copyOnWrite();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r14 = r13.instance;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r14 = (defpackage.ansx) r14;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r15 = r14.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r15 = r15.a();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        if (r15 != 0) goto L_0x003b;
    L_0x0033:
        r15 = r14.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03dc, IllegalArgumentException -> 0x03b5 }
        r15 = defpackage.anxl.mutableCopy(r15);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03dc, IllegalArgumentException -> 0x03b5 }
        r14.j = r15;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03dc, IllegalArgumentException -> 0x03b5 }
    L_0x003b:
        r14 = r14.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        defpackage.anvf.addAll(r6, r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13 = r13.build();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13 = (defpackage.anxl) r13;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
        r13 = (defpackage.ansx) r13;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03c9, IllegalArgumentException -> 0x03b5 }
    L_0x0048:
        r14 = defpackage.sjl.a(r34);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r15 = r5.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r15 = r1.a(r2, r15, r4);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r12 = new defpackage.basb[r10];	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7 = new sjo;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7.<init>(r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r14 = 0;
        r12[r14] = r7;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7 = r15.a(r12);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7 = (defpackage.anth) r7;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r12 = r7.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r14 = defpackage.ante.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        if (r14 != 0) goto L_0x00a1;
    L_0x0068:
        r14 = defpackage.ante.class;
        monitor-enter(r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r15 = defpackage.ante.a;	 Catch:{ all -> 0x009d }
        if (r15 != 0) goto L_0x009a;
    L_0x006f:
        r15 = defpackage.bauw.a();	 Catch:{ all -> 0x009d }
        r8 = defpackage.baux.UNARY;	 Catch:{ all -> 0x009d }
        r15.c = r8;	 Catch:{ all -> 0x009d }
        r8 = "google.identity.oauthintegrations.v1.OAuthIntegrationsService";
        r9 = "GetTokenForService";
        r8 = defpackage.bauw.a(r8, r9);	 Catch:{ all -> 0x009d }
        r15.d = r8;	 Catch:{ all -> 0x009d }
        r15.e = r10;	 Catch:{ all -> 0x009d }
        r8 = defpackage.ansx.l;	 Catch:{ all -> 0x009d }
        r8 = defpackage.bbic.a(r8);	 Catch:{ all -> 0x009d }
        r15.a = r8;	 Catch:{ all -> 0x009d }
        r8 = defpackage.ansz.g;	 Catch:{ all -> 0x009d }
        r8 = defpackage.bbic.a(r8);	 Catch:{ all -> 0x009d }
        r15.b = r8;	 Catch:{ all -> 0x009d }
        r8 = r15.a();	 Catch:{ all -> 0x009d }
        defpackage.ante.a = r8;	 Catch:{ all -> 0x009d }
        goto L_0x009b;
    L_0x009a:
        r8 = r15;
    L_0x009b:
        monitor-exit(r14);	 Catch:{ all -> 0x009d }
        goto L_0x00a2;
    L_0x009d:
        r0 = move-exception;
        r3 = r0;
        monitor-exit(r14);	 Catch:{ all -> 0x009d }
        throw r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
    L_0x00a1:
        r8 = r14;
    L_0x00a2:
        r7 = r7.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7 = defpackage.bbif.a(r12, r8, r7, r13);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r12 = r7;
        r12 = (defpackage.ansz) r12;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03b8, IllegalArgumentException -> 0x03b5 }
        r7 = r12.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r7 != 0) goto L_0x00b1;
    L_0x00af:
        r7 = defpackage.ansd.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x00b1:
        r7 = r7.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r1.d = r7;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = r12.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r7 != 0) goto L_0x00bb;
    L_0x00b9:
        r7 = defpackage.antn.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x00bb:
        r7 = r7.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r1.e = r7;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = r12.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = defpackage.antb.a(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r7 == 0) goto L_0x03a5;
    L_0x00c7:
        if (r7 == r11) goto L_0x0369;
    L_0x00c9:
        r7 = r12.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r7 = defpackage.antb.a(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r7 == 0) goto L_0x034f;
    L_0x00d1:
        r8 = 4;
        if (r7 != r8) goto L_0x0341;
    L_0x00d4:
        r7 = new shc;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r8 = r13.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r7.<init>(r8, r4, r5);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r7.g = r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r39 == 0) goto L_0x00e3;
    L_0x00df:
        r7.l = r10;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.m = r6;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x00e3:
        r3 = r12.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r3 = defpackage.antp.a(r3);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r3 != 0) goto L_0x00ed;
    L_0x00eb:
        r3 = defpackage.antp.UNRECOGNIZED;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x00ed:
        r7.h = r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r3 = r12.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r3 != 0) goto L_0x00f5;
    L_0x00f3:
        r3 = defpackage.antn.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x00f5:
        r6 = r12.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r6 != r11) goto L_0x00fe;
    L_0x00f9:
        r6 = r12.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r6 = (defpackage.ansn) r6;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x0100;
    L_0x00fe:
        r6 = defpackage.ansn.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
    L_0x0100:
        r8 = r12.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r8 == 0) goto L_0x0131;
    L_0x0104:
        r8 = defpackage.antp.APP_AUTH;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = r12.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = defpackage.antp.a(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x0110;
    L_0x010e:
        r9 = defpackage.antp.UNRECOGNIZED;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0110:
        r8 = r8.equals(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r8 != 0) goto L_0x012d;
    L_0x0116:
        r8 = r3.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r8 == 0) goto L_0x0125;
    L_0x011a:
        r7.b = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r3.h;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.d = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r3.i;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.e = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x012d;
    L_0x0125:
        r3 = new java.lang.NullPointerException;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r6 = "serviceName may not be null";
        r3.<init>(r6);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        throw r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x012d:
        r8 = r3.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.a = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0131:
        r8 = r12.e;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r8 == 0) goto L_0x0143;
    L_0x0135:
        r8 = r8.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = java.util.Collections.unmodifiableMap(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = r8.isEmpty();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x0143;
    L_0x0141:
        r7.j = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0143:
        r8 = r12.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r8 = defpackage.antb.a(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        if (r8 == 0) goto L_0x033b;
    L_0x014b:
        r9 = 4;
        if (r8 != r9) goto L_0x02ea;
    L_0x014e:
        r8 = r12.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = defpackage.antp.a(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r8 != 0) goto L_0x0158;
    L_0x0156:
        r8 = defpackage.antp.UNRECOGNIZED;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0158:
        r9 = r8.ordinal();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 == r10) goto L_0x023e;
    L_0x015e:
        r10 = 2;
        if (r9 == r10) goto L_0x01bc;
    L_0x0161:
        if (r9 == r11) goto L_0x0187;
    L_0x0163:
        r10 = 4;
        if (r9 == r10) goto L_0x01bd;
    L_0x0166:
        r9 = "GDIInternal";
        r14 = "Unknown completion state (no validation performed): ";
        r8 = r8.name();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = java.lang.String.valueOf(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r15 = r8.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r15 != 0) goto L_0x017e;
    L_0x0178:
        r8 = new java.lang.String;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8.<init>(r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x0182;
    L_0x017e:
        r8 = r14.concat(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0182:
        android.util.Log.w(r9, r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x023f;
    L_0x0187:
        r10 = 4;
        r9 = r6.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x018d;
    L_0x018c:
        goto L_0x0195;
    L_0x018d:
        r9 = r9.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 == 0) goto L_0x023f;
    L_0x0195:
        r9 = "GDIInternal";
        r8 = java.lang.String.valueOf(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r14 = r8.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r14 = r14 + 62;
        r15 = new java.lang.StringBuilder;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r15.<init>(r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r14 = "Invalid consent: Response completion for ";
        r15.append(r14);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r15.append(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = " should contain code.";
        r15.append(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r15.toString();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        android.util.Log.w(r9, r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x023f;
    L_0x01bc:
        r10 = 4;
    L_0x01bd:
        r9 = r3.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x020a;
    L_0x01c5:
        r9 = r3.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x020a;
    L_0x01cd:
        r9 = r6.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = android.text.TextUtils.isEmpty(r9);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x01d6;
    L_0x01d5:
        goto L_0x023f;
    L_0x01d6:
        r3 = new sfs;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = java.lang.String.valueOf(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r6 = java.lang.String.valueOf(r6);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r7.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r8 + 83;
        r9 = r6.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r8 + r9;
        r9 = new java.lang.StringBuilder;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.<init>(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "Invalid completion: Response completion for ";
        r9.append(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.append(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = " must contain OAuth authorization url: ";
        r9.append(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.append(r6);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r6 = r9.toString();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = 100;
        r3.<init>(r7, r6);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        throw r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x020a:
        r6 = new sfs;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = java.lang.String.valueOf(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r3 = java.lang.String.valueOf(r3);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r7.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r8 + 81;
        r9 = r3.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r8 + r9;
        r9 = new java.lang.StringBuilder;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.<init>(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "Invalid service: Response service for ";
        r9.append(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.append(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = " must contain auth endpoint and client ID: ";
        r9.append(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.append(r3);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r3 = r9.toString();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7 = 100;
        r6.<init>(r7, r3);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        throw r6;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x023e:
        r10 = 4;
    L_0x023f:
        r8 = r6.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = android.text.TextUtils.isEmpty(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r9 != 0) goto L_0x02df;
    L_0x0247:
        r9 = new sin;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.<init>();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r14 = android.net.Uri.parse(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r15 = r14.getQueryParameterNames();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r16 = defpackage.sim.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r16 = r16.iterator();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x025a:
        r17 = r16.hasNext();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r17 == 0) goto L_0x028c;
    L_0x0260:
        r17 = r16.next();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r10 = r17;
        r10 = (java.lang.String) r10;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r17 = r15.contains(r10);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r17 != 0) goto L_0x028a;
    L_0x026e:
        r3 = new java.lang.IllegalArgumentException;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r6 = "Missing parameter in authorization url: ";
        r7 = java.lang.String.valueOf(r10);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r7.length();	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r8 != 0) goto L_0x0282;
    L_0x027c:
        r7 = new java.lang.String;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.<init>(r6);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        goto L_0x0286;
    L_0x0282:
        r7 = r6.concat(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x0286:
        r3.<init>(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        throw r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x028a:
        r10 = 4;
        goto L_0x025a;
    L_0x028c:
        r9.g = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "client_id";
        r8 = r14.getQueryParameter(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.a = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "state";
        r8 = r14.getQueryParameter(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.d = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "scope";
        r8 = r14.getQueryParameter(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.e = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = "redirect_uri";
        r8 = r14.getQueryParameter(r8);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.f = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r3.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.a = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r3.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.b = r8;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r3 = r3.g;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9.c = r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r3 = new sio;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r8 = r9.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r10 = r9.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r14 = r9.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r15 = r9.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r11 = r9.e;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r1 = r9.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r9 = r9.g;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r17 = r3;
        r18 = r8;
        r19 = r10;
        r20 = r14;
        r21 = r15;
        r22 = r11;
        r23 = r1;
        r24 = r9;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.f = r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x02df:
        r1 = r6.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        if (r1 == 0) goto L_0x02ea;
    L_0x02e3:
        r3 = new sgc;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r3.<init>(r1);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
        r7.i = r3;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ad, IllegalArgumentException -> 0x03b5 }
    L_0x02ea:
        r1 = new sfq;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r3 = new sgz;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r6 = r7.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r8 = r7.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r9 = r7.c;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r10 = r7.d;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r11 = r7.e;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r14 = r7.f;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r15 = r7.g;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r5 = r7.h;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r2 = r7.i;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r4 = r7.k;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0360, IllegalArgumentException -> 0x03b5 }
        r36 = r13;
        r13 = r7.j;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0333, IllegalArgumentException -> 0x03b5 }
        r32 = r12;
        r12 = r7.l;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        r7 = r7.m;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        r31 = defpackage.amul.a(r7);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        r29 = 0;
        r17 = r3;
        r18 = r6;
        r19 = r8;
        r20 = r9;
        r21 = r10;
        r22 = r11;
        r23 = r14;
        r24 = r15;
        r25 = r5;
        r26 = r2;
        r27 = r4;
        r28 = r13;
        r30 = r12;
        r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        r1.<init>(r3);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        return r1;
    L_0x0333:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
        r13 = r36;
        goto L_0x0365;
    L_0x033b:
        r32 = r12;
        r36 = r13;
        r1 = 0;
        throw r1;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
    L_0x0341:
        r32 = r12;
        r36 = r13;
        r1 = new sfs;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        r2 = "Invalid server response: Response must contain TokenInfo or CompletionInfo";
        r3 = 100;
        r1.<init>(r3, r2);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
        throw r1;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
    L_0x034f:
        r32 = r12;
        r36 = r13;
        r1 = 0;
        throw r1;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0355, IllegalArgumentException -> 0x03b5 }
    L_0x0355:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
        r13 = r36;
        r2 = r0;
        r1 = r32;
        goto L_0x0367;
    L_0x0360:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
    L_0x0365:
        r2 = r0;
        r1 = r12;
    L_0x0367:
        r8 = 2;
        goto L_0x03b3;
    L_0x0369:
        r1 = r12;
        r36 = r13;
        r2 = r1.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x039d, IllegalArgumentException -> 0x03b5 }
        r8 = 2;
        if (r2 != r8) goto L_0x0376;
    L_0x0371:
        r2 = r1.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0395, IllegalArgumentException -> 0x03b5 }
        r2 = (defpackage.ants) r2;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0395, IllegalArgumentException -> 0x03b5 }
        goto L_0x0378;
    L_0x0376:
        r2 = defpackage.ants.e;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0395, IllegalArgumentException -> 0x03b5 }
    L_0x0378:
        r2 = defpackage.sga.a(r2);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x0395, IllegalArgumentException -> 0x03b5 }
        r13 = r36;
        r4 = r13.b;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x038f, IllegalArgumentException -> 0x03b5 }
        r5 = r34;
        r6 = r35;
        defpackage.sga.a(r5, r6, r4, r3, r2);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ab, IllegalArgumentException -> 0x03b5 }
        r3 = new sfq;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ab, IllegalArgumentException -> 0x03b5 }
        r2 = r2.a;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ab, IllegalArgumentException -> 0x03b5 }
        r3.<init>(r2);	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ab, IllegalArgumentException -> 0x03b5 }
        return r3;
    L_0x038f:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
        goto L_0x03b2;
    L_0x0395:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
        r13 = r36;
        goto L_0x03b2;
    L_0x039d:
        r0 = move-exception;
        r5 = r34;
        r6 = r35;
        r13 = r36;
        goto L_0x03b1;
    L_0x03a5:
        r5 = r2;
        r6 = r4;
        r1 = r12;
        r8 = 2;
        r12 = 0;
        throw r12;	 Catch:{ bawe -> 0x03c5, IOException -> 0x03c1, sfs -> 0x03ab, IllegalArgumentException -> 0x03b5 }
    L_0x03ab:
        r0 = move-exception;
        goto L_0x03b2;
    L_0x03ad:
        r0 = move-exception;
        r5 = r2;
        r6 = r4;
        r1 = r12;
    L_0x03b1:
        r8 = 2;
    L_0x03b2:
        r2 = r0;
    L_0x03b3:
        r12 = r1;
        goto L_0x03be;
    L_0x03b5:
        r0 = move-exception;
        r1 = r0;
        goto L_0x03d1;
    L_0x03b8:
        r0 = move-exception;
        r5 = r2;
        r6 = r4;
        r8 = 2;
        r12 = 0;
        r2 = r0;
    L_0x03be:
        r1 = r2;
        r9 = 3;
        goto L_0x03e6;
    L_0x03c1:
        r0 = move-exception;
        r1 = r0;
        goto L_0x045c;
    L_0x03c5:
        r0 = move-exception;
        r1 = r0;
        goto L_0x0464;
    L_0x03c9:
        r0 = move-exception;
        r5 = r2;
        r6 = r4;
        r8 = 2;
        r12 = 0;
        r2 = r0;
        r9 = 3;
        goto L_0x03e3;
    L_0x03d1:
        r2 = new sfq;
        r3 = r1.getMessage();
        r9 = 3;
        r2.<init>(r9, r3, r1);
        return r2;
    L_0x03dc:
        r0 = move-exception;
        r5 = r2;
        r6 = r4;
        r8 = 2;
        r9 = 3;
        r12 = 0;
        r2 = r0;
    L_0x03e3:
        r13 = r36;
        r1 = r2;
    L_0x03e6:
        r2 = r1.a;
        r3 = 100;
        if (r2 != r3) goto L_0x0450;
    L_0x03ec:
        r10 = new sfe;
        r3 = r34.getPackageName();
        r2 = r38;
        r5 = r2.a;
        r7 = r13.b;
        r2 = b;
        r11 = r2.a();
        r2 = r10;
        r4 = r35;
        r6 = r7;
        r7 = r11;
        r2.<init>(r3, r4, r5, r6, r7);
        r2 = r13.e;
        r2 = defpackage.antp.a(r2);
        if (r2 != 0) goto L_0x0410;
    L_0x040e:
        r2 = defpackage.antp.UNRECOGNIZED;
    L_0x0410:
        r2 = r2.ordinal();
        switch(r2) {
            case 0: goto L_0x0426;
            case 1: goto L_0x0424;
            case 2: goto L_0x0422;
            case 3: goto L_0x0420;
            case 4: goto L_0x041e;
            case 5: goto L_0x041b;
            case 6: goto L_0x0418;
            default: goto L_0x0417;
        };
    L_0x0417:
        goto L_0x0427;
    L_0x0418:
        r8 = 11;
        goto L_0x0427;
    L_0x041b:
        r8 = 13;
        goto L_0x0427;
    L_0x041e:
        r8 = 7;
        goto L_0x0427;
    L_0x0420:
        r8 = 5;
        goto L_0x0427;
    L_0x0422:
        r8 = 6;
        goto L_0x0427;
    L_0x0424:
        r8 = 4;
        goto L_0x0427;
    L_0x0426:
        r8 = 3;
    L_0x0427:
        r2 = defpackage.sfz.a(r8);
        r3 = defpackage.aodi.EVENT_MALFORMED_RESPONSE;
        r10.a(r2, r3);
        r2 = java.lang.String.valueOf(r12);
        r3 = r2.length();
        r4 = new java.lang.StringBuilder;
        r3 = r3 + 36;
        r4.<init>(r3);
        r3 = "Invalid GetTokenForServiceResponse: ";
        r4.append(r3);
        r4.append(r2);
        r2 = r4.toString();
        r3 = "GDIInternal";
        android.util.Log.w(r3, r2, r1);
    L_0x0450:
        r2 = new sfq;
        r3 = r1.a;
        r4 = r1.getMessage();
        r2.<init>(r3, r4, r1);
        return r2;
    L_0x045c:
        r2 = new sfq;
        r3 = 102; // 0x66 float:1.43E-43 double:5.04E-322;
        r2.<init>(r3, r1);
        return r2;
    L_0x0464:
        r2 = r1.a;
        r3 = r2.m;
        r3 = r3.r;
        r4 = new sfq;
        r2 = r2.n;
        r5 = new sfs;
        r1 = r1.getMessage();
        r5.<init>(r3, r1);
        r4.<init>(r3, r2, r5);
        return r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sga.a(android.content.Context, java.lang.String, ansx, java.lang.String[], sfi, boolean, java.util.List):sfq");
    }

    public static void a(Context context, String str, String str2, String[] strArr, ants ants) {
        aoaq aoaq = ants.d;
        long j = aoaq != null ? aoaq.a : 0;
        sfu a = sfu.a(context);
        String str3 = ants.a;
        SQLiteDatabase writableDatabase = a.a.getWritableDatabase();
        long currentTimeMillis = j == 0 ? (System.currentTimeMillis() / 1000) + 604800 : j;
        ContentValues contentValues = new ContentValues();
        contentValues.put("accountId", str);
        contentValues.put("thirdPartyServiceProvider", str2);
        contentValues.put("token", str3);
        contentValues.put("expiryTime", Long.valueOf(currentTimeMillis));
        contentValues.put("scopes", TextUtils.join(",", strArr));
        try {
            writableDatabase.insertOrThrow("CacheTable", null, contentValues);
        } catch (SQLiteException e) {
            Log.e("GDICache", e.toString());
        }
    }

    public final anth a(Context context, String str, String str2) {
        bauk bauk = this.h;
        Object obj = (bauk == null || bauk.c() || !str.equals(this.j) || !str2.equals(this.k)) ? 1 : null;
        this.k = str2;
        this.j = str;
        if (obj != null) {
            Uri parse = Uri.parse(str);
            this.h = b.a(parse.getHost(), parse.getPort() >= 0 ? parse.getPort() : 443);
            barx barx = this.h;
            if (barx != null) {
                this.i = base.a(barx, new sjs(str2, f));
                this.l = new anth(this.i);
            } else {
                throw new IOException("Failed to create grpc ManagedChannel.");
            }
        }
        return this.l;
    }

    public static ants a(ants ants) {
        if (ants != null && !TextUtils.isEmpty(ants.a)) {
            return ants;
        }
        String valueOf = String.valueOf(ants);
        StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 68);
        stringBuilder.append("Invalid TokenInfo: Response TokenInfo must contain an access token: ");
        stringBuilder.append(valueOf);
        throw new sfs(100, stringBuilder.toString());
    }

    public static Intent a(sfq sfq) {
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TOKEN_RESPONSE", sfq);
        intent.putExtra("EXTRA_RESULT", bundle);
        intent.putExtra("GDI", null);
        return intent;
    }
}
