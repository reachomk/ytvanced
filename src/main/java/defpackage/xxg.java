package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import com.google.protos.youtube.api.innertube.SendShareEndpoint$SendShareToConversationEndpoint;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: xxg */
public final class xxg implements algc, yfe {
    private final aaas a;
    private final akpd b;
    private final xzk c;
    private final akpk d;
    private final akmx e;
    private final String f;
    private final yfd g;
    private final Map h = new HashMap();
    private int i;

    public xxg(aaas aaas, akmx akmx, String str, akpd akpd, akpk akpk, xzk xzk, yfd yfd) {
        this.a = (aaas) amqw.a((Object) aaas);
        this.e = (akmx) amqw.a((Object) akmx);
        this.f = xvd.a(str);
        this.b = (akpd) amqw.a((Object) akpd);
        this.c = (xzk) amqw.a((Object) xzk);
        this.d = (akpk) amqw.a((Object) akpk);
        this.g = (yfd) amqw.a((Object) yfd);
    }

    public final void a() {
    }

    public final void a(apxu apxu) {
        a(apxu, false);
    }

    public final boolean a(aseo aseo) {
        arml arml;
        Iterator it = aseo.f.iterator();
        while (true) {
            arml = null;
            if (!it.hasNext()) {
                break;
            }
            Object a = zdb.a((ajtp) ajzv.a((aqnn) it.next(), ajtp.class));
            String c = zcz.c(a);
            if (c != null) {
                Object obj;
                this.h.remove(c);
                int size = this.d.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj2 = this.d.get(size);
                    if (TextUtils.equals(zcz.c(xxg.a(obj2)), c)) {
                        obj = obj2;
                        break;
                    }
                }
                if (obj != null) {
                    Object ycp;
                    this.c.a.remove(obj);
                    this.e.b(ycq.a(this.f, zcz.c(xxg.a(obj))));
                    if ((obj instanceof ycp) && (a instanceof ajtu)) {
                        ycp = new ycp((ajtu) a, ((ycp) obj).b);
                    } else if ((obj instanceof ycs) && (a instanceof ajtu)) {
                        ycp = new ycs((ajtu) a, ((ycs) obj).b);
                    } else {
                        ycp = a;
                    }
                    this.d.a(obj, ycp);
                } else {
                    String.format("PostItemController can't find temporary item %s", new Object[]{c});
                }
            }
        }
        int i = this.i;
        if (i >= 0) {
            this.b.a(i, 1);
        }
        yfd yfd = this.g;
        if (yfd != null) {
            yfd.a(this);
        }
        xzk xzk = this.c;
        if ((aseo.a & 16) != 0) {
            arml = aseo.h;
            if (arml == null) {
                arml = arml.f;
            }
        }
        xzk.b = ajqy.a(arml);
        this.c.b();
        return true;
    }

    public final void a(String str) {
        apxu apxu = (apxu) this.h.get(str);
        if (apxu != null) {
            a(apxu, true);
        }
    }

    public final void b(apxu apxu) {
        a(true, xxg.c(apxu));
    }

    private final void a(apxu apxu, boolean z) {
        if (!z) {
            this.i = this.d.size() - 2;
        }
        Map hashMap = new HashMap();
        hashMap.put("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
        hashMap.put("SendShareToConversationListener", this);
        a(false, xxg.c(apxu));
        if (!z) {
            anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
            apxu.a(access$000);
            if (apxu.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
                apxu.a(access$000);
                Object b = apxu.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                asfa asfa = ((SendShareEndpoint$SendShareToConversationEndpoint) obj).b;
                if (asfa == null) {
                    asfa = asfa.f;
                }
                int i = asfa.a;
                int i2 = i & 8;
                i &= 2;
                if (!(i2 == 0 && i == 0)) {
                    Map map;
                    if (i2 != 0 && i == 0) {
                        map = this.h;
                        asdi asdi = asfa.e;
                        if (asdi == null) {
                            asdi = asdi.d;
                        }
                        map.put(asdi.c, apxu);
                    } else if (i2 == 0 && i != 0) {
                        map = this.h;
                        asdk asdk = asfa.c;
                        if (asdk == null) {
                            asdk = asdk.d;
                        }
                        map.put(asdk.c, apxu);
                    } else {
                        apxx apxx = (apxx) ((anxo) apxu.toBuilder());
                        axfm axfm = (axfm) ((anxo) ((SendShareEndpoint$SendShareToConversationEndpoint) apxx.b(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint)).toBuilder());
                        asfd asfd = (asfd) ((anxo) axfm.a().toBuilder());
                        asfd.copyOnWrite();
                        asfa asfa2 = (asfa) asfd.instance;
                        asfa2.c = null;
                        asfa2.a &= -3;
                        asfd.copyOnWrite();
                        asfa2 = (asfa) asfd.instance;
                        asfa2.a &= -2;
                        asfa2.b = asfa.f.b;
                        axfm.a(asfd);
                        apxx.a(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint, (SendShareEndpoint$SendShareToConversationEndpoint) ((anxl) axfm.build()));
                        map = this.h;
                        asdi asdi2 = ((asfa) asfd.instance).e;
                        if (asdi2 == null) {
                            asdi2 = asdi.d;
                        }
                        map.put(asdi2.c, (apxu) ((anxl) apxx.build()));
                        apxx = (apxx) ((anxo) apxu.toBuilder());
                        axfm = (axfm) ((anxo) ((SendShareEndpoint$SendShareToConversationEndpoint) apxx.b(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint)).toBuilder());
                        asfd = (asfd) ((anxo) axfm.a().toBuilder());
                        asfd.copyOnWrite();
                        asfa2 = (asfa) asfd.instance;
                        asfa2.e = null;
                        asfa2.a &= -9;
                        asfd.copyOnWrite();
                        asfa2 = (asfa) asfd.instance;
                        asfa2.a &= -5;
                        asfa2.d = asfa.f.d;
                        axfm.a(asfd);
                        apxx.a(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint, (SendShareEndpoint$SendShareToConversationEndpoint) ((anxl) axfm.build()));
                        map = this.h;
                        asdk asdk2 = ((asfa) asfd.instance).c;
                        if (asdk2 == null) {
                            asdk2 = asdk.d;
                        }
                        map.put(asdk2.c, (apxu) ((anxl) apxx.build()));
                    }
                }
            }
        }
        this.a.a(apxu, hashMap);
    }

    private final void a(boolean z, Set set) {
        for (int i = 0; i < this.d.size(); i++) {
            Object a = xxg.a(this.d.get(i));
            String c = zcz.c(a);
            if (!TextUtils.isEmpty(c) && set.contains(c)) {
                ycl ycl;
                Uri a2 = ycq.a(this.f, zcz.c(a));
                ycm ycm = (ycm) this.e.a(a2);
                if (ycm == null) {
                    ycl = new ycl(this.f, a, false);
                } else {
                    ycl = ycm.a();
                }
                akmx akmx = this.e;
                ycl.e = z;
                akmx.b(a2, ycl.a());
            }
        }
    }

    private static Object a(Object obj) {
        if (obj instanceof ycp) {
            return ((ycp) obj).a;
        }
        if (obj instanceof ycs) {
            obj = ((ycs) obj).a;
        }
        return obj;
    }

    private static Set c(apxu apxu) {
        HashSet hashSet = new HashSet();
        anxr access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
        apxu.a(access$000);
        if (apxu.h.a(access$000.d)) {
            access$000 = anxl.checkIsLite(SendShareEndpoint$SendShareToConversationEndpoint.sendShareToConversationEndpoint);
            apxu.a(access$000);
            Object b = apxu.h.b(access$000.d);
            if (b == null) {
                b = access$000.b;
            } else {
                b = access$000.a(b);
            }
            SendShareEndpoint$SendShareToConversationEndpoint sendShareEndpoint$SendShareToConversationEndpoint = (SendShareEndpoint$SendShareToConversationEndpoint) b;
            if ((sendShareEndpoint$SendShareToConversationEndpoint.a & 1) != 0) {
                asfa asfa = sendShareEndpoint$SendShareToConversationEndpoint.b;
                if (asfa == null) {
                    asfa = asfa.f;
                }
                asdi asdi = asfa.e;
                if (asdi == null) {
                    asdi = asdi.d;
                }
                if (!asdi.c.isEmpty()) {
                    asdi = asfa.e;
                    if (asdi == null) {
                        asdi = asdi.d;
                    }
                    hashSet.add(asdi.c);
                }
                asdk asdk = asfa.c;
                if (asdk == null) {
                    asdk = asdk.d;
                }
                if (!asdk.c.isEmpty()) {
                    asdk asdk2 = asfa.c;
                    if (asdk2 == null) {
                        asdk2 = asdk.d;
                    }
                    hashSet.add(asdk2.c);
                }
            }
        }
        return hashSet;
    }
}
