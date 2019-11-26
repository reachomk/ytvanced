package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.view.KeyEvent;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: ahvn */
public final class ahvn implements ahoj, aibb, aifc, aihv {
    private final ViewGroup a;
    private final Context b;
    private ahtv c;
    private boolean d;
    private boolean e;
    private aibe f;
    private aihy g;
    private aiff h;
    private aich i = aich.a();
    private long j;
    private long k;
    private long l;
    private long m;
    private aicd n = aicd.a;
    private boolean o = true;
    private aajq[] p;
    private int q;
    private boolean r;

    public ahvn(ViewGroup viewGroup, Context context) {
        this.a = viewGroup;
        this.b = context;
    }

    public final void a(CharSequence charSequence) {
    }

    public final void a(String str, boolean z) {
    }

    public final void a(Map map) {
    }

    public final void c_(boolean z) {
    }

    public final void d_(boolean z) {
    }

    public final void e() {
    }

    public final void f() {
    }

    public final void g() {
    }

    public final void g(boolean z) {
    }

    public final void h_(boolean z) {
    }

    public final void i() {
    }

    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        return false;
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        return false;
    }

    public final void a(aajq[] aajqArr, int i, boolean z) {
        if (aajqArr != null && i >= 0) {
            int length = aajqArr.length;
            if (length != 0) {
                ahtv ahtv = this.c;
                if (ahtv != null) {
                    String str = aajqArr[i].b;
                    length--;
                    String str2 = aajqArr[length].b;
                    boolean z2 = i == length;
                    ahoz ahoz = ahtv.c.e;
                    ahoz.h = str;
                    ahoz.i = str2;
                    ahoz.e = z2;
                    if (ahoz.g) {
                        ahoz.g = z2;
                    }
                    ahoz.c();
                }
                this.p = aajqArr;
                this.q = i;
                this.r = z;
            }
        }
    }

    public final void a(aihy aihy) {
        this.g = aihy;
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahtv.h = this.g;
        }
    }

    public final void a(aiff aiff) {
        this.h = aiff;
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahtv.i = this.h;
        }
    }

    public final void a(aibe aibe) {
        this.f = aibe;
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahtv.g = aibe;
        }
    }

    private final void a(ahtv ahtv) {
        this.c = ahtv;
        if (ahtv != null) {
            aibe aibe = this.f;
            if (aibe != null) {
                ahtv.g = aibe;
            }
            aihy aihy = this.g;
            if (aihy != null) {
                ahtv.h = aihy;
            }
            aiff aiff = this.h;
            if (aiff != null) {
                ahtv.i = aiff;
            }
            b();
        }
    }

    private final void b() {
        a(this.n);
        b(this.d);
        b_(this.e);
        a(this.j, this.k, this.l, this.m);
        a(this.i);
        c(this.o);
        a(this.p, this.q, this.r);
    }

    public final void a(aicd aicd) {
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahvd ahvd = ahtv.e;
            ahvd.a = aicd;
            ahvd.c();
            ahtp ahtp = ahtv.c;
            ahuo ahuo = ahtp.f;
            ahuo.k = aicd;
            ahqc ahqc = ahuo.a;
            int i = aicd.q;
            amqw.a(ahqc.c.length > 0);
            ahqc.c[0].a(i);
            ahuo.a.a(ahuo.c());
            boolean a = aicd.a(aicd);
            ahtp.i = a;
            ahtp.b.l = a ^ 1;
            ahtp.a.m_(a);
            ahtp.c();
        }
        this.n = aicd;
    }

    public final void b(boolean z) {
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahvd ahvd = ahtv.e;
            ahvd.b = z;
            ahvd.c();
        }
        this.d = z;
    }

    public final void b_(boolean z) {
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahvd ahvd = ahtv.e;
            ahvd.c = z;
            ahvd.c();
        }
        this.e = z;
    }

    public final void a(aich aich) {
        amqw.a((Object) aich);
        ahtv ahtv = this.c;
        if (ahtv != null) {
            boolean z = aich.b;
            ahtv.j = z;
            ahtv.b.m_(z ^ 1);
            ahtv.g();
            aicj aicj = aich.a;
            if (aicj == aicj.PLAYING) {
                this.c.i();
            } else if (aicj == aicj.PAUSED) {
                ahtv = this.c;
                ahtv.k = false;
                ahtv.e.a(1);
                ahtv.g();
            } else if (aicj == aicj.ENDED) {
                ahtv = this.c;
                ahtv.p = true;
                ahtv.n = true;
                ahtv.k = false;
                ahtv.e.a(3);
                ahtv.g();
            }
        }
        this.i = aich;
    }

    public final void c(boolean z) {
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahuo ahuo = ahtv.c.f;
            ahuo.m = z;
            ahuo.a.a(ahuo.c());
        }
        this.o = z;
    }

    public final void a(long j, long j2, long j3, long j4) {
        long j5 = j;
        long j6 = j2;
        long j7 = j3;
        long j8 = j4;
        ahtv ahtv = this.c;
        if (ahtv != null) {
            ahtp ahtp = ahtv.c;
            ahtp.h = j7;
            ahpg ahpg = ahtp.b;
            boolean a = aicm.a(j5, j7);
            if (ahpg.e != a) {
                ahpg.e = a;
                ahpg.c();
            }
            ahqt ahqt = ahtp.a;
            String b = xvd.b(j5 / 1000);
            String b2 = xvd.b(j7 / 1000);
            StringBuilder stringBuilder = new StringBuilder((String.valueOf(b).length() + 1) + String.valueOf(b2).length());
            stringBuilder.append(b);
            stringBuilder.append("/");
            stringBuilder.append(b2);
            ahqt.a(stringBuilder.toString());
            ahuo ahuo = ahtp.f;
            if (j7 <= 0) {
                xtl.c("Cannot have a negative time for video duration!");
            } else {
                float f;
                float[] fArr;
                ahuo.g = j7;
                long j9 = j8 > j7 ? j7 : j8;
                ahuo.h = j6;
                long j10 = j7 - j6;
                if (j10 <= 0) {
                    float[] fArr2 = ahuo.e;
                    fArr2[0] = 1.0f;
                    fArr2[1] = 0.0f;
                    f = 1.0f;
                } else {
                    fArr = ahuo.e;
                    float f2 = (float) j10;
                    long j11 = j9;
                    fArr[0] = ((float) (j5 - j6)) / f2;
                    fArr[1] = j11 > j5 ? ((float) (j11 - j5)) / f2 : 0.0f;
                    float f3 = fArr[0];
                    f = 1.0f;
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr[0] = f3;
                    f3 = fArr[1];
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    fArr[1] = f3;
                }
                fArr = ahuo.e;
                fArr[2] = (f - fArr[0]) - fArr[1];
                ahuo.a.a(fArr);
                float f4 = ahuo.e[0];
                if (f4 < 0.0f || ((double) f4) > 1.01d) {
                    StringBuilder stringBuilder2 = new StringBuilder(38);
                    stringBuilder2.append("percentWidth invalid - ");
                    stringBuilder2.append(f4);
                    xtl.c(stringBuilder2.toString());
                }
                ahuo.c.b(ahuo.a.g * (f4 - ahuo.j), 0.0f, 0.0f);
                ahuo.j = f4;
            }
        }
        this.j = j5;
        this.k = j6;
        this.l = j7;
        this.m = j8;
    }

    public final void au_() {
        a(0, 0, 0, 0);
    }

    public final void h() {
        this.n = aicd.a;
        this.i = aich.a();
        b();
    }

    public final void a(ahry ahry, ahrt ahrt) {
        ahua ahua = new ahua(this.a, this.b, ahry, ahrt);
        ahqb ahrl = new ahrl((ahpn) ahua.b.clone(), ahua.f.b);
        ahrl.b(0.0f, 14.0f, 0.0f);
        ahtv ahtv = ahua.a;
        ahtv.f = ahrl;
        ahtv.a(ahrl);
        AudioManager audioManager = (AudioManager) ahua.d.getSystemService("audio");
        Resources resources = ahua.g;
        ahry ahry2 = ahua.e;
        ahrd ahrd = ahua.f.b;
        ahpn ahpn = (ahpn) ahua.b.clone();
        ahtv = ahua.a;
        ahtv.getClass();
        ahqb ahtp = new ahtp(resources, audioManager, ahry2, ahrd, ahpn, new ahud(ahtv), new ahuc(ahua));
        ahtp.b(0.0f, ahsl.a(-60.0f), 0.0f);
        ahtp.a(ahua.f.h);
        ahtv = ahua.a;
        ahtv.c = ahtp;
        ahtv.a(ahtp);
        ahrl = new ahvd(ahua.g, (ahpn) ahua.b.clone(), new ahuf(ahua), ahua.e);
        ahrl.b(0.0f, 7.0f, 0.0f);
        ahtv ahtv2 = ahua.a;
        ahtv2.e = ahrl;
        ahtv2.a(ahrl);
        ahtv ahtv3 = ahua.a;
        ahtv3.m = ahua.e.i;
        ahqb ahmt = new ahmt(ahua.c, ahua.d, ahtv3.a, (ahpn) ahua.b.clone(), ahua.e.a.e(), 10.5f, true);
        ahmt.b(0.0f, 7.0f, 0.0f);
        ahmt.m_(true);
        ahtv3 = ahua.a;
        ahtv3.b = ahmt;
        ahtv3.a(ahmt);
        ahua.e.a(ahua.a);
        ahua.e.a(ahua.a);
        ahrt ahrt2 = ahua.f;
        ahtv ahtv4 = ahua.a;
        ahrt2.f = ahtv4;
        ahrt2.c(ahtv4.o);
        ahrt2 = ahua.f;
        ahpv ahpv = ahua.a;
        ahrt2.i = ahpv;
        ahrt2.j = ahpv;
        a((ahtv) ahpv);
        ahrt.a(ahpv);
    }

    public final void bz_() {
        a(null);
    }
}
