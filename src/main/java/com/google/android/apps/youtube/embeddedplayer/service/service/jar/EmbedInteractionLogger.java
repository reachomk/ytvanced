package com.google.android.apps.youtube.embeddedplayer.service.service.jar;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.WatchEndpointOuterClass;
import defpackage.aakj;
import defpackage.acvs;
import defpackage.acvx;
import defpackage.acwc;
import defpackage.acwl;
import defpackage.acxf;
import defpackage.afpc;
import defpackage.afpf;
import defpackage.amqq;
import defpackage.anxl;
import defpackage.anxr;
import defpackage.apxu;
import defpackage.atss;
import defpackage.atst;
import defpackage.atsy;
import defpackage.atsz;
import defpackage.azje;
import defpackage.bcaa;
import defpackage.msf;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class EmbedInteractionLogger {
    public final LoggerWrapper a;
    public final LoggerWrapper b;
    public final LoggerWrapper c;
    public final int d;
    public final Set e = new HashSet();
    public apxu f = null;
    public String g = null;
    private final String h;
    private final Set i = new HashSet();

    class ChildLoggingRequest {
        public final LogType a;
        public final byte[] b;
        public final acwc c;

        enum LogType {
            ATTACH,
            CLICK,
            VISIBILITY_UPDATE
        }

        ChildLoggingRequest(LogType logType, byte[] bArr) {
            this.a = logType;
            this.b = bArr;
            this.c = null;
        }

        ChildLoggingRequest(LogType logType, acwc acwc) {
            this.a = logType;
            this.c = acwc;
            this.b = null;
        }

        public final int hashCode() {
            return Arrays.deepHashCode(new Object[]{this.a, this.b, this.c});
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj != null && (obj instanceof ChildLoggingRequest)) {
                ChildLoggingRequest childLoggingRequest = (ChildLoggingRequest) obj;
                return this.a == childLoggingRequest.a && Arrays.equals(this.b, childLoggingRequest.b) && this.c == childLoggingRequest.c;
            }
        }
    }

    class LoggerWrapper {
        public boolean a = false;
        private final acvx b;

        LoggerWrapper(acvx acvx) {
            this.b = acvx;
        }

        public final void a(acwl acwl, apxu apxu, atst atst) {
            this.b.a(acwl, apxu, atst);
            this.a = true;
        }

        public final void a() {
            this.b.b();
            this.a = false;
        }

        public final void a(apxu apxu) {
            this.b.a(apxu);
        }

        /* Access modifiers changed, original: final */
        public final void a(ChildLoggingRequest childLoggingRequest, String str) {
            atst a = EmbedInteractionLogger.this.a(str);
            if (!EmbedInteractionLogger.this.e.contains(childLoggingRequest)) {
                EmbedInteractionLogger.this.e.add(childLoggingRequest);
            }
            int ordinal = childLoggingRequest.a.ordinal();
            byte[] bArr;
            acwc acwc;
            if (ordinal == 0) {
                acxf acvs;
                byte[] bArr2 = childLoggingRequest.b;
                if (bArr2 != null) {
                    acvs = new acvs(bArr2);
                } else {
                    acvs = new acvs(childLoggingRequest.c);
                }
                this.b.a(acvs);
                this.b.a(str);
                this.b.b(acvs, EmbedInteractionLogger.this.a(null));
            } else if (ordinal == 1) {
                bArr = childLoggingRequest.b;
                if (bArr == null) {
                    acwc = childLoggingRequest.c;
                    if (acwc != null) {
                        this.b.a(3, new acvs(acwc), a);
                        return;
                    }
                }
                this.b.a(3, new acvs(bArr), a);
            } else if (ordinal == 2) {
                bArr = childLoggingRequest.b;
                if (bArr == null) {
                    acwc = childLoggingRequest.c;
                    if (acwc != null) {
                        this.b.a(new acvs(acwc), a);
                        return;
                    }
                }
                this.b.a(bArr, a);
            }
        }
    }

    public EmbedInteractionLogger(bcaa bcaa, int i, String str) {
        this.a = new LoggerWrapper((acvx) bcaa.get());
        this.b = new LoggerWrapper((acvx) bcaa.get());
        this.c = new LoggerWrapper((acvx) bcaa.get());
        this.d = i;
        this.h = str;
    }

    public final void a(apxu apxu) {
        a();
        b();
        LoggerWrapper loggerWrapper = this.c;
        if (!loggerWrapper.a) {
            loggerWrapper = this.b;
            if (!loggerWrapper.a) {
                loggerWrapper = this.a;
            }
        }
        loggerWrapper.a(apxu);
        this.c.a(acwl.m, apxu, a(null));
        this.f = apxu;
        this.g = null;
    }

    public final void a(ChildLoggingRequest childLoggingRequest) {
        LoggerWrapper loggerWrapper = this.b;
        if (loggerWrapper.a) {
            loggerWrapper.a(childLoggingRequest, null);
        } else {
            afpc.a(2, afpf.embeddedplayer, "logChildRequestForPreview called without logNewEmbedPreviewPage");
        }
    }

    public final void a(aakj aakj, apxu apxu) {
        a(apxu, aakj.b());
        ChildLoggingRequest childLoggingRequest = new ChildLoggingRequest(LogType.ATTACH, aakj.x());
        if (!c(childLoggingRequest)) {
            b(childLoggingRequest);
            childLoggingRequest = new ChildLoggingRequest(LogType.ATTACH, acwc.PLAYER_YOU_TUBE_BUTTON);
            if (!c(childLoggingRequest)) {
                b(childLoggingRequest);
            }
        }
    }

    public final void a(apxu apxu, String str) {
        apxu apxu2 = this.f;
        if (apxu2 != null) {
            int a;
            anxr access$000;
            Object b;
            if (apxu == null) {
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu2.a(access$000);
                b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                a = amqq.a(((azje) b).b, str);
            } else {
                Object obj;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu2.a(access$000);
                b = apxu2.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                azje azje = (azje) b;
                access$000 = anxl.checkIsLite(WatchEndpointOuterClass.watchEndpoint);
                apxu.a(access$000);
                Object b2 = apxu.h.b(access$000.d);
                if (b2 == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b2);
                }
                a = azje.equals(obj);
            }
            if ((a ^ 1) == 0) {
                return;
            }
        }
        if (apxu == null) {
            apxu = msf.a(str, 0);
        }
        a(apxu);
    }

    public final void b(ChildLoggingRequest childLoggingRequest) {
        if (this.c.a) {
            this.e.add(childLoggingRequest);
            if (TextUtils.isEmpty(this.g)) {
                this.i.add(childLoggingRequest);
                return;
            } else {
                this.c.a(childLoggingRequest, this.g);
                return;
            }
        }
        afpc.a(2, afpf.embeddedplayer, "queueOrLogChildRequestForPlayback called before EmbedWatchPage is logged.", new Throwable());
    }

    public final void a() {
        for (ChildLoggingRequest a : this.i) {
            this.c.a(a, this.g);
        }
        this.i.clear();
    }

    public final void b() {
        this.e.clear();
    }

    public final boolean c(ChildLoggingRequest childLoggingRequest) {
        return this.e.contains(childLoggingRequest);
    }

    /* Access modifiers changed, original: final */
    public final atst a(String str) {
        atsz atsz;
        atss atss = (atss) atst.q.createBuilder();
        atsy atsy = (atsy) atsz.d.createBuilder();
        if (str != null) {
            atsy.copyOnWrite();
            atsz = (atsz) atsy.instance;
            atsz.a |= 1;
            atsz.b = str;
        }
        str = this.h;
        atsy.copyOnWrite();
        atsz = (atsz) atsy.instance;
        if (str != null) {
            atsz.a |= 2;
            atsz.c = str;
            atss.a(atsy);
            return (atst) ((anxl) atss.build());
        }
        throw new NullPointerException();
    }
}
