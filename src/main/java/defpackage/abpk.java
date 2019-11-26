package defpackage;

import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: abpk */
public final class abpk implements abot, abrl, xsu {
    public final xoi a;
    public final aboq b;
    public final Set c = new HashSet();
    public final abpo d;
    public ajwv e;
    private final aaas f;
    private final akti g;
    private apxu h;

    public abpk(aboq aboq, aaas aaas, xoi xoi, akti akti, abpo abpo) {
        this.b = aboq;
        this.f = aaas;
        this.a = xoi;
        this.g = akti;
        this.d = (abpo) amqw.a((Object) abpo);
        this.d.a((abot) this);
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(abri abri) {
        if (!this.c.contains(abri)) {
            abri.a();
            abri.a((abrl) this);
            ajwv ajwv = this.e;
            if (ajwv != null) {
                abri.a(ajwv);
            }
            this.c.add(abri);
        }
    }

    public final void a() {
        for (abri b : this.c) {
            b.b();
        }
    }

    public final void a(ajwv ajwv) {
        this.e = ajwv;
        aufd aufd = ajwv.b;
        apxu apxu = null;
        if (aufd != null) {
            auex auex = aufd.g;
            if (auex == null) {
                auex = auex.c;
            }
            if (((auex.a == 65153809 ? (aphg) auex.b : aphg.s).a & 2048) != 0) {
                aphg aphg;
                auex auex2 = aufd.g;
                if (auex2 == null) {
                    auex2 = auex.c;
                }
                if (auex2.a == 65153809) {
                    aphg = (aphg) auex2.b;
                } else {
                    aphg = aphg.s;
                }
                apxu = aphg.l;
                if (apxu == null) {
                    apxu = apxu.d;
                }
            }
        }
        this.h = apxu;
        for (abri a : this.c) {
            a.a(ajwv);
        }
    }

    public final void a(CharSequence charSequence) {
        if (this.h != null) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abpn(this, charSequence.toString().trim(), abpk.b(this.h)));
            this.f.a(this.h, hashMap);
        }
    }

    public final void a(augl augl) {
        if (this.h != null) {
            Map hashMap = new HashMap();
            hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", new abpn(this, this.g, augl, abpk.b(this.h)));
            this.f.a(this.h, hashMap);
        }
    }

    public final void a(apxu apxu) {
        this.f.a(apxu, null);
    }

    private static String b(apxu apxu) {
        anxr access$000 = anxl.checkIsLite(SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint.sendLiveChatMessageEndpoint);
        apxu.a(access$000);
        Object b = apxu.h.b(access$000.d);
        if (b == null) {
            b = access$000.b;
        } else {
            b = access$000.a(b);
        }
        if (((SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) b).d.isEmpty()) {
            return null;
        }
        return TextUtils.concat(new CharSequence[]{((SendLiveChatMessageEndpointOuterClass$SendLiveChatMessageEndpoint) b).d, String.valueOf(System.currentTimeMillis())}).toString();
    }
}
