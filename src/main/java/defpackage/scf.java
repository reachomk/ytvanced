package defpackage;

import android.app.Activity;
import android.graphics.BitmapFactory;
import android.graphics.Point;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.view.accessibility.CaptioningManager;
import android.widget.SeekBar;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.cast.MediaTrack;
import com.google.android.youtube.R;
import java.util.List;
import java.util.Timer;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: scf */
public final class scf extends nf implements sbx {
    public static final String a = sdf.a(scf.class);
    public static boolean ag = false;
    public sbu Z;
    public Handler aa;
    public boolean ab = true;
    public sbw ac;
    public sdc ad;
    public int ae;
    public scp af;
    private Thread ah;
    private Timer ai;
    private Timer aj;
    private sck ak;
    private boolean al = true;
    private pjz am;
    private int an = 3;
    public MediaInfo b;
    public sap c;

    public final void a(Activity activity) {
        super.a(activity);
        ag = false;
        this.ac = (sbw) activity;
        this.aa = new Handler();
        this.c = sap.o();
    }

    public final void d(Bundle bundle) {
        super.d(bundle);
        this.ak = new sck(this);
        bundle = this.j;
        if (bundle != null) {
            bundle = bundle.getBundle("extras");
            Bundle bundle2 = bundle.getBundle("media");
            w();
            this.c.I.add(this);
            String str = "ccl-start-cast-activity";
            boolean b = this.c.i.b(str);
            boolean z = true;
            if (b) {
                this.al = true;
            }
            int i = 0;
            this.c.i.a.edit().putBoolean(str, Boolean.valueOf(false).booleanValue()).apply();
            this.ac.d(this.c.a.c);
            if (bundle.getBoolean("hasAuth")) {
                if (this.al) {
                    this.an = 1;
                    this.Z = this.c.J;
                    sbu sbu = this.Z;
                    this.ac.b(true);
                    if (sbu != null) {
                        String str2;
                        sbw sbw = this.ac;
                        if (sbu.d() == null) {
                            str2 = "";
                        } else {
                            str2 = sbu.d();
                        }
                        sbw.b(str2);
                        this.ah = new Thread(new sce(sbu));
                        this.ah.start();
                        this.ai = new Timer();
                        this.ai.schedule(new sci(this, this.ah), sbu.e());
                    }
                    a(sdh.a(this.Z.c(), 1));
                }
            } else if (bundle2 != null) {
                this.an = 2;
                boolean z2 = bundle.getBoolean("shouldStart");
                String string = bundle.getString("customData");
                JSONObject jSONObject = null;
                if (!TextUtils.isEmpty(string)) {
                    try {
                        jSONObject = new JSONObject(string);
                    } catch (JSONException e) {
                        String str3 = a;
                        string = String.valueOf(string);
                        String str4 = "Failed to unmarshalize custom data string: customData=";
                        if (string.length() == 0) {
                            string = new String(str4);
                        } else {
                            string = str4.concat(string);
                        }
                        sdf.a(str3, string, e);
                    }
                }
                MediaInfo a = sdh.a(bundle2);
                int i2 = bundle.getInt("startPoint", 0);
                if (!(z2 && b)) {
                    z = false;
                }
                this.b = a;
                W();
                try {
                    this.ac.e_(this.b.b);
                    if (z) {
                        this.ae = 4;
                        this.ac.a(4);
                        this.c.a(this.b, i2, jSONObject);
                    } else {
                        int i3 = 3;
                        if (this.c.t()) {
                            this.ae = 2;
                            i3 = 2;
                        } else {
                            this.ae = 3;
                        }
                        this.ac.a(i3);
                    }
                } catch (Exception e2) {
                    sdf.a(a, "Failed to get playback and media information", e2);
                    this.ac.a();
                }
                sam sam = this.c.x;
                if (sam == null) {
                    i2 = 0;
                } else {
                    i = sam.a();
                    i2 = sam.b();
                }
                this.ac.b(i, i2);
                X();
                aa();
            }
        }
    }

    public final void W() {
        int i = 3;
        if (this.c.c(16) && this.b != null) {
            boolean isEnabled;
            sct sct = this.c.w;
            if (sdh.a) {
                isEnabled = ((CaptioningManager) sct.a.getSystemService("captioning")).isEnabled();
            } else {
                isEnabled = sct.b.b(sct.a.getString(R.string.ccl_key_caption_enabled));
            }
            if (isEnabled) {
                List<MediaTrack> list = this.b.f;
                if (!(list == null || list.isEmpty())) {
                    for (MediaTrack mediaTrack : list) {
                        i = mediaTrack.b;
                        if (i != 2) {
                            if (i == 1) {
                            }
                        }
                        i = 1;
                    }
                }
                i = 2;
            }
        }
        this.ac.c(i);
    }

    private final void Z() {
        Timer timer = this.aj;
        if (timer != null) {
            timer.cancel();
        }
    }

    private final void aa() {
        Z();
        this.aj = new Timer();
        this.aj.scheduleAtFixedRate(new scn(this), 100, 1000);
    }

    public final void X() {
        Uri a;
        MediaInfo mediaInfo = this.b;
        boolean z = true;
        if (mediaInfo == null) {
            sbu sbu = this.Z;
            a = sbu != null ? sdh.a(sbu.c(), 1) : null;
        } else {
            a = sdh.a(mediaInfo, 1);
        }
        a(a);
        mediaInfo = this.b;
        if (mediaInfo != null) {
            pjw pjw = mediaInfo.d;
            String str = "com.google.android.gms.cast.metadata.TITLE";
            this.ac.a(pjw.a(str) != null ? pjw.a(str) : "");
            if (this.b.b != 2) {
                z = false;
            }
            this.ac.c(z);
        }
    }

    public final void Y() {
        sap sap = this.c;
        int i = sap.E;
        this.am = sap.y;
        MediaInfo mediaInfo = this.b;
        if (mediaInfo != null) {
            this.ac.e_(mediaInfo.b);
            if (i == 4) {
                this.ac.b(a((int) R.string.ccl_loading));
            } else {
                this.ac.b(a((int) R.string.ccl_casting_to_device, this.c.h));
            }
            if (i == 1) {
                sap = this.c;
                i = sap.F;
                if (i != 1) {
                    if (i == 2) {
                        try {
                            if (!sap.s()) {
                                this.ac.a();
                            } else if (this.ae != 1) {
                                this.ae = 1;
                                this.ac.a(1);
                            }
                        } catch (sbt | sbv unused) {
                        }
                    } else if (i == 3) {
                        this.ae = 1;
                        this.ac.a(1);
                    }
                } else if (!this.al && this.am.k == 0) {
                    this.ac.a();
                }
            } else if (i == 2) {
                this.al = false;
                if (this.ae != 2) {
                    this.ae = 2;
                    this.ac.a(2);
                }
            } else if (i == 3) {
                this.al = false;
                if (this.ae != 3) {
                    this.ae = 3;
                    this.ac.a(3);
                }
            } else if (i == 4) {
                this.al = false;
                if (this.ae != 4) {
                    this.ae = 4;
                    this.ac.a(4);
                }
            }
        }
    }

    public final void X_() {
        Z();
        sbu sbu = this.c.J;
        Timer timer = this.ai;
        if (timer != null) {
            timer.cancel();
        }
        if (this.ah != null) {
            this.ah = null;
        }
        sap sap = this.c;
        sbu sbu2 = sap.J;
        sap.b(this.ak);
        Handler handler = this.aa;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
        scp scp = this.af;
        if (scp != null) {
            scp.a = null;
        }
        if (!ag) {
            sbu = this.Z;
            if (sbu != null) {
                sbu.g();
            }
        }
        this.c.I.remove(this);
        super.X_();
    }

    public final void B() {
        super.B();
        try {
            sap sap;
            if ((this.c.u() || this.c.t()) && this.c.v() != null && this.b.a.equals(this.c.v().a)) {
                this.al = false;
            }
            if (!this.c.i()) {
                if (this.c.h()) {
                    sap = this.c;
                    if (sap.E == 1) {
                        if (sap.F != 1) {
                        }
                    }
                }
                if (!this.al) {
                    this.ac.a();
                    this.c.e();
                    return;
                }
            }
            sap = this.c;
            this.am = sap.y;
            sap.a(this.ak);
            if (!this.al) {
                Y();
                this.b = this.c.v();
                W();
                X();
            }
            this.c.e();
        } catch (sbt | sbv e) {
            sdf.a(a, "Failed to get media information or status of media playback", e);
            this.c.e();
        } catch (Throwable e2) {
            this.c.e();
            throw e2;
        }
    }

    public final void ad_() {
        this.c.b(this.ak);
        this.c.f();
        this.al = false;
        super.ad_();
    }

    private final void a(Uri uri) {
        if (uri == null) {
            this.ac.a(BitmapFactory.decodeResource(p().getResources(), R.drawable.album_art_placeholder_large));
            return;
        }
        scp scp = this.af;
        if (scp == null || scp.a == null || !uri.equals(scp.b)) {
            this.af = null;
            sdc sdc = this.ad;
            if (sdc != null) {
                sdc.cancel(true);
            }
            Point b = sdh.b(p());
            this.ad = new sch(this, b.x, b.y, uri);
            this.ad.a(uri);
            return;
        }
        this.ac.a(this.af.a);
    }

    public final void N_() {
        super.N_();
        sdc sdc = this.ad;
        if (sdc != null) {
            sdc.cancel(true);
            this.ad = null;
        }
    }

    public final void a(SeekBar seekBar) {
        try {
            int i = this.ae;
            if (i == 2) {
                this.ae = 4;
                this.ac.a(4);
                sap sap = this.c;
                int progress = seekBar.getProgress();
                sap.m();
                if (sap.C != null) {
                    sap.m();
                    if (sap.C != null) {
                        sap.C.a(sap.m, (long) progress, 1).a(new sax(sap));
                    } else {
                        sdf.a(sap.r, "Trying to seekAndPlay a video with no active media session");
                        throw new sbt();
                    }
                }
                sdf.a(sap.r, "Trying to play a video with no active media session");
                throw new sbt();
            } else if (i == 3) {
                this.c.f(seekBar.getProgress());
            }
            aa();
        } catch (Exception e) {
            sdf.a(a, "Failed to complete seek", e);
            this.ac.a();
        }
    }

    public final void d() {
        Z();
    }

    public final void e() {
        this.c.h();
        int i = this.ae;
        if (i == 1) {
            MediaInfo mediaInfo = this.b;
            if (mediaInfo.b == 2) {
                sap sap = this.c;
                if (sap.F == 2) {
                    sap.E();
                    this.ae = 4;
                    aa();
                }
            }
            this.c.a(mediaInfo);
            this.ae = 4;
            aa();
        } else if (i == 2) {
            this.c.F();
            this.ae = 4;
        } else if (i == 3) {
            this.c.E();
            this.ae = 4;
            aa();
        }
        this.ac.a(this.ae);
    }

    public final void f() {
        int i = this.an;
        int i2 = i - 1;
        if (i != 0) {
            sbu sbu;
            if (i2 == 0) {
                sbu = this.c.J;
            }
            if (this.b == null) {
                sbu = this.Z;
                if (sbu != null) {
                    a(sdh.a(sbu.c(), 1));
                }
                return;
            }
            X();
            Y();
            this.ac.a(this.c.h());
            return;
        }
        throw null;
    }

    public final void a(List list) {
        long[] jArr;
        int i = 0;
        if (list.isEmpty()) {
            jArr = new long[0];
        } else {
            jArr = new long[list.size()];
            while (i < list.size()) {
                jArr[i] = ((MediaTrack) list.get(i)).a;
                i++;
            }
        }
        this.c.a(jArr);
        if (list.size() > 0) {
            sap sap = this.c;
            sap.C.a(sap.m, sap.w.a()).a(new sbj(sap));
            for (sbo sbo : sap.H) {
                try {
                    sbo.o();
                } catch (Exception e) {
                    String str = sap.r;
                    String valueOf = String.valueOf(sbo);
                    StringBuilder stringBuilder = new StringBuilder(valueOf.length() + 44);
                    stringBuilder.append("onTextTrackStyleChanged(): Failed to inform ");
                    stringBuilder.append(valueOf);
                    sdf.a(str, stringBuilder.toString(), e);
                }
            }
        }
    }

    public final void g() {
        this.ac.b(true);
        this.c.C();
    }

    public final void h() {
        this.ac.b(true);
        this.c.D();
    }
}
