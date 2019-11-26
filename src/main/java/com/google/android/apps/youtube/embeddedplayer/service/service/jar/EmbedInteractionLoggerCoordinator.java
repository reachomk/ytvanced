package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import defpackage.acwc;
import defpackage.acwl;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.ahkf;
import defpackage.ahkn;
import defpackage.apxu;
import defpackage.bcaa;
import defpackage.xcp;
import defpackage.xua;
import java.util.HashMap;
import java.util.Map;

public class EmbedInteractionLoggerCoordinator implements xcp {
    public int a = -1;
    private final bcaa b;
    private final xua c;
    private final Map d;
    private final Map e;
    private int f = 0;

    class HostNonceHolder {
        public final String a;
        public int b;

        HostNonceHolder(String str) {
            this.a = str;
        }
    }

    public EmbedInteractionLoggerCoordinator(bcaa bcaa, xua xua) {
        this.b = bcaa;
        this.c = xua;
        this.d = new HashMap();
        this.e = new HashMap();
    }

    public final synchronized int a(int i) {
        int i2;
        i2 = this.f;
        this.f = i2 + 1;
        Map map = this.e;
        Integer valueOf = Integer.valueOf(i);
        HostNonceHolder hostNonceHolder = (HostNonceHolder) map.get(valueOf);
        if (hostNonceHolder == null) {
            hostNonceHolder = new HostNonceHolder(this.c.a());
            hostNonceHolder.b = 1;
            this.e.put(valueOf, hostNonceHolder);
        } else {
            hostNonceHolder.b++;
        }
        this.d.put(Integer.valueOf(i2), new EmbedInteractionLogger(this.b, i, hostNonceHolder.a));
        return i2;
    }

    /* JADX WARNING: Missing block: B:13:0x0057, code skipped:
            return;
     */
    public final synchronized void b(int r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d(r4);	 Catch:{ all -> 0x005a }
        if (r0 == 0) goto L_0x0058;
    L_0x0007:
        r1 = r3.d;	 Catch:{ all -> 0x005a }
        r4 = java.lang.Integer.valueOf(r4);	 Catch:{ all -> 0x005a }
        r1.remove(r4);	 Catch:{ all -> 0x005a }
        r4 = r3.e;	 Catch:{ all -> 0x005a }
        r1 = r0.d;	 Catch:{ all -> 0x005a }
        r1 = java.lang.Integer.valueOf(r1);	 Catch:{ all -> 0x005a }
        r4 = r4.get(r1);	 Catch:{ all -> 0x005a }
        r4 = (com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.HostNonceHolder) r4;	 Catch:{ all -> 0x005a }
        if (r4 != 0) goto L_0x0041;
    L_0x0020:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x005a }
        r0 = r0.d;	 Catch:{ all -> 0x005a }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x005a }
        r2 = 85;
        r1.<init>(r2);	 Catch:{ all -> 0x005a }
        r2 = "Activity identifier ";
        r1.append(r2);	 Catch:{ all -> 0x005a }
        r1.append(r0);	 Catch:{ all -> 0x005a }
        r0 = " doesn't have associated embedded playback host nonce.";
        r1.append(r0);	 Catch:{ all -> 0x005a }
        r0 = 2;
        r1 = r1.toString();	 Catch:{ all -> 0x005a }
        defpackage.afpc.a(r0, r4, r1);	 Catch:{ all -> 0x005a }
        goto L_0x0056;
    L_0x0041:
        r1 = r4.b;	 Catch:{ all -> 0x005a }
        r1 = r1 + -1;
        r4.b = r1;	 Catch:{ all -> 0x005a }
        if (r1 != 0) goto L_0x0056;
    L_0x0049:
        r4 = r3.e;	 Catch:{ all -> 0x005a }
        r0 = r0.d;	 Catch:{ all -> 0x005a }
        r0 = java.lang.Integer.valueOf(r0);	 Catch:{ all -> 0x005a }
        r4.remove(r0);	 Catch:{ all -> 0x005a }
        monitor-exit(r3);
        return;
    L_0x0056:
        monitor-exit(r3);
        return;
    L_0x0058:
        monitor-exit(r3);
        return;
    L_0x005a:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.b(int):void");
    }

    public final synchronized void c(int i) {
        EmbedInteractionLogger d = d(i);
        if (d == null) {
            afpf afpf = afpf.embeddedplayer;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("InteractionLogger with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't exist.");
            afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
            return;
        }
        LoggerWrapper loggerWrapper = d.a;
        if (loggerWrapper.a) {
            afpc.a(2, afpf.embeddedplayer, "logNewEmbedPage called more than once");
        } else {
            loggerWrapper.a(acwl.k, null, d.a(null));
        }
    }

    /* JADX WARNING: Missing block: B:21:0x0082, code skipped:
            return;
     */
    public final synchronized void a(int r4, defpackage.apxu r5, boolean r6) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.d(r4);	 Catch:{ all -> 0x009a }
        r1 = 2;
        if (r0 != 0) goto L_0x002c;
    L_0x0008:
        r5 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x009a }
        r6 = new java.lang.StringBuilder;	 Catch:{ all -> 0x009a }
        r0 = 52;
        r6.<init>(r0);	 Catch:{ all -> 0x009a }
        r0 = "InteractionLogger with ID ";
        r6.append(r0);	 Catch:{ all -> 0x009a }
        r6.append(r4);	 Catch:{ all -> 0x009a }
        r4 = " doesn't exist.";
        r6.append(r4);	 Catch:{ all -> 0x009a }
        r4 = r6.toString();	 Catch:{ all -> 0x009a }
        r6 = new java.lang.Throwable;	 Catch:{ all -> 0x009a }
        r6.<init>();	 Catch:{ all -> 0x009a }
        defpackage.afpc.a(r1, r5, r4, r6);	 Catch:{ all -> 0x009a }
        monitor-exit(r3);
        return;
    L_0x002c:
        r4 = r0.a;	 Catch:{ all -> 0x009a }
        r4 = r4.a;	 Catch:{ all -> 0x009a }
        if (r4 == 0) goto L_0x0091;
    L_0x0032:
        r4 = 0;
        r0.f = r4;	 Catch:{ all -> 0x009a }
        r0.a();	 Catch:{ all -> 0x009a }
        r2 = r0.b;	 Catch:{ all -> 0x009a }
        r2.a();	 Catch:{ all -> 0x009a }
        r2 = r0.c;	 Catch:{ all -> 0x009a }
        r2.a();	 Catch:{ all -> 0x009a }
        if (r6 != 0) goto L_0x008c;
    L_0x0044:
        r6 = r0.a;	 Catch:{ all -> 0x009a }
        r2 = r6.a;	 Catch:{ all -> 0x009a }
        if (r2 == 0) goto L_0x0083;
    L_0x004a:
        r6.a(r5);	 Catch:{ all -> 0x009a }
        r0.b();	 Catch:{ all -> 0x009a }
        r6 = r0.b;	 Catch:{ all -> 0x009a }
        r1 = defpackage.acwl.l;	 Catch:{ all -> 0x009a }
        r2 = r0.a(r4);	 Catch:{ all -> 0x009a }
        r6.a(r1, r5, r2);	 Catch:{ all -> 0x009a }
        r0.g = r4;	 Catch:{ all -> 0x009a }
        r4 = defpackage.acwc.PLAYER_LARGE_PLAY_BUTTON;	 Catch:{ all -> 0x009a }
        r5 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x009a }
        r6 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.ATTACH;	 Catch:{ all -> 0x009a }
        r5.<init>(r6, r4);	 Catch:{ all -> 0x009a }
        r4 = r0.c(r5);	 Catch:{ all -> 0x009a }
        if (r4 != 0) goto L_0x006f;
    L_0x006c:
        r0.a(r5);	 Catch:{ all -> 0x009a }
    L_0x006f:
        r4 = defpackage.acwc.PLAYER_LARGE_PLAY_BUTTON;	 Catch:{ all -> 0x009a }
        r5 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x009a }
        r6 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.VISIBILITY_UPDATE;	 Catch:{ all -> 0x009a }
        r5.<init>(r6, r4);	 Catch:{ all -> 0x009a }
        r4 = r0.c(r5);	 Catch:{ all -> 0x009a }
        if (r4 != 0) goto L_0x0081;
    L_0x007e:
        r0.a(r5);	 Catch:{ all -> 0x009a }
    L_0x0081:
        monitor-exit(r3);
        return;
    L_0x0083:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x009a }
        r5 = "logNewEmbedPreviewPage called before logNewEmbedPage";
        defpackage.afpc.a(r1, r4, r5);	 Catch:{ all -> 0x009a }
        monitor-exit(r3);
        return;
    L_0x008c:
        r0.a(r5);	 Catch:{ all -> 0x009a }
        monitor-exit(r3);
        return;
    L_0x0091:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x009a }
        r5 = "logNewApiVideoLoad before logNewEmbedPage";
        defpackage.afpc.a(r1, r4, r5);	 Catch:{ all -> 0x009a }
        monitor-exit(r3);
        return;
    L_0x009a:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(int, apxu, boolean):void");
    }

    public final synchronized void a(int i, apxu apxu) {
        EmbedInteractionLogger d = d(i);
        if (d == null) {
            afpf afpf = afpf.embeddedplayer;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("InteractionLogger with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't exist.");
            afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
            return;
        }
        d.a(apxu, null);
    }

    /* JADX WARNING: Missing block: B:15:0x0049, code skipped:
            return;
     */
    public final synchronized void a(int r3, defpackage.ajui r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d(r3);	 Catch:{ all -> 0x004a }
        if (r0 != 0) goto L_0x002c;
    L_0x0007:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x004a }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x004a }
        r1 = 52;
        r0.<init>(r1);	 Catch:{ all -> 0x004a }
        r1 = "InteractionLogger with ID ";
        r0.append(r1);	 Catch:{ all -> 0x004a }
        r0.append(r3);	 Catch:{ all -> 0x004a }
        r3 = " doesn't exist.";
        r0.append(r3);	 Catch:{ all -> 0x004a }
        r3 = r0.toString();	 Catch:{ all -> 0x004a }
        r0 = new java.lang.Throwable;	 Catch:{ all -> 0x004a }
        r0.<init>();	 Catch:{ all -> 0x004a }
        r1 = 2;
        defpackage.afpc.a(r1, r4, r3, r0);	 Catch:{ all -> 0x004a }
        monitor-exit(r2);
        return;
    L_0x002c:
        r3 = r0.b;	 Catch:{ all -> 0x004a }
        r3 = r3.a;	 Catch:{ all -> 0x004a }
        if (r3 != 0) goto L_0x0033;
    L_0x0032:
        goto L_0x0048;
    L_0x0033:
        r3 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x004a }
        r1 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.ATTACH;	 Catch:{ all -> 0x004a }
        r4 = r4.b;	 Catch:{ all -> 0x004a }
        r3.<init>(r1, r4);	 Catch:{ all -> 0x004a }
        r4 = r0.c(r3);	 Catch:{ all -> 0x004a }
        if (r4 != 0) goto L_0x0048;
    L_0x0042:
        r4 = r0.b;	 Catch:{ all -> 0x004a }
        r0 = 0;
        r4.a(r3, r0);	 Catch:{ all -> 0x004a }
    L_0x0048:
        monitor-exit(r2);
        return;
    L_0x004a:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(int, ajui):void");
    }

    /* JADX WARNING: Missing block: B:12:0x003d, code skipped:
            return;
     */
    public final synchronized void a(int r3, byte[] r4) {
        /*
        r2 = this;
        monitor-enter(r2);
        r0 = r2.d(r3);	 Catch:{ all -> 0x003e }
        if (r0 != 0) goto L_0x002c;
    L_0x0007:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x003e }
        r0 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003e }
        r1 = 52;
        r0.<init>(r1);	 Catch:{ all -> 0x003e }
        r1 = "InteractionLogger with ID ";
        r0.append(r1);	 Catch:{ all -> 0x003e }
        r0.append(r3);	 Catch:{ all -> 0x003e }
        r3 = " doesn't exist.";
        r0.append(r3);	 Catch:{ all -> 0x003e }
        r3 = r0.toString();	 Catch:{ all -> 0x003e }
        r0 = new java.lang.Throwable;	 Catch:{ all -> 0x003e }
        r0.<init>();	 Catch:{ all -> 0x003e }
        r1 = 2;
        defpackage.afpc.a(r1, r4, r3, r0);	 Catch:{ all -> 0x003e }
        monitor-exit(r2);
        return;
    L_0x002c:
        r3 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x003e }
        r1 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.VISIBILITY_UPDATE;	 Catch:{ all -> 0x003e }
        r3.<init>(r1, r4);	 Catch:{ all -> 0x003e }
        r4 = r0.c(r3);	 Catch:{ all -> 0x003e }
        if (r4 != 0) goto L_0x003c;
    L_0x0039:
        r0.a(r3);	 Catch:{ all -> 0x003e }
    L_0x003c:
        monitor-exit(r2);
        return;
    L_0x003e:
        r3 = move-exception;
        monitor-exit(r2);
        throw r3;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(int, byte[]):void");
    }

    public final synchronized void a(int i, acwc acwc) {
        EmbedInteractionLogger d = d(i);
        if (d == null) {
            afpf afpf = afpf.embeddedplayer;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("InteractionLogger with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't exist.");
            afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
            return;
        }
        d.a(new ChildLoggingRequest(LogType.CLICK, acwc));
    }

    public final synchronized void b(int i, byte[] bArr) {
        EmbedInteractionLogger d = d(i);
        if (d == null) {
            afpf afpf = afpf.embeddedplayer;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("InteractionLogger with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't exist.");
            afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
            return;
        }
        d.a(new ChildLoggingRequest(LogType.CLICK, bArr));
    }

    /* JADX WARNING: Missing block: B:21:0x005f, code skipped:
            return;
     */
    private final synchronized void a(defpackage.ahkf r5) {
        /*
        r4 = this;
        monitor-enter(r4);
        r0 = r4.a();	 Catch:{ all -> 0x0074 }
        r1 = 2;
        if (r0 != 0) goto L_0x002e;
    L_0x0008:
        r5 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x0074 }
        r0 = r4.a;	 Catch:{ all -> 0x0074 }
        r2 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0074 }
        r3 = 52;
        r2.<init>(r3);	 Catch:{ all -> 0x0074 }
        r3 = "InteractionLogger with ID ";
        r2.append(r3);	 Catch:{ all -> 0x0074 }
        r2.append(r0);	 Catch:{ all -> 0x0074 }
        r0 = " doesn't exist.";
        r2.append(r0);	 Catch:{ all -> 0x0074 }
        r0 = r2.toString();	 Catch:{ all -> 0x0074 }
        r2 = new java.lang.Throwable;	 Catch:{ all -> 0x0074 }
        r2.<init>();	 Catch:{ all -> 0x0074 }
        defpackage.afpc.a(r1, r5, r0, r2);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x002e:
        r2 = r5.e;	 Catch:{ all -> 0x0074 }
        r3 = r2 + -1;
        if (r2 == 0) goto L_0x0072;
    L_0x0034:
        r2 = 3;
        if (r3 == r2) goto L_0x0069;
    L_0x0037:
        r2 = 4;
        if (r3 == r2) goto L_0x003b;
    L_0x003a:
        goto L_0x005e;
    L_0x003b:
        r2 = r5.b;	 Catch:{ all -> 0x0074 }
        r3 = r5.d;	 Catch:{ all -> 0x0074 }
        r0.a(r2, r3);	 Catch:{ all -> 0x0074 }
        r5 = r5.c;	 Catch:{ all -> 0x0074 }
        r2 = r0.c;	 Catch:{ all -> 0x0074 }
        r2 = r2.a;	 Catch:{ all -> 0x0074 }
        if (r2 == 0) goto L_0x0060;
    L_0x004a:
        r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x0074 }
        r2 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.ATTACH;	 Catch:{ all -> 0x0074 }
        r5 = r5.b();	 Catch:{ all -> 0x0074 }
        r1.<init>(r2, r5);	 Catch:{ all -> 0x0074 }
        r5 = r0.c(r1);	 Catch:{ all -> 0x0074 }
        if (r5 != 0) goto L_0x005e;
    L_0x005b:
        r0.b(r1);	 Catch:{ all -> 0x0074 }
    L_0x005e:
        monitor-exit(r4);
        return;
    L_0x0060:
        r5 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x0074 }
        r0 = "handleWatchNextResponse called without any EmbedWatchPage logged";
        defpackage.afpc.a(r1, r5, r0);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x0069:
        r1 = r5.b;	 Catch:{ all -> 0x0074 }
        r5 = r5.d;	 Catch:{ all -> 0x0074 }
        r0.a(r1, r5);	 Catch:{ all -> 0x0074 }
        monitor-exit(r4);
        return;
    L_0x0072:
        r5 = 0;
        throw r5;	 Catch:{ all -> 0x0074 }
    L_0x0074:
        r5 = move-exception;
        monitor-exit(r4);
        throw r5;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(ahkf):void");
    }

    /* JADX WARNING: Missing block: B:12:0x003e, code skipped:
            return;
     */
    private final synchronized void a(defpackage.ahkn r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a();	 Catch:{ all -> 0x003f }
        if (r0 != 0) goto L_0x002e;
    L_0x0007:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x003f }
        r0 = r3.a;	 Catch:{ all -> 0x003f }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x003f }
        r2 = 52;
        r1.<init>(r2);	 Catch:{ all -> 0x003f }
        r2 = "InteractionLogger with ID ";
        r1.append(r2);	 Catch:{ all -> 0x003f }
        r1.append(r0);	 Catch:{ all -> 0x003f }
        r0 = " doesn't exist.";
        r1.append(r0);	 Catch:{ all -> 0x003f }
        r0 = r1.toString();	 Catch:{ all -> 0x003f }
        r1 = new java.lang.Throwable;	 Catch:{ all -> 0x003f }
        r1.<init>();	 Catch:{ all -> 0x003f }
        r2 = 2;
        defpackage.afpc.a(r2, r4, r0, r1);	 Catch:{ all -> 0x003f }
        monitor-exit(r3);
        return;
    L_0x002e:
        r4 = r4.e;	 Catch:{ all -> 0x003f }
        r0.g = r4;	 Catch:{ all -> 0x003f }
        r4 = r0.g;	 Catch:{ all -> 0x003f }
        r4 = android.text.TextUtils.isEmpty(r4);	 Catch:{ all -> 0x003f }
        if (r4 != 0) goto L_0x003d;
    L_0x003a:
        r0.a();	 Catch:{ all -> 0x003f }
    L_0x003d:
        monitor-exit(r3);
        return;
    L_0x003f:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(ahkn):void");
    }

    /* JADX WARNING: Missing block: B:12:0x003f, code skipped:
            return;
     */
    public final synchronized void a(byte[] r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a();	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x002e;
    L_0x0007:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x0040 }
        r0 = r3.a;	 Catch:{ all -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0040 }
        r2 = 52;
        r1.<init>(r2);	 Catch:{ all -> 0x0040 }
        r2 = "InteractionLogger with ID ";
        r1.append(r2);	 Catch:{ all -> 0x0040 }
        r1.append(r0);	 Catch:{ all -> 0x0040 }
        r0 = " doesn't exist.";
        r1.append(r0);	 Catch:{ all -> 0x0040 }
        r0 = r1.toString();	 Catch:{ all -> 0x0040 }
        r1 = new java.lang.Throwable;	 Catch:{ all -> 0x0040 }
        r1.<init>();	 Catch:{ all -> 0x0040 }
        r2 = 2;
        defpackage.afpc.a(r2, r4, r0, r1);	 Catch:{ all -> 0x0040 }
        monitor-exit(r3);
        return;
    L_0x002e:
        r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x0040 }
        r2 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.VISIBILITY_UPDATE;	 Catch:{ all -> 0x0040 }
        r1.<init>(r2, r4);	 Catch:{ all -> 0x0040 }
        r4 = r0.c(r1);	 Catch:{ all -> 0x0040 }
        if (r4 != 0) goto L_0x003e;
    L_0x003b:
        r0.b(r1);	 Catch:{ all -> 0x0040 }
    L_0x003e:
        monitor-exit(r3);
        return;
    L_0x0040:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(byte[]):void");
    }

    /* JADX WARNING: Missing block: B:12:0x003f, code skipped:
            return;
     */
    public final synchronized void a(defpackage.acwc r4) {
        /*
        r3 = this;
        monitor-enter(r3);
        r0 = r3.a();	 Catch:{ all -> 0x0040 }
        if (r0 != 0) goto L_0x002e;
    L_0x0007:
        r4 = defpackage.afpf.embeddedplayer;	 Catch:{ all -> 0x0040 }
        r0 = r3.a;	 Catch:{ all -> 0x0040 }
        r1 = new java.lang.StringBuilder;	 Catch:{ all -> 0x0040 }
        r2 = 52;
        r1.<init>(r2);	 Catch:{ all -> 0x0040 }
        r2 = "InteractionLogger with ID ";
        r1.append(r2);	 Catch:{ all -> 0x0040 }
        r1.append(r0);	 Catch:{ all -> 0x0040 }
        r0 = " doesn't exist.";
        r1.append(r0);	 Catch:{ all -> 0x0040 }
        r0 = r1.toString();	 Catch:{ all -> 0x0040 }
        r1 = new java.lang.Throwable;	 Catch:{ all -> 0x0040 }
        r1.<init>();	 Catch:{ all -> 0x0040 }
        r2 = 2;
        defpackage.afpc.a(r2, r4, r0, r1);	 Catch:{ all -> 0x0040 }
        monitor-exit(r3);
        return;
    L_0x002e:
        r1 = new com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger$ChildLoggingRequest;	 Catch:{ all -> 0x0040 }
        r2 = com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLogger.ChildLoggingRequest.LogType.VISIBILITY_UPDATE;	 Catch:{ all -> 0x0040 }
        r1.<init>(r2, r4);	 Catch:{ all -> 0x0040 }
        r4 = r0.c(r1);	 Catch:{ all -> 0x0040 }
        if (r4 != 0) goto L_0x003e;
    L_0x003b:
        r0.b(r1);	 Catch:{ all -> 0x0040 }
    L_0x003e:
        monitor-exit(r3);
        return;
    L_0x0040:
        r4 = move-exception;
        monitor-exit(r3);
        throw r4;
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.youtube.embeddedplayer.service.service.jar.EmbedInteractionLoggerCoordinator.a(acwc):void");
    }

    public final synchronized void b(byte[] bArr) {
        EmbedInteractionLogger a = a();
        if (a == null) {
            afpf afpf = afpf.embeddedplayer;
            int i = this.a;
            StringBuilder stringBuilder = new StringBuilder(52);
            stringBuilder.append("InteractionLogger with ID ");
            stringBuilder.append(i);
            stringBuilder.append(" doesn't exist.");
            afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
            return;
        }
        a.b(new ChildLoggingRequest(LogType.CLICK, bArr));
    }

    public final synchronized void b(acwc acwc) {
        EmbedInteractionLogger a = a();
        if (a != null) {
            a.b(new ChildLoggingRequest(LogType.CLICK, acwc));
            return;
        }
        afpf afpf = afpf.embeddedplayer;
        int i = this.a;
        StringBuilder stringBuilder = new StringBuilder(52);
        stringBuilder.append("InteractionLogger with ID ");
        stringBuilder.append(i);
        stringBuilder.append(" doesn't exist.");
        afpc.a(2, afpf, stringBuilder.toString(), new Throwable());
    }

    private final EmbedInteractionLogger d(int i) {
        return (EmbedInteractionLogger) this.d.get(Integer.valueOf(i));
    }

    private final EmbedInteractionLogger a() {
        return d(this.a);
    }

    public final Class[] a(Class cls, Object obj, int i) {
        if (i == -1) {
            return new Class[]{ahkf.class, ahkn.class};
        } else if (i == 0) {
            a((ahkf) obj);
            return null;
        } else if (i == 1) {
            a((ahkn) obj);
            return null;
        } else {
            StringBuilder stringBuilder = new StringBuilder(32);
            stringBuilder.append("unsupported op code: ");
            stringBuilder.append(i);
            throw new IllegalStateException(stringBuilder.toString());
        }
    }
}
