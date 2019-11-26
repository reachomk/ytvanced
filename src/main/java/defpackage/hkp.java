package defpackage;

import android.util.Pair;
import com.google.protos.youtube.api.innertube.DownloadsPageEndpointOuterClass;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: hkp */
public final class hkp implements acwa {
    public final acvx a;
    public final amur b = amur.a("downloads_page_downloads_item_section_identifier", acwc.DOWNLOADS_PAGE_MY_DOWNLOADS_SECTION, "downloads_page_recommendations_item_section_identifier", acwc.DOWNLOADS_PAGE_RECOMMENDATIONS_SECTION);
    public final Map c;
    public final Map d;
    public final Map e;
    public final Map f;
    public int g;

    public static acwc a(String str, Object obj) {
        if (obj instanceof axqn) {
            return acwc.DOWNLOADS_PAGE_FILTER_MENU;
        }
        if (obj instanceof axql) {
            int a;
            axql axql = (axql) obj;
            int i = 1;
            boolean z = hkp.a(axql) || hkp.b(axql);
            amqw.a(z);
            Object b;
            if (hkp.a(axql)) {
                anxp anxp;
                if (axql.b == 6) {
                    anxp = (apxu) axql.c;
                } else {
                    anxp = apxu.d;
                }
                anxr access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
                anxp.a(access$000);
                b = anxp.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                a = aqxx.a(((aqxw) b).b);
                if (a != 0) {
                    i = a;
                }
            } else {
                axqp axqp;
                if (axql.b == 3) {
                    axqp = (axqp) axql.c;
                } else {
                    axqp = axqp.c;
                }
                b = axqp.b;
                if (b == null) {
                    b = awzv.d;
                }
                i = hss.a(ajtj.a(b));
            }
            a = i - 1;
            if (i != 0) {
                acwc acwc;
                if (a == 2) {
                    acwc = acwc.DOWNLOADS_PAGE_FILTER_MENU_PLAYLISTS_ITEM;
                } else if (a != 3) {
                    acwc = acwc.DOWNLOADS_PAGE_FILTER_MENU_PLAYLISTS_AND_VIDEOS_ITEM;
                } else {
                    acwc = acwc.DOWNLOADS_PAGE_FILTER_MENU_VIDEOS_ITEM;
                }
                return acwc;
            }
            throw null;
        } else if (obj instanceof aqfs) {
            return acwc.DOWNLOADS_PAGE_PLAYLIST;
        } else {
            if (obj instanceof aqgs) {
                if ("downloads_page_downloads_item_section_identifier".equals(str)) {
                    return acwc.DOWNLOADS_PAGE_VIDEO;
                }
                if ("downloads_page_recommendations_item_section_identifier".equals(str)) {
                    return acwc.DOWNLOADS_PAGE_RECOMMENDED_VIDEO;
                }
            } else if (obj instanceof avmq) {
                return acwc.OFFLINE_BUNDLE_ITEM_RENDERER;
            }
            return null;
        }
    }

    public hkp(acvx acvx) {
        this.a = acvx;
        this.g = 0;
        this.d = new HashMap();
        this.c = new HashMap();
        this.e = new HashMap();
        this.f = new HashMap();
    }

    public final void b(String str, Object obj) {
        Set set;
        if (this.f.containsKey(str)) {
            set = (Set) this.f.get(str);
        } else {
            set = new HashSet();
            this.f.put(str, set);
        }
        set.add(obj);
    }

    public final azfa c(String str, Object obj) {
        if (this.c.containsKey(str)) {
            acwc a = hkp.a(str, obj);
            if (a != null) {
                Object create = Pair.create((azfa) this.c.get(str), obj);
                if (this.f.containsKey(str) && ((Set) this.f.get(str)).contains(obj)) {
                    return this.a.a(create, a);
                }
                if (this.e.containsKey(str)) {
                    Map map = (Map) this.e.get(str);
                    if (map.containsKey(obj)) {
                        return this.a.a(create, a, ((Integer) map.get(obj)).intValue());
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0024  */
    public final defpackage.azfa a(defpackage.acwc r3, java.lang.Object r4) {
        /*
        r2 = this;
        r0 = defpackage.acwc.DOWNLOADS_PAGE_RECOMMENDED_VIDEO;
        r1 = 0;
        if (r3 != r0) goto L_0x002d;
    L_0x0005:
        r3 = r4 instanceof defpackage.aqgs;
        if (r3 == 0) goto L_0x0021;
    L_0x0009:
        r4 = (defpackage.aqgs) r4;
        r3 = r4.x;
        if (r3 != 0) goto L_0x0011;
    L_0x000f:
        r3 = defpackage.ayym.c;
    L_0x0011:
        r3 = r3.a;
        r3 = r3 & 1;
        if (r3 != 0) goto L_0x0018;
    L_0x0017:
        goto L_0x0021;
    L_0x0018:
        r3 = r4.x;
        if (r3 != 0) goto L_0x001e;
    L_0x001c:
        r3 = defpackage.ayym.c;
    L_0x001e:
        r3 = r3.b;
        goto L_0x0022;
    L_0x0021:
        r3 = r1;
    L_0x0022:
        if (r3 == 0) goto L_0x002d;
    L_0x0024:
        r4 = r2.a;
        r0 = defpackage.acwc.OFFLINEABILITY_RENDERER;
        r3 = r4.a(r3, r0);
        return r3;
    L_0x002d:
        return r1;
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hkp.a(acwc, java.lang.Object):azfa");
    }

    public final acvx t() {
        return this.a;
    }

    public static boolean a(axql axql) {
        anxp anxp;
        if (axql.b == 6) {
            anxp = (apxu) axql.c;
        } else {
            anxp = apxu.d;
        }
        anxr access$000 = anxl.checkIsLite(DownloadsPageEndpointOuterClass.downloadsPageEndpoint);
        anxp.a(access$000);
        return anxp.h.a(access$000.d);
    }

    public static boolean b(axql axql) {
        axqp axqp;
        if (axql.b == 3) {
            axqp = (axqp) axql.c;
        } else {
            axqp = axqp.c;
        }
        Object obj = axqp.b;
        if (obj == null) {
            obj = awzv.d;
        }
        return hss.a(ajtj.a(obj)) != 1;
    }
}
