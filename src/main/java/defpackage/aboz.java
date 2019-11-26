package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.LiveChatAction.ReplayChatItemAction;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: aboz */
public final class aboz extends abpd {
    private Queue g;
    private final abpb h;
    private long i;
    private long j;
    private boolean k;

    public final synchronized void ah_() {
        this.g = new ArrayDeque();
        this.j = 0;
        this.k = true;
        this.i = Long.MIN_VALUE;
    }

    public final synchronized void ai_() {
        this.k = true;
    }

    public final synchronized void aj_() {
        this.k = false;
    }

    public final synchronized void ak_() {
        this.g = null;
        this.k = false;
    }

    public aboz(Handler handler, aboq aboq, abor abor, abpb abpb) {
        super(handler, aboq, abor);
        this.h = (abpb) amqw.a((Object) abpb);
    }

    public final synchronized void a(apxu[] apxuArr, long j) {
        if (this.g != null) {
            this.i = Long.MIN_VALUE;
            for (anxp anxp : apxuArr) {
                anxr access$000 = anxl.checkIsLite(ReplayChatItemAction.replayChatItemAction);
                anxp.a(access$000);
                if (anxp.h.a(access$000.d)) {
                    access$000 = anxl.checkIsLite(ReplayChatItemAction.replayChatItemAction);
                    anxp.a(access$000);
                    Object b = anxp.h.b(access$000.d);
                    if (b == null) {
                        b = access$000.b;
                    } else {
                        b = access$000.a(b);
                    }
                    ReplayChatItemAction replayChatItemAction = (ReplayChatItemAction) b;
                    this.g.add(replayChatItemAction);
                    long j2 = replayChatItemAction.c;
                    if (j2 > this.i) {
                        this.i = j2;
                    }
                }
            }
            this.k = true;
            a(this.j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x015b  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x015a  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0173  */
    /* JADX WARNING: Missing block: B:63:0x0169, code skipped:
            if (r1.h.b() != false) goto L_0x016b;
     */
    /* JADX WARNING: Missing block: B:68:0x0177, code skipped:
            return;
     */
    /* JADX WARNING: Missing block: B:74:0x017e, code skipped:
            return;
     */
    public final synchronized void a(long r23) {
        /*
        r22 = this;
        r1 = r22;
        r2 = r23;
        monitor-enter(r22);
        r0 = r1.k;	 Catch:{ all -> 0x017f }
        if (r0 == 0) goto L_0x017d;
    L_0x0009:
        r0 = r1.g;	 Catch:{ all -> 0x017f }
        if (r0 == 0) goto L_0x017d;
    L_0x000d:
        r4 = r1.j;	 Catch:{ all -> 0x017f }
        r6 = -1000; // 0xfffffffffffffc18 float:NaN double:NaN;
        r6 = r6 + r4;
        r8 = 10000; // 0x2710 float:1.4013E-41 double:4.9407E-320;
        r4 = r4 + r8;
        r8 = r1.i;	 Catch:{ all -> 0x017f }
        r10 = 0;
        r0 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1));
        if (r0 <= 0) goto L_0x0020;
    L_0x001d:
        r12 = r8 - r2;
        goto L_0x0021;
    L_0x0020:
        r12 = r10;
    L_0x0021:
        r0 = r1.h;	 Catch:{ all -> 0x017f }
        r14 = r0.a();	 Catch:{ all -> 0x017f }
        r1.j = r2;	 Catch:{ all -> 0x017f }
        r0 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1));
        if (r0 < 0) goto L_0x0178;
    L_0x002d:
        r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1));
        if (r0 > 0) goto L_0x0032;
    L_0x0031:
        goto L_0x0040;
    L_0x0032:
        r0 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1));
        if (r0 <= 0) goto L_0x0040;
    L_0x0036:
        r0 = r1.h;	 Catch:{ all -> 0x017f }
        r0 = r0.b();	 Catch:{ all -> 0x017f }
        if (r0 == 0) goto L_0x0040;
    L_0x003e:
        goto L_0x0178;
    L_0x0040:
        r0 = r1.g;	 Catch:{ all -> 0x017f }
        defpackage.amqw.a(r0);	 Catch:{ all -> 0x017f }
        r4 = r1.a;	 Catch:{ all -> 0x017f }
        r4 = r4.f();	 Catch:{ all -> 0x017f }
        if (r4 == 0) goto L_0x0056;
    L_0x004d:
        r6 = r4.d();	 Catch:{ all -> 0x017f }
        if (r6 == 0) goto L_0x0054;
    L_0x0053:
        goto L_0x0056;
    L_0x0054:
        r6 = 1;
        goto L_0x0057;
    L_0x0056:
        r6 = 0;
    L_0x0057:
        r7 = r0.isEmpty();	 Catch:{ all -> 0x017f }
        if (r7 != 0) goto L_0x014c;
    L_0x005d:
        r7 = r0.peek();	 Catch:{ all -> 0x017f }
        r7 = (com.google.protos.youtube.api.innertube.LiveChatAction.ReplayChatItemAction) r7;	 Catch:{ all -> 0x017f }
        r7 = r7.c;	 Catch:{ all -> 0x017f }
        r9 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1));
        if (r9 <= 0) goto L_0x006b;
    L_0x0069:
        goto L_0x014c;
    L_0x006b:
        r7 = r0.remove();	 Catch:{ all -> 0x017f }
        r7 = (com.google.protos.youtube.api.innertube.LiveChatAction.ReplayChatItemAction) r7;	 Catch:{ all -> 0x017f }
        r8 = java.util.concurrent.TimeUnit.MILLISECONDS;	 Catch:{ all -> 0x017f }
        r16 = r6;
        r5 = r7.c;	 Catch:{ all -> 0x017f }
        r5 = r5 - r2;
        r5 = r8.toSeconds(r5);	 Catch:{ all -> 0x017f }
        r8 = (r5 > r10 ? 1 : (r5 == r10 ? 0 : -1));
        if (r8 < 0) goto L_0x0093;
    L_0x0080:
        r5 = r7.b;	 Catch:{ all -> 0x017f }
        r6 = 0;
        r7 = new defpackage.apxu[r6];	 Catch:{ all -> 0x017f }
        r5 = r5.toArray(r7);	 Catch:{ all -> 0x017f }
        r5 = (defpackage.apxu[]) r5;	 Catch:{ all -> 0x017f }
        r17 = r0;
        r8 = r5;
        r5 = r10;
        r18 = r12;
        goto L_0x0131;
    L_0x0093:
        r8 = r7.b;	 Catch:{ all -> 0x017f }
        r8 = r8.size();	 Catch:{ all -> 0x017f }
        r8 = new defpackage.apxu[r8];	 Catch:{ all -> 0x017f }
        r9 = 0;
    L_0x009c:
        r10 = r7.b;	 Catch:{ all -> 0x017f }
        r10 = r10.size();	 Catch:{ all -> 0x017f }
        if (r9 >= r10) goto L_0x012b;
    L_0x00a4:
        r10 = r7.b;	 Catch:{ all -> 0x017f }
        r10 = r10.get(r9);	 Catch:{ all -> 0x017f }
        r10 = (defpackage.apxu) r10;	 Catch:{ all -> 0x017f }
        r11 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction;	 Catch:{ all -> 0x017f }
        r11 = defpackage.anxl.checkIsLite(r11);	 Catch:{ all -> 0x017f }
        r10.a(r11);	 Catch:{ all -> 0x017f }
        r17 = r0;
        r0 = r10.h;	 Catch:{ all -> 0x017f }
        r11 = r11.d;	 Catch:{ all -> 0x017f }
        r0 = r0.a(r11);	 Catch:{ all -> 0x017f }
        if (r0 != 0) goto L_0x00c8;
    L_0x00c1:
        r20 = r5;
        r18 = r12;
        r5 = 0;
        goto L_0x011d;
    L_0x00c8:
        r0 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction;	 Catch:{ all -> 0x017f }
        r0 = defpackage.anxl.checkIsLite(r0);	 Catch:{ all -> 0x017f }
        r10.a(r0);	 Catch:{ all -> 0x017f }
        r11 = r10.h;	 Catch:{ all -> 0x017f }
        r2 = r0.d;	 Catch:{ all -> 0x017f }
        r2 = r11.b(r2);	 Catch:{ all -> 0x017f }
        if (r2 != 0) goto L_0x00de;
    L_0x00db:
        r0 = r0.b;	 Catch:{ all -> 0x017f }
        goto L_0x00e2;
    L_0x00de:
        r0 = r0.a(r2);	 Catch:{ all -> 0x017f }
    L_0x00e2:
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction) r0;	 Catch:{ all -> 0x017f }
        r2 = r0.toBuilder();	 Catch:{ all -> 0x017f }
        r2 = (defpackage.anxo) r2;	 Catch:{ all -> 0x017f }
        r2 = (defpackage.aubl) r2;	 Catch:{ all -> 0x017f }
        r18 = r12;
        r11 = r0.c;	 Catch:{ all -> 0x017f }
        r11 = r11 + r5;
        r20 = r5;
        r5 = 0;
        r11 = java.lang.Math.max(r5, r11);	 Catch:{ all -> 0x017f }
        r2.copyOnWrite();	 Catch:{ all -> 0x017f }
        r0 = r2.instance;	 Catch:{ all -> 0x017f }
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction) r0;	 Catch:{ all -> 0x017f }
        r3 = r0.a;	 Catch:{ all -> 0x017f }
        r3 = r3 | 2;
        r0.a = r3;	 Catch:{ all -> 0x017f }
        r0.c = r11;	 Catch:{ all -> 0x017f }
        r0 = r2.build();	 Catch:{ all -> 0x017f }
        r0 = (defpackage.anxl) r0;	 Catch:{ all -> 0x017f }
        r0 = (com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction) r0;	 Catch:{ all -> 0x017f }
        r2 = r10.toBuilder();	 Catch:{ all -> 0x017f }
        r2 = (defpackage.anxo) r2;	 Catch:{ all -> 0x017f }
        r2 = (defpackage.apxx) r2;	 Catch:{ all -> 0x017f }
        r3 = com.google.protos.youtube.api.innertube.LiveChatAction.AddLiveChatTickerItemAction.addLiveChatTickerItemAction;	 Catch:{ all -> 0x017f }
        r2.a(r3, r0);	 Catch:{ all -> 0x017f }
    L_0x011d:
        r8[r9] = r10;	 Catch:{ all -> 0x017f }
        r9 = r9 + 1;
        r2 = r23;
        r0 = r17;
        r12 = r18;
        r5 = r20;
        goto L_0x009c;
    L_0x012b:
        r17 = r0;
        r18 = r12;
        r5 = 0;
    L_0x0131:
        if (r16 != 0) goto L_0x0139;
    L_0x0133:
        r2 = 1000; // 0x3e8 float:1.401E-42 double:4.94E-321;
        super.a(r8, r2);	 Catch:{ all -> 0x017f }
        goto L_0x0141;
    L_0x0139:
        r0 = r1.b;	 Catch:{ all -> 0x017f }
        r2 = r1.a;	 Catch:{ all -> 0x017f }
        r3 = 0;
        r0.a(r8, r2, r3);	 Catch:{ all -> 0x017f }
    L_0x0141:
        r2 = r23;
        r10 = r5;
        r6 = r16;
        r0 = r17;
        r12 = r18;
        goto L_0x0057;
    L_0x014c:
        r16 = r6;
        r18 = r12;
        if (r16 != 0) goto L_0x0153;
    L_0x0152:
        goto L_0x0156;
    L_0x0153:
        r4.b();	 Catch:{ all -> 0x017f }
    L_0x0156:
        r0 = (r18 > r14 ? 1 : (r18 == r14 ? 0 : -1));
        if (r0 >= 0) goto L_0x015b;
    L_0x015a:
        goto L_0x016b;
    L_0x015b:
        r0 = r1.g;	 Catch:{ all -> 0x017f }
        r0 = r0.size();	 Catch:{ all -> 0x017f }
        if (r0 != 0) goto L_0x0176;
    L_0x0163:
        r0 = r1.h;	 Catch:{ all -> 0x017f }
        r0 = r0.b();	 Catch:{ all -> 0x017f }
        if (r0 == 0) goto L_0x0176;
    L_0x016b:
        r0 = r1.h;	 Catch:{ all -> 0x017f }
        r0 = r0.d();	 Catch:{ all -> 0x017f }
        if (r0 == 0) goto L_0x0176;
    L_0x0173:
        r0 = 0;
        r1.k = r0;	 Catch:{ all -> 0x017f }
    L_0x0176:
        monitor-exit(r22);
        return;
    L_0x0178:
        r22.b(r23);	 Catch:{ all -> 0x017f }
        monitor-exit(r22);
        return;
    L_0x017d:
        monitor-exit(r22);
        return;
    L_0x017f:
        r0 = move-exception;
        monitor-exit(r22);
        goto L_0x0183;
    L_0x0182:
        throw r0;
    L_0x0183:
        goto L_0x0182;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aboz.a(long):void");
    }

    public final synchronized void b(long j) {
        this.j = j;
        this.i = Long.MIN_VALUE;
        this.a.g().ak_();
        this.g.clear();
        if (this.h.a(j, new aboy(this))) {
            this.k = false;
        }
    }
}
