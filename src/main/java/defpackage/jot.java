package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint;
import com.google.protos.youtube.api.innertube.OfflineVideoEndpointOuterClass$OfflineVideoEndpoint;
import java.util.ArrayList;
import java.util.Collection;

/* renamed from: jot */
public final class jot implements aafd {
    private final Context a;
    private final bcaa b;
    private final eki c;

    public jot(Context context, bcaa bcaa, eki eki) {
        this.a = context;
        this.b = bcaa;
        this.c = eki;
    }

    public final auvj a() {
        return null;
    }

    public final amul a(auvj auvj) {
        amqw.a((Object) auvj);
        apxu d = abmk.d(auvj);
        if (d != null) {
            anxr access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
                d.a(access$000);
                Object b = d.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                OfflineVideoEndpointOuterClass$OfflineVideoEndpoint offlineVideoEndpointOuterClass$OfflineVideoEndpoint = (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) b;
                if (offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b.isEmpty()) {
                    return amul.g();
                }
                agqy a = this.c.b() ? ((agwc) this.b.get()).b().k().a(offlineVideoEndpointOuterClass$OfflineVideoEndpoint.b) : null;
                String str = offlineVideoEndpointOuterClass$OfflineVideoEndpoint.c;
                Collection arrayList = new ArrayList();
                if (a != null && !a.i()) {
                    switch (a.u().ordinal()) {
                        case 3:
                        case 4:
                        case 5:
                        case 6:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 12:
                            arrayList.add(a(auvj, 4, R.string.pause_offline));
                            break;
                        case 11:
                            arrayList.add(a(auvj, 6, R.string.resume_offline));
                            break;
                        case 13:
                        case 14:
                        case 15:
                        case 16:
                        case 17:
                        case 18:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                            arrayList.add(a(auvj, 5, R.string.offline_retry_failed_videos_menu_item));
                            break;
                        case 19:
                            arrayList.add(a(auvj, 9, R.string.renew_offline));
                            break;
                    }
                    arrayList.add(a(auvj, 3, R.string.remove_offline));
                } else if (amqu.a(str) || !this.c.a(str)) {
                    arrayList.add(a(auvj, 2, R.string.menu_add_to_offline));
                } else {
                    arrayList.add(a(auvj, 8, R.string.readd_to_offline));
                }
                return amul.a(arrayList);
            }
        }
        return amul.g();
    }

    public final auvj b(auvj auvj) {
        amqw.a((Object) auvj);
        apxu d = abmk.d(auvj);
        auvj auvj2 = null;
        if (d != null) {
            anxr access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
                d.a(access$000);
                Object b = d.h.b(access$000.d);
                if (b == null) {
                    b = access$000.b;
                } else {
                    b = access$000.a(b);
                }
                OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint = (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) b;
                if (!offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b.isEmpty()) {
                    if (this.c.a(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b)) {
                        auvj2 = ((agwc) this.b.get()).b().n().f(offlinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.b);
                    }
                    if (auvj2 == null) {
                        return b(auvj, 2, R.string.menu_add_to_offline);
                    }
                    return b(auvj, 3, R.string.remove_offline);
                }
            }
        }
        return null;
    }

    private final void a(auvm auvm, int i) {
        arml a = ajqy.a(this.a.getResources().getString(i));
        auvj auvj = (auvj) auvm.instance;
        anxl anxl;
        auvj auvj2;
        if ((auvj.a & 1) != 0) {
            anxl = auvj.b;
            if (anxl == null) {
                anxl = auvl.f;
            }
            auvo auvo = (auvo) ((anxo) anxl.toBuilder());
            auvo.a(a);
            auvm.copyOnWrite();
            auvj2 = (auvj) auvm.instance;
            auvj2.b = (auvl) ((anxl) auvo.build());
            auvj2.a |= 1;
        } else if (auvm.a()) {
            auvs auvs = (auvs) ((anxo) auvm.b().toBuilder());
            auvs.a(a);
            auvm.a(auvs);
        } else {
            auvj = (auvj) auvm.instance;
            if ((auvj.a & 8) != 0) {
                anxl = auvj.e;
                if (anxl == null) {
                    anxl = auvd.g;
                }
                auvg auvg = (auvg) ((anxo) anxl.toBuilder());
                auvg.copyOnWrite();
                auvd auvd = (auvd) auvg.instance;
                if (a != null) {
                    auvd.b = a;
                    auvd.a |= 1;
                    auvm.copyOnWrite();
                    auvj2 = (auvj) auvm.instance;
                    auvj2.e = (auvd) ((anxl) auvg.build());
                    auvj2.a |= 8;
                    return;
                }
                throw new NullPointerException();
            } else if (auvm.e()) {
                auvi auvi = (auvi) ((anxo) auvm.f().toBuilder());
                auvi.copyOnWrite();
                auvf auvf = (auvf) auvi.instance;
                if (a != null) {
                    auvf.b = a;
                    auvf.a |= 1;
                    auvm.a(auvi);
                    return;
                }
                throw new NullPointerException();
            } else if (auvm.c()) {
                auwe auwe = (auwe) auwb.l.createBuilder();
                if (auvm.d().j) {
                    auwe.copyOnWrite();
                    auwb auwb = (auwb) auwe.instance;
                    if (a != null) {
                        auwb.f = a;
                        auwb.a |= 16;
                    } else {
                        throw new NullPointerException();
                    }
                }
                auwe.copyOnWrite();
                auwb auwb2 = (auwb) auwe.instance;
                if (a != null) {
                    auwb2.b = a;
                    auwb2.a |= 1;
                } else {
                    throw new NullPointerException();
                }
                auvm.a(auwe);
            }
        }
    }

    private final auvj a(auvj auvj, int i, int i2) {
        auvm auvm = (auvm) ((anxo) auvj.toBuilder());
        a(auvm, i2);
        apxu d = abmk.d((auvj) ((anxl) auvm.build()));
        if (d != null) {
            anxr access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint);
                d.a(access$000);
                Object b = d.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                avrh avrh = (avrh) ((anxo) ((OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) obj).toBuilder());
                avrh.a(i);
                apxx apxx = (apxx) ((anxo) d.toBuilder());
                apxx.a(OfflineVideoEndpointOuterClass$OfflineVideoEndpoint.offlineVideoEndpoint, (OfflineVideoEndpointOuterClass$OfflineVideoEndpoint) ((anxl) avrh.build()));
                abmk.a(auvm, (apxu) ((anxl) apxx.build()));
            }
        }
        return (auvj) ((anxl) auvm.build());
    }

    private final auvj b(auvj auvj, int i, int i2) {
        auvm auvm = (auvm) ((anxo) auvj.toBuilder());
        a(auvm, i2);
        apxu d = abmk.d((auvj) ((anxl) auvm.build()));
        if (d != null) {
            anxr access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
            d.a(access$000);
            if (d.h.a(access$000.d)) {
                Object obj;
                access$000 = anxl.checkIsLite(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint);
                d.a(access$000);
                Object b = d.h.b(access$000.d);
                if (b == null) {
                    obj = access$000.b;
                } else {
                    obj = access$000.a(b);
                }
                avot avot = (avot) ((anxo) ((OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) obj).toBuilder());
                avot.a(i);
                apxx apxx = (apxx) ((anxo) d.toBuilder());
                apxx.a(OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint.offlinePlaylistEndpoint, (OfflinePlaylistEndpointOuterClass$OfflinePlaylistEndpoint) ((anxl) avot.build()));
                abmk.a(auvm, (apxu) ((anxl) apxx.build()));
            }
        }
        return (auvj) ((anxl) auvm.build());
    }
}
