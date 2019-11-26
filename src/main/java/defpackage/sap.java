package defpackage;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.youtube.R;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* renamed from: sap */
public final class sap extends saf implements sbs, sdq {
    private static sap N;
    public static final String r = sdf.a(sap.class);
    public static final Class s = sbz.class;
    public static final long t = TimeUnit.SECONDS.toMillis(1);
    public sdc A;
    public final Set B = Collections.synchronizedSet(new HashSet());
    public pka C;
    public wq D;
    public int E = 1;
    public int F;
    public String G;
    public final Set H = new CopyOnWriteArraySet();
    public final Set I = new CopyOnWriteArraySet();
    public sbu J;
    public final ScheduledExecutorService K = Executors.newScheduledThreadPool(1);
    public ScheduledFuture L;
    public final Runnable M = new sbk(this);
    private Class O;
    private AudioManager P;
    private pjj Q;
    private final int R = 2;
    public Class u;
    public final double v = 0.05d;
    public sct w;
    public sam x;
    public pjz y;
    public sdc z;

    private sap() {
    }

    private sap(Context context, sal sal) {
        super(context, sal);
        List list = sal.h;
        this.G = list != null ? (String) list.get(0) : null;
        this.O = s;
        this.i.a("cast-activity-name", this.O.getName());
        if (!TextUtils.isEmpty(this.G)) {
            this.i.a("cast-custom-data-namespace", this.G);
        }
        this.P = (AudioManager) this.c.getSystemService("audio");
        this.u = null;
        if (this.u == null) {
            this.u = scy.class;
        }
    }

    public static synchronized sap a(Context context, sal sal) {
        sap sap;
        synchronized (sap.class) {
            if (N == null) {
                sad sad = new sad();
                if (psi.a(context) != 0) {
                    sdf.a(r, "Couldn't find the appropriate version of Google Play Services");
                }
                N = new sap(context, sal);
            }
            sap sap2 = N;
            if (sap2.c(16)) {
                sap2.w = new sct(sap2.c.getApplicationContext());
                Context applicationContext = sap2.c.getApplicationContext();
                if (sdh.a) {
                    ((CaptioningManager) applicationContext.getSystemService("captioning")).addCaptioningChangeListener(new sbl(sap2));
                }
            }
            if (N.c(8)) {
                N.q = new sco(context.getApplicationContext());
            }
            sap = N;
        }
        return sap;
    }

    public static sap o() {
        sap sap = N;
        if (sap != null) {
            return sap;
        }
        String str = "No VideoCastManager instance was found, did you forget to initialize it?";
        sdf.a(r, str);
        throw new IllegalStateException(str);
    }

    public final void a(sdg sdg) {
        m();
        K();
        if (this.C.b() > 0 || s()) {
            MediaInfo v = v();
            pjw pjw = v.d;
            sdg.a(v.b);
            sdg.a(this.E, this.F);
            sdg.b(this.c.getResources().getString(R.string.ccl_casting_to_device, new Object[]{this.h}));
            sdg.a(pjw.a("com.google.android.gms.cast.metadata.TITLE"));
            sdg.a(sdh.a(v, 0));
        }
    }

    public final void p() {
        m();
        if (this.E == 2) {
            F();
        } else {
            boolean s = s();
            int i = this.E;
            if ((i == 3 && !s) || (i == 1 && s)) {
                E();
            }
        }
    }

    public final void a(Context context) {
        Intent intent = new Intent(context, this.O);
        intent.putExtra("media", sdh.a(v()));
        context.startActivity(intent);
    }

    public final void q() {
        for (sbo s : this.H) {
            s.s();
        }
    }

    public final void r() {
        for (sbo t : this.H) {
            t.t();
        }
    }

    public final void b(boolean z) {
        synchronized (this.B) {
            for (sdg visibility : this.B) {
                visibility.setVisibility(!z ? 8 : 0);
            }
        }
    }

    public final boolean s() {
        m();
        MediaInfo v = v();
        return v != null && v.b == 2;
    }

    private final void K() {
        if (this.C == null) {
            throw new sbt();
        }
    }

    public final boolean t() {
        m();
        int i = this.E;
        return i == 4 || i == 2;
    }

    public final boolean u() {
        m();
        return this.E == 3;
    }

    public final MediaInfo v() {
        m();
        K();
        return this.C.d();
    }

    public final double w() {
        m();
        if (this.R != 1) {
            m();
            try {
                return pje.b.b(this.m);
            } catch (IllegalStateException e) {
                throw new sbt("getDeviceVolume()", e);
            }
        }
        K();
        return this.C.c().h;
    }

    public final void a(double d) {
        m();
        double d2 = d <= 1.0d ? d >= 0.0d ? d : 0.0d : 1.0d;
        if (this.R == 1) {
            K();
            pka pka = this.C;
            ptd ptd = this.m;
            if (Double.isInfinite(d2) || Double.isNaN(d2)) {
                StringBuilder stringBuilder = new StringBuilder(41);
                stringBuilder.append("Volume cannot be ");
                stringBuilder.append(d2);
                throw new IllegalArgumentException(stringBuilder.toString());
            }
            ptd.b(new pqk(pka, ptd, ptd, d2)).a(new sao(this));
            return;
        }
        m();
        try {
            pje.b.a(this.m, d2);
        } catch (IOException e) {
            throw new sbq("Failed to set volume", e);
        } catch (IllegalStateException e2) {
            throw new sbt("setDeviceVolume()", e2);
        }
    }

    public final boolean x() {
        m();
        if (this.R != 1) {
            m();
            try {
                return pje.b.c(this.m);
            } catch (IllegalStateException e) {
                throw new sbt("isDeviceMute()", e);
            }
        }
        K();
        return this.C.c().i;
    }

    public final long y() {
        m();
        K();
        return this.C.b();
    }

    public final long z() {
        m();
        K();
        return this.C.a();
    }

    public final boolean A() {
        if (!c(4)) {
            return true;
        }
        Intent intent = new Intent(this.c, this.u);
        intent.setPackage(this.c.getPackageName());
        intent.setAction("com.google.android.libraries.cast.companionlibrary.action.notificationvisibility");
        intent.putExtra("visible", this.l ^ 1);
        if (this.c.startService(intent) != null) {
            return true;
        }
        return false;
    }

    public final void B() {
        if (c(4)) {
            Context context = this.c;
            if (context != null) {
                context.stopService(new Intent(context, this.u));
            }
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void a(pjb pjb, String str, boolean z) {
        String str2 = "Failed to attach media/data channel due to network issues";
        String.valueOf(str).length();
        this.p = 0;
        if (this.k == 2) {
            String a = this.i.a("route-id");
            List<bbs> a2 = bbb.a();
            if (a2 != null && !a2.isEmpty() && a != null) {
                for (bbs bbs : a2) {
                    if (a.equals(bbs.c)) {
                        this.k = 3;
                        bbb.a(bbs);
                        break;
                    }
                }
            }
        }
        A();
        try {
            if (!TextUtils.isEmpty(this.G) && this.Q == null) {
                m();
                this.Q = new sba(this);
                try {
                    pje.b.a(this.m, this.G, this.Q);
                } catch (IOException | IllegalStateException e) {
                    sdf.a(r, "attachDataChannel()", e);
                }
            }
            m();
            if (this.C == null) {
                this.C = new pka();
                this.C.g = new saw(this);
                this.C.d = new saz(this);
                this.C.f = new say(this);
                this.C.e = new sbb(this);
            }
            try {
                pje.b.a(this.m, this.C.e(), this.C);
            } catch (IOException | IllegalStateException e2) {
                sdf.a(r, "attachMediaChannel()", e2);
            }
            c(null);
            this.o = str;
            this.i.a("session-id", this.o);
            pka pka = this.C;
            ptd ptd = this.m;
            ptd.b(new pqn(pka, ptd, ptd)).a(new sav(this));
            for (sbo a3 : this.H) {
                a3.a(pjb, this.o, z);
            }
        } catch (sbv e3) {
            sdf.a(r, str2, e3);
            a((int) R.string.ccl_failed_no_connection_trans, -1);
        } catch (sbt e4) {
            sdf.a(r, str2, e4);
            a((int) R.string.ccl_failed_no_connection, -1);
        }
    }

    public final void l() {
        if (!(this.C == null || this.m == null)) {
            try {
                pje.b.a(this.m, this.C.e(), this.C);
            } catch (IOException | IllegalStateException e) {
                sdf.a(r, "reattachMediaChannel()", e);
            }
        }
        if (!(TextUtils.isEmpty(this.G) || this.Q == null)) {
            try {
                pje.b.a(this.m, this.G, this.Q);
            } catch (IOException | IllegalStateException e2) {
                sdf.a(r, "reattachDataChannel()", e2);
            }
        }
        for (sbm g : this.j) {
            g.g();
        }
    }

    public final void b() {
        for (sbo i : this.H) {
            i.i();
        }
    }

    public final void b(int i) {
        this.p = i;
        if (this.k != 2) {
            for (sbo b : this.H) {
                b.b(i);
            }
            a(null, null);
            if (this.d != null) {
                bbb.a(bbb.b());
            }
        } else if (i == 2005) {
            this.k = 4;
            a(null, null);
        }
    }

    public final void a(MediaInfo mediaInfo) {
        a(mediaInfo, 0, null);
    }

    public final void a(MediaInfo mediaInfo, int i, JSONObject jSONObject) {
        m();
        if (mediaInfo != null) {
            pka pka = this.C;
            if (pka != null) {
                ptd ptd = this.m;
                ptd.b(new pqh(pka, ptd, ptd, (long) i, jSONObject, mediaInfo)).a(new sbe(this));
                return;
            }
            sdf.a(r, "Trying to load a video with no active media session");
            throw new sbt();
        }
    }

    public final void C() {
        m();
        pka pka = this.C;
        if (pka != null) {
            ptd ptd = this.m;
            ptd.b(new pqe(pka, ptd, ptd)).a(new sar(this));
            return;
        }
        sdf.a(r, "Trying to update the queue with no active media session");
        throw new sbt();
    }

    public final void D() {
        m();
        pka pka = this.C;
        if (pka != null) {
            ptd ptd = this.m;
            ptd.b(new pqf(pka, ptd, ptd)).a(new saq(this));
            return;
        }
        sdf.a(r, "Trying to update the queue with no active media session");
        throw new sbt();
    }

    public final void E() {
        m();
        pka pka = this.C;
        if (pka != null) {
            ptd ptd = this.m;
            ptd.b(new pqi(pka, ptd, ptd)).a(new sat(this));
            return;
        }
        sdf.a(r, "Trying to play a video with no active media session");
        throw new sbt();
    }

    public final void F() {
        m();
        pka pka = this.C;
        if (pka != null) {
            ptd ptd = this.m;
            ptd.b(new pqj(pka, ptd, ptd)).a(new sas(this));
            return;
        }
        sdf.a(r, "Trying to pause a video with no active media session");
        throw new sbt();
    }

    public final void f(int i) {
        m();
        pka pka = this.C;
        if (pka != null) {
            pka.a(this.m, (long) i, 0).a(new sau(this));
        } else {
            sdf.a(r, "Trying to seek a video with no active media session");
            throw new sbt();
        }
    }

    public final void g(int i) {
        m();
        pka pka = this.C;
        if (pka != null) {
            f((int) (pka.a() + ((long) i)));
        } else {
            sdf.a(r, "Trying to seek a video with no active media session");
            throw new sbt();
        }
    }

    public final void G() {
        m();
        if (t()) {
            F();
        } else if (this.E == 1 && this.F == 1) {
            a(v());
        } else {
            E();
        }
    }

    public final void a(List list, pjy pjy, int i) {
        Object[] objArr = new Object[4];
        objArr[0] = Integer.valueOf(list != null ? list.size() : 0);
        objArr[1] = pjy;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Boolean.valueOf(false);
        String.format("Queue Items size: %d, Item: %s, Repeat Mode: %d, Shuffle: %s", objArr);
        if (list != null) {
            this.x = new sam(new CopyOnWriteArrayList(list), pjy);
        } else {
            this.x = new sam(new CopyOnWriteArrayList(), null);
        }
        for (sbo a : this.H) {
            a.a(list, pjy);
        }
    }

    private final void c(MediaInfo mediaInfo) {
        if (c(2)) {
            if (this.D == null) {
                this.D = new wq(this.c, "TAG", new ComponentName(this.c, sdd.class.getName()), null);
                this.D.a();
                this.D.a(true);
                this.D.a(new sbc(this));
            }
            this.P.requestAudioFocus(null, 3, 3);
            PendingIntent L = L();
            if (L != null) {
                this.D.a(L);
            }
            if (mediaInfo == null) {
                wq wqVar = this.D;
                xu xuVar = new xu();
                xuVar.a(0, 0);
                wqVar.a(xuVar.a());
            } else {
                wq wqVar2 = this.D;
                xu xuVar2 = new xu();
                xuVar2.a(3, 0);
                xuVar2.b = 512;
                wqVar2.a(xuVar2.a());
            }
            b(mediaInfo);
            H();
            bbb.a(this.D);
        }
    }

    private final PendingIntent L() {
        try {
            Bundle a = sdh.a(v());
            Intent intent = new Intent(this.c, this.O);
            intent.putExtra("media", a);
            return PendingIntent.getActivity(this.c, 0, intent, 134217728);
        } catch (sbt | sbv unused) {
            sdf.a(r, "getCastControllerPendingIntent(): Failed to get the remote media information");
            return null;
        }
    }

    public final void b(MediaInfo mediaInfo) {
        if (!(mediaInfo == null || this.D == null)) {
            Uri uri;
            List list = mediaInfo.d.a;
            Bitmap bitmap = null;
            if (list.size() > 1) {
                uri = ((pyb) list.get(1)).a;
            } else if (list.size() == 1) {
                uri = ((pyb) list.get(0)).a;
            } else {
                Context context = this.c;
                if (context != null) {
                    bitmap = BitmapFactory.decodeResource(context.getResources(), R.drawable.album_art_placeholder_large);
                    uri = null;
                } else {
                    uri = null;
                }
            }
            if (bitmap != null) {
                vl vlVar;
                vj b = this.D.b.b();
                if (b == null) {
                    vlVar = new vl();
                } else {
                    vlVar = new vl(b);
                }
                wq wqVar = this.D;
                vlVar.a("android.media.metadata.ART", bitmap);
                wqVar.a(vlVar.a());
            } else {
                sdc sdc = this.z;
                if (sdc != null) {
                    sdc.cancel(true);
                }
                Point b2 = sdh.b(this.c);
                this.z = new sbf(this, b2.x, b2.y);
                this.z.a(uri);
            }
        }
    }

    public final void c(boolean z) {
        int i = 2;
        if (c(2) && h()) {
            try {
                if (this.D == null) {
                    if (z) {
                        c(v());
                    }
                }
                if (this.D != null) {
                    int i2 = !s() ? 3 : 6;
                    if (z) {
                        i = i2;
                    }
                    PendingIntent L = L();
                    if (L != null) {
                        this.D.a(L);
                    }
                    wq wqVar = this.D;
                    xu xuVar = new xu();
                    xuVar.a(i, 0);
                    xuVar.b = 512;
                    wqVar.a(xuVar.a());
                }
            } catch (sbt | sbv e) {
                sdf.a(r, "Failed to set up MediaSessionCompat due to network issues", e);
            }
        }
    }

    public final void H() {
        String str = "com.google.android.gms.cast.metadata.TITLE";
        if (this.D != null && c(2)) {
            try {
                MediaInfo v = v();
                if (v != null) {
                    vl vlVar;
                    pjw pjw = v.d;
                    vj b = this.D.b.b();
                    if (b == null) {
                        vlVar = new vl();
                    } else {
                        vlVar = new vl(b);
                    }
                    vlVar.a("android.media.metadata.TITLE", pjw.a(str));
                    vlVar.a("android.media.metadata.ALBUM_ARTIST", this.c.getResources().getString(R.string.ccl_casting_to_device, new Object[]{this.h}));
                    vlVar.a("android.media.metadata.DISPLAY_TITLE", pjw.a(str));
                    vlVar.a("android.media.metadata.DISPLAY_SUBTITLE", pjw.a("com.google.android.gms.cast.metadata.SUBTITLE"));
                    vlVar.a("android.media.metadata.DURATION", v.e);
                    this.D.a(vlVar.a());
                    Uri uri = pjw.a() ? ((pyb) pjw.a.get(0)).a : null;
                    if (uri == null) {
                        Bitmap decodeResource = BitmapFactory.decodeResource(this.c.getResources(), R.drawable.album_art_placeholder);
                        wq wqVar = this.D;
                        vlVar.a("android.media.metadata.DISPLAY_ICON", decodeResource);
                        wqVar.a(vlVar.a());
                        return;
                    }
                    sdc sdc = this.A;
                    if (sdc != null) {
                        sdc.cancel(true);
                    }
                    this.A = new sbh(this);
                    this.A.a(uri);
                }
            } catch (NotFoundException e) {
                sdf.a(r, "Failed to update Media Session due to resource not found", e);
            } catch (sbt | sbv e2) {
                sdf.a(r, "Failed to update Media Session due to network issues", e2);
            }
        }
    }

    public final void I() {
        if (c(2)) {
            sdc sdc = this.z;
            if (sdc != null) {
                sdc.cancel(true);
            }
            sdc = this.A;
            if (sdc != null) {
                sdc.cancel(true);
            }
            this.P.abandonAudioFocus(null);
            wq wqVar = this.D;
            if (wqVar != null) {
                wqVar.a(null);
                xu xuVar = new xu();
                xuVar.a(0, 0);
                this.D.a(xuVar.a());
                this.D.c();
                this.D.a(false);
                this.D = null;
            }
        }
    }

    public final synchronized void a(sbo sbo) {
        if (sbo != null) {
            if (this.j.add(sbo)) {
                String.valueOf(sbo).length();
            }
            this.H.add(sbo);
            String.valueOf(sbo).length();
        }
    }

    public final synchronized void b(sbo sbo) {
        if (sbo != null) {
            if (this.j.remove(sbo)) {
                String.valueOf(sbo).length();
            }
            this.H.remove(sbo);
        }
    }

    /* Access modifiers changed, original: protected|final */
    public final void c() {
        B();
        if (this.C != null) {
            try {
                pje.b.b(this.m, this.C.e());
            } catch (IOException | IllegalStateException e) {
                sdf.a(r, "detachMediaChannel()", e);
            }
            this.C = null;
        }
        if (!TextUtils.isEmpty(this.G)) {
            try {
                if (this.m != null) {
                    pje.b.b(this.m, this.G);
                }
                this.Q = null;
                this.i.a("cast-custom-data-namespace", null);
            } catch (IOException | IllegalStateException e2) {
                String str = r;
                String valueOf = String.valueOf(this.G);
                String str2 = "removeDataChannel() failed to remove namespace ";
                sdf.a(str, valueOf.length() == 0 ? new String(str2) : str2.concat(valueOf), e2);
            }
        }
        this.E = 1;
    }

    /* Access modifiers changed, original: protected|final */
    public final pjh a() {
        pjh pjh = new pjh(this.g, new sbn(this));
        if (c(1)) {
            pjh.c = 1 | pjh.c;
        }
        return pjh;
    }

    public final void a(psa psa) {
        super.a(psa);
        c(false);
        B();
    }

    public final void a(boolean z) {
        this.h = null;
        for (sbm c : this.j) {
            c.c();
        }
        b(false);
        if (z && !this.n) {
            I();
        }
        this.E = 1;
        this.x = null;
    }

    public final void a(int i, int i2) {
        String.valueOf(this.c.getString(i)).length();
        for (sbm a : this.j) {
            a.a(i, i2);
        }
    }

    public final boolean a(double d, boolean z) {
        if (this.E == 2 && c(2)) {
            return false;
        }
        if (z) {
            try {
                m();
                double w = w() + d;
                d = 0.0d;
                if (w > 1.0d) {
                    d = 1.0d;
                } else if (w >= 0.0d) {
                    d = w;
                }
                a(d);
            } catch (sbq | sbt | sbv e) {
                sdf.a(r, "Failed to change volume", e);
            }
        }
        return true;
    }

    public final void a(long[] jArr) {
        pka pka = this.C;
        if (pka != null && pka.d() != null) {
            pka = this.C;
            ptd ptd = this.m;
            ptd.b(new pqd(pka, ptd, ptd, jArr)).a(new sbg());
        }
    }

    public final void a(pkl pkl) {
        pka pka = this.C;
        if (pka != null && pka.d() != null) {
            this.C.a(this.m, pkl).a(new sbi(this));
            for (sbo sbo : this.H) {
                try {
                    sbo.o();
                } catch (Exception e) {
                    String str = r;
                    String valueOf = String.valueOf(sbo);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
                    stringBuilder.append("onTextTrackStyleChanged(): Failed to inform ");
                    stringBuilder.append(valueOf);
                    sdf.a(str, stringBuilder.toString(), e);
                }
            }
        }
    }

    public final void J() {
        ScheduledFuture scheduledFuture = this.L;
        if (scheduledFuture != null && !scheduledFuture.isCancelled()) {
            this.L.cancel(true);
            this.L = null;
        }
    }

    static {
        TimeUnit.HOURS.toMillis(2);
    }
}
