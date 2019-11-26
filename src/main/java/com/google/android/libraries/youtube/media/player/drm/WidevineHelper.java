package com.google.android.libraries.youtube.media.player.drm;

import android.media.UnsupportedSchemeException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import defpackage.aajj;
import defpackage.aerr;
import defpackage.aers;
import defpackage.aeru;
import defpackage.aerz;
import defpackage.aese;
import defpackage.aesp;
import defpackage.aesu;
import defpackage.aesx;
import defpackage.aetb;
import defpackage.aetm;
import defpackage.afjj;
import defpackage.amqw;
import defpackage.bcaa;
import defpackage.nqb;
import defpackage.nqe;
import defpackage.nqk;
import defpackage.nqm;
import defpackage.nqp;
import defpackage.nxf;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class WidevineHelper implements aesu, aesx {
    public final Listener a;
    public final int b;
    public final aajj c;
    public final String d;
    public final bcaa e;
    public final afjj f;
    public final aetb g;
    public boolean h;
    public boolean i;
    public aerz j;
    public boolean k;
    public String l;

    public final class DrmProvisionException extends Exception {
        public DrmProvisionException(Exception exception) {
            super(exception);
        }
    }

    public interface Listener {
        void onDrmError(int i, Exception exception);

        void onHdDrmPlayable(int i);

        void onHdDrmUnavailable(int i, String str);
    }

    public class V18CompatibilityLayer {
        private V18CompatibilityLayer() {
        }

        public static int getSystemWidevineSecurityLevel() {
            return aesp.h();
        }

        private static void logKeyStatusChangeEvent(boolean z, byte[] bArr, List list, boolean z2) {
            ByteBuffer.wrap(bArr).getInt();
            for (nqe nqe : list) {
                aerr.a(nqe.b());
                nqe.a();
            }
        }

        public static aerz createDrmSessionManager18(Uri uri, aetb aetb, Looper looper, Handler handler, WidevineHelper widevineHelper, String str, String str2, String str3, String str4, String str5, boolean z, aese aese, afjj afjj, aajj aajj) {
            aetm aetm = new aetm(!aajj.V() ? uri.toString() : null, aetb, str, str2, str4, str5, handler, widevineHelper);
            HashMap hashMap = new HashMap(1);
            hashMap.put("aid", str3);
            WidevineHelper$V18CompatibilityLayer$$Lambda$0 widevineHelper$V18CompatibilityLayer$$Lambda$0 = new WidevineHelper$V18CompatibilityLayer$$Lambda$0(aese, str);
            try {
                nqk nqk = new nqk(aers.a);
                if (aajj.U()) {
                    nqk.a("securityLevel", "L3");
                }
                Handler handler2;
                WidevineHelper widevineHelper2;
                if (VERSION.SDK_INT >= 23) {
                    handler2 = handler;
                    widevineHelper2 = widevineHelper;
                    WidevineHelper$V18CompatibilityLayer$$Lambda$1 widevineHelper$V18CompatibilityLayer$$Lambda$1 = new WidevineHelper$V18CompatibilityLayer$$Lambda$1(nqk, aajj, handler, widevineHelper);
                    if (nxf.a >= 23) {
                        nqk.a.setOnKeyStatusChangeListener(new nqm(nqk, widevineHelper$V18CompatibilityLayer$$Lambda$1), null);
                    } else {
                        throw new UnsupportedOperationException();
                    }
                }
                handler2 = handler;
                widevineHelper2 = widevineHelper;
                aajj aajj2 = aajj;
                if (!z || VERSION.SDK_INT < 21) {
                    return new aesp(looper, aetm, hashMap, handler, widevineHelper, widevineHelper$V18CompatibilityLayer$$Lambda$0, nqk, afjj);
                }
                return new aeru(looper, aetm, hashMap, handler, widevineHelper, nqk, afjj, aajj);
            } catch (UnsupportedSchemeException e) {
                throw new nqp(e);
            }
        }

        static final /* synthetic */ void lambda$createDrmSessionManager18$2$WidevineHelper$V18CompatibilityLayer(nqk nqk, aajj aajj, Handler handler, WidevineHelper widevineHelper, nqb nqb, byte[] bArr, List list, boolean z) {
            boolean z2 = nqb == nqk;
            logKeyStatusChangeEvent(z2, bArr, list, z);
            if (aajj.ap() && z2) {
                handler.post(new WidevineHelper$V18CompatibilityLayer$$Lambda$2(widevineHelper, list));
            }
        }

        static final /* synthetic */ void lambda$createDrmSessionManager18$1$WidevineHelper$V18CompatibilityLayer(WidevineHelper widevineHelper, List list) {
            if (widevineHelper.l != null && widevineHelper.c.ap() && !widevineHelper.h && widevineHelper.k && widevineHelper.c.T()) {
                for (nqe nqe : list) {
                    int a = nqe.a();
                    if (widevineHelper.l.equals(aerr.a(nqe.b())) && a == 0) {
                        widevineHelper.h = true;
                        widevineHelper.a.onHdDrmPlayable(widevineHelper.b);
                        return;
                    }
                }
            }
        }
    }

    public WidevineHelper(Listener listener, int i, aajj aajj, String str, bcaa bcaa, afjj afjj, aetb aetb) {
        this.a = (Listener) amqw.a((Object) listener);
        this.b = i;
        this.c = (aajj) amqw.a((Object) aajj);
        this.d = (String) amqw.a((Object) str);
        this.e = (bcaa) amqw.a((Object) bcaa);
        this.f = (afjj) amqw.a((Object) afjj);
        this.g = (aetb) amqw.a((Object) aetb);
    }

    public final void a(Exception exception) {
        this.a.onDrmError(this.b, exception);
    }

    public final void i() {
        this.i = true;
        if (!this.k) {
            this.a.onHdDrmUnavailable(this.b, "SecureSurfaceUnavailable");
        } else if (a() != 1) {
            this.a.onHdDrmUnavailable(this.b, "WidevineL1");
        } else if (this.c.T()) {
            this.h = true;
            this.a.onHdDrmPlayable(this.b);
        } else {
            this.a.onHdDrmUnavailable(this.b, "DeviceBlacklisted");
        }
    }

    public final void a(Map map) {
        if (this.c.ap()) {
            for (String str : map.keySet()) {
                if (((Integer) map.get(str)).intValue() == 3) {
                    this.l = str;
                }
            }
        }
    }

    public final int a() {
        if (!this.k) {
            return 3;
        }
        aerz aerz = this.j;
        if (aerz != null) {
            return aerz.f();
        }
        return V18CompatibilityLayer.getSystemWidevineSecurityLevel();
    }
}
