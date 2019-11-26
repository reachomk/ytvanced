package defpackage;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.youtube.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;

/* renamed from: hku */
public final class hku extends agro {
    public final wyr a;
    public final aluo b;
    public final Resources c;
    public final boolean d;
    public agrp e;
    private final Context f;
    private final bcaa g;
    private final agrs h;
    private final bcaa i;
    private final hld j;
    private final xhv k;
    private final HashMap l;
    private final zyw m;
    private final yx n;
    private final hsw o;
    private final IntentFilter p;

    public hku(Context context, xsc xsc, agrs agrs, bcaa bcaa, agrn agrn, bcaa bcaa2, hld hld, xhv xhv, bcaa bcaa3, bcaa bcaa4, zyw zyw, hsw hsw) {
        boolean z = false;
        boolean z2 = !foh.k(zyw) || VERSION.SDK_INT >= 28;
        boolean z3 = !foh.k(zyw) || VERSION.SDK_INT >= 28;
        boolean z4 = !foh.k(zyw) || VERSION.SDK_INT >= 28;
        super(xsc, bcaa, agrn, z2, z3, z4, foh.j(zyw));
        this.f = context;
        this.g = bcaa2;
        this.j = hld;
        this.k = xhv;
        this.c = context.getResources();
        apxn a = zyw.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.ay) {
                z = true;
            }
        }
        this.d = z;
        if (z) {
            this.b = (aluo) bcaa4.get();
            this.a = null;
        } else {
            this.b = null;
            this.a = (wyr) bcaa3.get();
        }
        this.l = new HashMap();
        this.h = agrs;
        this.i = bcaa;
        this.m = zyw;
        this.o = hsw;
        this.p = new IntentFilter();
        this.p.addAction("com.google.android.youtube.action.offline_notification_cancel_transfer");
        this.f.registerReceiver(new hky(this), this.p);
        this.n = yx.a();
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a() {
        return false;
    }

    public final void a(agrp agrp) {
        this.e = agrp;
    }

    public final boolean a(agqz agqz, avqk avqk) {
        avqo avqo = avqk.e;
        if (avqo == null) {
            avqo = avqo.c;
        }
        if (((avqo.a == 135988795 ? (avqi) avqo.b : avqi.d).a & 1) != 0) {
            avqo = avqk.e;
            if (avqo == null) {
                avqo = avqo.c;
            }
            if (((avqo.a == 135988795 ? (avqi) avqo.b : avqi.d).a & 2) != 0) {
                Object b;
                String c;
                int i;
                avqo = avqk.e;
                if (avqo == null) {
                    avqo = avqo.c;
                }
                String str = (avqo.a == 135988795 ? (avqi) avqo.b : avqi.d).b;
                avqo avqo2 = avqk.e;
                if (avqo2 == null) {
                    avqo2 = avqo.c;
                }
                String str2 = (avqo2.a == 135988795 ? (avqi) avqo2.b : avqi.d).c;
                agvz b2 = ((agwc) this.i.get()).b();
                Collection<agqy> a = b2.k().a();
                agvx n = b2.n();
                if (agqz != null) {
                    b = agxj.b(agqz.f);
                    c = agxj.c(agqz.f);
                    i = 1;
                } else {
                    b = null;
                    c = b;
                    i = 0;
                }
                String str3 = c;
                agqy agqy = null;
                for (agqy agqy2 : a) {
                    if (!agqy2.a().equals(b)) {
                        if (agqy2.p()) {
                            i++;
                            if (agqy == null) {
                                if (b == null) {
                                    Set l = n.l(agqy2.a());
                                    if (!l.isEmpty()) {
                                        str3 = (String) l.iterator().next();
                                    }
                                }
                            }
                        }
                    }
                    agqy = agqy2;
                }
                if (i == 0 || agqy == null) {
                    d();
                } else {
                    CharSequence a2;
                    Uri f;
                    if (TextUtils.isEmpty(str3)) {
                        str3 = agqy.a();
                        a2 = agqy.a(this.f);
                        f = agqy.f();
                    } else {
                        agqi agqi = n.f(str3).a;
                        String str4 = agqi.b;
                        f = agqi.a();
                        a2 = str4;
                    }
                    if (i <= 0) {
                        return false;
                    }
                    CharSequence quantityString = this.f.getResources().getQuantityString(R.plurals.offline_pending_time_window_plural, i, new Object[]{Integer.valueOf(i), str, str2});
                    qg e = e();
                    e.b(quantityString);
                    e.a(a2);
                    e.d(null);
                    e.a((int) R.drawable.ic_notification_offline_progress);
                    e.a(false);
                    e.b(false);
                    e.f = PendingIntent.getActivity(this.f, 11, this.j.a(), 134217728);
                    b(e, str3, 4, f, false);
                    return true;
                }
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(agqy agqy) {
        boolean z;
        String a = agqy.a();
        long g = agqy.g();
        long h = agqy.h();
        boolean z2 = false;
        String string = this.f.getString(R.string.percent, new Object[]{Integer.valueOf(h > 0 ? (int) ((100 * g) / h) : 0)});
        CharSequence string2 = this.f.getString(R.string.notification_progress_size, new Object[]{this.n.a(hku.a(g)), this.n.a(hku.a(h))});
        qg a2 = a(a, false, false);
        a2.d(string);
        a2.b(string2);
        a2.a(100, r7, false);
        a2 = a(a, false, false);
        agqs u = agqy.u();
        if (!this.k.c()) {
            a2.b(this.f.getString(R.string.offline_waiting_for_network));
        } else if (u == agqs.TRANSFER_PENDING_WIFI) {
            a2.b(this.f.getString(R.string.offline_waiting_for_wifi));
        } else if (u == agqs.TRANSFER_PENDING_TOOTHFAIRY) {
            a2.b(this.f.getString(R.string.offline_waiting_for_discount));
        } else {
            z = false;
            z2 = true;
            a2.a(agqy.a(this.f));
            a2.a((int) R.drawable.ic_notification_offline_progress);
            a2.a(z2);
            a2.b(z);
            a2.f = PendingIntent.getActivity(this.f, a.hashCode(), this.j.a(), 134217728);
            b(a2, a, 0, agqy.f(), true);
            return true;
        }
        z = true;
        a2.a(agqy.a(this.f));
        a2.a((int) R.drawable.ic_notification_offline_progress);
        a2.a(z2);
        a2.b(z);
        a2.f = PendingIntent.getActivity(this.f, a.hashCode(), this.j.a(), 134217728);
        b(a2, a, 0, agqy.f(), true);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(agqy agqy) {
        e(agqy);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(agqy agqy) {
        e(agqy);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(agqy agqy, boolean z) {
        if (!z) {
            return false;
        }
        qg e = e();
        e.a(this.f.getString(R.string.offline_renew_title));
        e.b(this.f.getString(R.string.offline_renew));
        e.a((int) R.drawable.ic_notification_offline_progress);
        e.a(true);
        e.b(false);
        e.f = PendingIntent.getActivity(this.f, agqy.a().hashCode(), this.j.a(), 134217728);
        a(e.e(), "14", 9);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d(agqy agqy) {
        boolean contains = ((agwc) this.i.get()).b().o().h(agqy.a()).contains(hpr.b);
        apxn a = this.m.a();
        if (a != null) {
            aulu aulu = a.e;
            if (aulu == null) {
                aulu = aulu.bw;
            }
            if (aulu.am && contains && VERSION.SDK_INT < 28) {
                return false;
            }
        }
        qg e = e();
        e.a(this.f.getString(!contains ? R.string.offline_thumbnail_updating_notification : R.string.notification_download_recs_refreshing));
        e.a((int) R.drawable.ic_notification_offline_progress);
        e.a(0, 0, false);
        e.a(true);
        e.b(false);
        e.f = PendingIntent.getActivity(this.f, agqy.a().hashCode(), this.j.a(), 134217728);
        a(e.e(), "15", 10);
        return true;
    }

    private final void e(agqy agqy) {
        CharSequence a;
        int i;
        String a2 = agqy.a();
        if (agqy.v()) {
            a = agqy.a(agqy.u(), this.f);
            i = R.drawable.ic_notification_error_small;
        } else {
            a = this.f.getString(R.string.notification_video_download_completed);
            i = R.drawable.ic_notification_offline_complete;
        }
        qg e = e();
        e.b(a);
        e.a(agqy.a(this.f));
        e.d(null);
        e.a(i);
        e.a(0, 0, false);
        e.a(false);
        e.b(true);
        e.f = PendingIntent.getActivity(this.f, a2.hashCode(), this.j.a(), 1073741824);
        b(e, a2, 1, agqy.f(), true);
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(agqh agqh) {
        CharSequence quantityString;
        boolean z;
        boolean z2;
        String a = agqh.a();
        qg a2 = a(a, true, false);
        String a3 = agqh.a();
        int c = agqh.c();
        int d = agqh.d();
        int i = agqh.c;
        if (this.k.c()) {
            quantityString = this.c.getQuantityString(R.plurals.notification_playlist_progress_size, c, new Object[]{Integer.valueOf(d), Integer.valueOf(c)});
            z = true;
            z2 = false;
        } else {
            quantityString = this.f.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        }
        a2.a(agqh.a.b);
        a2.d(this.f.getString(R.string.percent, new Object[]{Integer.valueOf(i)}));
        a2.b(quantityString);
        a2.a((int) R.drawable.ic_notification_offline_progress);
        a2.a(100, i, false);
        a2.a(z);
        a2.b(z2);
        a2.f = PendingIntent.getActivity(this.f, 0, this.j.a(a3), 134217728);
        b(a2, a, 2, agqh.a.a(), true);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean b(agqh agqh) {
        qg e = e();
        a(e, agqh, (int) R.string.notification_playlist_completed);
        agqi agqi = agqh.a;
        b(e, agqi.a, 3, agqi.a(), true);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean c(agqh agqh) {
        Object quantityString;
        boolean z;
        boolean z2;
        String a = agqh.a();
        qg a2 = a(a, true, true);
        String a3 = agqh.a();
        int c = agqh.c();
        int d = agqh.d();
        int i = agqh.d;
        int i2 = agqh.b;
        if (this.k.c()) {
            quantityString = this.c.getQuantityString(R.plurals.notification_playlist_progress_size, c - i2, new Object[]{Integer.valueOf(d - i2), Integer.valueOf(c - i2)});
            z = true;
            z2 = false;
        } else {
            quantityString = this.f.getString(R.string.offline_waiting_for_network);
            z = false;
            z2 = true;
        }
        String valueOf = String.valueOf(this.f.getString(R.string.offline_sync_notification));
        String valueOf2 = String.valueOf(quantityString);
        CharSequence str = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
        a2.a(agqh.a.b);
        a2.d(this.f.getString(R.string.percent, new Object[]{Integer.valueOf(i)}));
        a2.b(str);
        a2.a((int) R.drawable.ic_notification_offline_progress);
        a2.a(100, i, false);
        a2.a(z);
        a2.b(z2);
        a2.f = PendingIntent.getActivity(this.f, 0, this.j.a(a3), 134217728);
        b(a2, a, 7, agqh.a.a(), true);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean d(agqh agqh) {
        qg e = e();
        a(e, agqh, (int) R.string.notification_playlist_sync_completed);
        agqi agqi = agqh.a;
        b(e, agqi.a, 8, agqi.a(), true);
        return true;
    }

    /* Access modifiers changed, original: protected|final */
    public final boolean a(agqu agqu) {
        String str = agqu.a.a;
        if (hpr.a.equals(str) && agqu.a() != 0) {
            List b = ((agwc) this.i.get()).b().o().b(str);
            if (!b.isEmpty()) {
                hsw hsw = this.o;
                hsw.a.a(acwl.w, null, null);
                hsw.a.b(acwc.MAIN_AUTO_OFFLINE_DOWNLOAD_COMPLETE_NOTIFICATION, null);
                acwp c = hsw.a.c();
                agqy agqy = (agqy) b.iterator().next();
                qg e = e();
                e.a(this.f.getString(R.string.auto_offline_videos_title));
                e.b(this.c.getQuantityString(R.plurals.notification_video_list_completed, agqu.a(), new Object[]{Integer.valueOf(agqu.a())}));
                e.d(null);
                e.a((int) R.drawable.ic_notification_offline_complete);
                e.a(0, 0, false);
                e.a(false);
                e.b(true);
                Context context = this.f;
                int hashCode = str.hashCode();
                Intent addFlags = this.j.a.a().addFlags(67108864);
                Bundle b2 = fiw.b();
                b2.putString("video_list_id", str);
                b2.putInt("network_connectivity_requirement", 1);
                b2.putParcelable("notification_logging_data", c);
                e.f = PendingIntent.getActivity(context, hashCode, addFlags.putExtra("pane", new fiw(hkn.class, b2)), 1073741824);
                b(e, str, 5, agqy.f(), true);
                return true;
            }
        }
        return false;
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void a(String str) {
        super.a(str);
        this.l.remove(str);
        a(str, "cancelVideoProgress");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void b(String str) {
        super.b(str);
        this.l.remove(hku.a(str, false));
        a(str, "cancelPlaylistProgress");
    }

    /* Access modifiers changed, original: protected|final|declared_synchronized */
    public final synchronized void c(String str) {
        super.c(str);
        this.l.remove(hku.a(str, true));
        a(str, "cancelPlaylistSyncProgress");
    }

    public final Notification b() {
        qg e = e();
        e.a(this.f.getString(R.string.offline_fallback_notification));
        e.a((int) R.drawable.ic_notification_offline_progress);
        e.a(0, 0, false);
        e.a(true);
        e.b(false);
        return e.e();
    }

    private static String a(long j) {
        if (j >= 1048576) {
            return Long.toString(xrz.a(j));
        }
        Locale locale = Locale.getDefault();
        Object[] objArr = new Object[1];
        double d = (double) j;
        Double.isNaN(d);
        objArr[0] = Double.valueOf(d / 1048576.0d);
        return String.format(locale, "%.1f", objArr);
    }

    private final void a(String str, String str2) {
        if (this.d) {
            xan.a(this.b.b(str), aniv.a, new hkx(str2));
        } else {
            this.a.b(str);
        }
    }

    private final void b(qg qgVar, String str, int i, Uri uri, boolean z) {
        Object obj = str;
        int i2 = i;
        boolean z2 = i2 == 2 || i2 == 7 || i2 == 0;
        if (this.d) {
            if (z) {
                a(qgVar.e(), (String) obj, i2);
            }
            qg qgVar2 = qgVar;
            String str2 = str;
            int i3 = i;
            Uri uri2 = uri;
            boolean z3 = z2;
            xan.a(this.b.a(obj), aniv.a, new hkw(this, qgVar2, str2, i3, uri2, z3), new hkz(this, qgVar2, str2, i3, uri2, z3));
            return;
        }
        a(qgVar, (Bitmap) this.a.a(obj), str, i, uri, z, z2);
    }

    public final void a(qg qgVar, Bitmap bitmap, String str, int i, Uri uri, boolean z, boolean z2) {
        if (bitmap != null) {
            qgVar.a(bitmap);
        }
        if (z || bitmap != null || uri == null) {
            a(qgVar.e(), str, i);
        }
        if (bitmap == null && uri != null) {
            ((akkq) this.g.get()).b(uri, new hlb(this, qgVar, z2, str, i, z));
        }
    }

    public final void a(Notification notification, String str, int i) {
        switch (i) {
            case 0:
                a(str, notification);
                break;
            case 1:
                b(str, notification);
                return;
            case 2:
                e(str, notification);
                return;
            case 3:
                f(str, notification);
                return;
            case 4:
                b(notification);
                return;
            case 5:
                i(str, notification);
                return;
            case 6:
                a(notification);
                return;
            case 7:
                g(str, notification);
                return;
            case 8:
                h(str, notification);
                return;
            case 9:
                c(str, notification);
                return;
            case 10:
                d(str, notification);
                return;
        }
    }

    public final void d(String str) {
        if (this.l.containsKey(str)) {
            ((qg) this.l.get(str)).a(System.currentTimeMillis());
        }
    }

    private final qg a(String str, boolean z, boolean z2) {
        Object a = z ? hku.a(str, z2) : str;
        if (this.l.containsKey(a)) {
            return (qg) this.l.get(a);
        }
        PendingIntent broadcast = PendingIntent.getBroadcast(this.f.getApplicationContext(), a.hashCode(), new Intent("com.google.android.youtube.action.offline_notification_cancel_transfer").putExtra(!z ? "video_id" : "playlist_id", str).putExtra("is_sync", z2), 134217728);
        qg a2 = this.h.a();
        a2.t = this.c.getColor(R.color.color_brand_primary);
        a2.c();
        a2.a((int) R.drawable.ic_cancel, this.c.getString(R.string.notification_cancel_transfer), broadcast);
        this.l.put(a, a2);
        return a2;
    }

    private static String a(String str, boolean z) {
        return z ? "sync:".concat(str) : str;
    }

    private final qg e() {
        qg a = this.h.a();
        a.a(System.currentTimeMillis());
        a.t = this.c.getColor(R.color.color_brand_primary);
        a.c();
        return a;
    }

    private final void a(qg qgVar, agqh agqh, int i) {
        CharSequence string;
        int i2;
        if (agqh.e) {
            string = this.f.getString(R.string.notification_playlist_error);
            i2 = R.drawable.ic_notification_error_small;
        } else {
            string = this.f.getString(i);
            i2 = R.drawable.ic_notification_offline_complete;
        }
        agqi agqi = agqh.a;
        String str = agqi.a;
        qgVar.a(agqi.b);
        qgVar.b(string);
        qgVar.d(null);
        qgVar.a(i2);
        qgVar.a(0, 0, false);
        qgVar.a(false);
        qgVar.b(true);
        qgVar.f = PendingIntent.getActivity(this.f, str.hashCode(), this.j.a(str), 1073741824);
    }

    /* Access modifiers changed, original: final|synthetic */
    public final /* synthetic */ void a(qg qgVar, String str, int i, Uri uri, boolean z) {
        a(qgVar, null, str, i, uri, false, z);
    }
}
